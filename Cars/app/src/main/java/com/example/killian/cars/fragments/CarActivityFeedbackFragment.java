package com.example.killian.cars.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.killian.cars.adapters.CarActivityFeedbackAdapter;
import com.example.killian.cars.constants.ActivityConstants;
import com.example.killian.cars.models.FeedbackItem;
import com.example.killian.cars.R;
import com.example.killian.cars.db.SQLiteHelper;
import com.example.killian.cars.utils.AnimationUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;

/**
 * This class (@code CarActivityFeedbackFragment) governs the framework of the feedback tab
 * for a specific car
 *
 * @author Killian.
 * @since 12/07/2016.
 */
public class CarActivityFeedbackFragment extends Fragment {

    @BindView(R.id.name_text)
    EditText editTextName;

    @BindView(R.id.feedback_text)
    EditText editTextFeedback;

    @BindView(R.id.comment_box)
    RelativeLayout commentBox;

    private int bundle_car_id;
    private List<FeedbackItem> feedbackItems;
    private SQLiteHelper db;

    private CarActivityFeedbackAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_car_feedback, container, false);
        initBundleVariables(getActivity().getIntent().getExtras());
        ButterKnife.bind(this, view);

        fetchFeedbackItemsFromDb();

        final RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.feedback_recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CarActivityFeedbackAdapter(feedbackItems);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @OnClick(R.id.feedback_button)
    public void submitOnClick() {
        db.insertFeedback(bundle_car_id, editTextName.getText().toString(), "http://goo.gl/lCxNi4", editTextFeedback.getText().toString());
        fetchFeedbackItemsFromDb();
        mAdapter.setFeedbackItems(feedbackItems);
        mAdapter.notifyDataSetChanged();
        inflateFeedbackOnClick();
    }

    @OnClick({R.id.feedback_inflate_button, R.id.cancel_button})
    public void inflateFeedbackOnClick() {
        commentBox.setVisibility(commentBox.getVisibility() == View.GONE ? View.VISIBLE: View.GONE);
        editTextName.getText().clear();
        editTextFeedback.getText().clear();
        if(commentBox.getVisibility() == View.GONE){
            commentBox.setAnimation(AnimationUtils.slideLeftToRight(this.getContext(), 500, 0));
            commentBox.setVisibility(View.GONE);

        }
        else {
            commentBox.setAnimation(AnimationUtils.slideRightToLeft(this.getContext(), 500, 0));
        }
    }

    private void initBundleVariables(Bundle bundle) {
        if (bundle != null) {
            bundle_car_id = bundle.getInt(ActivityConstants.BUNDLE_CAR_ID);
        } else {
            bundle_car_id = -1;
        }
    }

    private void fetchFeedbackItemsFromDb() {
        db = new SQLiteHelper(getActivity().getApplicationContext());
        feedbackItems = db.getCarFeedback(bundle_car_id);
    }
}
