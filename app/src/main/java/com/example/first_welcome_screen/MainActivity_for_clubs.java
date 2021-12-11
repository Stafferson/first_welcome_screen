package com.example.first_welcome_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity_for_clubs extends AppCompatActivity {
    ListView listView;
    String[] arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_clubs);

        listView = findViewById(R.id.list_view_clubs);

        arr = new String[] {"87004099444", "87714554475", "87472555360", "87086052421", "87076254229", "87074142211", "87079238648", "87775291777", "87780008832", "87772339434", "87471520062", "87015295455", "87781887515", "87086052421", "87473883740", "87770123516"};

        ArrayAdapter<String> arr_adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
        arr_adapter.addAll("Volleyball Club", "College Prep Club", "Football Club", "Fizmat Press", "Basketball club", "Otaku Club|FIZMAT", "Шахматный Клуб", "Stem Sisters", "Dance Club", "Менторский Клуб", "AgroEcoClub", "Дебатный клуб", "Reading Club", "ARights & Wrongs", "Fizmat Speaking Club", "Fizmat Event Club");
        listView.setAdapter(arr_adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str_whatsapp = "https://wa.me/";
                str_whatsapp += arr[view.getId()];
                Uri uri = Uri.parse(str_whatsapp);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
    }
}