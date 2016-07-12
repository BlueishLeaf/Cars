package com.example.killian.cars.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.killian.cars.Adapters.CarActivityFragmentAdapter;
import com.example.killian.cars.Adapters.CarActivityPagerAdapter;
import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.Listeners.TabLayoutListener;
import com.example.killian.cars.Models.Car;
import com.example.killian.cars.R;
import com.example.killian.cars.db.SQLiteHelper;

import butterknife.BindView;

/**
 * @author Killian.
 * @since 11/07/2016.
 */

public class CarActivity extends AppCompatActivity {

    @BindView(R.id.viewPager) ViewPager viewPager;
    @BindView(R.id.tab_layout) TabLayout tabLayout;
    @BindView(R.id.carInfoPager) ViewPager tabViewPager;
    private int bundle_id;
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        initBundleVariables(getIntent().getExtras());
        SQLiteHelper db = new SQLiteHelper(this);
        car=db.getCar(bundle_id);

        initCarFragmentTabs();
        initPagerAdapter();
    }
    private void initPagerAdapter() {
        CarActivityPagerAdapter adapter = new CarActivityPagerAdapter(this, car.urls());
        viewPager.setAdapter(adapter);
        //viewPager.setAnimation(AnimationUtils.get_slide_down(this, 500, 500));
    }

    private void initCarFragmentTabs() {
        tabLayout.addTab(tabLayout.newTab().setText(DBConstants.CAR_TAB_INFO));
        tabLayout.addTab(tabLayout.newTab().setText(DBConstants.CAR_TAB_FEEDBACK));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final CarActivityFragmentAdapter adapter = new CarActivityFragmentAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        tabViewPager.setAdapter(adapter);
        tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //tabLayout.setSelectedTabIndicatorColor(imageDetailColor);
        tabLayout.addOnTabSelectedListener(new TabLayoutListener(tabViewPager));

    }

    private int initBundleVariables(Bundle bundle) {
        return bundle_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
    }
}
