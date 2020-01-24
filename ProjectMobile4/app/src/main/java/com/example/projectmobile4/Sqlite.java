package com.example.projectmobile4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sqlite extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 20;
    protected static final String DATABASE_NAME = "categorieen";
     static final String COL1 = "ID";
     static final String COL2 = "categorie";
     static final String COL3 = "naam";
     static final String COL4 = "route";
     static final String COL5 = "routeMuziek";
     static final String COL6 = "amazigh";

    public Sqlite(Context context){
        super(context, DATABASE_NAME, null,  DATABASE_VERSION);
    }

    @Override

    public void onCreate(SQLiteDatabase db){

        insert(db);

    }
    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS dieren01");
        db.execSQL("DROP TABLE IF EXISTS dieren02");
        db.execSQL("DROP TABLE IF EXISTS eten");
        db.execSQL("DROP TABLE IF EXISTS fruit");
        db.execSQL("DROP TABLE IF EXISTS groente");
        db.execSQL("DROP TABLE IF EXISTS insecten");
        db.execSQL("DROP TABLE IF EXISTS kleding");
        db.execSQL("DROP TABLE IF EXISTS kleuren");
        db.execSQL("DROP TABLE IF EXISTS weer");
        onCreate(db);
    }


    public void insert(SQLiteDatabase db) {


        //dieren01 aanmaken
        db.execSQL("CREATE TABLE IF NOT EXISTS dieren01" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'egel','drawable/dieren01_egel','raw/dieren01_egel','aɣyul')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'ezel','drawable/dieren01_ezel','raw/dieren01_ezel','insi')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'geit','drawable/dieren01_geit','raw/dieren01_geit','tɣaṭṭ')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'hond','drawable/dieren01_hond','raw/dieren01_hond','ayḍi')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'jakhals','drawable/dieren01_jakhals','raw/dieren01_jakhals','uccen')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'kat','drawable/dieren01_kat','raw/dieren01_kat','mucc')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'kikker','drawable/dieren01_kikker','raw/dieren01_kikker','aqaqriw')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'kip','drawable/dieren01_kip','raw/dieren01_kip','tyaziḍt')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'koe','drawable/dieren01_koe','raw/dieren01_koe','tafunast')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'konijn','drawable/dieren01_konijn','raw/dieren01_konijn','aqninni')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'muis','drawable/dieren01_muis','raw/dieren01_muis','aɣerda')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'paard','drawable/dieren01_paard','raw/dieren01_paard','ayis')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'schaap','drawable/dieren01_schaap','raw/dieren01_schaap','icerri')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'vis','drawable/dieren01_vis','raw/dieren01_vis','aslem')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'vogel','drawable/dieren01_vogel','raw/dieren01_vogel','agḍiḍ')");
        //dieren02 aanmaken
        db.execSQL("CREATE TABLE dieren02" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'duif','drawable/dieren02_duif','raw/dieren02_duif','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'gekko','drawable/dieren02_gekko','raw/dieren02_gekko','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'haas','drawable/dieren02_haas','raw/dieren02_haas','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'hyena','drawable/dieren02_hyena','raw/dieren02_hyena','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'kameleon','drawable/dieren02_kameleon','raw/dieren02_kameleon','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'patrijs','drawable/dieren02_patrijs','raw/dieren02_patrijs','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'schildpad','drawable/dieren02_schildpad','raw/dieren02_schildpad','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'schorpioen','drawable/dieren02_schorpioen','raw/dieren02_schorpioen','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'slang','drawable/dieren02_slang','raw/dieren02_slang','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'stekelvarken','drawable/dieren02_stekelvarken','raw/dieren02_stekelvarken','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'uil','drawable/dieren02_uil','raw/dieren02_uil','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'vos','drawable/dieren02_vos','raw/dieren02_vos','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'wildzwijn','drawable/dieren02_wildzwijn','raw/dieren02_wildzwijn','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'windhond','drawable/dieren02_windhond','raw/dieren02_windhond','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'zwaluw','drawable/dieren02_zwaluw','raw/dieren02_zwaluw','placeholder')");

        db.execSQL("CREATE TABLE eten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'boter','drawable/eten_boter','raw/eten_boter','ddhen')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'brood','drawable/eten_brood','raw/eten_brood','aɣrum')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'eieren','drawable/eten_eieren','raw/eten_eieren','timejjalin')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'honing','drawable/eten_honing','raw/eten_honing','tamment')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'koekjes','drawable/eten_koekjes','raw/eten_koekjes','ɣayiṭa')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'koffie','drawable/eten_koffie','raw/eten_koffie','rqehwa')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'melk','drawable/eten_melk','raw/eten_melk','aɣi')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'olie','drawable/eten_olie','raw/eten_olie','zzict')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'suiker','drawable/eten_suiker','raw/eten_suiker','sseqqur')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'thee','drawable/eten_thee','raw/eten_thee','atay')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'vissen','drawable/eten_vissen','raw/eten_vissen','iselman')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'vlees','drawable/eten_vlees','raw/eten_vlees','aysum')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'water','drawable/eten_water','raw/eten_water','aman')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'yoghurt','drawable/eten_yoghurt','raw/eten_yoghurt','accil')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'zout','drawable/eten_zout','raw/eten_zout','tamellaḥt')");

        db.execSQL("CREATE TABLE fruit" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'abrikoos','drawable/fruit_abrikoos','raw/fruit_abrikoos','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'appel','drawable/fruit_appel','raw/fruit_appel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'bananen','drawable/fruit_bananen','raw/fruit_bananen','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'cactusvijg','drawable/fruit_cactusvijg','raw/fruit_cactusvijg','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'citroen','drawable/fruit_citroen','raw/fruit_citroen','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'dadel','drawable/fruit_dadel','raw/fruit_dadel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'druiven','drawable/fruit_druiven','raw/fruit_druiven','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'granaatappel','drawable/fruit_granaatappel','raw/fruit_granaatappel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'honingmeloen','drawable/fruit_honingmeloen','raw/fruit_honingmeloen','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'peer','drawable/fruit_peer','raw/fruit_peer','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'perzik','drawable/fruit_perzik','raw/fruit_perzik','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'pruim','drawable/fruit_pruim','raw/fruit_pruim','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'sinaasappel','drawable/fruit_sinaasappel','raw/fruit_sinaasappel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'vijg','drawable/fruit_vijg','raw/fruit_vijg','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'watermeloen','drawable/fruit_watermeloen','raw/fruit_watermeloen','placeholder')");

        db.execSQL("CREATE TABLE groente" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'aardappel','drawable/groente_aardappel','raw/groente_aardappel','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'bonen','drawable/groente_bonen','raw/groente_bonen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'doperwten','drawable/groente_doperwten','raw/groente_doperwten','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'kikkererwten','drawable/groente_kikkererwten','raw/groente_kikkererwten','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'knoflook','drawable/groente_knoflook','raw/groente_knoflook','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'linzen','drawable/groente_linzen','raw/groente_linzen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'mais','drawable/groente_mais','raw/groente_mais','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'olijven','drawable/groente_olijven','raw/groente_olijven','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'paprika','drawable/groente_paprika','raw/groente_paprika','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'pompoen','drawable/groente_pompoen','raw/groente_pompoen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'spinazie','drawable/groente_spinazie','raw/groente_spinazie','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'tomaat','drawable/groente_tomaat','raw/groente_tomaat','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'tuinbonen','drawable/groente_tuinbonen','raw/groente_tuinbonen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'ui','drawable/groente_ui','raw/groente_ui','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'wortel','drawable/groente_wortel','raw/groente_wortel','placeholder')");

        db.execSQL("CREATE TABLE insecten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'bidsprinkhaan','drawable/insecten_bidsprinkhaan','raw/insecten_bidsprinkhaan','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'bij','drawable/insecten_bij','raw/insecten_bij','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'bloedzuiger','drawable/insecten_bloedzuiger','raw/insecten_bloedzuiger','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'larve','drawable/insecten_larve','raw/insecten_larve','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'mier','drawable/insecten_mier','raw/insecten_mier','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'mug','drawable/insecten_mug','raw/insecten_mug','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'naaktslak','drawable/insecten_naaktslak','raw/insecten_naaktslak','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'regenworm','drawable/insecten_regenworm','raw/insecten_regenworm','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'rups','drawable/insecten_rups','raw/insecten_rups','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'slak','drawable/insecten_slak','raw/insecten_slak','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'spin','drawable/insecten_spin','raw/insecten_spin','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'sprinkhaan','drawable/insecten_sprinkhaan','raw/insecten_sprinkhaan','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'vlieg','drawable/insecten_vlieg','raw/insecten_vlieg','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'vlinder','drawable/insecten_vlinder','raw/insecten_vlinder','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'wesp','drawable/insecten_wesp','raw/insecten_wesp','placeholder')");

        db.execSQL("CREATE TABLE kleding" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'broek','drawable/kleding_broek','raw/kleding_broek','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'handschoenen','drawable/kleding_handschoenen','raw/kleding_handschoenen','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'jas','drawable/kleding_jas','raw/kleding_jas','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'jurk','drawable/kleding_jurk','raw/kleding_jurk','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'laarzen','drawable/kleding_laarzen','raw/kleding_laarzen','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'muts','drawable/kleding_muts','raw/kleding_muts','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'onderhemd','drawable/kleding_onderhemd','raw/kleding_onderhemd','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'overhemd','drawable/kleding_overhemd','raw/kleding_overhemd','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'riem','drawable/kleding_riem','raw/kleding_riem','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'rok','drawable/kleding_rok','raw/kleding_rok','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'schoenen','drawable/kleding_schoenen','raw/kleding_schoenen','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'sjaal','drawable/kleding_sjaal','raw/kleding_sjaal','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'slippers','drawable/kleding_slippers','raw/kleding_slippers','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'sokken','drawable/kleding_sokken','raw/kleding_sokken','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'trui','drawable/kleding_trui','raw/kleding_trui','placeholder')");

        db.execSQL("CREATE TABLE kleuren" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'blauw','drawable/kleuren_blauw','raw/kleuren_blauw','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'bont','drawable/kleuren_bont','raw/kleuren_bont','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'bruin','drawable/kleuren_bruin','raw/kleuren_bruin','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'geel','drawable/kleuren_geel','raw/kleuren_geel','placeholder')");
//        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'grijs','drawable/kleuren_grijs','raw/kleuren_grijs')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'groen','drawable/kleuren_groen','raw/kleuren_groen','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'oranje','drawable/kleuren_oranje','raw/kleuren_oranje','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'paars','drawable/kleuren_paars','raw/kleuren_paars','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'rood','drawable/kleuren_rood','raw/kleuren_rood','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'wit','drawable/kleuren_wit','raw/kleuren_wit','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'zwart','drawable/kleuren_zwart','raw/kleuren_zwart','placeholder')");

        db.execSQL("CREATE TABLE weer" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT) ");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'donder','drawable/weer_donder','raw/weer_donder','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'halvemaan','drawable/weer_halvemaan','raw/weer_halvemaan','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'herfst','drawable/weer_herfst','raw/weer_herfst','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'lente','drawable/weer_lente','raw/weer_lente','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'maan','drawable/weer_maan','raw/weer_maan','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'mist','drawable/weer_mist','raw/weer_mist','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'regen','drawable/weer_regen','raw/weer_regen','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'regenboog','drawable/weer_regenboog','raw/weer_regenboog','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'sneeuw','drawable/weer_sneeuw','raw/weer_sneeuw','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'ster','drawable/weer_ster','raw/weer_ster','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'wind','drawable/weer_wind','raw/weer_wind','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'winter','drawable/weer_winter','raw/weer_winter','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'wolken','drawable/weer_wolken','raw/weer_wolken','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'zomer','drawable/weer_zomer','raw/weer_zomer','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'zon','drawable/weer_zon','raw/weer_zon','placeholder')");
    }
}
