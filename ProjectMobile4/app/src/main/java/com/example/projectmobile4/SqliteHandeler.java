package com.example.projectmobile4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHandeler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 10;
    protected static final String DATABASE_NAME = "categorieen";
     static final String COL1 = "ID";
     static final String COL2 = "categorie";
     static final String COL3 = "naam";
     static final String COL4 = "route";
     static final String COL5 = "routeMuziek";

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
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'egel','drawable/dieren01_egel','raw/dieren01_egel')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'ezel','drawable/dieren01_ezel','raw/dieren01_ezel')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'geit','drawable/dieren01_geit','raw/dieren01_geit')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'hond','drawable/dieren01_hond','raw/dieren01_hond')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'jakhals','drawable/dieren01_jakhals','raw/dieren01_jakhals')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'kat','drawable/dieren01_kat','raw/dieren01_kat')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'kikker','drawable/dieren01_kikker','raw/dieren01_kikker')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'kip','drawable/dieren01_kip','raw/dieren01_kip')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'koe','drawable/dieren01_koe','raw/dieren01_koe')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'konijn','drawable/dieren01_konijn','raw/dieren01_konijn')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'muis','drawable/dieren01_muis','raw/dieren01_muis')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'paard','drawable/dieren01_paard','raw/dieren01_paard')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'schaap','drawable/dieren01_schaap','raw/dieren01_schaap')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'vis','drawable/dieren01_vis','raw/dieren01_vis')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'vogel','drawable/dieren01_vogel','raw/dieren01_vogel')");
        //dieren02 aanmaken
        db.execSQL("CREATE TABLE dieren02" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'duif','drawable/dieren02_duif','R.raw.dieren02_duif')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'gekko','drawable/dieren02_gekko','R.raw.dieren02_gekko')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'haas','drawable/dieren02_haas','R.raw.dieren02_geit')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'hyena','drawable/dieren02_hyena','R.raw.dieren02_hyena')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'kameleon','drawable/dieren02_kameleon','R.raw.dieren02_kameleon')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'patrijs','drawable/dieren02_patrijs','R.raw.dieren02_patrijs')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'schildpad','drawable/dieren02_schildpad','R.raw.dieren02_schildpad')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'schorpioen','drawable/dieren02_schorpioen','R.raw.dieren02_schropioen')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'slang','drawable/dieren02_slang','R.raw.dieren02_slang')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'stekelvarken','drawable/dieren02_stekelvarken','R.raw.dieren02_stekelvarken')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'uil','drawable/dieren02_uil','R.raw.dieren02_uil')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'vos','drawable/dieren02_vos','R.raw.dieren02_vos')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'wildzwijn','drawable/dieren02_wildzwijn','R.raw.dieren02_wildzwijn')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'windhond','drawable/dieren02_windhond','R.raw.dieren02_windhond')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'zwaluw','drawable/dieren02_zwaluw','R.raw.dieren02_zwaluw')");

        db.execSQL("CREATE TABLE eten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'boter','drawable/eten_boter','R.raw.eten_boter')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'brood','drawable/eten_brood','R.raw.eten_brood')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'eieren','drawable/eten_eieren','R.raw.eten_eieren')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'honing','drawable/eten_honing','R.raw.eten_honing')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'koekjes','drawable/eten_koekjes','R.raw.eten_koekjes')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'koffie','drawable/eten_koffie','R.raw.eten_koffie')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'melk','drawable/eten_melk','R.raw.eten_melk')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'olie','drawable/eten_olie','R.raw.eten_olie')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'suiker','drawable/eten_suiker','R.raw.eten_suiker')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'thee','drawable/eten_thee','R.raw.eten_thee')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'vissen','drawable/eten_vissen','R.raw.eten_vissen')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'vlees','drawable/eten_vlees','R.raw.eten_vlees')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'water','drawable/eten_water','R.raw.eten_water')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'yoghurt','drawable/eten_yoghurt','R.raw.eten_yoghurt')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'zout','drawable/eten_zout','R.raw.eten_zout')");

        db.execSQL("CREATE TABLE fruit" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'abrikoos','drawable/fruit_abrikoos','R.raw.fruit_abrikoos')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'appel','drawable/fruit_appel','R.raw.fruit_appel')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'bananen','drawable/fruit_bananen','R.raw.fruit_bananen')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'cactusvijg','drawable/fruit_cactusvijg','R.raw.fruit_cactusvijg')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'citroen','drawable/fruit_citroen','R.raw.fruit_citroen')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'dadel','drawable/fruit_dadel','R.raw.fruit_dadel')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'druiven','drawable/fruit_druiven','R.raw.fruit_druiven')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'granaatappel','drawable/fruit_granaatappel','R.raw.fruit_granaatappel')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'honingmeloen','drawable/fruit_honingmeloen','R.raw.fruit_honingmeloen')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'peer','drawable/fruit_peer','R.raw.fruit_peer')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'perzik','drawable/fruit_perzik','R.raw.fruit_perzik')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'pruim','drawable/fruit_pruim','R.raw.fruit_pruim')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'sinaasappel','drawable/fruit_sinaasappel','R.raw.fruit_sinaasappel')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'vijg','drawable/fruit_vijg','R.raw.fruit_vijg')");
        db.execSQL("INSERT INTO fruit (categorie, naam, route, routeMuziek) VALUES ('fruit', 'watermeloen','drawable/fruit_watermeloen','R.raw.fruit_watermeloen')");

        db.execSQL("CREATE TABLE groente" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'aardappel','drawable/groente_aardappel','R.raw.groente_aardappel')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'bonen','drawable/groente_bonen','R.raw.groente_bonen')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'doperwten','drawable/groente_doperwten','R.raw.groente_doperwten')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'kikkererwten','drawable/groente_kikkererwten','R.raw.groente_kikkererwten')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'knoflook','drawable/groente_knoflook','R.raw.groente_knoflook')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'linzen','drawable/groente_linzen','R.raw.groente_linzen')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'mais','drawable/groente_mais','R.raw.groente_mais')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'olijven','drawable/groente_olijven','R.raw.groente_olijven')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'paprika','drawable/groente_paprika','R.raw.groente_paprika')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'pompoen','drawable/groente_pompoen','R.raw.groente_pompoen')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'spinazie','drawable/groente_spinazie','R.raw.groente_spinazie')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'tomaat','drawable/groente_tomaat','R.raw.groente_tomaat')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'tuinbonen','drawable/groente_tuinbonen','R.raw.groente_tuinbonen')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'ui','drawable/groente_ui','R.raw.groente_ui')");
        db.execSQL("INSERT INTO groente (categorie, naam, route, routeMuziek) VALUES ('groente', 'wortel','drawable/groente_wortel','R.raw.groente_wortel')");

        db.execSQL("CREATE TABLE insecten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'bidsprinkhaan','drawable/insecten_bidsprinkhaan','R.raw.insecten_bidsprinkhaan')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'bij','drawable/insecten_bij','R.raw.insecten_bij')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'bloedzuiger','drawable/insecten_bloedzuiger','R.raw.insecten_bloedzuiger')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'larve','drawable/insecten_larve','R.raw.insecten_larve')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'mier','drawable/insecten_mier','R.raw.insecten_mier')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'mug','drawable/insecten_mug','R.raw.insecten_mug')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'naaktslak','drawable/insecten_naaktslak','R.raw.insecten_naaktslak')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'regenworm','drawable/insecten_regenworm','R.raw.insecten_regenworm')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'rups','drawable/insecten_rups','R.raw.insecten_rups')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'slak','drawable/insecten_slak','R.raw.insecten_slak')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'spin','drawable/insecten_spin','R.raw.insecten_spin')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'sprinkhaan','drawable/insecten_sprinkhaan','R.raw.insecten_sprinkhaan')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'vlieg','drawable/insecten_vlieg','R.raw.insecten_vlieg')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'vlinder','drawable/insecten_vlinder','R.raw.insecten_vlinder')");
        db.execSQL("INSERT INTO insecten (categorie, naam, route, routeMuziek) VALUES ('insecten', 'wesp','drawable/insecten_wesp','R.raw.insecten_wesp')");

        db.execSQL("CREATE TABLE kleding" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'broek','drawable/kleding_broek','R.raw.kleding_broek')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'handschoenen','drawable/kleding_handschoenen','R.raw.kleding_handschoenen')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'jas','drawable/kleding_jas','R.raw.kleding_jas')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'jurk','drawable/kleding_jurk','R.raw.kleding_jurk')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'laarzen','drawable/kleding_laarzen','R.raw.kleding_laarzen')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'muts','drawable/kleding_muts','R.raw.kleding_muts')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'onderhemd','drawable/kleding_onderhemd','R.raw.kleding_onderhemd')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'overhemd','drawable/kleding_overhemd','R.raw.kleding_overhemd')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'riem','drawable/kleding_riem','R.raw.kleding_riem')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'rok','drawable/kleding_rok','R.raw.kleding_rok')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'schoenen','drawable/kleding_schoenen','R.raw.kleding_schoenen')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'sjaal','drawable/kleding_sjaal','R.raw.kleding_sjaal')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'slippers','drawable/kleding_slippers','R.raw.kleding_slippers')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'sokken','drawable/kleding_sokken','R.raw.kleding_sokken')");
        db.execSQL("INSERT INTO kleding (categorie, naam, route, routeMuziek) VALUES ('kleding', 'trui','drawable/kleding_trui','R.raw.kleding_trui')");



        db.execSQL("CREATE TABLE kleuren" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'blauw','drawable/kleuren_blauw','R.raw.kleuren_blauw')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'bont','drawable/kleuren_bont','R.raw.kleuren_bont')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'bruin','drawable/kleuren_bruin','R.raw.kleuren_bruin')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'geel','drawable/kleuren_geel','R.raw.kleuren_geel')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'grijs','drawable/kleuren_grijs','R.raw.kleuren_grijs')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'groen','drawable/kleuren_groen','R.raw.kleuren_groen')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'oranje','drawable/kleuren_oranje','R.raw.kleuren_oranje')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'paars','drawable/kleuren_paars','R.raw.kleuren_paars')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'rood','drawable/kleuren_rood','R.raw.kleuren_rood')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'wit','drawable/kleuren_wit','R.raw.kleuren_wit')");
        db.execSQL("INSERT INTO kleuren (categorie, naam, route, routeMuziek) VALUES ('kleuren', 'zwart','drawable/kleuren_zwart','R.raw.kleuren_zwart')");

        db.execSQL("CREATE TABLE weer" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'donder','drawable/weer_donder','R.raw.weer_donder')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'halvemaan','drawable/weer_halvemaan','R.raw.weer_halvemaan')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'herfst','drawable/weer_herfst','R.raw.weer_herfst')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'lente','drawable/weer_lente','R.raw.weer_lente')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'maan','drawable/weer_maan','R.raw.weer_maan')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'mist','drawable/weer_mist','R.raw.weer_mist')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'regen','drawable/weer_regen','R.raw.weer_regen')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'regenboog','drawable/weer_regenboog','R.raw.weer_regenboog')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'sneeuw','drawable/weer_sneeuw','R.raw.weer_sneeuw')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'ster','drawable/weer_ster','R.raw.weer_ster')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'wind','drawable/weer_wind','R.raw.weer_wind')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'winter','drawable/weer_winter','R.raw.weer_winter')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'wolken','drawable/weer_wolken','R.raw.weer_wolken')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'zomer','drawable/weer_zomer','R.raw.weer_zomer')");
        db.execSQL("INSERT INTO weer (categorie, naam, route, routeMuziek) VALUES ('weer', 'zon','drawable/weer_zon','R.raw.weer_zon')");


    }
}
