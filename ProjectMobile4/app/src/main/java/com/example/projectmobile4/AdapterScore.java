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
    private final Integer[] score;
    private final String[] succes;
    private final String categorie;

    public AdapterScore(Context context, Integer[] score, String[] succes, String categorie) {
        this.categorie = categorie;
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
    public String[] getCategorieNaam() {
        return categorieNaam;
    }
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
        Database thedb = new Database(context);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_view_score,null);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(GalImages[position]);

        TextView textView = view.findViewById(R.id.naamItem);
        textView.setText("Categorie: "+categorieNaam[position]);

        TextView textView2 = view.findViewById(R.id.scoreItem);
        String text = "Aantal fouten: " +thedb.getScore(position+1)+" - " + "Aantal successen: "+thedb.getSucces(categorie);
        textView2.setText(text);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){

        container.removeView((RelativeLayout)object);
    }
}
