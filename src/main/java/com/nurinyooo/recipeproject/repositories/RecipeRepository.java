package com.nurinyooo.recipeproject.repositories;

import com.nurinyooo.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository  extends CrudRepository<Recipe ,Long> {



}
