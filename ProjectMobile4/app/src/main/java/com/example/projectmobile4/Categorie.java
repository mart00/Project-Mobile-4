package com.example.projectmobile4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager.widget.ViewPager;

public class Categorie extends Activity {

    ViewPager viewPager;
    AdapterList lis;
    Database thedb;
    int listViewPosition;
    String taal2;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_categorie);

        thedb = new Database(this);

        AdapterCategorie adapterCategorie = new AdapterCategorie(this);
        final AdapterListView adapterList = new AdapterListView(this);
        final String[] categorie = adapterCategorie.categorieNaam;

        listViewPosition = getIntent().getIntExtra("listViewPosition", 0);
        String sessieVersie = getIntent().getStringExtra("Versie");

        final String[] taal = adapterList.getNamen();

        Integer[] images = adapterList.getImages();

        if (sessieVersie.equals("oefen")){
        lis = new AdapterList(this, taal, images);
        ListView list;

        list = findViewById(R.id.list);
        list.setAdapter(lis);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1){
                     String [] doot = adapterList.getNamen();
                    taal2 = doot[1];
                    Integer[] images = adapterList.getImages();

                    Toast.makeText(context,doot[1],Toast.LENGTH_SHORT).show();
                    lis = new AdapterList(Categorie.this, doot, images);
                    ListView list;

                    list = findViewById(R.id.list);
                    list.setAdapter(lis);
                }
                else if (position == 2){
                     String [] doot = adapterList.getNamen();
                     taal2 = doot[2];
                    Integer[] images = adapterList.getImages();

                    Toast.makeText(context,doot[2],Toast.LENGTH_SHORT).show();
                    lis = new AdapterList(Categorie.this, doot, images);
                    ListView list;

                    list = findViewById(R.id.list);
                    list.setAdapter(lis);
                }
                else if (position == 3){
                   String [] doot = adapterList.getNamen();
                   taal2 = doot[3];
                    Integer[] images = adapterList.getImages();

                    Toast.makeText(context,doot[3],Toast.LENGTH_SHORT).show();
                    lis = new AdapterList(Categorie.this, doot, images);
                    ListView list;

                    list = findViewById(R.id.list);
                    list.setAdapter(lis);
                }
                else if (position == 4){
                    String [] doot = adapterList.getNamen();
                    taal2 = doot[4];
                    Integer[] images = adapterList.getImages();

                    Toast.makeText(context,doot[4],Toast.LENGTH_SHORT).show();
                    lis = new AdapterList(Categorie.this, doot, images);
                    ListView list;

                    list = findViewById(R.id.list);
                    list.setAdapter(lis);
                }
                else if (position == 5){
                    String [] doot = adapterList.getNamen();
                    taal2 = doot[5];
                    Integer[] images = adapterList.getImages();

                    Toast.makeText(context,doot[5],Toast.LENGTH_SHORT).show();
                    lis = new AdapterList(Categorie.this, doot, images);
                    ListView list;

                    list = findViewById(R.id.list);
                    list.setAdapter(lis);
                }
                else {
                    String [] doot = adapterList.getNamen();
                    taal2 = doot[0];
                    Integer[] images = adapterList.getImages();

                    Toast.makeText(context,doot[0],Toast.LENGTH_SHORT).show();
                    lis = new AdapterList(Categorie.this, doot, images);
                    ListView list;

                    list = findViewById(R.id.list);
                    list.setAdapter(lis);
                }
            }
        });}

        if(sessieVersie.equals("oefen") || sessieVersie.equals("speel")){
            //doe iets

            viewPager = findViewById(R.id.view_pager);
            viewPager.setAdapter(adapterCategorie);
            final int position = viewPager.getCurrentItem();
            TextView displayTextView = findViewById(R.id.versie);

            displayTextView.setText(sessieVersie);

            Button buttonCategorie = findViewById(R.id.buttonCategorie);

            buttonCategorie.setOnClickListener(new AdapterView.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(getIntent().getStringExtra("Versie").equals("oefen")) {
                        Intent int1 = new Intent(Categorie.this, Oefen.class);
                        Integer pos = viewPager.getCurrentItem();
                        int1.putExtra("position", pos);
                        int1.putExtra("taal", taal2);
                        startActivity(int1);
                    } else if (getIntent().getStringExtra("Versie").equals("speel")) {
                        Intent int1 = new Intent(Categorie.this, Speel.class);
                        Integer pos = viewPager.getCurrentItem();
                        int1.putExtra("position", pos);
                        int1.putExtra("taal", taal2);
                        startActivity(int1);
                    }
                }
            });

        }else{
            Intent goToMainActivity = new Intent(this, MainActivity.class);
            startActivity(goToMainActivity);
            finish();
        }
    }

//    public void Select(){
//        AdapterCategorie adapterCategorie = new AdapterCategorie(this);
//        final String[] Categorie = adapterCategorie.categorieNaam;
//        if(getIntent().getStringExtra("Versie").equals("oefen")) {
//            Intent int1 = new Intent(com.example.projectmobile4.Categorie.this, Oefen.class);
//            int1.putExtra("Categorie", Categorie);
//            startActivity(int1);
//        } else if (getIntent().getStringExtra("Versie").equals("speel")) {
//            Intent int1 = new Intent(Categorie.this, Speel.class);
//            int1.putExtra("Categorie", Categorie);
//            startActivity(int1);
//        }
//    }

}

