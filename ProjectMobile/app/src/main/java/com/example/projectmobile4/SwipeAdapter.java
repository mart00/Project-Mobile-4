package com.example.projectmobile4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


public class SwipeAdapter extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_oefen, container, false);
        ((ViewPager) view.findViewById(R.id.viewpager)).setAdapter(new ImagePagerAdapter());
        return view;
    }

    private class ImagePagerAdapter extends PagerAdapter {
        private int[] images;
        private String[] namen;

        private ImagePagerAdapter() {
            this.images = new  int[] {
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
            this.namen = new String[]  {
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
        }

        public int getCount() {
            return this.images.length;
        }

        public boolean isViewFromObject(View view, Object object) {
            return view == ((View) object);
        }

        public Object instantiateItem(ViewGroup container, int position) {
            FragmentActivity activity = getActivity();
            View view = ((LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.activity_oefen, container, false);
            ((TextView) view.findViewById(R.id.naam)).setText(this.namen[position]);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(this.images[position]);
            ((ViewPager) container).addView(view, 0);
            return view;
        }

        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((View) object);
        }
    }
}