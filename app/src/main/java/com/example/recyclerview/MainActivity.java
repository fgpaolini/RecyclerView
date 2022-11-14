package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<FitnessModel> fitnessModels = new ArrayList<>();
    int[] fitnessImages = {R.drawable.fitness_and_heart_healthcare_16876,
            R.drawable.fitness_and_dumbbells_16879,
            R.drawable.healthy_organic_diet_foods_16894,
            R.drawable.jumping_rope_and_fitness_16893,
            R.drawable.man_arm_muscles_16867,
            R.drawable.man_muscles_and_fitness_16863,
            R.drawable.smartphone_health_application_16883,
            R.drawable.strong_woman_dumbbell,
            R.drawable.whey_protein__16881,
            R.drawable.woman_muscles_and_fitness_16864};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpFitnessModels();
        F_RecyclerViewAdapter adapter = new F_RecyclerViewAdapter(this,
                fitnessModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpFitnessModels() {
        String[] fitnessNames = getResources().getStringArray(R.array.fitness_full_txt);
        String[] fitnessNamesAbr = getResources().getStringArray(R.array.fitness_three_txt);
        String[] fitnessNamesLetra = getResources().getStringArray(R.array.fitness_one_txt);

        for (int i=0; i<fitnessNames.length; i++) {
            fitnessModels.add(new FitnessModel(fitnessNames[i],
                    fitnessNamesAbr[i],
                    fitnessNamesLetra[i],
                    fitnessImages[i]));
        }

    }

}