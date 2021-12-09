package com.example.first_welcome_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class main_screen_not_welcome extends AppCompatActivity {

    ListView lv;
    EditText et;
    ArrayList<String> classes = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_not_welcome);
        lv = findViewById(R.id.list_view);
        et = findViewById(R.id.editText_class);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        String[] arr_str = {"A", "B", "C", "D", "E", "F", "K", "L", "XZ", "A", "B", "C", "D", "E", "F", "K", "L", "XZ", "A", "B", "C", "D", "E", "F", "K", "L", "XZ", "A", "B", "C", "D", "E", "F", "K", "L", "XZ", "A", "B", "C", "D", "E", "F", "K", "L", "XZ", };

        int counter = 0;
        int classes
        for (int i = 0; i < 43; i++) {
            if (counter < 7) {
                classes.("7" + arr_str[])
            }
        }
    }
}