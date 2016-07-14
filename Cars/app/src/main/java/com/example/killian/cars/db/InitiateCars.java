package com.example.killian.cars.db;

import android.database.sqlite.SQLiteDatabase;

import com.example.killian.cars.Constants.DBConstants;


/**
 * The class (@code InitiateCars) contains all the data for the database of cars
 *
 * @author Killian.
 * @since 11/07/2016.
 */

public class InitiateCars {
    public static void initCars(SQLiteDatabase db) {
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(1,'Audi R8', 'Blue', '240000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejsr.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(2,'Audi TT', 'Silver', '32000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejsz.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(3,'BMW G11', 'Silver', '16000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejs1.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(4,'BMW i3', 'Silver/Black', '30000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejs2.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(5,'Honda City', 'Silver', '21000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejs3.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(6,'Honda Civic', 'White', '26000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejs8.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(7,'DL DMC-12', 'Silver', '300000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejs4.jpeg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CARS + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_MODEL + ", "
                + DBConstants.KEY_COLOR + ","
                + DBConstants.KEY_PRICE + ", "
                + DBConstants.KEY_DESCRIPTION + ", "
                + DBConstants.KEY_IMAGE_URL + ") "
                + "values(8,'Toyota Yaris', 'Red', '21000', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ullamcorper risus. Nulla facilisi. Sed faucibus massa ut mi sodales, a aliquam eros commodo. Praesent quis aliquet leo. Praesent et nisi felis. Vestibulum eget venenatis arcu, sed hendrerit massa. Vivamus rutrum arcu at feugiat vulputate. Proin mattis quis mauris eget pulvinar. Suspendisse potenti. Pellentesque semper eros in purus consectetur gravida. Nunc nec turpis malesuada, consequat nisl venenatis, vehicula quam. Maecenas ornare aliquet nunc eget pretium. Maecenas egestas dui a dignissim vulputate.\n" +
                "\n" +
                "Pellentesque egestas elit ut erat egestas scelerisque. Nulla aliquam turpis ac lorem tincidunt, vel viverra justo blandit. Donec pellentesque id metus in rutrum. Sed quis pretium ipsum. Nam facilisis eleifend augue, a placerat lacus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas blandit, lacus vitae auctor faucibus, tortor est accumsan mi, id porta risus nisl et lorem. In vestibulum, nulla nec fringilla sollicitudin, lectus turpis condimentum enim, vel commodo tortor est at leo.\n" +
                "\n" +
                "Nulla eu augue tempus, luctus arcu a, blandit arcu. Cras orci mauris, faucibus et odio id, mattis hendrerit nisi. Suspendisse potenti. Donec eros quam, luctus sed semper luctus, vulputate consectetur eros. Nam pharetra tincidunt pellentesque. Nunc ac metus dapibus, sagittis nulla porta, imperdiet leo. Integer maximus quis ligula id maximus. Mauris id leo consequat orci ornare tincidunt nec at est. Quisque sit amet tellus commodo, aliquet nunc vitae, varius lacus. Quisque dolor ante, tempus sed elit a, ullamcorper ornare nunc.', 'http://needsmorejpeg.com/i/ejsy.jpeg')");
    }

    public static void initCarImages(SQLiteDatabase db) {
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(1,'1', 'https://s32.postimg.org/lnu3ponr9/2015_Audi_R8_Coup_5_2_FSI_quattro_19409896583.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(2,'1', 'https://s32.postimg.org/c4kew8091/2016_audi_r8_v10_11_1600x1200_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(3,'1', 'https://s32.postimg.org/h5rsxl7ph/Audi_R8_blue_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(4,'2', 'https://s32.postimg.org/t8x4l5irp/audi_tt_silver_1_1.jpg\n')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(5,'2', 'https://s32.postimg.org/wsegx7w3p/2007_Audi_TT_8_J_3_2_quattro_coupe_2015_11_11.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(6,'2', 'https://s32.postimg.org/mjlzre81x/2007audittquattro_l_097b069076d4cd97_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(7,'3', 'https://s32.postimg.org/f1c1a8vgl/Screen_Shot_2015_11_30_at_7_33_07_AM_copy.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(8,'3', 'https://s32.postimg.org/4d8abelhh/rsz_2016_bmw_7_series_g11_sedan_front_view.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(9,'3', 'https://s32.postimg.org/bzgnmjsxx/BMW_6er_Gran_Coupe_Pure_Metal_Silver_Pearl_Editi.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(10,'4', 'https://s32.postimg.org/ahv7azo79/BMW_i3_01_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(11,'4', 'https://s32.postimg.org/57q8jp3yd/BMW_i3_charging_on_Autolib_station_in_Paris_tri.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(12,'4', 'https://s32.postimg.org/594rquv5x/USC40_BMC601_B021001_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(13,'5', 'https://s32.postimg.org/uewj67hol/2014_Honda_City_GM6_MY14_VTi_sedan_2015_07_15.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(14,'5', 'https://s32.postimg.org/fufgbdmpx/2009_Honda_City_GM2_MY09_VTi_L_sedan_2011_01.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(15,'5', 'https://s32.postimg.org/cu7smbq6d/rsz_2012_honda_city_e_in_cyberjaya_malaysia_02.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(16,'6', 'https://s32.postimg.org/9w1n153r9/2014_Honda_Civic_FB2_MY15_VTi_sedan_2015_07_0.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(17,'6', 'https://s32.postimg.org/w1lqrftqd/01_2016_honda_civic_fd_1_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(18,'6', 'https://s32.postimg.org/pvovyfp6t/2014_Honda_Civic_FB2_MY15_VTi_sedan_2015_07_0.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(19,'7', 'https://s32.postimg.org/zeykrwcp1/Delorean_DMC_12_side_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(20,'7', 'https://s32.postimg.org/u8nfguxxh/79911_delorean_autoart_grey_silver_satin_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(21,'7', 'https://s32.postimg.org/gb9upap8l/delorean_in_silver_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(22,'8', 'https://s32.postimg.org/jps15fkn9/toyota_yaris_hybrid_cutout_1.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(23,'8', 'https://s32.postimg.org/6kcizbqrp/Toyota_Yaris_Near_Sea_In_Red_Back_Side_Pose.jpg')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_CAR_IMAGES + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_CAR_IMAGE_URL + ") "
                + "values(24,'8', 'https://s32.postimg.org/j1j6mhlxh/toyota_yaris_red_5_1.jpg')");

    }

    public static void initCarFeedback(SQLiteDatabase db) {
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(1, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(2, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(3, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(4, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(5, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(6, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(7, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(8, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(9, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(10, 'SatanRocksMySocks', 1, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(11, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(12, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(13, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(14, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(15, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(16, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(17, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(18, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(19, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(20, 'SatanRocksMySocks', 2, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(21, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(22, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(23, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(24, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(25, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(26, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(27, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(28, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.)");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(29, 'SatanRocksMySocks', 3, 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(30, 'SatanRocksMySocks', 3, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(31, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(32, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(33, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(34, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(35, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(36, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(37, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(38, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(39, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(40, 'SatanRocksMySocks', 4, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(41, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");
        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(42, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(43, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(44, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(45, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(46, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(47, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(48, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(49, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(50, 'SatanRocksMySocks', 5, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(51, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(52, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(53, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(54, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(55, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(56, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(57, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(58, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.)");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(59, 'SatanRocksMySocks', 6, 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(60, 'SatanRocksMySocks', 6, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(61, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(62, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(63, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(64, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(65, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(66, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(67, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(68, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(69, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(70, 'SatanRocksMySocks', 7, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(71, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(72, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(73, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(74, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(75, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(76, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(77, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(78, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(79, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");

        db.execSQL("insert into " + DBConstants.DATABASE_TABLE_FEEDBACK + "(" + DBConstants.KEY_ID + ","
                + DBConstants.KEY_USER_NAME + ","
                + DBConstants.KEY_CAR_ID + ","
                + DBConstants.KEY_USER_AVATAR_URL + ", "
                + DBConstants.KEY_USER_FEEDBACK + ") "
                + "values(80, 'SatanRocksMySocks', 8, 'https://goo.gl/4C5eeA', 'Praesent sollicitudin arcu sed dolor dignissim pretium. Fusce suscipit, sapien laoreet ornare convallis, ligula libero bibendum ex, cursus fermentum metus justo ut nisl. Pellentesque et justo ornare, scelerisque lacus hendrerit, convallis nibh. Donec consectetur vehicula dignissim. Nunc non eros pretium, ornare urna at, faucibus tellus. Phasellus vitae dignissim nulla, at.')");
    }
}
