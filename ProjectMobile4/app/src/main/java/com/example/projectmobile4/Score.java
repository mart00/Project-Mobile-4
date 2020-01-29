package com.example.projectmobile4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;

import androidx.viewpager.widget.ViewPager;

public class Score extends Activity {
    ViewPager viewPager;
    Database thedb;
    int listViewPosition;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Context context = this;
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_score);
        thedb = new Database(context);

        AdapterCategorie viewPagerAdapterCategorie = new AdapterCategorie(this);
        String[] categorieNaam = viewPagerAdapterCategorie.getCategorieNaam();
        String categorie = categorieNaam[listViewPosition];

        Integer[] score = new Integer[1];
        score[0] = thedb.getScore(listViewPosition+1);

        String[] succes = new String[1];
        succes[0] = thedb.getSucces(categorie);

        AdapterScore viewPagerAdapterScore = new AdapterScore(this,score,succes,categorie);
        listViewPosition = getIntent().getIntExtra("listViewPosition", 0);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(viewPagerAdapterScore);

    }
}

