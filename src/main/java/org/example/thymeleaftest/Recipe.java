package org.example.thymeleaftest;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    List<Ingredients> ingredientsList = new ArrayList<>();
    String name;

    public Recipe(List<Ingredients> ingredientsList, String name) {
        this.ingredientsList = ingredientsList;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
