package com.example.projectmobile4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

public class ScoreActivity extends Activity {
    ViewPager viewPager;
    DatabaseHandler thedb;
    int listViewPosition;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            this.setContentView(R.layout.activity_score);
        thedb = new DatabaseHandler(this);


        String[] score = {
                thedb.getScore("categorieen",1),
                thedb.getScore("categorieen",2),
                thedb.getScore("categorieen",3),
                thedb.getScore("categorieen",4),
                thedb.getScore("categorieen",5),
                thedb.getScore("categorieen",6),
                thedb.getScore("categorieen",7),
                thedb.getScore("categorieen",8),
                thedb.getScore("categorieen",9)
        };
        ViewPagerAdapterScore viewPagerAdapterScore = new ViewPagerAdapterScore(this,score);
        final String[] categorie = viewPagerAdapterScore.categorieNaam;
        listViewPosition = getIntent().getIntExtra("listViewPosition", 0);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(viewPagerAdapterScore);
        final int position = viewPager.getCurrentItem();
        TextView displayTextView = findViewById(R.id.versie);

        Button buttonCategorie = findViewById(R.id.buttonCategorie);

    }
}

