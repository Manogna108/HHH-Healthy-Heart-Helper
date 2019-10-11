package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nutrition extends AppCompatActivity {
    /**
     * This class contains the protected void method onCreate which sets up the layout for the Nutrition screen.
     * This class also contains the public void method startExercise which opens the next activity when the button is clicked.
     * @Author Soumya Kakarlapudi, Manogna Namburu, Samiksha Yethimar
     * @Version 11 October, 2019
     * Android Studio Version
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
    }
    public void startExercise (View v) {

        startActivity(new Intent(Nutrition.this, Exercise.class));
    }
}
