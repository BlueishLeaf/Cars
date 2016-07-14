package com.example.killian.cars.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.Models.Car;
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
    private TextView username;
    private TextView feedback;
    private ImageView avatar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car_feedback, container, false);
        initBundleVariables(getActivity().getIntent().getExtras());

        username=(TextView) view.findViewById(R.id.user_name);
        avatar=(ImageView) view.findViewById(R.id.user_avatar_url);
        feedback=(TextView) view.findViewById(R.id.user_feedback);

        SQLiteHelper db = new SQLiteHelper(getActivity().getApplicationContext());
        List<FeedbackItem> feedbackItems = db.getAllFeedback(bundle_id);

        username.setText(feedbackItems.get(0).getUsername());
        feedback.setText(feedbackItems.get(0).getFeedback());

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
