//package com.example.projectmobile4;
//
//import android.app.Activity;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//
//import androidx.viewpager.widget.ViewPager;
//
//public class Speel extends Activity {
//    Database thedb;
//    ViewPager viewPager;
//    private Context context;
//    private SQLiteDatabase database;
//    private Sqlite dbHandler;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        Context context = this;
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_speel);
//
//        AdapterCategorie viewPagerAdapterCategorie = new AdapterCategorie(this);
//
//        Integer itemClicked = getIntent().getIntExtra("position",0);
//        String[] categorieNaam = viewPagerAdapterCategorie.getCategorieNaam();
//        String categorie = categorieNaam[itemClicked];
//        String talen = "amazigh";
//
//        Database thedb = new Database(this);
//        String[] routes = {
//                thedb.getRoute(categorie,1),
//                thedb.getRoute(categorie,2),
//                thedb.getRoute(categorie,3),
//                thedb.getRoute(categorie,4),
//                thedb.getRoute(categorie,5),
//                thedb.getRoute(categorie,6),
//                thedb.getRoute(categorie,7),
//                thedb.getRoute(categorie,8),
//                thedb.getRoute(categorie,9),
//                thedb.getRoute(categorie,10),
//                thedb.getRoute(categorie,11),
//                thedb.getRoute(categorie,12),
//                thedb.getRoute(categorie,13),
//                thedb.getRoute(categorie,14),
//                thedb.getRoute(categorie,15)
//        };
//        String[] namen = {
//                thedb.getNamen(talen, categorie,1),
//                thedb.getNamen(talen, categorie,2),
//                thedb.getNamen(talen, categorie,3),
//                thedb.getNamen(talen, categorie,4),
//                thedb.getNamen(talen, categorie,5),
//                thedb.getNamen(talen, categorie,6),
//                thedb.getNamen(talen, categorie,7),
//                thedb.getNamen(talen, categorie,8),
//                thedb.getNamen(talen, categorie,9),
//                thedb.getNamen(talen, categorie,10),
//                thedb.getNamen(talen, categorie,11),
//                thedb.getNamen(talen, categorie,12),
//                thedb.getNamen(talen, categorie,13),
//                thedb.getNamen(talen, categorie,14),
//                thedb.getNamen(talen, categorie,15)
//        };
//        String[] amazigh = {
//                thedb.getAmazigh(categorie,1),
//                thedb.getAmazigh(categorie,2),
//                thedb.getAmazigh(categorie,3),
//                thedb.getAmazigh(categorie,4),
//                thedb.getAmazigh(categorie,5),
//                thedb.getAmazigh(categorie,6),
//                thedb.getAmazigh(categorie,7),
//                thedb.getAmazigh(categorie,8),
//                thedb.getAmazigh(categorie,9),
//                thedb.getAmazigh(categorie,10),
//                thedb.getAmazigh(categorie,11),
//                thedb.getAmazigh(categorie,12),
//                thedb.getAmazigh(categorie,13),
//                thedb.getAmazigh(categorie,14),
//                thedb.getAmazigh(categorie,15)
//        };
//        viewPager = findViewById(R.id.viewpager);
//        AdapterSpeel viewpage = new AdapterSpeel(this,routes,namen,amazigh, viewPager, categorie);
//        viewPager.setAdapter(viewpage);
//        viewPager.setOffscreenPageLimit(14);
//    }
//}
package com.example.projectmobile4;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

public class Speel extends Activity {
    Database thedb;
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
        String talen = "amazigh";

        Database thedb = new Database(this);
        final String[] routes = new String[thedb.getAllNamen(categorie) + 1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
            String da = thedb.getRoute(categorie, i);
            routes[i] = da;
        }
        final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
            String da = thedb.getNamen(talen, categorie, i);
            namen[i] = da;
        }
        final String[] amazigh = new String[thedb.getAllNamen(categorie) + 1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
            String da = thedb.getAmazigh(categorie, i);
            amazigh[i] = da;
        }
        viewPager = findViewById(R.id.viewpager);
        AdapterSpeel viewpage = new AdapterSpeel(this,routes,namen,amazigh, viewPager, categorie);
        viewPager.setAdapter(viewpage);
        viewPager.setOffscreenPageLimit(14);
    }
}