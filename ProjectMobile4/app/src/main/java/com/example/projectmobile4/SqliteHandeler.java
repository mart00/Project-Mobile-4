package com.example.projectmobile4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHandeler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 6;
    protected static final String DATABASE_NAME = "categorieen";
    private static final String COL1 = "ID";
    private static final String COL2 = "categorie";
    private static final String COL3 = "naam";
    private static final String COL4 = "route";
    private static final String COL5 = "routeMuziek";

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
        onCreate(db);
    }


    public void insert(SQLiteDatabase db) {


        //dieren01 aanmaken
        db.execSQL("CREATE TABLE IF NOT EXISTS dieren01" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'egel','R.drawable.dieren01_egel','R.raw.dieren01_egel')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'ezel','R.drawable.dieren01_ezel','R.raw.dieren01_ezel')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'geit','R.drawable.dieren01_geit','R.raw.dieren01_geit')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'hond','R.drawable.dieren01_hond','R.raw.dieren01_hond')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'jakhals','R.drawable.dieren01_jakhals','R.raw.dieren01_jakhals')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'kat','R.drawable.dieren01_kat','R.raw.dieren01_kat')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'kikker','R.drawable.dieren01_kikker','R.raw.dieren01_kikker')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'kip','R.drawable.dieren01_kip','R.raw.dieren01_kip')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'koe','R.drawable.dieren01_koe','R.raw.dieren01_koe')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'konijn','R.drawable.dieren01_konijn','R.raw.dieren01_konijn')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'muis','R.drawable.dieren01_muis','R.raw.dieren01_muis')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'paard','R.drawable.dieren01_paard','R.raw.dieren01_paard')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'schaap','R.drawable.dieren01_schaap','R.raw.dieren01_schaap')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'vis','R.drawable.dieren01_vis','R.raw.dieren01_vis')");
        db.execSQL("INSERT INTO dieren01 (categorie, naam, route, routeMuziek) VALUES ('dieren01', 'vogel','R.drawable.dieren01_vogel','R.raw.dieren01_vogel')");
        //dieren02 aanmaken
        db.execSQL("CREATE TABLE dieren02" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'duif','R.drawable.dieren02_duif','R.raw.dieren02_duif')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'gekko','R.drawable.dieren02_gekko','R.raw.dieren02_gekko')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'haas','R.drawable.dieren02_geit','R.raw.dieren02_geit')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'hyena','R.drawable.dieren02_hyena','R.raw.dieren02_hyena')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'kameleon','R.drawable.dieren02_kameleon','R.raw.dieren02_kameleon')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'patrijs','R.drawable.dieren02_patrijs','R.raw.dieren02_patrijs')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'schildpad','R.drawable.dieren02_schildpad','R.raw.dieren02_schildpad')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'schropioen','R.drawable.dieren02_schropioen','R.raw.dieren02_schropioen')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'slang','R.drawable.dieren02_slang','R.raw.dieren02_slang')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'stekelvarken','R.drawable.dieren02_stekelvarken','R.raw.dieren02_stekelvarken')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'uil','R.drawable.dieren02_uil','R.raw.dieren02_uil')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'vos','R.drawable.dieren02_vos','R.raw.dieren02_vos')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'wildzwijn','R.drawable.dieren02_wildzwijn','R.raw.dieren02_wildzwijn')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'windhond','R.drawable.dieren02_windhond','R.raw.dieren02_windhond')");
        db.execSQL("INSERT INTO dieren02 (categorie, naam, route, routeMuziek) VALUES ('dieren02', 'zwaluw','R.drawable.dieren02_zwaluw','R.raw.dieren02_zwaluw')");

        db.execSQL("CREATE TABLE eten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'boter','R.drawable.eten_boter','R.raw.eten_boter')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'brood','R.drawable.eten_brood','R.raw.eten_brood')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'eieren','R.drawable.eten_eieren','R.raw.eten_eieren')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'honing','R.drawable.eten_honing','R.raw.eten_honing')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'koekjes','R.drawable.eten_koekjes','R.raw.eten_koekjes')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'koffie','R.drawable.eten_koffie','R.raw.eten_koffie')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'melk','R.drawable.eten_melk','R.raw.eten_melk')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'olie','R.drawable.eten_olie','R.raw.eten_olie')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'suiker','R.drawable.eten_suiker','R.raw.eten_suiker')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'thee','R.drawable.eten_thee','R.raw.eten_thee')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'vissen','R.drawable.eten_vissen','R.raw.eten_vissen')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'vlees','R.drawable.eten_vlees','R.raw.eten_vlees')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'water','R.drawable.eten_water','R.raw.eten_water')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'yoghurt','R.drawable.eten_yoghurt','R.raw.eten_yoghurt')");
        db.execSQL("INSERT INTO eten (categorie, naam, route, routeMuziek) VALUES ('eten', 'zout','R.drawable.eten_zout','R.raw.eten_zout')");
//
//        db.execSQL("CREATE TABLE fruit" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
//
//
//
//
//        db.execSQL("CREATE TABLE groente" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
//
//
//
//        db.execSQL("CREATE TABLE insecten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
//
//
//
//        db.execSQL("CREATE TABLE kleding" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
//
//
//
//        db.execSQL("CREATE TABLE kleuren" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
//
//
//
//        db.execSQL("CREATE TABLE weer" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "categorie TEXT, " + " naam TEXT, " + " route TEXT, " + " routeMuziek TEXT ) ");
//
//
    }
}