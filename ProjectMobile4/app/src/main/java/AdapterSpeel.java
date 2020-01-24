package com.example.projectmobile4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import java.util.concurrent.ThreadLocalRandom;

public class AdapterSpeel extends PagerAdapter {
    private LayoutInflater layoutInflater;
    public Database thedb;
    Context context;
    private boolean swipe;
    private final String[] route;
    private final String[] namen;
    //    private final String[] mp3;
    private final String[] amazigh;
    public AdapterSpeel(Context context, String[] route, String[] namen, String[] amazigh ) { //String[] mp3
        this.context = context;
        this.route = route;
        this.namen = namen;
//        this.mp3 = mp3;
        this.amazigh = amazigh;
        this.swipe = false;
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

    int fouten;
    int question = 1;

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
    public Object instantiateItem(@NonNull final ViewGroup container, final int postition) {
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

        final int correct = ThreadLocalRandom.current().nextInt(0, 6);

        int img0 = routes[rr(routes,postition+1)];
        int img1 = routes[rr(routes,postition+1)];
        int img2 = routes[rr(routes,postition+1)];
        int img3 = routes[rr(routes,postition+1)];
        int img4 = routes[rr(routes,postition+1)];
        int img5 = routes[rr(routes,postition+1)];

        switch (correct){
            case 0:
                img0 = routes[postition+1];
                break;
            case 1:
                img1 = routes[postition+1];
                break;
            case 2:
                img2 = routes[postition+1];
                break;
            case 3:
                img3 = routes[postition+1];
                break;
            case 4:
                img4 = routes[postition+1];
                break;
            default:
                img5 = routes[postition+1];
        }

        imageView0.setImageResource(img0);
        imageView1.setImageResource(img1);
        imageView2.setImageResource(img2);
        imageView3.setImageResource(img3);
        imageView4.setImageResource(img4);
        imageView5.setImageResource(img5);

        TextView textView = view.findViewById(R.id.naamItem);
        String[] namenn = new String[amazigh.length];
        for (int i = 1; i < amazigh.length; i++){
            namenn[i] = amazigh[i];
        }
        textView.setText(namenn[postition+1]);

//        Button btn_play = view.findViewById(R.id.mp3);
//        final String song = mp3[postition];
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

        fouten = 3;


        imageView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correct==0){
                    Toast.makeText(context,"Correct!",Toast.LENGTH_SHORT).show();
                    if(question < amazigh.length){
                        question += 1;
                        notifyDataSetChanged();
                    } else {
                        //TODO Succes situatie
                    }
                } else {
                    fouten -= 1;
                    Toast.makeText(context,"Fout, probeer nog " + fouten + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(fouten<1){
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
                    } else {
                        //TODO Succes situatie
                    }
                } else {
                    fouten -= 1;
                    Toast.makeText(context,"Fout, probeer nog " + fouten + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(fouten<1){
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
                    } else {
                        //TODO Succes situatie
                    }
                } else {
                    fouten -= 1;
                    Toast.makeText(context,"Fout, probeer nog " + fouten + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(fouten<1){
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
                    } else {
                        //TODO Succes situatie
                    }
                } else {
                    fouten -= 1;
                    Toast.makeText(context,"Fout, probeer nog " + fouten + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(fouten<1){
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
                    } else {
                        //TODO: succes situatie
                    }
                } else {
                    fouten -= 1;
                    Toast.makeText(context,"Fout, probeer nog " + fouten + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(fouten<1){
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
                        setPrimaryItem(container,question+1,view);
                        notifyDataSetChanged();
                    } else {
                        //TODO: succes situatie
                    }

                } else {
                    fouten -= 1;
                    Toast.makeText(context,"Fout, probeer nog " + fouten + " keer.",Toast.LENGTH_SHORT).show();
                }
                if(fouten<1){
                    forceRunApp(context,"com.example.projectmobile4");
                }
            }
        });

        return view;
    }

    public static void forceRunApp(Context context, String packageApp){
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(packageApp);
        launchIntent.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(launchIntent);
    }

    public static int rr(int[] routes, int current){
        int random;
        do {
            random = ThreadLocalRandom.current().nextInt(0, routes.length);
        } while(random == current);
        return random;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object){

        container.removeView((RelativeLayout)object);
    }
}
