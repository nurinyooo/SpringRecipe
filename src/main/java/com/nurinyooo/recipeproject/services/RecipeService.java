package com.nurinyooo.recipeproject.services;

import com.nurinyooo.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();
    Recipe findById(Long l);
}
