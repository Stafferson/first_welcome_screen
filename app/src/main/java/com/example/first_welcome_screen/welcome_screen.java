package com.example.first_welcome_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class welcome_screen extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        sp = getPreferences(MODE_PRIVATE);
        int a = sp.getInt("is_first_time", 0);
        if (a == 1) {
            Intent i = new Intent(this, main_screen_not_welcome.class);
            startActivity(i);
        }
    }

    public void onClick(View view) {
        SharedPreferences.Editor ed = sp.edit();
        ed.putInt("choose", 1);
        ed.apply();
        Intent i = new Intent(this, main_screen_not_welcome.class);
        startActivity(i);
    }
}