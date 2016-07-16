package com.example.killian.cars.utils;

import android.graphics.Bitmap;

import org.michaelevans.colorart.library.ColorArt;

/**
 * @author Killian.
 * @since 12/07/2016.
 */
public class UIUtils {

    /**
     * Get primary color from an image
     *
     * @param bitmap image to get color from
     * @return integer value of primary color from a bitmap image
     */
    public static int getPrimaryColorFromBitmap(Bitmap bitmap) {
        ColorArt colorArt = new ColorArt(bitmap);
        return colorArt.getPrimaryColor();
    }

    /**
     * Get secondary color from an image
     *
     * @param bitmap image to get color from
     * @return integer value of secondary color from a bitmap image
     */
    public static int getSecondaryColorFromBitmap(Bitmap bitmap) {
        ColorArt colorArt = new ColorArt(bitmap);
        return colorArt.getSecondaryColor();
    }

    /**
     * Get detail color from an image
     *
     * @param bitmap image to get color from
     * @return integer value of detail color from a bitmap image
     */
    public static int getDetailColorFromBitmap(Bitmap bitmap) {
        ColorArt colorArt = new ColorArt(bitmap);
        return colorArt.getDetailColor();
    }
}