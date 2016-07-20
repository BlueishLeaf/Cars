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

import com.example.killian.cars.adapters.CarActivityFeedbackAdapter;
import com.example.killian.cars.constants.ActivityConstants;
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
    private int bundle_car_id;
    private List<FeedbackItem> feedbackItems;
    private SQLiteHelper db;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_car_feedback, container, false);
        initBundleVariables(getActivity().getIntent().getExtras());

        fetchFeedbackItemsFromDb();

        editTextName = (EditText) view.findViewById(R.id.name_text);
        editTextFeedback = (EditText) view.findViewById(R.id.feedback_text);

        final RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.feedback_recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        final CarActivityFeedbackAdapter mAdapter = new CarActivityFeedbackAdapter(feedbackItems);
        mRecyclerView.setAdapter(mAdapter);

        Button addFeedback = (Button) view.findViewById(R.id.feedback_button);
        addFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insertFeedback(bundle_car_id, editTextName.getText().toString(), "http://goo.gl/lCxNi4", editTextFeedback.getText().toString());
                fetchFeedbackItemsFromDb();
                mAdapter.setFeedbackItems(feedbackItems);
                mAdapter.notifyDataSetChanged();
            }
        });
        return view;
    }

    private void initBundleVariables(Bundle bundle) {
        if (bundle != null) {
            bundle_car_id = bundle.getInt(ActivityConstants.BUNDLE_CAR_ID);
        } else {
            bundle_car_id = -1;
        }
    }

    private void fetchFeedbackItemsFromDb(){
        db = new SQLiteHelper(getActivity().getApplicationContext());
        feedbackItems = db.getCarFeedback(bundle_car_id);
    }
}
