package com.example.killian.cars.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;

import com.example.killian.cars.R;
import com.example.killian.cars.adapters.CarItemActivityAdapter;
import com.example.killian.cars.db.SQLiteHelper;
import com.example.killian.cars.models.CarItem;

import java.util.List;

/**
 * The class {@code MainActivity} populates the main screen with
 * a list of cars
 *
 * @author Killian.
 * @since 11/07/2016.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteHelper db = new SQLiteHelper(this);
        db.getAllCars();

        List<CarItem> carItemList = db.getAllCars();
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        RecyclerView.Adapter mAdapter = new CarItemActivityAdapter(carItemList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
