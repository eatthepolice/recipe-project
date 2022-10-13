package own.springframework.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import own.springframework.recipeproject.domain.Category;
import own.springframework.recipeproject.domain.UnitOfMeasure;
import own.springframework.recipeproject.repositories.CategoryRepository;
import own.springframework.recipeproject.repositories.UnitOfMeasureRepository;
import own.springframework.recipeproject.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
