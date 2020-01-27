package com.example.projectmobile4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sqlite extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 24;
    protected static final String DATABASE_NAME = "categorieen";
     static final String COL1 = "ID";
     static final String COL2 = "categorie";
     static final String COL3 = "nederlands";
     static final String COL4 = "route";
     static final String COL5 = "routeMuziek";
     static final String COL6 = "amazigh";
     static final String COL7 = "frans";
     static final String COL8 = "duits";
     static final String COL9 = "spaans";
     static final String COL10 = "engels";

    public Sqlite(Context context){
        super(context, DATABASE_NAME, null,  DATABASE_VERSION);
    }
    public String getCol3(){
        return COL3;
    }
    public String getCol6(){
        return COL6;
    }
    public String getCol7(){
        return COL7;
    }
    public String getCol8(){
        return COL8;
    }
    public String getCol9(){
        return COL9;
    }
    public String getCol10(){
        return COL10;
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
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'egel','drawable/dieren01_egel','raw/dieren01_egel','insi','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'ezel','drawable/dieren01_ezel','raw/dieren01_ezel','aɣyul','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'geit','drawable/dieren01_geit','raw/dieren01_geit','tɣaṭṭ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'hond','drawable/dieren01_hond','raw/dieren01_hond','ayḍi','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'jakhals','drawable/dieren01_jakhals','raw/dieren01_jakhals','uccen','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'kat','drawable/dieren01_kat','raw/dieren01_kat','mucc','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'kikker','drawable/dieren01_kikker','raw/dieren01_kikker','aqaqriw','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'kip','drawable/dieren01_kip','raw/dieren01_kip','tyaziḍt','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'koe','drawable/dieren01_koe','raw/dieren01_koe','tafunast','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'konijn','drawable/dieren01_konijn','raw/dieren01_konijn','aqninni','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'muis','drawable/dieren01_muis','raw/dieren01_muis','aɣerda','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'paard','drawable/dieren01_paard','raw/dieren01_paard','ayis','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'schaap','drawable/dieren01_schaap','raw/dieren01_schaap','icerri','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'vis','drawable/dieren01_vis','raw/dieren01_vis','aslem','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'vogel','drawable/dieren01_vogel','raw/dieren01_vogel','agḍiḍ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        //dieren02 aanmaken
        db.execSQL("CREATE TABLE dieren02" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'duif','drawable/dieren02_duif','raw/dieren02_duif','adbir','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'gekko','drawable/dieren02_gekko','raw/dieren02_gekko','aḥamchel','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'haas','drawable/dieren02_haas','raw/dieren02_haas','ayaṛziz','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'hyena','drawable/dieren02_hyena','raw/dieren02_hyena','ifis','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'kameleon','drawable/dieren02_kameleon','raw/dieren02_kameleon','tata','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'patrijs','drawable/dieren02_patrijs','raw/dieren02_patrijs','asekkur','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'schildpad','drawable/dieren02_schildpad','raw/dieren02_schildpad','icfar','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'schorpioen','drawable/dieren02_schorpioen','raw/dieren02_schorpioen','tɣirdent','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'slang','drawable/dieren02_slang','raw/dieren02_slang','afiɣra','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'stekelvarken','drawable/dieren02_stekelvarken','raw/dieren02_stekelvarken','aruy','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'uil','drawable/dieren02_uil','raw/dieren02_uil','muka','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'vos','drawable/dieren02_vos','raw/dieren02_vos','icɛb','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'wildzwijn','drawable/dieren02_wildzwijn','raw/dieren02_wildzwijn','ilf','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'windhond','drawable/dieren02_windhond','raw/dieren02_windhond','uccay','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'zwaluw','drawable/dieren02_zwaluw','raw/dieren02_zwaluw','tiflillest','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");

        db.execSQL("CREATE TABLE eten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'boter','drawable/eten_boter','raw/eten_boter','ddhen','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'brood','drawable/eten_brood','raw/eten_brood','aɣrum','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'eieren','drawable/eten_eieren','raw/eten_eieren','timejjalin','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'honing','drawable/eten_honing','raw/eten_honing','tamment','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'koekjes','drawable/eten_koekjes','raw/eten_koekjes','ɣayiṭa','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'koffie','drawable/eten_koffie','raw/eten_koffie','rqehwa','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'melk','drawable/eten_melk','raw/eten_melk','aɣi','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'olie','drawable/eten_olie','raw/eten_olie','zzict','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'suiker','drawable/eten_suiker','raw/eten_suiker','sseqqur','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'thee','drawable/eten_thee','raw/eten_thee','atay','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'vissen','drawable/eten_vissen','raw/eten_vissen','iselman','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'vlees','drawable/eten_vlees','raw/eten_vlees','aysum','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'water','drawable/eten_water','raw/eten_water','aman','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'yoghurt','drawable/eten_yoghurt','raw/eten_yoghurt','accil','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'zout','drawable/eten_zout','raw/eten_zout','tamellaḥt','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");

        db.execSQL("CREATE TABLE fruit" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'abrikoos','drawable/fruit_abrikoos','raw/fruit_abrikoos','rmecmac','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'appel','drawable/fruit_appel','raw/fruit_appel','tateffaht','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'bananen','drawable/fruit_bananen','raw/fruit_bananen','banan','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'cactusvijg','drawable/fruit_cactusvijg','raw/fruit_cactusvijg','tahendict','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'citroen','drawable/fruit_citroen','raw/fruit_citroen','llaymun','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'dadel','drawable/fruit_dadel','raw/fruit_dadel','tini','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'druiven','drawable/fruit_druiven','raw/fruit_druiven','adil','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'granaatappel','drawable/fruit_granaatappel','raw/fruit_granaatappel','arremman','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'honingmeloen','drawable/fruit_honingmeloen','raw/fruit_honingmeloen','abettix','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'peer','drawable/fruit_peer','raw/fruit_peer','tafirast','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'perzik','drawable/fruit_perzik','raw/fruit_perzik','rxux','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'pruim','drawable/fruit_pruim','raw/fruit_pruim','rbarquq','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'sinaasappel','drawable/fruit_sinaasappel','raw/fruit_sinaasappel','taleccint','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'vijg','drawable/fruit_vijg','raw/fruit_vijg','tazart','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'watermeloen','drawable/fruit_watermeloen','raw/fruit_watermeloen','ddellaɛ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");

        db.execSQL("CREATE TABLE groente" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'aardappel','drawable/groente_aardappel','raw/groente_aardappel','baṭaṭa','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'bonen','drawable/groente_bonen','raw/groente_bonen','llubeyyet','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'doperwten','drawable/groente_doperwten','raw/groente_doperwten','tinifin','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'kikkererwten','drawable/groente_kikkererwten','raw/groente_kikkererwten','rḥimez','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'knoflook','drawable/groente_knoflook','raw/groente_knoflook','ticcart','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'linzen','drawable/groente_linzen','raw/groente_linzen','leɛdes','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'mais','drawable/groente_mais','raw/groente_mais','dra','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'olijven','drawable/groente_olijven','raw/groente_olijven','zzitun','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'paprika','drawable/groente_paprika','raw/groente_paprika','rferfer','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'pompoen','drawable/groente_pompoen','raw/groente_pompoen','taxsact','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'spinazie','drawable/groente_spinazie','raw/groente_spinazie','tebi','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'tomaat','drawable/groente_tomaat','raw/groente_tomaat','ttumatic','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'tuinbonen','drawable/groente_tuinbonen','raw/groente_tuinbonen','ibawen','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'ui','drawable/groente_ui','raw/groente_ui','rebser','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'wortel','drawable/groente_wortel','raw/groente_wortel','xizzu','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");

        db.execSQL("CREATE TABLE insecten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'bidsprinkhaan','drawable/insecten_bidsprinkhaan','raw/insecten_bidsprinkhaan','tamraebt','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'bij','drawable/insecten_bij','raw/insecten_bij','zizwit','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'bloedzuiger','drawable/insecten_bloedzuiger','raw/insecten_bloedzuiger','tidda','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'larve','drawable/insecten_larve','raw/insecten_larve','takecca','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'mier','drawable/insecten_mier','raw/insecten_mier','tikedfet','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'mug','drawable/insecten_mug','raw/insecten_mug','nnamus','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'naaktslak','drawable/insecten_naaktslak','raw/insecten_naaktslak','buccel','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'regenworm','drawable/insecten_regenworm','raw/insecten_regenworm','adan n tmurt ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'rups','drawable/insecten_rups','raw/insecten_rups','bugḍif','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'slak','drawable/insecten_slak','raw/insecten_slak','aɣlal','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'spin','drawable/insecten_spin','raw/insecten_spin','qundɣa','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'sprinkhaan','drawable/insecten_sprinkhaan','raw/insecten_sprinkhaan','burxes','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'vlieg','drawable/insecten_vlieg','raw/insecten_vlieg','iẓi','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'vlinder','drawable/insecten_vlinder','raw/insecten_vlinder','aferṭṭu','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'wesp','drawable/insecten_wesp','raw/insecten_wesp','yaẓẓa','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");

        db.execSQL("CREATE TABLE kleding" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'broek','drawable/kleding_broek','raw/kleding_broek','ssarwal','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'handschoenen','drawable/kleding_handschoenen','raw/kleding_handschoenen','iwantisan','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'jas','drawable/kleding_jas','raw/kleding_jas','aqabud','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'jurk','drawable/kleding_jurk','raw/kleding_jurk','tablust','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'laarzen','drawable/kleding_laarzen','raw/kleding_laarzen','ihakusen','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'muts','drawable/kleding_muts','raw/kleding_muts','tcaccict','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'onderhemd','drawable/kleding_onderhemd','raw/kleding_onderhemd','camisita','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'overhemd','drawable/kleding_overhemd','raw/kleding_overhemd','taqmijjat','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'riem','drawable/kleding_riem','raw/kleding_riem','abyas','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'rok','drawable/kleding_rok','raw/kleding_rok','farda','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'schoenen','drawable/kleding_schoenen','raw/kleding_schoenen','tisila','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'sjaal','drawable/kleding_sjaal','raw/kleding_sjaal','ahewwak','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'slippers','drawable/kleding_slippers','raw/kleding_slippers','tcinklat','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'sokken','drawable/kleding_sokken','raw/kleding_sokken','tqacir','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'trui','drawable/kleding_trui','raw/kleding_trui','amaryul','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");

        db.execSQL("CREATE TABLE kleuren" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'blauw','drawable/kleuren_blauw','raw/kleuren_blauw','aḥmaymi','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'bont','drawable/kleuren_bont','raw/kleuren_bont','akarkac','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'bruin','drawable/kleuren_bruin','raw/kleuren_bruin','ahemruni','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'geel','drawable/kleuren_geel','raw/kleuren_geel','awraɣ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
//        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek) VALUES ('kleuren', 'grijs','drawable/kleuren_grijs','raw/kleuren_grijs')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'groen','drawable/kleuren_groen','raw/kleuren_groen','aziza','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'oranje','drawable/kleuren_oranje','raw/kleuren_oranje','aletcini','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'paars','drawable/kleuren_paars','raw/kleuren_paars','azbaybi ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'rood','drawable/kleuren_rood','raw/kleuren_rood','azegg-aɣ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'wit','drawable/kleuren_wit','raw/kleuren_wit','acemlal','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'zwart','drawable/kleuren_zwart','raw/kleuren_zwart','abarcan','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");

        db.execSQL("CREATE TABLE weer" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'donder','drawable/weer_donder','raw/weer_donder','ajjaj','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'halvemaan','drawable/weer_halvemaan','raw/weer_halvemaan','leiglief','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'herfst','drawable/weer_herfst','raw/weer_herfst','tafsut','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'lente','drawable/weer_lente','raw/weer_lente','yur','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'maan','drawable/weer_maan','raw/weer_maan','tayyut','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'mist','drawable/weer_mist','raw/weer_mist','anẓar','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'regen','drawable/weer_regen','raw/weer_regen','taslit n unzar','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'regenboog','drawable/weer_regenboog','raw/weer_regenboog','adfel','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'sneeuw','drawable/weer_sneeuw','raw/weer_sneeuw','itri','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'ster','drawable/weer_ster','raw/weer_ster','taziri','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'wind','drawable/weer_wind','raw/weer_wind','asemmiḍ','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'winter','drawable/weer_winter','raw/weer_winter','tajarst','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'wolken','drawable/weer_wolken','raw/weer_wolken','asinu','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'zomer','drawable/weer_zomer','raw/weer_zomer','anebdu','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'zon','drawable/weer_zon','raw/weer_zon','tfuct','placeholderfrans','placeholderduits','placeholderspaans','placeholderengels')");
    }
}
