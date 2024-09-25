package com.example.WaguWagu.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_idx;     // 댓글ID

    @Column(length = 200)
    private String c_content;       // 내용

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime c_reg_date;      // 작성시간

    @LastModifiedDate
    private LocalDateTime c_mod_date;       // 수정시간

    @ManyToOne
    private Board board;        // 게시글ID FK

    @ManyToOne
    private Member member;      // 회원ID FK
}
