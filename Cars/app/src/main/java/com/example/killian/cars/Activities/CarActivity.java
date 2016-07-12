package com.example.killian.cars.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.R;

/**
 * @author Killian.
 * @since 11/07/2016.
 */

public class CarActivity extends AppCompatActivity {
    private int bundle_id;
    TextView caridtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        initBundleVariables(getIntent().getExtras());
        caridtest = (TextView)findViewById(R.id.car_model_textView);
        Log.e("Hello","Id Is :  " + initBundleVariables(getIntent().getExtras()));
        caridtest.setText(Integer.toString(bundle_id));
    }

    private int initBundleVariables(Bundle bundle) {
        return bundle_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
    }
}
