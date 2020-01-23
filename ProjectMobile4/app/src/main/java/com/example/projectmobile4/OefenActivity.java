package com.example.projectmobile4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class OefenActivity extends AppCompatActivity {
    private MediaPlayer mp = new MediaPlayer();
    DatabaseHandler thedb;
    ViewPager viewPager;
    private Context context;
    private SQLiteDatabase database;
    private SqliteHandeler dbHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefen);

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
        ViewPagerAdapterOefen viewpage = new ViewPagerAdapterOefen(this,routes,namen);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(viewpage);
    }
}


