package com.example.projectmobile4;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

public class SpeelActivity extends Activity {
    DatabaseHandler thedb;
    ViewPager viewPager;
    private Context context;
    private SQLiteDatabase database;
    private SqliteHandeler dbHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speel);

        ViewPagerAdapterCategorie viewPagerAdapterCategorie = new ViewPagerAdapterCategorie(this);

        Integer itemClicked = getIntent().getIntExtra("position",0);
        String[] categorieNaam = viewPagerAdapterCategorie.getCategorieNaam();
        String categorie = categorieNaam[itemClicked];

        DatabaseHandler thedb = new DatabaseHandler(this);
        String[] routes = {
                thedb.getRoute(categorie,1),
                thedb.getRoute(categorie,2),
                thedb.getRoute(categorie,3),
                thedb.getRoute(categorie,4),
                thedb.getRoute(categorie,5),
                thedb.getRoute(categorie,6),
                thedb.getRoute(categorie,7),
                thedb.getRoute(categorie,8),
                thedb.getRoute(categorie,9),
                thedb.getRoute(categorie,10),
                thedb.getRoute(categorie,11),
                thedb.getRoute(categorie,12),
                thedb.getRoute(categorie,13),
                thedb.getRoute(categorie,14),
                thedb.getRoute(categorie,15)
        };
        String[] namen = {
                thedb.getNamen(categorie,1),
                thedb.getNamen(categorie,2),
                thedb.getNamen(categorie,3),
                thedb.getNamen(categorie,4),
                thedb.getNamen(categorie,5),
                thedb.getNamen(categorie,6),
                thedb.getNamen(categorie,7),
                thedb.getNamen(categorie,8),
                thedb.getNamen(categorie,9),
                thedb.getNamen(categorie,10),
                thedb.getNamen(categorie,11),
                thedb.getNamen(categorie,12),
                thedb.getNamen(categorie,13),
                thedb.getNamen(categorie,14),
                thedb.getNamen(categorie,15)
        };
        String[] amazigh = {
                thedb.getAmazigh(categorie,1),
                thedb.getAmazigh(categorie,2),
                thedb.getAmazigh(categorie,3),
                thedb.getAmazigh(categorie,4),
                thedb.getAmazigh(categorie,5),
                thedb.getAmazigh(categorie,6),
                thedb.getAmazigh(categorie,7),
                thedb.getAmazigh(categorie,8),
                thedb.getAmazigh(categorie,9),
                thedb.getAmazigh(categorie,10),
                thedb.getAmazigh(categorie,11),
                thedb.getAmazigh(categorie,12),
                thedb.getAmazigh(categorie,13),
                thedb.getAmazigh(categorie,14),
                thedb.getAmazigh(categorie,15)
        };
        viewPager = findViewById(R.id.viewpager);
        ViewPagerAdapterSpeel viewpage = new ViewPagerAdapterSpeel(this,routes,namen,amazigh, viewPager);
        viewPager.setAdapter(viewpage);
        viewPager.setOffscreenPageLimit(14);
    }
}