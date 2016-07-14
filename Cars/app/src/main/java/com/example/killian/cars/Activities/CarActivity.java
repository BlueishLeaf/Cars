package com.example.killian.cars.Activities;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.Adapters.CarActivityFragmentAdapter;
import com.example.killian.cars.Adapters.CarActivityPagerAdapter;
import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.Listeners.TabLayoutListener;
import com.example.killian.cars.Models.Car;
import com.example.killian.cars.R;
import com.example.killian.cars.Utils.AnimationUtils;
import com.example.killian.cars.Utils.UIUtils;
import com.example.killian.cars.db.SQLiteHelper;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

/**
 * The class {@code CarActivity} governs the framework of a specific car's page
 *
 * @author Killian.
 * @since 11/07/2016.
 */

public class CarActivity extends AppCompatActivity {

    //Variable definitions
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPager tabViewPager;

    private int bundle_car_id;
    private int detailColor;
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        //ButterKnife.bind(this);// Must use this line to initialize the @BindViews class variables :P

        // bind variables
        viewPager = (ViewPager) findViewById(R.id.carImagePager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabViewPager = (ViewPager) findViewById(R.id.carTabPager);

        // get extras
        initBundleVariables(getIntent().getExtras());
        SQLiteHelper db = new SQLiteHelper(getApplicationContext());
        car = db.getCar(bundle_car_id);

        initPagerAdapter();
        initCarFragmentTabs();

    }

    private void initPagerAdapter() {
        CarActivityPagerAdapter adapter = new CarActivityPagerAdapter(this, car.urls());
        viewPager.setAdapter(adapter);
    }

    private void initCarFragmentTabs() {
        tabLayout.addTab(tabLayout.newTab().setText(DBConstants.CAR_TAB_INFO));
        tabLayout.addTab(tabLayout.newTab().setText(DBConstants.CAR_TAB_FEEDBACK));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setSelectedTabIndicatorColor(detailColor);
        final CarActivityFragmentAdapter adapter = new CarActivityFragmentAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        tabViewPager.setAdapter(adapter);
        tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayoutListener(tabViewPager));
    }

    private void initBundleVariables(Bundle bundle) {
        bundle_car_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
    }

}
