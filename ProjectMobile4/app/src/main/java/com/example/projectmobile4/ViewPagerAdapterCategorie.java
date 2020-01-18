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


public class ViewPagerAdapterCategorie extends PagerAdapter {
    static Resources res = null;
    Context context;
    LayoutInflater layoutInflater;

    public ViewPagerAdapterCategorie(Context context) {

        this.context = context;
    }
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
        View view = layoutInflater.inflate(R.layout.image_view,null);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(GalImages[position]);

        TextView textView = view.findViewById(R.id.naamItem);
        textView.setText(categorieNaam[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){

        container.removeView((RelativeLayout)object);
    }
}
