package com.example.killian.cars.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.constants.ActivityConstants;
import com.example.killian.cars.models.Car;
import com.example.killian.cars.R;
import com.example.killian.cars.utils.AnimationUtils;
import com.example.killian.cars.db.SQLiteHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * This class (@code CarActivityInfoFragment) governs the framework for the information about
 * a specific car to be displayed on its info tab
 *
 * @author Killian
 * @since 12/07/2016.
 */
public class CarActivityInfoFragment extends Fragment {

    @BindView(R.id.carModel)
    TextView model;

    @BindView(R.id.carColor)
    ImageView color;

    @BindView(R.id.carPrice)
    TextView price;

    @BindView(R.id.carDescription)
    TextView description;

    private int bundle_id;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_car_info, container, false);
        initBundleVariables(getActivity().getIntent().getExtras());
        ButterKnife.bind(this, view);

        SQLiteHelper db = new SQLiteHelper(getActivity().getApplicationContext());
        Car car = db.getCar(bundle_id);

        model.setText(car.getModel());
        color.setBackgroundColor(car.getColor());
        price.setText(car.getPrice());
        description.setText(car.getDescription());

        initAnimations();

        return view;
    }

    private void initAnimations() {
        model.setAnimation(AnimationUtils.slideUp(this.getContext(), 900, 0));
        color.setAnimation(AnimationUtils.slideUp(this.getContext(), 900, 0));
        price.setAnimation(AnimationUtils.slideUp(this.getContext(), 1150, 0));
        description.setAnimation(AnimationUtils.slideUp(this.getContext(), 1350, 0));
    }

    private void initBundleVariables(Bundle bundle) {
        if (bundle != null) {
            bundle_id = bundle.getInt(ActivityConstants.BUNDLE_CAR_ID);
        } else {
            bundle_id = -1;
        }
    }
}
