package org.example.thymeleaftest;

import java.util.List;

public class RecipeService {

    RecipeRepository recipeRepository;

    public RecipeService( RecipeRepository recipeRepository) {

        this.recipeRepository = recipeRepository;

    }

    public List<Recipe> getRecipeList() {
        return recipeRepository.getRecipeList();
    }

    public Recipe getRecipeByName(String name) {
        return recipeRepository.getRecipeByName(name);
    }

}
