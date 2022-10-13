package own.springframework.recipeproject.services;

import own.springframework.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
