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
public class Recipe {

    @Id
    @Column(name = "r_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeId;

    @Column(name = "f_name", nullable = false)
    private String foodName;

    @Column(name = "c_type")
    private String cuisineType;

    @Column(nullable = false)
    private String instructions;

    @Column(nullable = false)
    private String ingredients;
}