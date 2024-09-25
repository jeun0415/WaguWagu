package com.example.WaguWagu.repository;

import com.example.WaguWagu.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
