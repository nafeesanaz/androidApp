package com.example.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {

    public TextView mRecipeName;
    public TextView mRecipeIngredient;
    public TextView mRecipeMethodTitle;
    public TextView mRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe2);

        mRecipeName = findViewById(R.id.text_recipes);
        mRecipeIngredient = findViewById(R.id.ingredient);
        mRecipeMethodTitle = findViewById(R.id.title);
        mRecipe = findViewById(R.id.recipe);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("RecipeName");
        String Ingredient = intent.getExtras().getString("RecipeIngredient");
        String MethodTitle = intent.getExtras().getString("RecipeMethodTitle");
        String Recipe = intent.getExtras().getString("Recipe");

        mRecipeName.setText(Title);
        mRecipeIngredient.setText(Ingredient);
        mRecipeMethodTitle.setText(MethodTitle);
        mRecipeMethodTitle.setText(Recipe);




    }
}