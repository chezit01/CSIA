package com.example.kikkchi19.firsthighland2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;


public class ConfirmationPage extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_page);
        Intent intent = getIntent();
        String kidsName = intent.getStringExtra(AddKids.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.KName);
        textView.setText(kidsName);
    }
}

