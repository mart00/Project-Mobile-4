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

public class ViewPagerAdapterOefen extends PagerAdapter {
    private LayoutInflater layoutInflater;
    public DatabaseHandler thedb;
    Context context;

    public ViewPagerAdapterOefen(Context context) {
        this.context = context;
        DatabaseHandler thedb = new DatabaseHandler(context);
    }
    private Integer[] images = {
            R.drawable.dieren01_egel,
            R.drawable.dieren01_ezel,
            R.drawable.dieren01_geit,
            R.drawable.dieren01_hond,
            R.drawable.dieren01_jakhals,
            R.drawable.dieren01_kat,
            R.drawable.dieren01_kikker,
            R.drawable.dieren01_kip,
            R.drawable.dieren01_koe,
            R.drawable.dieren01_konijn,
            R.drawable.dieren01_muis,
            R.drawable.dieren01_paard,
            R.drawable.dieren01_schaap,
            R.drawable.dieren01_vis,
            R.drawable.dieren01_vogel,
    };
//    private Integer[] images = {
//            Integer.valueOf(thedb.getResource(1)),
//            Integer.valueOf(thedb.getRoute(1)),
//            Integer.valueOf(thedb.getRoute(1)),
//            Integer.valueOf(thedb.getRoute(1)),
//            Integer.valueOf(thedb.getRoute(1)),
//            Integer.valueOf(thedb.getRoute(1)),
//            Integer.valueOf(thedb.getRoute(1)),
//            Integer.valueOf(thedb.getRoute(1))
//
//    };
//    private String[] namen = {
//            doot.getName(1),
//            thedb.getName(2),
//            thedb.getName(3),
//            thedb.getName(4),
//            thedb.getName(5),
//            thedb.getName(6),
//            thedb.getName(7),
//            thedb.getName(8),
//            thedb.getName(9),
//            thedb.getName(10),
//            thedb.getName(11),
//            thedb.getName(12),
//            thedb.getName(13),
//            thedb.getName(14),
//            thedb.getName(15)
//    };
    private String[] namen = {
                     "Egel",
                    "Ezel",
                    "Geit",
                    "Hond",
                    "Jakhals",
                    "Kat",
                    "Kikker",
                    "Kip",
                    "Koe",
                    "Konijn",
                    "Muis",
                    "Paard",
                    "Schaap",
                    "Vis",
                    "Vogel"

};

    @Override
    public int getCount(){
        if (namen == null) return 0;
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int postition){
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_view,null);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(images[postition]);

        TextView textView = view.findViewById(R.id.naamItem);
        textView.setText(namen[postition]);

        container.addView(view);

        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){

        container.removeView((RelativeLayout)object);
    }
}
