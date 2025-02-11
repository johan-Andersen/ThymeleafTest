package org.example.thymeleaftest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class RecipeController {
RecipeService recipeService;

    @GetMapping("/recipe")
    public String viewRecipe(@RequestParam("name") String name, Model model) {

        Recipe recipe = recipeService.getRecipeByName(name);
        model.addAttribute("recipe", recipe);
        return "recipe-details";
    }

}
