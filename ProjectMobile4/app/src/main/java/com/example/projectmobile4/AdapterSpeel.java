package com.example.projectmobile4;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class AdapterSpeel extends PagerAdapter {
    private LayoutInflater layoutInflater;
    public Database thedb;
    public Sqlite dbHandler;
    Context context;
    public Speel activity;
    private final String[] route;
    private final String[] namen;
    private final String[] mp3;
    private final String[] amazigh;
    private final  ViewPager viewPager;
    private  final  Integer categorieId;
    private String categorie;
    public AdapterSpeel(Context context, String[] route, String[] namen, String[] amazigh,String[] mp3, ViewPager viewPager, String categorie, Integer categorieId) { //String[] mp3
        this.context = context;
        this.route = route;
        this.namen = namen;
        this.mp3 = mp3;
        this.amazigh = amazigh;
        this.viewPager = viewPager;
        this.categorie = categorie;
        this.dbHandler = new Sqlite(this.context);
        this.categorieId = categorieId;
        thedb = new Sqlite(context).getInstance(context);
    }
    Integer[] images;
    Integer correct;
    int kansen;
    int question = 1;
    int fouten;
    int succes = 1;
    int score = 1;

    @Override
    public int getCount(){
        if (namen == null) return 0;
        return question;
        //return categorieNaam.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, final int position) {
        final AdapterCategorie vpag = new AdapterCategorie(context);
        final String[] categorieen = vpag.getCategorieNaam();
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view = layoutInflater.inflate(R.layout.image_view_speel, null);

        ImageView imageView0 = view.findViewById(R.id.imageView0);
        ImageView imageView1 = view.findViewById(R.id.imageView1);
        ImageView imageView2 = view.findViewById(R.id.imageView2);
        ImageView imageView3 = view.findViewById(R.id.imageView3);
        ImageView imageView4 = view.findViewById(R.id.imageView4);
        ImageView imageView5 = view.findViewById(R.id.imageView5);

        int[] routes = new int[route.length];
        int resourceId;
        for (int i = 1; i < route.length; i++){
            try {
                resourceId = context.getResources().getIdentifier(route[i],null,context.getPackageName());
                routes[i] = resourceId;
            } catch(NumberFormatException nfe) {
                System.out.println("Could not parse " + nfe);
            }
        }

        correct = ThreadLocalRandom.current().nextInt(1, 6);

        String ran[] = random();
        images = new Integer[6];
        for (int i = 0; i < 6; i++){
            try {
                images[i] = Integer.parseInt(ran[i]);
                Log.d("img",String.valueOf(images[i]+1));
            } catch(NumberFormatException nfe) {
                System.out.println("Could not parse " + nfe);
            }
        }
        int img0 = routes[images[0]+1];
        int img1 = routes[images[1]+1];
        int img2 = routes[images[2]+1];
        int img3 = routes[images[3]+1];
        int img4 = routes[images[4]+1];
        int img5 = routes[images[5]+1];

        switch (correct){
            case 0:
                img0 = routes[images[0]+1];
                break;
            case 1:
                img1 = routes[images[1]+1];
                break;
            case 2:
                img2 = routes[images[2]+1];
                break;
            case 3:
                img3 = routes[images[3]+1];
                break;
            case 4:
                img4 = routes[images[4]+1];
                break;
            default:
                img5 = routes[images[5]+1];
        }

        imageView0.setImageResource(img0);
        imageView1.setImageResource(img1);
        imageView2.setImageResource(img2);
        imageView3.setImageResource(img3);
        imageView4.setImageResource(img4);
        imageView5.setImageResource(img5);


        TextView textView = view.findViewById(R.id.naamItem);
        String[] namenn = new String[amazigh.length+1];
        for (int i = 1; i < route.length; i++){
            namenn[i] = amazigh[i];
        }
        switch (correct){
            case 0:
                textView.setText(namenn[images[0]+1]);
                break;
            case 1:
                textView.setText(namenn[images[1]+1]);
                break;
            case 2:
                textView.setText(namenn[images[2]+1]);
                break;
            case 3:
                textView.setText(namenn[images[3]+1]);
                break;
            case 4:
                textView.setText(namenn[images[4]+1]);
                break;
            default:
                textView.setText(namenn[images[5]+1]);
        }

        container.addView(view);

        kansen = 3;


        imageView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correct==0){
                    Toast.makeText(context,"Correct!",Toast.LENGTH_SHORT).show();
                    if(question < route.length){
                        question += 1;
                        notifyDataSetChanged();
                        viewPager.setCurrentItem(position+1);
                        notifyDataSetChanged();
                        destroyItem(container,position-1,view);
                    } else {
                        Toast.makeText(context,"Correct! Dat was de laatste vraag.",Toast.LENGTH_SHORT).show();
                        Boolean update =thedb.setSuccessen(categorie,categorieId+1,thedb.getScore(position+1));
                        forceRunApp(context,"com.example.projectmobile4");

                    }
                } else {
                    kansen --;
                    fouten ++;
                    Toast.makeText(context,"Fout, probeer nog " + kansen + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(kansen<1){
                   Boolean update = thedb.setScore(position+1,thedb.getScore(position+1)+1);
                    forceRunApp(context,"com.example.projectmobile4");
                }
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correct==1){
                    Toast.makeText(context,"Correct!",Toast.LENGTH_SHORT).show();
                    if(question < amazigh.length){
                        question += 1;
                        notifyDataSetChanged();
                        viewPager.setCurrentItem(position+1);
                        notifyDataSetChanged();
                        destroyItem(container,position-1,view);
                    } else {

                        Toast.makeText(context,"Correct! Dat was de laatste vraag.",Toast.LENGTH_SHORT).show();
                        Boolean update =thedb.setSuccessen(categorie,categorieId+1,Integer.parseInt(thedb.getSucces(categorie)+1));
                        forceRunApp(context,"com.example.projectmobile4");
                    }
                } else {
                    kansen --;
                    fouten ++;
                    Toast.makeText(context,"Fout, probeer nog " + kansen + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(kansen<1){
                    Boolean update =thedb.setScore(categorieId+1,thedb.getScore(categorieId+1)+1);
                    forceRunApp(context,"com.example.projectmobile4");
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correct==2){
                    Toast.makeText(context,"Correct!",Toast.LENGTH_SHORT).show();
                    if(question < amazigh.length){
                        question += 1;
                        notifyDataSetChanged();
                        viewPager.setCurrentItem(position+1);
                        notifyDataSetChanged();
                        destroyItem(container,position-1,view);
                    } else {
                        Toast.makeText(context,"Correct! Dat was de laatste vraag.",Toast.LENGTH_SHORT).show();
                        Boolean update =thedb.setSuccessen(categorie,categorieId+1,Integer.parseInt(thedb.getSucces(categorie)+1));
                        forceRunApp(context,"com.example.projectmobile4");

                    }
                } else {
                    kansen --;
                    fouten ++;
                    Toast.makeText(context,"Fout, probeer nog " + kansen + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(kansen<1){
                   Boolean update = thedb.setScore(categorieId+1,thedb.getScore(categorieId+1)+1);
                    forceRunApp(context,"com.example.projectmobile4");
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correct==3){
                    Toast.makeText(context,"Correct!",Toast.LENGTH_SHORT).show();
                    if(question < amazigh.length){
                        question += 1;
                        notifyDataSetChanged();
                        viewPager.setCurrentItem(position+1);
                        notifyDataSetChanged();
                        destroyItem(container,position-1,view);
                    } else {
                        Toast.makeText(context,"Correct! Dat was de laatste vraag.",Toast.LENGTH_SHORT).show();
                        Boolean update =thedb.setSuccessen(categorie,categorieId+1,Integer.parseInt(thedb.getSucces(categorie)+1));
                        forceRunApp(context,"com.example.projectmobile4");
                    }
                } else {
                    kansen --;
                    fouten ++;
                    Toast.makeText(context,"Fout, probeer nog " + kansen + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(kansen<1){
                    Boolean update =thedb.setScore(categorieId+1,thedb.getScore(categorieId+1)+1);
                    forceRunApp(context,"com.example.projectmobile4");
                }
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correct==4){
                    Toast.makeText(context,"Correct!",Toast.LENGTH_SHORT).show();
                    if(question < amazigh.length){
                        question += 1;
                        notifyDataSetChanged();
                        viewPager.setCurrentItem(position+1);
                        notifyDataSetChanged();
                        destroyItem(container,position-1,view);
                    } else {
                        Toast.makeText(context,"Correct! Dat was de laatste vraag.",Toast.LENGTH_SHORT).show();
                        Boolean update =thedb.setSuccessen(categorie,categorieId+1,Integer.parseInt(thedb.getSucces(categorie)+1));
                        forceRunApp(context,"com.example.projectmobile4");
                    }
                } else {
                    kansen --;
                    fouten ++;
                    Toast.makeText(context,"Fout, probeer nog " + kansen + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(kansen<1){
                    Boolean update =thedb.setScore(categorieId+1,thedb.getScore(categorieId+1)+1);
                    forceRunApp(context,"com.example.projectmobile4");
                }
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correct==5){
                    Toast.makeText(context,"Correct!",Toast.LENGTH_SHORT).show();
                    if(question < amazigh.length){
                        question += 1;
                        notifyDataSetChanged();
                        viewPager.setCurrentItem(position+1);
                        notifyDataSetChanged();
                        destroyItem(container,position-1,view);
                    } else {
                        Toast.makeText(context,"Correct! Dat was de laatste vraag.",Toast.LENGTH_SHORT).show();
                        Boolean update =thedb.setSuccessen(categorie,categorieId+1,Integer.parseInt(thedb.getSucces(categorie)+1));
                        forceRunApp(context,"com.example.projectmobile4");
                    }
                } else {
                    kansen --;
                    fouten ++;
                    Toast.makeText(context,"Fout, probeer nog " + kansen + " keer.",Toast.LENGTH_SHORT).show();

                }
                if(kansen<1){
                    Boolean update = thedb.setScore(categorieId+1,thedb.getScore(categorieId+1)+1);
                    forceRunApp(context,"com.example.projectmobile4");
                }
            }
        });

        return view;
    }
//    public Integer getdoot(){
//        final int[] mp3s = new int[mp3.length];
//        switch (correct){
//            case 0:
//                return mp3s[images[0]+1];
//            case 1:
//                return mp3s[images[1]+1];
//            case 2:
//                return mp3s[images[2]+1];
//            case 3:
//                return mp3s[images[3]+1];
//            case 4:
//                return mp3s[images[4]+1];
//            default:
//                return mp3s[images[5]+1];
//        }
//    }
    private static void forceRunApp(Context context, String packageApp){
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(packageApp);
        launchIntent.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(launchIntent);
    }

    public String[] random() {

        HashSet hs = new HashSet();
        String random [] = new String[6];
        Integer i = 0;
        while (hs.size() < 12) {

            int num = (int) (Math.random() * route.length);

            hs.add(num);

        }

        Iterator it = hs.iterator();

        while (it.hasNext()) {
            String doot = it.next().toString();
            random[i] = doot;
            i++;
            System.out.println(it.next());
        }
        return random;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){
        viewPager.removeView((RelativeLayout)object);
    }
}
