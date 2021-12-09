package com.example.first_welcome_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class main_screen_not_welcome extends AppCompatActivity {

    ListView lv;
    EditText et;

    String[] arr_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_not_welcome);
        lv = findViewById(R.id.list_view);
        et = findViewById(R.id.editText_class);

        ArrayAdapter<String> ar_adapt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                System.out.println(s);
                System.out.println("gay");
                System.out.println(start);
                System.out.println(before);
                System.out.println(count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("?????");
                System.out.println(s);
                ArrayAdapter<String> arr_adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
                arr_adapter.addAll(is_in_arr(s.toString()));
                lv.setAdapter(arr_adapter);
            }
        });

        arr_str = new String[] {"7 A", "7 B", "7 C", "7 D", "7 E", "7 F", "8 A", "8 B", "8 C", "8 D", "8 E", "8 F", "8 K", "8 L", "9 A", "9 B", "9 C", "9 D", "9 E", "9 F", "9 K", "9 L", "10 A", "10 B", "10 C", "10 D", "10 E", "10 F", "10 K", "10 XZ", "11 A", "11 B", "11 C", "11 D", "11 E", "11 F"};

    }

    public ArrayList<String> is_in_arr(String request_str) {
        ArrayList<String> arr_ans = new ArrayList<String>();
        for (int i = 0; i < arr_str.length; i++) {
            if (arr_str[i].contains(request_str)){
                arr_ans.add(arr_str[i]);
            }
        }
        return arr_ans;
    }
}