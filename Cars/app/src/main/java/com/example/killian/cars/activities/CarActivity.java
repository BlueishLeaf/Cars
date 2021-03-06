package com.example.killian.cars.activities;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.killian.cars.R;
import com.example.killian.cars.adapters.CarActivityFragmentAdapter;
import com.example.killian.cars.adapters.CarActivityPagerAdapter;
import com.example.killian.cars.constants.ActivityConstants;
import com.example.killian.cars.db.SQLiteHelper;
import com.example.killian.cars.listeners.CarPagerImageListener;
import com.example.killian.cars.listeners.CarFragmentsTabLayoutListener;
import com.example.killian.cars.models.Car;
import com.example.killian.cars.utils.UIUtils;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * The class {@code CarActivity} governs the framework of a specific car's page
 *
 * @author Killian.
 * @since 11/07/2016.
 */
public class CarActivity extends AppCompatActivity {

    //Variable definitions
    private int bundle_car_id;
    private int detailColor;

    private Car car;
    private String bundle_car_ulr;

    //Bind Variables
    @BindView(R.id.carImagePager)
    ViewPager viewPager;

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;

    @BindView(R.id.carTabPager)
    ViewPager tabViewPager;

    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        ButterKnife.bind(this);

        // get extras
        initBundleVariables(getIntent().getExtras());

        // setup data
        SQLiteHelper db = new SQLiteHelper(getApplicationContext());
        car = db.getCar(bundle_car_id);

        // setup car image pager indicator dots
        int dotsCount = car.urls().size();
        LinearLayout dotsLinearLayout = (LinearLayout) findViewById(R.id.viewPagerCountDots);
        viewPager.addOnPageChangeListener(new CarPagerImageListener(dotsLinearLayout, dotsCount, this));

        setupActivityTheme();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    private void initPagerAdapter() {
        CarActivityPagerAdapter adapter = new CarActivityPagerAdapter(this, car.urls());
        viewPager.setAdapter(adapter);
    }

    private void initCarFragmentTabs() {
        tabLayout.addTab(tabLayout.newTab().setText(ActivityConstants.CAR_TAB_INFO));
        tabLayout.addTab(tabLayout.newTab().setText(ActivityConstants.CAR_TAB_FEEDBACK));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final CarActivityFragmentAdapter adapter = new CarActivityFragmentAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        tabViewPager.setAdapter(adapter);
        tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setSelectedTabIndicatorColor(detailColor);
        tabLayout.setOnTabSelectedListener(new CarFragmentsTabLayoutListener(tabViewPager));
    }

    private void initToolbar(String title) {
        if (getSupportActionBar() != null) {
            SpannableString spannableString = new SpannableString(title);
            spannableString.setSpan(new ForegroundColorSpan(detailColor), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            getSupportActionBar().setTitle(spannableString);
            getSupportActionBar().setElevation(0);
            getSupportActionBar().setHomeAsUpIndicator(getColorBackButton());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
    }

    private Drawable getColorBackButton() {
        final Drawable upArrow = getResources().getDrawable(R.drawable.back_arrow, this.getTheme());
        assert upArrow != null;
        Bitmap bitmap = ((BitmapDrawable) upArrow).getBitmap();
        Drawable arrowDrawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, ActivityConstants.ARROW_WIDTH, ActivityConstants.ARROW_HEIGHT, true));
        arrowDrawable.setColorFilter(detailColor, PorterDuff.Mode.SRC_ATOP);
        return arrowDrawable;
    }

    private void initBundleVariables(Bundle bundle) {
        bundle_car_id = bundle.getInt(ActivityConstants.BUNDLE_CAR_ID);
        bundle_car_ulr = bundle.getString(ActivityConstants.BUNDLE_CAR_URL);

    }

    private void setupActivityTheme() {
        Picasso.with(this)
                .load(bundle_car_ulr)
                .into(new Target() {
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        detailColor = UIUtils.getDetailColorFromBitmap(bitmap);
                        initToolbar(car.getModel());
                        initPagerAdapter();
                        initCarFragmentTabs();
                    }

                    @Override
                    public void onBitmapFailed(Drawable errorDrawable) {
                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {
                    }
                });
    }
}
