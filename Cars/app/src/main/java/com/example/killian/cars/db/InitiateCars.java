package com.example.killian.cars.db;

import android.database.sqlite.SQLiteDatabase;

import com.example.killian.cars.Constants.DBConstants;


/**
 * Created by Killian on 07/07/2016.
 */
public class InitiateCars {
    public static void initCars(SQLiteDatabase db) {
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(1,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(2,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(3,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(4,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(5,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(6,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(7,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(8,'Mazda 323', 'Blue', '240000', 'description', 'http://needsmorejpeg.com/i/ejsr.jpeg')");
    }
    public static void initCarImages(SQLiteDatabase db) {
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(1,'1', 'https://upload.wikimedia.org/wikipedia/commons/2/29/2014_Audi_TTS_%288J_MY14%29_quattro_coupe_%282015-12-07%29_01.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(2,'1', 'https://upload.wikimedia.org/wikipedia/commons/2/29/2014_Audi_TTS_%288J_MY14%29_quattro_coupe_%282015-12-07%29_01.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(3,'1', 'https://upload.wikimedia.org/wikipedia/commons/2/29/2014_Audi_TTS_%288J_MY14%29_quattro_coupe_%282015-12-07%29_01.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(4,'1', 'https://upload.wikimedia.org/wikipedia/commons/2/29/2014_Audi_TTS_%288J_MY14%29_quattro_coupe_%282015-12-07%29_01.jpg')");
    }

}
