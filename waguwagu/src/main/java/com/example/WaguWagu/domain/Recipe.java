package com.example.WaguWagu.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
public class Recipe {

    @Id
    @Column(name = "r_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rIdx;

    @Column(name = "r_name", nullable = false)
    private String rName;

    private String rType;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String rMethod;

    @Column(nullable = false)
    private String rIngredient;
}