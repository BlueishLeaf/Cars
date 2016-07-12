package com.example.killian.cars.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.michaelevans.colorart.library.ColorArt;

/**
 * Created by Killian on 12/07/2016.
 */
public class UIUtils {

    /**
     * Get primary color from an image
     *
     * @param context    context
     * @param resourceId image id to get color from
     * @return integer value of primary color from an image
     */
    public static int getPrimaryColorFromImage(Context context, int resourceId) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resourceId);
        ColorArt colorArt = new ColorArt(bitmap);
        return colorArt.getPrimaryColor();
    }

    /**
     * Get secondary color from an image
     *
     * @param context    context
     * @param resourceId image id to get color from
     * @return integer value of secondary color from an image
     */
    public static int getSecondaryColorFromImage(Context context, int resourceId) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resourceId);
        ColorArt colorArt = new ColorArt(bitmap);
        return colorArt.getSecondaryColor();
    }

    /**
     * Get detail color from an image
     *
     * @param context    context
     * @param resourceId image id to get color from
     * @return integer value of detail color from an image
     */
    public static int getDetailColorFromImage(Context context, int resourceId) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resourceId);
        ColorArt colorArt = new ColorArt(bitmap);
        return colorArt.getDetailColor();
    }
}