package com.example.recipes;

public class Recipes {
    private final String RecipeName;
    private final String RecipeIngredient;
    private final String RecipeMethodTitle;
    private final String Recipe;
    private final int Thumbnail;

    public Recipes(String name, String recipeIngredient,String recipeMethodTitle, String recipe, int thumbnail)
    {
        RecipeName = name;
        RecipeIngredient = recipeIngredient;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;

    }

    public String getRecipeName() {
        return RecipeName;
    }

    public String getRecipeIngredient() {
        return RecipeIngredient;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }
}
