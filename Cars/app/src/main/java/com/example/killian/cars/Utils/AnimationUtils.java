package com.example.killian.cars.Utils;

import android.content.Context;
import android.view.animation.Animation;

import com.example.killian.cars.R;

/**
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
    public static Animation get_slide_up(Context context, int duration, int offset) {
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
    public static Animation get_slide_down(Context context, int duration, int offset) {
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
    public static Animation get_fade_in(Context context, int duration, int offset) {
        Animation fade_in = android.view.animation.AnimationUtils.loadAnimation(context,
                R.anim.fade_in);
        fade_in.setDuration(duration);
        fade_in.setStartOffset(offset);
        return fade_in;
    }
}