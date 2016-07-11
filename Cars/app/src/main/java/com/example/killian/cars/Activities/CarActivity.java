package com.example.killian.cars.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.R;

/**
 * Created by Killian on 11/07/2016.
 */
public class CarActivity extends Activity {
    private int bundle_id;
    private TextView caridtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        caridtest=(TextView)findViewById(R.id.car_model_textView);
        initBundleVariables(getIntent().getExtras());
        caridtest.setText(bundle_id);
    }
    private void initBundleVariables(Bundle bundle) {
        bundle_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
    }
}
