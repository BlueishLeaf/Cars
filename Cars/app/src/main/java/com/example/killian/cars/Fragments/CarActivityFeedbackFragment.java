package com.example.killian.cars.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.killian.cars.activities.CarActivity;
import com.example.killian.cars.adapters.CarActivityFeedbackAdapter;
import com.example.killian.cars.constants.DBConstants;
import com.example.killian.cars.models.Car;
import com.example.killian.cars.models.FeedbackItem;
import com.example.killian.cars.R;
import com.example.killian.cars.db.SQLiteHelper;

import java.util.List;

/**
 * This class (@code CarActivityFeedbackFragment) governs the framework of the feedback tab
 * for a specific car
 *
 * @author Killian.
 * @since 12/07/2016.
 */

public class CarActivityFeedbackFragment extends Fragment {

    private EditText editTextName;
    private EditText editTextFeedback;
    private Button addFeedback;
    private int bundle_car_id;
    private Car car;
    SQLiteHelper db;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_car_feedback, container, false);
        initBundleVariables(getActivity().getIntent().getExtras());

        final SQLiteHelper db = new SQLiteHelper(getActivity().getApplicationContext());
        List<FeedbackItem> feedbackItems = db.getCarFeedback(bundle_car_id);

        editTextName = (EditText) view.findViewById(R.id.name_text);
        editTextFeedback = (EditText) view.findViewById(R.id.feedback_text);

        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.feedback_recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        RecyclerView.Adapter mAdapter = new CarActivityFeedbackAdapter(feedbackItems);
        mRecyclerView.setAdapter(mAdapter);
        addFeedback = (Button) view.findViewById(R.id.feedback_button);
        car = db.getCar(bundle_car_id);

        addFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insertFeedback(bundle_car_id, editTextName.getText().toString(), "http://goo.gl/lCxNi4", editTextFeedback.getText().toString());
            }});

            return view;
        }


    private void initBundleVariables(Bundle bundle) {
        if (bundle != null) {
            bundle_car_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
        } else {
            bundle_car_id = -1;
        }
    }
}
