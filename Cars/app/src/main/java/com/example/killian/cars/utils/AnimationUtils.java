package com.example.killian.cars.utils;

import android.content.Context;
import android.view.animation.Animation;

import com.example.killian.cars.R;

/**
 * The class (@code AnimationUtils) contains frameworks for the animations
 * used in this project
 *
 * @author Killian.
 * @since 12/07/2016.
 */
public class AnimationUtils {

    /**
     * Returns a simple slide up animation
     *
     * @param context  context
     * @param duration mls duration of animation
     * @param offset   mls delay animation starting, set to 0 for no offset
     * @return Animation animation with a duration and offset
     */
    public static Animation slideUp(Context context, int duration, int offset) {
        Animation slide_up = android.view.animation.AnimationUtils.loadAnimation(context,
                R.anim.slide_up);
        slide_up.setDuration(duration);
        slide_up.setStartOffset(offset);
        return slide_up;
    }

    /**
     * Returns a simple slide down animation
     *
     * @param context  context
     * @param duration mls duration of animation
     * @param offset   mls delay animation starting, set to 0 for no offset
     * @return Animation animation with a duration and offset
     */
    public static Animation slideDown(Context context, int duration, int offset) {
        Animation slide_down = android.view.animation.AnimationUtils.loadAnimation(context,
                R.anim.slide_down);
        slide_down.setDuration(duration);
        slide_down.setStartOffset(offset);
        return slide_down;
    }

    /**
     * Returns a simple fade in animation
     *
     * @param context  context
     * @param duration mls duration of animation
     * @param offset   mls delay animation starting, set to 0 for no offset
     * @return Animation animation with a duration and offset
     */
    public static Animation fadeIn(Context context, int duration, int offset) {
        Animation fade_in = android.view.animation.AnimationUtils.loadAnimation(context,
                R.anim.fade_in);
        fade_in.setDuration(duration);
        fade_in.setStartOffset(offset);
        return fade_in;
    }

    /**
     * Returns a slide right to left animation
     *
     * @param context  context
     * @param duration mls duration of animation
     * @param offset   mls delay animation starting, set to 0 for no offset
     * @return Animation animation with a duration and offset
     */
    public static Animation slideRightToLeft(Context context, int duration, int offset) {
        Animation slide_right_to_left = android.view.animation.AnimationUtils.loadAnimation(context,
                R.anim.slide_right_to_left);
        slide_right_to_left.setDuration(duration);
        slide_right_to_left.setStartOffset(offset);
        return slide_right_to_left;
    }

    /**
     * Returns a simple fade out animation
     *
     * @param context  context
     * @param duration mls duration of animation
     * @param offset   mls delay animation starting, set to 0 for no offset
     * @return Animation animation with a duration and offset
     */
    public static Animation fadeOut(Context context, int duration, int offset) {
        Animation fade_out = android.view.animation.AnimationUtils.loadAnimation(context,
                R.anim.fade_out);
        fade_out.setDuration(duration);
        fade_out.setStartOffset(offset);
        return fade_out;
    }
}