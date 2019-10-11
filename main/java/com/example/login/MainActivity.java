package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /**
     * This class contains the protected void method onCreate which sets up the layout for the MainActivity screen.
     * This class also contains the public void method startSettingsActivity which opens the next activity when the button is clicked.
     * @Author Soumya Kakarlapudi, Manogna Namburu, Samiksha Yethimar
     * @Version 11 October, 2019
     * Android Studio Version
     *
     */





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSettingsActivity(View v) {

        startActivity(new Intent(MainActivity.this,SettingsActivity.class));


    }
}