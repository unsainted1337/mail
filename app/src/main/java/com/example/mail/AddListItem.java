package com.example.mail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.android.material.textfield.TextInputEditText;


public class AddListItem extends AppCompatActivity {


    TextInputEditText inptName;
    TextInputEditText inptLname;
    TextInputEditText inptBirthday;
    TextInputEditText inptMailAdress;
    TextInputEditText inptMailText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_item);

        inptName = findViewById(R.id.inputName);
        inptLname = findViewById(R.id.inputLName);
        inptBirthday = findViewById(R.id.inputbithday);
        inptMailAdress = findViewById(R.id.inputMailadress);
        inptMailText = findViewById(R.id.inputMailText);

    }

    public void save_data(View view){

        Intent intent = new Intent(this,MainActivity.class);

        intent.putExtra("name",inptName.getText().toString());
        intent.putExtra("Lname",inptLname.getText().toString());
        intent.putExtra("birthday", inptBirthday.getText().toString());
        setResult(RESULT_OK, intent);
        finish();

    }


}