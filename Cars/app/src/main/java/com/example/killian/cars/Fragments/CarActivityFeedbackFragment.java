package com.example.killian.cars.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.killian.cars.Adapters.CarActivityFeedbackAdapter;
import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.Models.FeedbackItem;
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

    private int bundle_id;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car_feedback, container, false);
        initBundleVariables(getActivity().getIntent().getExtras());

        SQLiteHelper db = new SQLiteHelper(getActivity().getApplicationContext());
        List<FeedbackItem> feedbackItems = db.getCarFeedback(bundle_id);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.feedback_recycler_view);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new CarActivityFeedbackAdapter(feedbackItems);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    private void initBundleVariables(Bundle bundle) {
        if (bundle != null) {
            bundle_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
        } else {
            bundle_id = -1;
        }
    }
}
