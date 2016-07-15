package com.example.killian.cars.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.killian.cars.adapters.CarItemActivityAdapter;
import com.example.killian.cars.models.CarItem;
import com.example.killian.cars.R;
import com.example.killian.cars.db.SQLiteHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * The class {@code MainActivity} populates the main screen with
 * a list of cars
 *
 * @author Killian.
 * @since 11/07/2016.
 */
public class MainActivity extends AppCompatActivity {

    private List<CarItem> carItemList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteHelper db = new SQLiteHelper(this);
        db.getAllCars();

        carItemList = db.getAllCars();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new CarItemActivityAdapter(carItemList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
