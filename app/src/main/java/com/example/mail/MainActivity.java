package com.example.mail;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        arrayList.add(new data_get_set("name", "lname","09.04.2002",0));

      ArrAdapter arrAdapter = new ArrAdapter(this, R.layout.list_row,arrayList);



      listView.setAdapter(arrAdapter);
    }

    public void add_list_item(View view) {

        Intent intent = new Intent(this,AddListItem.class);
        startActivity(intent);

    }
}