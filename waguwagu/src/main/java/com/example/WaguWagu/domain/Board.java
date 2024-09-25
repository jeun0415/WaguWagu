package com.example.WaguWagu.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardIdx;     // 게시글ID

    @Column(columnDefinition = "int default 0")
    private int boardCount;    // 조회수

    private String boardTitle;     // 제목

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime boardRegDate;      // 작성시간

    @LastModifiedDate
    private LocalDateTime boardModDate;       // 수정시간

    @OneToOne
    private Recipe recipe;      // 레시피ID FK
}
