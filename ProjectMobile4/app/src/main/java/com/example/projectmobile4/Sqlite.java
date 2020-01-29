package com.example.projectmobile4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sqlite extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 33;
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

     private static Database mInstance = null;

    public static Database getInstance(Context c){
        if (mInstance == null) {
            mInstance = new Database(c.getApplicationContext());
        }
        return mInstance;

    }
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
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'egel','drawable/dieren01_egel','raw/dieren01_egel','insi','hérisson','Igel','erizo','hedgehog')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'ezel','drawable/dieren01_ezel','raw/dieren01_ezel','aɣyul','âne','Esel','burro','donkey')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'geit','drawable/dieren01_geit','raw/dieren01_geit','tɣaṭṭ','chèvre','Ziege','cabra','goat')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'hond','drawable/dieren01_hond','raw/dieren01_hond','ayḍi','chien','Hund','perro','dog')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'jakhals','drawable/dieren01_jakhals','raw/dieren01_jakhals','uccen','chacal','Schakal','chacal','jackal')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'kat','drawable/dieren01_kat','raw/dieren01_kat','mucc','chat','Katze','gato','cat')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'kikker','drawable/dieren01_kikker','raw/dieren01_kikker','aqaqriw','grenouille','Frosch','rana','frog')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'kip','drawable/dieren01_kip','raw/dieren01_kip','tyaziḍt','poulet','Huhn','pollo','chicken')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'koe','drawable/dieren01_koe','raw/dieren01_koe','tafunast','vache','kuh','vaca','cow')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'konijn','drawable/dieren01_konijn','raw/dieren01_konijn','aqninni','lapin','Kaninchen','conejo','rabbit')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'muis','drawable/dieren01_muis','raw/dieren01_muis','aɣerda','souris','Maus','ratón','mouse')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'paard','drawable/dieren01_paard','raw/dieren01_paard','ayis','cheval','Pferd','caballo','horse')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'schaap','drawable/dieren01_schaap','raw/dieren01_schaap','icerri','mouton','Schaf','oveja','sheep')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'vis','drawable/dieren01_vis','raw/dieren01_vis','aslem','poisson','Fisch','pescado','fish')");
        db.execSQL("INSERT INTO dieren01 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren01', 'vogel','drawable/dieren01_vogel','raw/dieren01_vogel','agḍiḍ','oiseau','Vogel','pájaro','bird')");
        //dieren02 aanmaken
        db.execSQL("CREATE TABLE dieren02" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'duif','drawable/dieren02_duif','raw/dieren02_duif','adbir','pigeon','Taube','paloma','pigeon')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'gekko','drawable/dieren02_gekko','raw/dieren02_gekko','aḥamchel','gecko','gecko','geco','gecko')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'haas','drawable/dieren02_haas','raw/dieren02_haas','ayaṛziz','lièvre','Hase','liebre','hare')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'hyena','drawable/dieren02_hyena','raw/dieren02_hyena','ifis','hyène','Hyäne','hiena','hyena')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'kameleon','drawable/dieren02_kameleon','raw/dieren02_kameleon','tata','caméléon','Chamäleon','camaleón','chameleon')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'patrijs','drawable/dieren02_patrijs','raw/dieren02_patrijs','asekkur','perdrix','Rebhuhn','perdiz','partridge')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'schildpad','drawable/dieren02_schildpad','raw/dieren02_schildpad','icfar','tortue','Schildkröte','tortuga','turtle')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'schorpioen','drawable/dieren02_schorpioen','raw/dieren02_schorpioen','tɣirdent','scorpion','Skorpion','escorpión','scorpion')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'slang','drawable/dieren02_slang','raw/dieren02_slang','afiɣra','serpent','Schlange','serpiente','snake')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'stekelvarken','drawable/dieren02_stekelvarken','raw/dieren02_stekelvarken','aruy','porc-épic','Stachelschwein','puerco espín','porcupine')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'uil','drawable/dieren02_uil','raw/dieren02_uil','muka','chouette','Eule','búho','owl')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'vos','drawable/dieren02_vos','raw/dieren02_vos','icɛb','renard','Fuchs','zorro','fox')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'wildzwijn','drawable/dieren02_wildzwijn','raw/dieren02_wildzwijn','ilf','sanglier','Wildschwein','jabali','boar')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'windhond','drawable/dieren02_windhond','raw/dieren02_windhond','uccay','levrette','Windhund','galgo','greyhound')");
        db.execSQL("INSERT INTO dieren02 (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('dieren02', 'zwaluw','drawable/dieren02_zwaluw','raw/dieren02_zwaluw','tiflillest','hirondelle','Schwalbe','golondrina','swallow')");

        db.execSQL("CREATE TABLE eten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'boter','drawable/eten_boter','raw/eten_boter','ddhen','beurre','Butter','mantequilla','butter')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'brood','drawable/eten_brood','raw/eten_brood','aɣrum','pain','Brot','pan','bread')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'eieren','drawable/eten_eieren','raw/eten_eieren','timejjalin','œufs','Eier','huevos','eggs')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'honing','drawable/eten_honing','raw/eten_honing','tamment','miel','Honig','miel','honey')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'koekjes','drawable/eten_koekjes','raw/eten_koekjes','ɣayiṭa','biscuits','Kekse','galletas','cookies')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'koffie','drawable/eten_koffie','raw/eten_koffie','rqehwa','café','Kaffee','café','coffee')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'melk','drawable/eten_melk','raw/eten_melk','aɣi','lait','Milch','leche','milk')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'olie','drawable/eten_olie','raw/eten_olie','zzict','huile','Öl','aceite','oil')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'suiker','drawable/eten_suiker','raw/eten_suiker','sseqqur','sucre','Zucker','azúcar','sugar')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'thee','drawable/eten_thee','raw/eten_thee','atay','thé','tee','té','tea')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'vissen','drawable/eten_vissen','raw/eten_vissen','iselman','poisson','Fisch','pescado','fish')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'vlees','drawable/eten_vlees','raw/eten_vlees','aysum','viande','Fleisch','carne','meat')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'water','drawable/eten_water','raw/eten_water','aman','eau','Wasser','agua','water')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'yoghurt','drawable/eten_yoghurt','raw/eten_yoghurt','accil','yaourt','Joghurt','yogur','yogurt')");
        db.execSQL("INSERT INTO eten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('eten', 'zout','drawable/eten_zout','raw/eten_zout','tamellaḥt','sel','Salz','sal','salt')");

        db.execSQL("CREATE TABLE fruit" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'abrikoos','drawable/fruit_abrikoos','raw/fruit_abrikoos','rmecmac','abricot','Aprikose','albaricoque','apricot')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'appel','drawable/fruit_appel','raw/fruit_appel','tateffaht','pomme','Apfel','manzana','apple')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'bananen','drawable/fruit_bananen','raw/fruit_bananen','banan','bananes','bananen','plátanos','bananas')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'cactusvijg','drawable/fruit_cactusvijg','raw/fruit_cactusvijg','tahendict','figue de barbarie','Kaktusfeige','higo chumbo','cactus pear')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'citroen','drawable/fruit_citroen','raw/fruit_citroen','llaymun','citron','Zitrone','limón','lemon')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'dadel','drawable/fruit_dadel','raw/fruit_dadel','tini','date','Dattel','fecha','date')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'druiven','drawable/fruit_druiven','raw/fruit_druiven','adil','raisins','Trauben','uvas','grapes')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'granaatappel','drawable/fruit_granaatappel','raw/fruit_granaatappel','arremman','grenade','Granatapfel','granada','pomegranate')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'honingmeloen','drawable/fruit_honingmeloen','raw/fruit_honingmeloen','abettix','melon de miel','Honigmelone','melón de miel','honey dew melon')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'peer','drawable/fruit_peer','raw/fruit_peer','tafirast','poire','Birne','pera','pear')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'perzik','drawable/fruit_perzik','raw/fruit_perzik','rxux','pêche','Pfirsich','melocotón','peach')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'pruim','drawable/fruit_pruim','raw/fruit_pruim','rbarquq','prune','Pflaume','ciruela','prum')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'sinaasappel','drawable/fruit_sinaasappel','raw/fruit_sinaasappel','taleccint','orange','orange','naranja','orange')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'vijg','drawable/fruit_vijg','raw/fruit_vijg','tazart','figue','Feige','higo','fig')");
        db.execSQL("INSERT INTO fruit (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('fruit', 'watermeloen','drawable/fruit_watermeloen','raw/fruit_watermeloen','ddellaɛ','pastèque','Wassermelone','sandía','watermelon')");

        db.execSQL("CREATE TABLE groente" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'aardappel','drawable/groente_aardappel','raw/groente_aardappel','baṭaṭa','pomme de terre','Kartoffel','patata','potato')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'bonen','drawable/groente_bonen','raw/groente_bonen','llubeyyet','haricots','Bohnen','frijoles','beans')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'doperwten','drawable/groente_doperwten','raw/groente_doperwten','tinifin','petit pois','Erbsen','chícharos','peas')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'kikkererwten','drawable/groente_kikkererwten','raw/groente_kikkererwten','rḥimez','pois chiches','Kichererbsen','garbanzos','chickpeas')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'knoflook','drawable/groente_knoflook','raw/groente_knoflook','ticcart','ail','Knoblauch','ajo','garlic')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'linzen','drawable/groente_linzen','raw/groente_linzen','leɛdes','lentilles','Linsen','lentejas','lentils')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'mais','drawable/groente_mais','raw/groente_mais','dra','maïs','Mais','maíz','corn')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'olijven','drawable/groente_olijven','raw/groente_olijven','zzitun','olives','oliven','aceitunas','olives')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'paprika','drawable/groente_paprika','raw/groente_paprika','rferfer','poivron','Paprika','pimiento','bell pepper ')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'pompoen','drawable/groente_pompoen','raw/groente_pompoen','taxsact','citrouille','Kürbis','calabaza','pumpkin')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'spinazie','drawable/groente_spinazie','raw/groente_spinazie','tebi','épinards','Spinat','espinacas','spinach')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'tomaat','drawable/groente_tomaat','raw/groente_tomaat','ttumatic','tomate','tomate','tomate','tomato')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'tuinbonen','drawable/groente_tuinbonen','raw/groente_tuinbonen','ibawen','fèves','Saubohnen','habas','green beans')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'ui','drawable/groente_ui','raw/groente_ui','rebser','oignon','Zwiebel','cebolla','onion')");
        db.execSQL("INSERT INTO groente (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('groente', 'wortel','drawable/groente_wortel','raw/groente_wortel','xizzu','carotte','karotte','zanahoria','carrot')");

        db.execSQL("CREATE TABLE insecten" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'bidsprinkhaan','drawable/insecten_bidsprinkhaan','raw/insecten_bidsprinkhaan','tamraebt','mante','Gottesanbeterin','mantis','mantis')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'bij','drawable/insecten_bij','raw/insecten_bij','zizwit','abeille','Biene','abeja','bee')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'bloedzuiger','drawable/insecten_bloedzuiger','raw/insecten_bloedzuiger','tidda','sangsue','Blutsauger','sanguijuela','leech')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'larve','drawable/insecten_larve','raw/insecten_larve','takecca','larve','larve','larva','larva')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'mier','drawable/insecten_mier','raw/insecten_mier','tikedfet','fourmi','Ameise','hormiga','ant')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'mug','drawable/insecten_mug','raw/insecten_mug','nnamus','moustique','Mücke','mosquito','mosquito')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'naaktslak','drawable/insecten_naaktslak','raw/insecten_naaktslak','buccel','limace','Nacktschnecke','babosa','slug')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'regenworm','drawable/insecten_regenworm','raw/insecten_regenworm','adan n tmurt ','ver de terre','Regenwurm','lombriz','earthworm')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'rups','drawable/insecten_rups','raw/insecten_rups','bugḍif','chenille','Raupe','oruga','caterpillar')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'slak','drawable/insecten_slak','raw/insecten_slak','aɣlal','escargot','Schnecke','caracol','snail')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'spin','drawable/insecten_spin','raw/insecten_spin','qundɣa','araignée','Spinne','araña','spider')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'sprinkhaan','drawable/insecten_sprinkhaan','raw/insecten_sprinkhaan','burxes','sauterelle','Heuschrecke','saltamontes','grasshopper')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'vlieg','drawable/insecten_vlieg','raw/insecten_vlieg','iẓi','mouche','Fliege','mosca','fly')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'vlinder','drawable/insecten_vlinder','raw/insecten_vlinder','aferṭṭu','papillon','Schmetterling','mariposa','butterfly')");
        db.execSQL("INSERT INTO insecten (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('insecten', 'wesp','drawable/insecten_wesp','raw/insecten_wesp','yaẓẓa','guêpe','Wespe','avispa','wasp')");

        db.execSQL("CREATE TABLE kleding" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'broek','drawable/kleding_broek','raw/kleding_broek','ssarwal','pantalon','Hose','pantalones','pants')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'handschoenen','drawable/kleding_handschoenen','raw/kleding_handschoenen','iwantisan','gants','Handschuhe','guantes','gloves')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'jas','drawable/kleding_jas','raw/kleding_jas','aqabud','veste','Jacke','chaqueta','jacket')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'jurk','drawable/kleding_jurk','raw/kleding_jurk','tablust','robe','Kleid','vestido','dress')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'laarzen','drawable/kleding_laarzen','raw/kleding_laarzen','ihakusen','bottes','Stiefel','botas','boots')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'muts','drawable/kleding_muts','raw/kleding_muts','tcaccict','bonnet','Kappe','gorro','cap')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'onderhemd','drawable/kleding_onderhemd','raw/kleding_onderhemd','camisita','maillot de corps','Unterhemd','camiseta','undershirt')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'overhemd','drawable/kleding_overhemd','raw/kleding_overhemd','taqmijjat','chemise','hemd','camisa','shirt')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'riem','drawable/kleding_riem','raw/kleding_riem','abyas','ceinture','Gürtel','cinturón','belt')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'rok','drawable/kleding_rok','raw/kleding_rok','farda','jupe','Rock','falda','skirt')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'schoenen','drawable/kleding_schoenen','raw/kleding_schoenen','tisila','chaussures','Schuhe','zapatos','shoes')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'sjaal','drawable/kleding_sjaal','raw/kleding_sjaal','ahewwak','écharpe','Schal','bufanda','scarf')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'slippers','drawable/kleding_slippers','raw/kleding_slippers','tcinklat','claquette','Flip Flops','chanclas','flip flops')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'sokken','drawable/kleding_sokken','raw/kleding_sokken','tqacir','chaussettes','Socken','calcetines','socks')");
        db.execSQL("INSERT INTO kleding (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleding', 'trui','drawable/kleding_trui','raw/kleding_trui','amaryul','chandail','Pullover','suéter','sweater')");

        db.execSQL("CREATE TABLE kleuren" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'blauw','drawable/kleuren_blauw','raw/kleuren_blauw','aḥmaymi','bleu','blau','azul','blue')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'bont','drawable/kleuren_bont','raw/kleuren_bont','akarkac','coloré','bunt','vistoso','colourful')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'bruin','drawable/kleuren_bruin','raw/kleuren_bruin','ahemruni','brun','braun','marrón','brown')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'geel','drawable/kleuren_geel','raw/kleuren_geel','awraɣ','jaune','gelb','amarillo','yellow')");
