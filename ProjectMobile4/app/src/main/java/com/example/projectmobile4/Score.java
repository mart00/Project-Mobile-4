package com.example.projectmobile4;

import android.app.Activity;
import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

public class Score extends Activity {
    ViewPager viewPager;
    Database thedb;
    int listViewPosition;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_score);
        thedb = new Database(this);

        String[] score = new String[thedb.getAllNamen2("categorieen") +1];
            for (int i = 1; i <= thedb.getAllNamen2("categorieen"); i++) {
                String da = thedb.getScore("categorieen", i);
                score[i] = da;
            }

        String[] succes = new String[thedb.getAllNamen2("categorieen") +1];
        for (int i = 1; i <= thedb.getAllNamen2("categorieen"); i++) {
            String da = thedb.getSucces("categorieen", i);
            succes[i] = da;
        }
        AdapterScore viewPagerAdapterScore = new AdapterScore(this,score,succes);
        listViewPosition = getIntent().getIntExtra("listViewPosition", 0);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(viewPagerAdapterScore);

    }
}

