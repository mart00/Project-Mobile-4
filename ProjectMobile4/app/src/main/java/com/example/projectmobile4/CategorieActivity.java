package com.example.projectmobile4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class CategorieActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_categorie);
        String sessieVersie = getIntent().getStringExtra("Versie");
        if(sessieVersie.equals("oefen") || sessieVersie.equals("speel")){
            //doe iets
            final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
            ImageAdapter adapter = new ImageAdapter(this);
            viewPager.setAdapter(adapter);

            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                public void onPageScrollStateChanged(int state) {
                }

                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                public void onPageSelected(int position) {
                    String Categorie = categorieNaam[position];
                    setTitle(Categorie);
                    Toast.makeText(getApplicationContext(),Categorie,Toast.LENGTH_SHORT).show();
                }
            });

            TextView displayTextView = findViewById(R.id.versie);

            displayTextView.setText(sessieVersie);

            Button buttonCategorie = findViewById(R.id.buttonCategorie);

            buttonCategorie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(getIntent().getStringExtra("Versie").equals("oefen")) {
                        Intent int1 = new Intent(CategorieActivity.this, OefenActivity.class);
                        int1.putExtra("Categorie", Categorie);
                        startActivity(int1);
                    } else if (getIntent().getStringExtra("Versie").equals("speel")) {
                        //TODO: implementeer speel
                    }
                }
            });

        }else{
            Intent goToMainActivity = new Intent(this, MainActivity.class);
            startActivity(goToMainActivity);
            finish();
        }
    }
    String Categorie = "dieren01";

    String[] categorieNaam = {
        "dieren01",
        "fruit",
        "insecten",
        "groente",
        "dieren02",
        "eten",
        "kleding",
        "weer",
        "kleuren",
    };

    public class ImageAdapter extends PagerAdapter {
        Context context;

        private int[] GalImages = new int[] {
                R.drawable.dieren01_kat,
                R.drawable.fruit_appel,
                R.drawable.insecten_bij,
                R.drawable.groente_doperwten,
                R.drawable.dieren02_schildpad,
                R.drawable.eten_koekjes,
                R.drawable.kleding_trui,
                R.drawable.weer_zon,
                R.drawable.kleuren_groen
        };
        ImageAdapter(Context context){
            this.context=context;
        }


        public int getCount() {
            return GalImages.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((ImageView) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView= new ImageView(context);
            imageView.setImageResource(GalImages[position]);
            ((ViewPager) container).addView(imageView, 0);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((ImageView) object);
        }
    }

    public void Select(){
        if(getIntent().getStringExtra("Versie").equals("oefen")) {
            Intent int1 = new Intent(CategorieActivity.this, OefenActivity.class);
            int1.putExtra("Categorie", Categorie);
            startActivity(int1);
        } else if (getIntent().getStringExtra("Versie").equals("speel")) {
            //TODO: implementeer speel
        }
    }
}

