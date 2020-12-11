package com.example.mail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AddListItem extends AppCompatActivity {

    TextInputLayout name;
    TextInputEditText Lname;
    TextInputLayout birthday;
    TextInputLayout adressMail;
    TextInputEditText inptName;
    TextInputEditText inptLname;
    TextInputEditText inptBirthday;
    TextInputEditText inptMailAdress;
    TextInputEditText inptMailText;
    MaterialButton sendMail;
    MaterialButton save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_item);

        name = findViewById(R.id.namelay);
        Lname = findViewById(R.id.lnamelay);
        birthday = findViewById(R.id.birthdaylay);
        adressMail= findViewById(R.id.adressMaillay);
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