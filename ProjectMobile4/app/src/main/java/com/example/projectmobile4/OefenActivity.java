package com.example.projectmobile4;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class OefenActivity extends AppCompatActivity {
    private MediaPlayer mp = new MediaPlayer();
    DatabaseHandler thedb;
    ViewPager viewPager;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        thedb = new DatabaseHandler(this);
        setContentView(R.layout.activity_oefen);

        viewPager = findViewById(R.id.viewpager);
        ViewPagerAdapterOefen viewPagerAdapterOefen = new ViewPagerAdapterOefen(this);
        viewPager.setAdapter(viewPagerAdapterOefen);
    }
}
