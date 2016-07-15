package com.example.killian.cars.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.killian.cars.adapters.CarActivityFragmentAdapter;
import com.example.killian.cars.adapters.CarActivityPagerAdapter;
import com.example.killian.cars.constants.DBConstants;
import com.example.killian.cars.listeners.TabLayoutListener;
import com.example.killian.cars.models.Car;
import com.example.killian.cars.R;
import com.example.killian.cars.utils.UIUtils;
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
    private CollapsingToolbarLayout collapsingToolbarLayout;

    private int bundle_car_id;
    private int detailColor;
    private Car car;
    private String bundle_car_ulr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        //ButterKnife.bind(this);// Must use this line to initialize the @BindViews class variables :P

        // bind variables
        viewPager = (ViewPager) findViewById(R.id.carImagePager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabViewPager = (ViewPager) findViewById(R.id.carTabPager);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);

        // get extras
        initBundleVariables(getIntent().getExtras());

        // setup data
        SQLiteHelper db = new SQLiteHelper(getApplicationContext());
        car = db.getCar(bundle_car_id);

        Picasso.with(this)
                .load(bundle_car_ulr)
                .into(new Target() {
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        // setup views
                        detailColor = UIUtils.getDetailColorFromImage(bitmap);
                        initPagerAdapter();
                        initCarFragmentTabs();
                        setCollapsingToolbarTheme();
                    }

                    @Override
                    public void onBitmapFailed(Drawable errorDrawable) {
                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {
                    }
                });
    }

    private void initPagerAdapter() {
        CarActivityPagerAdapter adapter = new CarActivityPagerAdapter(this, car.urls());
        viewPager.setAdapter(adapter);
    }

    private void initCarFragmentTabs() {
        tabLayout.addTab(tabLayout.newTab().setText(DBConstants.CAR_TAB_INFO));
        tabLayout.addTab(tabLayout.newTab().setText(DBConstants.CAR_TAB_FEEDBACK));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final CarActivityFragmentAdapter adapter = new CarActivityFragmentAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        tabViewPager.setAdapter(adapter);
        tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setSelectedTabIndicatorColor(detailColor);
        tabLayout.setOnTabSelectedListener(new TabLayoutListener(tabViewPager));
    }

    private void setCollapsingToolbarTheme(){
        collapsingToolbarLayout.setBackgroundColor(detailColor);
    }

    private void initBundleVariables(Bundle bundle) {
        bundle_car_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
        bundle_car_ulr = bundle.getString("car_url");
    }
}
