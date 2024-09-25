package com.example.WaguWagu.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pIdx;

    @Column(nullable = false, length = 100)
    private String pName;
    @Column(nullable = false, columnDefinition = "tinyint DEFAULT 2")
    private int pCover;

    @Column(nullable = false)
    private String pUrl;

    @ManyToOne
    private Recipe recipe;

}
