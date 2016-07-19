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
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.killian.cars.R;
import com.example.killian.cars.adapters.CarActivityFragmentAdapter;
import com.example.killian.cars.adapters.CarActivityPagerAdapter;
import com.example.killian.cars.constants.DBConstants;
import com.example.killian.cars.db.SQLiteHelper;
import com.example.killian.cars.listeners.TabLayoutListener;
import com.example.killian.cars.models.Car;
import com.example.killian.cars.utils.UIUtils;
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
    private EditText editTextName;
    private EditText editTextUrl;
    private EditText editTextFeedback;
    private Button addFeedback;

    private int bundle_car_id;
    private int detailColor;
    private int secondaryColor;
    private int primaryColor;
    private int dotsCount;    //No of tabs or images

    private Car car;
    private String bundle_car_ulr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);


        // bind variables
        viewPager = (ViewPager) findViewById(R.id.carImagePager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabViewPager = (ViewPager) findViewById(R.id.carTabPager);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        editTextName = (EditText) findViewById(R.id.name_text);
//        editTextUrl = (EditText) findViewById(R.id.url_text);
//        editTextFeedback = (EditText) findViewById(R.id.feedback_text);
//
//        addFeedback = (Button) findViewById(R.id.feedback_button);
//        addFeedback.setOnClickListener(this);


        // get extras
        initBundleVariables(getIntent().getExtras());


        // setup data
        SQLiteHelper db = new SQLiteHelper(getApplicationContext());
        car = db.getCar(bundle_car_id);
        drawPageSelectionIndicators(0);
        dotsCount = car.urls().size();    //No of tabs or images
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                drawPageSelectionIndicators(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        Picasso.with(this)
                .load(bundle_car_ulr)
                .into(new Target() {
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        // setup views
                        detailColor = UIUtils.getDetailColorFromBitmap(bitmap);
                        secondaryColor = UIUtils.getSecondaryColorFromBitmap(bitmap);
                        primaryColor = UIUtils.getPrimaryColorFromBitmap(bitmap);
                        initToolbar(car.getModel());
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
        Drawable arrowDrawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, DBConstants.ARROW_HEIGHT, DBConstants.ARROW_WIDTH, true));
        arrowDrawable.setColorFilter(detailColor, PorterDuff.Mode.SRC_ATOP);
        return arrowDrawable;
    }

    private void setCollapsingToolbarTheme() {
        collapsingToolbarLayout.animate();
    }

    private void initBundleVariables(Bundle bundle) {
        bundle_car_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
        bundle_car_ulr = bundle.getString("car_url");

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


    private ImageView[] dots;
    LinearLayout linearLayout;

    private void drawPageSelectionIndicators(int mPosition) {
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        linearLayout = (LinearLayout) findViewById(R.id.viewPagerCountDots);
        dots = new ImageView[dotsCount];
        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(this);
            if (i == mPosition)
                dots[i].setImageDrawable(getResources().getDrawable(R.drawable.item_selected));
            else
                dots[i].setImageDrawable(getResources().getDrawable(R.drawable.item_unselected));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4, 0, 4, 0);
            linearLayout.addView(dots[i], params);
        }
    }

//    @Override
//    public void onClick(View v) {
//        SQLiteHelper sqLiteHelper = new SQLiteHelper(getApplicationContext());
//        if (v == addFeedback) {
//            sqLiteHelper.insertFeedback();
//        }
//    }
}
