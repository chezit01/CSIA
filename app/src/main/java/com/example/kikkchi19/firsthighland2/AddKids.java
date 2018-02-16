package com.example.kikkchi19.firsthighland2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;



public class AddKids extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_kids);


    }

    public void goToConfirm(View view) {

        Intent intent = new Intent(this, ConfirmationPage.class);
        EditText editText = (EditText) findViewById(R.id.KName);
        String kidsName = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, kidsName);
        startActivity(intent);

    }
}
