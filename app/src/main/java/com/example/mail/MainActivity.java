package com.example.mail;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    int req_code_name;
    String name;
    String Lname;
    String birthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<data_get_set> arrayList = new ArrayList<>();

        arrayList.add(new data_get_set("name", "lname","09.04.2002",0));
        arrayList.add(new data_get_set(name, Lname,birthday,0));

      ArrAdapter arrAdapter = new ArrAdapter(this, R.layout.list_row,arrayList);



      listView.setAdapter(arrAdapter);
    }

    public void add_list_item(View view) {

        Intent intent = new Intent(this,AddListItem.class);
        startActivityForResult(intent,req_code_name);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
             name = getIntent().getStringExtra("name");
             Lname = getIntent().getStringExtra("Lname");
             birthday = getIntent().getStringExtra("birthday");

        }
    }
}