package com.example.kikkchi19.firsthighland2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.Object;

public class TrackPoints extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_points);

    }
    public void goToAddKids(View view) {

        Intent intent = new Intent(this, AddKids.class);

        startActivity(intent);

    }

}
