package com.example.projectmobile4;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


public class AdapterScore extends PagerAdapter {
    static Resources res = null;
    Context context;
    LayoutInflater layoutInflater;
    private final String[] score;
    private final String[] succes;

    public AdapterScore(Context context, String[] score, String[] succes) {

        this.context = context;
        this.score = score;
        this.succes = succes;
    }

    String[] categorieNaam = {
            "dieren01",
            "dieren02",
            "eten",
            "fruit",
            "groente",
            "kleding",
            "kleuren",
            "insecten",
            "weer"
    };
    private int[] GalImages = new int[] {
            R.drawable.dieren01_kat,
            R.drawable.dieren02_schildpad,
            R.drawable.eten_koekjes,
            R.drawable.fruit_appel,
            R.drawable.groente_doperwten,
            R.drawable.kleding_trui,
            R.drawable.kleuren_groen,
            R.drawable.insecten_bij,
            R.drawable.weer_zon

    };
    @Override
    public int getCount(){
        if (categorieNaam == null) return 0;
        return GalImages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view,@NonNull Object object){
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_view_score,null);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(GalImages[position]);

        TextView textView = view.findViewById(R.id.naamItem);
        textView.setText("Categorie: "+categorieNaam[position]);

        String[] scores = new String[score.length];
        for (int i = 0; i < score.length; i++){
            scores[i] = score[i];
        }
        TextView textView2 = view.findViewById(R.id.scoreItem);
        textView2.setText("Aantal fouten: " +scores[position+1] + " - " + "Aantal successen: "+succes[position+1]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){

        container.removeView((RelativeLayout)object);
    }
}
