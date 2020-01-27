package com.example.projectmobile4;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapterOefen extends PagerAdapter {
    private LayoutInflater layoutInflater;
    public DatabaseHandler thedb;
    Context context;
    private final String[] route;
    private final String[] namen;
//    private final String[] mp3;
    public ViewPagerAdapterOefen(Context context, String[] route, String[] namen ) { //String[] mp3
        this.context = context;
        this.route = route;
        this.namen = namen;
//        this.mp3 = mp3;
        DatabaseHandler thedb = new DatabaseHandler(context);
    }
    String[] categorieNaam = {
            "dieren01",
            "dieren02",
            "eten",
            "fruit",
            "groente",
            "insecten",
            "kleding",
            "kleuren",
            "weer"
    };

    public String[] getCategorieNaam() {
        return categorieNaam;
    }

    @Override
    public int getCount(){
        if (namen == null) return 0;
        return categorieNaam.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_view, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        int[] inte = new int[route.length];
        int[] routes = new int[route.length];
        int resourceId;
        for (int i = 0; i < route.length; i++){
            try {
                resourceId = context.getResources().getIdentifier(route[i],null,context.getPackageName());
                routes[i] = resourceId;
            } catch(NumberFormatException nfe) {
                System.out.println("Could not parse " + nfe);
            }
         }
        imageView.setImageResource(routes[position]);

        TextView textView = view.findViewById(R.id.naamItem);
        String[] namenn = new String[namen.length];
        for (int i = 0; i < namen.length; i++){
            namenn[i] = namen[i];
        }
        textView.setText(namenn[position]);

//        Button btn_play = view.findViewById(R.id.mp3);
//        final String song = mp3[position];
//        btn_play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    if (mp != null && mp.isPlaying()){
//                        mp.stop();
//                        mp.release();
//                    }
//                    mp = MediaPlayer.create(this, song);
//                }
//            }
//        });

        container.addView(view);

        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){

        container.removeView((RelativeLayout)object);
    }
}
