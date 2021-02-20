package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import org.w3c.dom.Text;

public class RecipeActivity extends AppCompatActivity {

    private TextView mRecipeName;
    private TextView mRecipeIngredient;
    private TextView mRecipeMethodTitle;
    private TextView mRecipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe2);

        mRecipeName = (TextView)findViewById(R.id.text_recipes);
        mRecipeIngredient = (TextView)findViewById(R.id.ingredient);
        mRecipeMethodTitle = (TextView)findViewById(R.id.title);
        mRecipe = (TextView)findViewById(R.id.recipe);

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