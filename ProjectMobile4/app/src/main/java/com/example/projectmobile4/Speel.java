package com.example.projectmobile4;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

public class Speel extends Activity {
    ViewPager viewPager;
    private Context context;
    private SQLiteDatabase database;
    private Sqlite dbHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speel);

        AdapterCategorie viewPagerAdapterCategorie = new AdapterCategorie(this);

        Integer itemClicked = getIntent().getIntExtra("position",0);
        String[] categorieNaam = viewPagerAdapterCategorie.getCategorieNaam();
        String categorie = categorieNaam[itemClicked];

        Database thedb = new Database(this);
        String[] routes = new String[thedb.getAllNamen(categorie)+1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++){
            String da = thedb.getRoute(categorie,i);
            routes[i] = da;
        }
        String[] namen = new String[thedb.getAllNamen(categorie)+1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++){
            String da = thedb.getNamen(categorie,i);
            namen[i] = da;
        }
        final String[] amazigh = new String[thedb.getAllNamen(categorie)+1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++){
            String da = thedb.getAmazigh(categorie,i);
            amazigh[i] = da;
        }
        com.example.projectmobile4.AdapterSpeel viewpage = new com.example.projectmobile4.AdapterSpeel(this,routes,namen,amazigh);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(viewpage);
    }
}