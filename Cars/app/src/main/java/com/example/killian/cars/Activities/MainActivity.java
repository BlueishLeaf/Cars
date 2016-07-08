package com.example.killian.cars.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.killian.cars.Adapters.MyAdapter;
import com.example.killian.cars.Models.CarItem;
import com.example.killian.cars.R;
import com.example.killian.cars.db.SQLiteHelper;

import java.util.ArrayList;
import java.util.List;

//This class is used to populate our collection view of cars
public class MainActivity extends AppCompatActivity {

    private List<CarItem> carItemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteHelper db = new SQLiteHelper(this);
        carItemList = db.getAllCars();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MyAdapter(carItemList, this.getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);



    }
}
