package com.example.kikkchi19.firsthighland2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

    }
    public void goToTrackPoints(View view) {

        Intent intent = new Intent(this, TrackPoints.class);

        startActivity(intent);

    }
    public void goToMentors(View view) {

        Intent intent = new Intent(this, TrackPoints.class);

        startActivity(intent);

    }

}
