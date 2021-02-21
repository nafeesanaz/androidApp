package com.example.recipes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Crepes", "1 cup all-purpose flour\n" +
                "2 eggs\n" +
                "½ cup milk\n" +
                "½ cup water\n" +
                "¼ teaspoon salt\n" +
                "2 tablespoons butter, melted", "METHOD:", "DirectionsInstructions Checklist\n" +
                "Step 1:\n" +
                "In a large mixing bowl, whisk together the flour and the eggs. Gradually add in the milk and water, stirring to combine. Add the salt and butter; beat until smooth.\n" +
                "\n" +
                "Step 2:\n" +
                "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each crepe. Tilt the pan with a circular motion so that the batter coats the surface evenly.\n" +
                "\n" +
                "Step 3:\n" +
                "Cook the crepe for about 2 minutes, until the bottom is light brown. Loosen with a spatula, turn and cook the other side. Serve hot.\n" +
                "\n" +
                "Nutrition Facts!!\n" +
                "Per Serving: 216 calories; protein 7.4g; carbohydrates 25.5g; fat 9.2g; cholesterol 110.7mg; sodium 235.3mg.\n", R.drawable.crepe ) );


        myRecyclerView = findViewById( R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter( this , recipes1);
        myRecyclerView.setLayoutManager(new GridLayoutManager( this, 1));
        myRecyclerView.setAdapter(myAdapter);


    }




}