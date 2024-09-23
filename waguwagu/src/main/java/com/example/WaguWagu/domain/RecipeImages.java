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
    @Column(name = "ri_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rImageId;

    private String imageFile;

}
