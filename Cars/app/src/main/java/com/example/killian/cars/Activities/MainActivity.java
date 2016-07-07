package com.example.killian.cars.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.killian.cars.Models.CarItem;
import com.example.killian.cars.R;
import com.example.killian.cars.db.SQLiteHelper;

import java.util.ArrayList;
import java.util.List;

//This class is used to populate our collection view of cars
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteHelper db = new SQLiteHelper(this);
        List<CarItem> carItems = db.getAllCars();
//        mRecyclerView = (RecyclerView) findViewById(R.id.car_recycler_view);
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        //mAdapter = new MyAdapter(myDataset);
//        mRecyclerView.setAdapter(mAdapter);


    }
}
