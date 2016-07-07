package com.example.killian.cars.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.Models.CarItem;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Killian on 07/07/2016.
 */

public class SQLiteHelper extends SQLiteOpenHelper {


    public SQLiteHelper(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createCarsTable = "CREATE TABLE "+ DBConstants.DATABASE_TABLE_CARS +" (id INTEGER PRIMARY KEY AUTOINCREMENT, model TEXT, color TEXT, price TEXT, description INTEGER, imageurl TEXT)";
        db.execSQL(createCarsTable);
        InitiateCars.initCars(db);

        String createCarImageTable = "CREATE TABLE "+ DBConstants.DATABASE_TABLE_CAR_IMAGES +"(id INTEGER PRIMARY KEY AUTOINCREMENT, carId INTEGER, imageurl TEXT)";
        db.execSQL(createCarImageTable);
        InitiateCars.initCarImages(db);

        /*String createCarCommentsTable = "CREATE TABLE Car_comments (id INTEGER PRIMARY KEY AUTOINCREMENT, CarId INTEGER, comment TEXT, profileImageId TEXT)";
        db.execSQL(createCarCommentsTable);*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    /**
     * Return a list of cars to display in {@code CarGalleryActivity}
     *
     * @return List<CarItem>
     */
    public List<CarItem> getAllCars() {

        SQLiteDatabase db = this.getWritableDatabase();

        List<CarItem> cars = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT id, imageurl FROM " + DBConstants.DATABASE_TABLE_CARS + "", null);

        CarItem car;

        if (cursor.moveToFirst()) {
            do {
                car = new CarItem(cursor.getInt(0), cursor.getString(1), cursor.getString(5));
                cars.add(car);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return cars;
    }

    /**
     * Get a list of watch image resource ids for a specific watch
     *
     * @param id watch id
     * @return List<String> image resource ids
     */
//    public List<String> getWatchImageResourceIds(int id) {
//
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        List<String> watches = new ArrayList<>();
//
//        Cursor cursor = db.rawQuery("SELECT imageId from " + DATABASE_TABLE_WATCH_IMAGES + " WHERE watchId = " + id, null);
//
//        if (cursor != null) {
//            if (cursor.moveToFirst()) {
//                do {
//                    watches.add(cursor.getString(0));
//                } while (cursor.moveToNext());
//            }
//            cursor.close();
//        }
//        return watches;
//    }
//
//    /**
//     * Return a specific watch
//     *
//     * @param id watch id
//     * @return WatchModel a Watch
//     */
//    public WatchModel getWatch(int id) {
//
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        Cursor cursor = db.rawQuery("SELECT * from " + DATABASE_TABLE_WATCHES + " WHERE id = " + id, null);
//
//        WatchModel watch = null;
//
//        if (cursor != null) {
//            if (cursor.moveToFirst()) {
//                do {
//                    watch = new WatchModel(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3));
//                } while (cursor.moveToNext());
//            }
//            cursor.close();
//        }
//
//        return watch;
//    }
}