//        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek) VALUES ('kleuren', 'grijs','drawable/kleuren_grijs','raw/kleuren_grijs')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'groen','drawable/kleuren_groen','raw/kleuren_groen','aziza','vert','grün','verde','green')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'oranje','drawable/kleuren_oranje','raw/kleuren_oranje','aletcini','orange','orange','naranja','orange')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'paars','drawable/kleuren_paars','raw/kleuren_paars','azbaybi ','mauve','lila','morado','purple')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'rood','drawable/kleuren_rood','raw/kleuren_rood','azegg-aɣ','rouge','rot','rojo','red')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'wit','drawable/kleuren_wit','raw/kleuren_wit','acemlal','blanc','weiß','blanco','white')");
        db.execSQL("INSERT INTO kleuren (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('kleuren', 'zwart','drawable/kleuren_zwart','raw/kleuren_zwart','abarcan','noir','schwarz','negro','black')");

        db.execSQL("CREATE TABLE weer" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "categorie TEXT, " + " nederlands TEXT, " + " route TEXT, " + " routeMuziek TEXT, "+" amazigh TEXT, "+" frans TEXT, "+" duits TEXT, "+" spaans TEXT, "+" engels TEXT) ");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'donder','drawable/weer_donder','raw/weer_donder','ajjaj','tonnerre','Donner','trueno','thunder')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'halvemaan','drawable/weer_halvemaan','raw/weer_halvemaan','leiglief','automne','Herbst','otoño','autumn')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'herfst','drawable/weer_herfst','raw/weer_herfst','tafsut','printemps','Frühling','primavera','spring')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'lente','drawable/weer_lente','raw/weer_lente','yur','lune','mund','luna','moon')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'maan','drawable/weer_maan','raw/weer_maan','tayyut','brouillard','nebel','niebla','fog')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'mist','drawable/weer_mist','raw/weer_mist','anẓar','pluie','regen','lluvia','rain')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'regen','drawable/weer_regen','raw/weer_regen','taslit n unzar','arc en ciel','Regenbogen','arco iris','rainbow')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'regenboog','drawable/weer_regenboog','raw/weer_regenboog','adfel','neige','Schnee','nieve','snow')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'sneeuw','drawable/weer_sneeuw','raw/weer_sneeuw','itri','vedette','Star','estrella','Star')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'ster','drawable/weer_ster','raw/weer_ster','taziri','croissant','Halbmond','creciente','crescent')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'wind','drawable/weer_wind','raw/weer_wind','asemmiḍ','vent','Wind','viento','Wind')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'winter','drawable/weer_winter','raw/weer_winter','tajarst','hiver','Winter','invierno','Winter')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'wolken','drawable/weer_wolken','raw/weer_wolken','asinu','nuages','Wolken','nubes','clouds')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'zomer','drawable/weer_zomer','raw/weer_zomer','anebdu','été','Sommer','verano','summer')");
        db.execSQL("INSERT INTO weer (categorie, nederlands, route, routeMuziek, amazigh, frans, duits, spaans, engels) VALUES ('weer', 'zon','drawable/weer_zon','raw/weer_zon','tfuct','soleil','Sonne','sol','sun')");
    }
}
