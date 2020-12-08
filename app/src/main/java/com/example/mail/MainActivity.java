package com.example.mail;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<data_get_set> arrayList = new ArrayList<>();

      ArrAdapter arrAdapter = new ArrAdapter(this, R.layout.list_row,arrayList);

      listView.setAdapter(arrAdapter);
    }


}