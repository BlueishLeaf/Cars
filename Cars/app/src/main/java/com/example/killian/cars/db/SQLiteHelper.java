package com.example.killian.cars.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.Models.Car;
import com.example.killian.cars.Models.CarItem;
import com.example.killian.cars.Models.FeedbackItem;

import java.util.ArrayList;
import java.util.List;


/**
 * The class (@code SQLiteHelper) sets up our SQLite database
 *
 * @author Killian.
 * @since 11/07/2016.
 */

public class SQLiteHelper extends SQLiteOpenHelper {


    public SQLiteHelper(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATA_BASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createCarsTable = "CREATE TABLE "+ DBConstants.DATABASE_TABLE_CARS +" (id INTEGER PRIMARY KEY AUTOINCREMENT, model TEXT, color TEXT, price TEXT, description TEXT, image_url TEXT)";
        db.execSQL(createCarsTable);
        InitiateCars.initCars(db);

        String createCarImageTable = "CREATE TABLE "+ DBConstants.DATABASE_TABLE_CAR_IMAGES +"(id INTEGER PRIMARY KEY AUTOINCREMENT, car_id INTEGER, car_image_url TEXT)";
        db.execSQL(createCarImageTable);
        InitiateCars.initCarImages(db);

        String createCarCommentsTable = "CREATE TABLE "+ DBConstants.DATABASE_TABLE_FEEDBACK + "(id INTEGER PRIMARY KEY AUTOINCREMENT, car_id INTEGER, user_name TEXT, user_avatar_url TEXT, user_feedback TEXT)";
        db.execSQL(createCarCommentsTable);
        InitiateCars.initCarFeedback(db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /**
     * Return a list of cars to display in {@code MainActivity}
     *
     * @return List<CarItem>
     */

    public List<CarItem> getAllCars() {

        SQLiteDatabase db = this.getWritableDatabase();

        List<CarItem> cars = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM " + DBConstants.DATABASE_TABLE_CARS + "", null);

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
     * Get a list of car image URLs for a specific car
     *
     * @param id car id
     * @return List<String> cars
     */

    public List<String> getCarImageResourceIds(int id) {

        SQLiteDatabase db = this.getReadableDatabase();

        List<String> cars = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT car_image_url from " + DBConstants.DATABASE_TABLE_CAR_IMAGES + " WHERE car_id = " + id, null);

        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    cars.add(cursor.getString(0));
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        return cars;
    }

    /**
     * Return a specific car
     *
     * @param id watch id
     * @return Car
     */
    public Car getCar(int id) {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * from " + DBConstants.DATABASE_TABLE_CARS + " WHERE id = " + id, null);

        Car car = null;

        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    car = new Car(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), getCarImageResourceIds(id));
                } while (cursor.moveToNext());
            }
            cursor.close();
        }

        return car;
    }

    public List<FeedbackItem> getAllFeedback(final int carId) {

        SQLiteDatabase db = this.getWritableDatabase();

        List<FeedbackItem> feedbackItems = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM " + DBConstants.DATABASE_TABLE_FEEDBACK + " WHERE car_id = "+ carId, null);

        FeedbackItem feedback;

        if (cursor.moveToFirst()) {
            do {
                feedback = new FeedbackItem(cursor.getInt(0), cursor.getString(2), cursor.getString(3), cursor.getString(4));
                feedbackItems.add(feedback);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return feedbackItems;
    }
}

