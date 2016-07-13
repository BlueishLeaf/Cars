package com.example.killian.cars.Constants;

/**
 * The class (@code DBConstants) shows all the constants used in this project
 *
 * @author Killian.
 * @since 11/07/2016.
 */

public class DBConstants {

    //Database table names and version
    public static final String DATABASE_NAME = "car_database";
    public static final String DATABASE_TABLE_CARS = "cars";
    public static final String DATABASE_TABLE_CAR_IMAGES = "car_images";
    public static final int DATA_BASE_VERSION = 1;

    //Keys for database
    public static final String KEY_ID = "id";
    public static final String KEY_MODEL = "model";
    public static final String KEY_COLOR = "color";
    public static final String KEY_PRICE = "price";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_CAR_ID = "car_id";
    public static final String KEY_IMAGE_URL = "image_url";
    public static final String KEY_CAR_IMAGE_URL = "car_image_url";

    //CarActivity tabs
    public static final String CAR_TAB_INFO = "info";
    public static final String CAR_TAB_FEEDBACK = "feedback";

    public static final String BUNDLE_CAR_ID = "bundle_car_id";

    public static final int SPLASH_DISPLAY_LENGTH = 1000;

}
