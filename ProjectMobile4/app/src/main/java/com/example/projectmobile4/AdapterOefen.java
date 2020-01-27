package com.example.projectmobile4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class AdapterOefen extends PagerAdapter {

    private LayoutInflater layoutInflater;
    Context context;
    private final String[] route;
    private final String[] namen;
    private final String[] mp3;
    private final String[] amazigh;

    public AdapterOefen(Context context, String[] route, String[] namen, String[] mp3, String[] amazigh ) {
        this.context = context;
        this.route = route;
        this.namen = namen;
        this.mp3 = mp3;
        this.amazigh = amazigh;
        Database thedb = new Database(context);
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
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int postition) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_view, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        int[] routes = new int[route.length];
        int resourceId;
        for (int i = 1; i < route.length; i++){
            try {
                resourceId = context.getResources().getIdentifier(route[i],null, context.getPackageName());
                routes[i] = resourceId;
            } catch(NumberFormatException nfe) {
                System.out.println("Could not parse " + nfe);
            }
         }
        imageView.setImageResource(routes[postition+1]);
        TextView textView = view.findViewById(R.id.naamItem);
        String[] namenn = new String[namen.length];
        for (int i = 1; i < namen.length; i++){
            namenn[i] = namen[i];
        }
        String[] amazigs = new String[amazigh.length];
        for (int i = 1; i < amazigh.length; i++){
            amazigs[i] = amazigh[i];
        }
        textView.setText(namenn[postition+1] +" - "+ amazigs[postition+1]);
        container.addView(view);

        return view;
    }
    @Override
    public int getCount(){
        return route.length-1;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){

        container.removeView((RelativeLayout)object);
    }
}
