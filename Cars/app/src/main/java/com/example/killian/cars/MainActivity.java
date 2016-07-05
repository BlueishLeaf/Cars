package com.example.killian.cars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//This class is used to populate our collection view of cars
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person = new Person(23, "John", "Blue");
        Log.i(person.getname(),"000000000000000000000000000000000");
    }
}
