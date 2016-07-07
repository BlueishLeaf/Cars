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
                + "values(1,'Mazda 323', 'Blue', '240000', 'description', 'https://upload.wikimedia.org/wikipedia/commons/3/36/2015_Audi_R8_Coup%C3%A9_5.2_FSI_quattro_%2819409896583%29.jpg')");

    }
    public static void initCarImages(SQLiteDatabase db) {
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(1,'1', 'https://upload.wikimedia.org/wikipedia/commons/2/29/2014_Audi_TTS_%288J_MY14%29_quattro_coupe_%282015-12-07%29_01.jpg')");
    }
}
