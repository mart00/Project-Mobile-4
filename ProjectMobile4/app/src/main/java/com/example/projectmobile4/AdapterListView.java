package com.example.projectmobile4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.projectmobile4.Database;

public class AdapterListView extends PagerAdapter{

    private LayoutInflater layoutInflater;
    public Database thedb;
    Context context;

    public AdapterListView(Context context) {
        this.context = context;
        Database thedb = new Database(context);
    }

    private Integer[] images = {
            R.drawable.ned,
            R.drawable.amazigh,
            R.drawable.frans,
            R.drawable.duits,
            R.drawable.spaans,
            R.drawable.engels

    };
    public Integer[] getImages() {
        return images;
    }

    String[] namen = {
            "nederlands",
            "amazigh",
            "frans",
            "duits",
            "spaans",
            "engels"
    };

    public String[] getNamen() {
        return namen;
    }

    @Override
    public int getCount() {
        if (namen == null) return 0;
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int postition) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_view, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(images[postition]);

        TextView naam = view.findViewById(R.id.naamItem);
        naam.setText(namen[postition]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout) object);
    }

}

