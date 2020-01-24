package com.example.projectmobile4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHandeler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 12;
    protected static final String DATABASE_NAME = "categorieen";
     static final String COL1 = "ID";
     static final String COL2 = "categorie";
     static final String COL3 = "naam";
     static final String COL4 = "route";
     static final String COL5 = "routeMuziek";
     static final String COL6 = "amazigh";

    public SqliteHandeler(Context context){
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
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'ezel','drawable/dieren01_ezel','raw/dieren01_ezel','aɣyul')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren01', 'egel','drawable/dieren01_egel','raw/dieren01_egel','insi')");
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
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'duif','drawable/dieren02_duif','R.raw.dieren02_duif','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'gekko','drawable/dieren02_gekko','R.raw.dieren02_gekko','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'haas','drawable/dieren02_haas','R.raw.dieren02_geit','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'hyena','drawable/dieren02_hyena','R.raw.dieren02_hyena','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'kameleon','drawable/dieren02_kameleon','R.raw.dieren02_kameleon','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'patrijs','drawable/dieren02_patrijs','R.raw.dieren02_patrijs','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'schildpad','drawable/dieren02_schildpad','R.raw.dieren02_schildpad','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'schorpioen','drawable/dieren02_schorpioen','R.raw.dieren02_schropioen','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'slang','drawable/dieren02_slang','R.raw.dieren02_slang','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'stekelvarken','drawable/dieren02_stekelvarken','R.raw.dieren02_stekelvarken','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'uil','drawable/dieren02_uil','R.raw.dieren02_uil','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'vos','drawable/dieren02_vos','R.raw.dieren02_vos','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'wildzwijn','drawable/dieren02_wildzwijn','R.raw.dieren02_wildzwijn','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'windhond','drawable/dieren02_windhond','R.raw.dieren02_windhond','placeholder')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek, amazigh) VALUES ('dieren02', 'zwaluw','drawable/dieren02_zwaluw','R.raw.dieren02_zwaluw','placeholder')");

        db.execSQL("CREATE TABLE eten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'boter','drawable/eten_boter','R.raw.eten_boter','ddhen')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'brood','drawable/eten_brood','R.raw.eten_brood','aɣrum')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'eieren','drawable/eten_eieren','R.raw.eten_eieren','timejjalin')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'honing','drawable/eten_honing','R.raw.eten_honing','tamment')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'koekjes','drawable/eten_koekjes','R.raw.eten_koekjes','ɣayiṭa')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'koffie','drawable/eten_koffie','R.raw.eten_koffie','rqehwa')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'melk','drawable/eten_melk','R.raw.eten_melk','aɣi')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'olie','drawable/eten_olie','R.raw.eten_olie','zzict')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'suiker','drawable/eten_suiker','R.raw.eten_suiker','sseqqur')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'thee','drawable/eten_thee','R.raw.eten_thee','atay')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'vissen','drawable/eten_vissen','R.raw.eten_vissen','iselman')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'vlees','drawable/eten_vlees','R.raw.eten_vlees','aysum')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'water','drawable/eten_water','R.raw.eten_water','aman')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'yoghurt','drawable/eten_yoghurt','R.raw.eten_yoghurt','accil')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek, amazigh) VALUES ('eten', 'zout','drawable/eten_zout','R.raw.eten_zout','tamellaḥt')");

        db.execSQL("CREATE TABLE fruit" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'abrikoos','drawable/fruit_abrikoos','R.raw.fruit_abrikoos','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'appel','drawable/fruit_appel','R.raw.fruit_appel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'bananen','drawable/fruit_bananen','R.raw.fruit_bananen','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'cactusvijg','drawable/fruit_cactusvijg','R.raw.fruit_cactusvijg','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'citroen','drawable/fruit_citroen','R.raw.fruit_citroen','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'dadel','drawable/fruit_dadel','R.raw.fruit_dadel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'druiven','drawable/fruit_druiven','R.raw.fruit_druiven','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'granaatappel','drawable/fruit_granaatappel','R.raw.fruit_granaatappel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'honingmeloen','drawable/fruit_honingmeloen','R.raw.fruit_honingmeloen','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'peer','drawable/fruit_peer','R.raw.fruit_peer','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'perzik','drawable/fruit_perzik','R.raw.fruit_perzik','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'pruim','drawable/fruit_pruim','R.raw.fruit_pruim','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'sinaasappel','drawable/fruit_sinaasappel','R.raw.fruit_sinaasappel','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'vijg','drawable/fruit_vijg','R.raw.fruit_vijg','placeholder')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek, amazigh) VALUES ('fruit', 'watermeloen','drawable/fruit_watermeloen','R.raw.fruit_watermeloen','placeholder')");

        db.execSQL("CREATE TABLE groente" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'aardappel','drawable/groente_aardappel','R.raw.groente_aardappel','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'bonen','drawable/groente_bonen','R.raw.groente_bonen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'doperwten','drawable/groente_doperwten','R.raw.groente_doperwten','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'kikkererwten','drawable/groente_kikkererwten','R.raw.groente_kikkererwten','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'knoflook','drawable/groente_knoflook','R.raw.groente_knoflook','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'linzen','drawable/groente_linzen','R.raw.groente_linzen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'mais','drawable/groente_mais','R.raw.groente_mais','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'olijven','drawable/groente_olijven','R.raw.groente_olijven','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'paprika','drawable/groente_paprika','R.raw.groente_paprika','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'pompoen','drawable/groente_pompoen','R.raw.groente_pompoen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'spinazie','drawable/groente_spinazie','R.raw.groente_spinazie','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'tomaat','drawable/groente_tomaat','R.raw.groente_tomaat','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'tuinbonen','drawable/groente_tuinbonen','R.raw.groente_tuinbonen','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'ui','drawable/groente_ui','R.raw.groente_ui','placeholder')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek, amazigh) VALUES ('groente', 'wortel','drawable/groente_wortel','R.raw.groente_wortel','placeholder')");

        db.execSQL("CREATE TABLE insecten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'bidsprinkhaan','drawable/insecten_bidsprinkhaan','R.raw.insecten_bidsprinkhaan','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'bij','drawable/insecten_bij','R.raw.insecten_bij','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'bloedzuiger','drawable/insecten_bloedzuiger','R.raw.insecten_bloedzuiger','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'larve','drawable/insecten_larve','R.raw.insecten_larve','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'mier','drawable/insecten_mier','R.raw.insecten_mier','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'mug','drawable/insecten_mug','R.raw.insecten_mug','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'naaktslak','drawable/insecten_naaktslak','R.raw.insecten_naaktslak','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'regenworm','drawable/insecten_regenworm','R.raw.insecten_regenworm','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'rups','drawable/insecten_rups','R.raw.insecten_rups','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'slak','drawable/insecten_slak','R.raw.insecten_slak','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'spin','drawable/insecten_spin','R.raw.insecten_spin','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'sprinkhaan','drawable/insecten_sprinkhaan','R.raw.insecten_sprinkhaan','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'vlieg','drawable/insecten_vlieg','R.raw.insecten_vlieg','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'vlinder','drawable/insecten_vlinder','R.raw.insecten_vlinder','placeholder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek, amazigh) VALUES ('insecten', 'wesp','drawable/insecten_wesp','R.raw.insecten_wesp','placeholder')");

        db.execSQL("CREATE TABLE kleding" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'broek','drawable/kleding_broek','R.raw.kleding_broek','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'handschoenen','drawable/kleding_handschoenen','R.raw.kleding_handschoenen','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'jas','drawable/kleding_jas','R.raw.kleding_jas','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'jurk','drawable/kleding_jurk','R.raw.kleding_jurk','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'laarzen','drawable/kleding_laarzen','R.raw.kleding_laarzen','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'muts','drawable/kleding_muts','R.raw.kleding_muts','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'onderhemd','drawable/kleding_onderhemd','R.raw.kleding_onderhemd','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'overhemd','drawable/kleding_overhemd','R.raw.kleding_overhemd','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'riem','drawable/kleding_riem','R.raw.kleding_riem','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'rok','drawable/kleding_rok','R.raw.kleding_rok','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'schoenen','drawable/kleding_schoenen','R.raw.kleding_schoenen','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'sjaal','drawable/kleding_sjaal','R.raw.kleding_sjaal','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'slippers','drawable/kleding_slippers','R.raw.kleding_slippers','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'sokken','drawable/kleding_sokken','R.raw.kleding_sokken','placeholder')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleding', 'trui','drawable/kleding_trui','R.raw.kleding_trui','placeholder')");



        db.execSQL("CREATE TABLE kleuren" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'blauw','drawable/kleuren_blauw','R.raw.kleuren_blauw','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'bont','drawable/kleuren_bont','R.raw.kleuren_bont','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'bruin','drawable/kleuren_bruin','R.raw.kleuren_bruin','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'geel','drawable/kleuren_geel','R.raw.kleuren_geel','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'grijs','drawable/kleuren_grijs','R.raw.kleuren_grijs','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'groen','drawable/kleuren_groen','R.raw.kleuren_groen','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'oranje','drawable/kleuren_oranje','R.raw.kleuren_oranje','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'paars','drawable/kleuren_paars','R.raw.kleuren_paars','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'rood','drawable/kleuren_rood','R.raw.kleuren_rood','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'wit','drawable/kleuren_wit','R.raw.kleuren_wit','placeholder')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek, amazigh) VALUES ('kleuren', 'zwart','drawable/kleuren_zwart','R.raw.kleuren_zwart','placeholder')");

        db.execSQL("CREATE TABLE weer" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT, " + " amazigh TEXT ) ");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'donder','drawable/weer_donder','R.raw.weer_donder','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'halvemaan','drawable/weer_halvemaan','R.raw.weer_halvemaan','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'herfst','drawable/weer_herfst','R.raw.weer_herfst','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'lente','drawable/weer_lente','R.raw.weer_lente','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'maan','drawable/weer_maan','R.raw.weer_maan','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'mist','drawable/weer_mist','R.raw.weer_mist','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'regen','drawable/weer_regen','R.raw.weer_regen','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'regenboog','drawable/weer_regenboog','R.raw.weer_regenboog','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'sneeuw','drawable/weer_sneeuw','R.raw.weer_sneeuw','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'ster','drawable/weer_ster','R.raw.weer_ster','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'wind','drawable/weer_wind','R.raw.weer_wind','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'winter','drawable/weer_winter','R.raw.weer_winter','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'wolken','drawable/weer_wolken','R.raw.weer_wolken','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'zomer','drawable/weer_zomer','R.raw.weer_zomer','placeholder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek, amazigh) VALUES ('weer', 'zon','drawable/weer_zon','R.raw.weer_zon','placeholder')");


    }
}
