package com.example.projectmobile4;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import org.w3c.dom.Text;

import java.util.Arrays;

public class OefenActivity extends AppCompatActivity {
    private MediaPlayer mp = new MediaPlayer();
    private int currentPosition = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        TextView integerTextView = (TextView)findViewById(R.id.naam);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefen);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            public void onPageScrollStateChanged(int state){
            }
            public void onPageScrolled(int position, float positionOffset,
                                       int positionOffsetPixels){
            }
            public void onPageSelected ( int position){
                String s = "Plaatje " + String.valueOf(position + 1);
                setTitle(s);
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }

        });
    }
    public class ImageAdapter extends PagerAdapter{
        Context context;
        public int[] images = new int[] {
                R.drawable.dieren01_ezel,
                R.drawable.dieren01_egel,
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

        public int[] Sound = new int[]{
                R.raw.dieren01_ezel,
                R.raw.dieren01_egel,
                R.raw.dieren01_geit,
                R.raw.dieren01_hond,
                R.raw.dieren01_jakhals,
                R.raw.dieren01_kat,
                R.raw.dieren01_kikker,
                R.raw.dieren01_kip,
                R.raw.dieren01_koe,
                R.raw.dieren01_konijn,
                R.raw.dieren01_muis,
                R.raw.dieren01_paard,
                R.raw.dieren01_schaap,
                R.raw.dieren01_vis,
                R.raw.dieren01_vogel
        };
        ImageAdapter(Context context){this.context=context;}
        public int getCount(){
            return images.length;
        }
        @Override
        public boolean isViewFromObject(View view, Object object){
            return view == ((ImageView) object);
        }
        public Object instantiateItem(ViewGroup container, int position){
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(images[position]);
            ((ViewPager) container).addView(imageView, 0);
            return imageView;
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object){
            ((ViewPager) container).removeView((ImageView) object);
        }
    }
}
