package org.example.thymeleaftest;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository {
    private List<Recipe> recipeList = new ArrayList<>();

    public RecipeRepository(List<Recipe> recipeList) {

        this.recipeList = recipeList;

        List<Ingredients> carbonaraIngredients = new ArrayList<>();
        carbonaraIngredients.add(new Ingredients("Spaghetti", false));
        carbonaraIngredients.add(new Ingredients("Eggs", false));
        carbonaraIngredients.add(new Ingredients("Parmesan Cheese", false));
        carbonaraIngredients.add(new Ingredients("Pancetta", false));
        carbonaraIngredients.add(new Ingredients("Black Pepper", false));

        Recipe carbonara = new Recipe(carbonaraIngredients, "Spaghetti Carbonara");

        // Recipe 2: Margherita Pizza
        List<Ingredients> pizzaIngredients = new ArrayList<>();
        pizzaIngredients.add(new Ingredients("Pizza Dough", false));
        pizzaIngredients.add(new Ingredients("Tomato Sauce", false));
        pizzaIngredients.add(new Ingredients("Mozzarella", false));
        pizzaIngredients.add(new Ingredients("Basil", false));
        pizzaIngredients.add(new Ingredients("Olive Oil", false));

        Recipe margheritaPizza = new Recipe(pizzaIngredients, "Margherita Pizza");

        // Recipe 3: Caesar Salad
        List<Ingredients> caesarIngredients = new ArrayList<>();
        caesarIngredients.add(new Ingredients("Romaine Lettuce", false));
        caesarIngredients.add(new Ingredients("Croutons", false));
        caesarIngredients.add(new Ingredients("Parmesan Cheese", false));
        caesarIngredients.add(new Ingredients("Caesar Dressing", false));
        caesarIngredients.add(new Ingredients("Chicken Breast", false));

        Recipe caesarSalad = new Recipe(caesarIngredients, "Caesar Salad");

        // Recipe 4: Chocolate Cake
        List<Ingredients> cakeIngredients = new ArrayList<>();
        cakeIngredients.add(new Ingredients("Flour", false));
        cakeIngredients.add(new Ingredients("Sugar", false));
        cakeIngredients.add(new Ingredients("Cocoa Powder", false));
        cakeIngredients.add(new Ingredients("Eggs", false));
        cakeIngredients.add(new Ingredients("Butter", false));

        Recipe chocolateCake = new Recipe(cakeIngredients, "Chocolate Cake");

        recipeList.add(carbonara);
        recipeList.add(margheritaPizza);
        recipeList.add(caesarSalad);
        recipeList.add(chocolateCake);
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public Recipe getRecipeByName(String name) {
        for(Recipe recipe : recipeList) {
            if(recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
    }
}
