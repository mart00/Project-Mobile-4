package com.example.projectmobile4;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class Oefen extends AppCompatActivity {
    ViewPager viewPager;
    AdapterList lis;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefen);

        AdapterCategorie adapterCategorie = new AdapterCategorie(this);
        AdapterListView view = new AdapterListView(context);
        final Database thedb = new Database(this);

        Integer itemClicked = getIntent().getIntExtra("position", 0);
        String taal = getIntent().getStringExtra("taal");

        String[] categorieNaam = adapterCategorie.getCategorieNaam();
        final String categorie = categorieNaam[itemClicked];
        final String[] talenNaam = view.getNamen();
        String tale;

        final String[] routes = new String[thedb.getAllNamen(categorie) + 1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
            String da = thedb.getRoute(categorie, i);
            routes[i] = da;
        }
        final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
            String da = thedb.getNamen(taal, categorie, i);
            namen[i] = da;
        }
        final String[] amazigh = new String[thedb.getAllNamen(categorie) + 1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
            String da = thedb.getAmazigh(categorie, i);
            amazigh[i] = da;
        }
        final String[] mp3 = new String[thedb.getAllNamen(categorie) + 1];
        for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
            String da = thedb.getMp3(categorie, i);
            mp3[i] = da;
        }
        final int[] mp3s = new int[mp3.length];

        AdapterOefen viewpage = new AdapterOefen(this, routes, namen, mp3, amazigh);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(viewpage);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            boolean first = true;

            public void onPageScrollStateChanged(int state) {
            }

            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (first && positionOffset == 0 && positionOffsetPixels == 0) {
                    onPageSelected(0);
                    first = false;
                }
            }

            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        for (int i = 1; i < mp3.length; i++) {
                            try {
                                mp3s[i] = context.getResources().getIdentifier(mp3[i], "raw", context.getPackageName());
                            } catch (NumberFormatException nfe) {
                                System.out.println("Could not parse " + nfe);
                            }
                        }
                        int i = position;
                        MediaPlayer mp;
                        mp = MediaPlayer.create(context, mp3s[position + 1]);
                        mp.start();
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        break;

                    default:

                        for (int b = 1; b < mp3.length; b++) {
                            try {
                                mp3s[b] = context.getResources().getIdentifier(mp3[b], "raw", context.getPackageName());
                            } catch (NumberFormatException nfe) {
                                System.out.println("Could not parse " + nfe);
                            }
                        }
                        int b = position;
                        MediaPlayer mpp;
                        mpp = MediaPlayer.create(context, mp3s[position + 1]);
                        mpp.start();
                        mpp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mpp) {
                                mpp.release();
                            }
                        });
                        break;
                }
            }
        });

//
//        final String[] itemname = view.getNamen();
//        Integer[] images = view.getImages();
//
//        lis = new AdapterList(this, itemname, images);
//        ListView list;
//
//        list = findViewById(R.id.list);
//        list.setAdapter(lis);
//
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0){
//                    final String talenn = talenNaam[0];
//                    final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
//                    for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
//                        String da = thedb.getNamen(talenn, categorie, i);
//                        namen[i] = da;
//                    }
//                    Toast.makeText(context, "0", Toast.LENGTH_SHORT).show();
//                    AdapterOefen viewpage = new AdapterOefen(context, routes, namen, mp3, amazigh);
//                    viewPager = findViewById(R.id.viewpager);
//                    viewPager.setAdapter(viewpage);
//                }
//                else if (position == 1){
//                    final String talenn = talenNaam[1];
//                    final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
//                    for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
//                        String da = thedb.getNamen(talenn, categorie, i);
//                        namen[i] = da;
//                    }
//                    Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
//                    AdapterOefen viewpage = new AdapterOefen(context, routes, namen, mp3, amazigh);
//                    viewPager = findViewById(R.id.viewpager);
//                    viewPager.setAdapter(viewpage);
//                }
//                else if (position == 2){
//                    final String talenn = talenNaam[2];
//                    final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
//                    for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
//                        String da = thedb.getNamen(talenn, categorie, i);
//                        namen[i] = da;
//                    }
//                    Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
//                    AdapterOefen viewpage = new AdapterOefen(context, routes, namen, mp3, amazigh);
//                    viewPager = findViewById(R.id.viewpager);
//                    viewPager.setAdapter(viewpage);
//                }
//                else if (position == 3){
//                    final String talenn = talenNaam[3];
//                    final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
//                    for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
//                        String da = thedb.getNamen(talenn, categorie, i);
//                        namen[i] = da;
//                    }
//                    Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
//                    AdapterOefen viewpage = new AdapterOefen(context, routes, namen, mp3, amazigh);
//                    viewPager = findViewById(R.id.viewpager);
//                    viewPager.setAdapter(viewpage);
//                }
//                else if (position == 4){
//                    final String talenn = talenNaam[4];
//                    final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
//                    for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
//                        String da = thedb.getNamen(talenn, categorie, i);
//                        namen[i] = da;
//                    }
//                    Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
//                    AdapterOefen viewpage = new AdapterOefen(context, routes, namen, mp3, amazigh);
//                    viewPager = findViewById(R.id.viewpager);
//                    viewPager.setAdapter(viewpage);
//                }
//                else if (position == 5){
//                    final String talenn = talenNaam[5];
//                    final String[] namen = new String[thedb.getAllNamen(categorie) + 1];
//                    for (int i = 1; i <= thedb.getAllNamen(categorie); i++) {
//                        String da = thedb.getNamen(talenn, categorie, i);
//                        namen[i] = da;
//                    }
//                    Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
//                    AdapterOefen viewpage = new AdapterOefen(context, routes, namen, mp3, amazigh);
//                    viewPager = findViewById(R.id.viewpager);
//                    viewPager.setAdapter(viewpage);
//                }
//            }
//        });
    }
}


