package com.example.killian.cars.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.killian.cars.R;
import com.example.killian.cars.constants.ActivityConstants;
import com.example.killian.cars.utils.AnimationUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * The class {@code SplashActivity} is used to display a splash screen
 *
 * @author Killian.
 * @since 11/07/2016.
 */
public class SplashActivity extends Activity {

    @BindView(R.id.splash_image)
    ImageView splashImage;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash);
        ButterKnife.bind(this);

        setAnimations();

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, ActivityConstants.SPLASH_DISPLAY_LENGTH);
    }

    private void setAnimations() {
        splashImage.setAnimation(AnimationUtils.fadeIn(this, 500, 0));

    }
}

