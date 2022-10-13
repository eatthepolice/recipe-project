package own.springframework.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import own.springframework.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
