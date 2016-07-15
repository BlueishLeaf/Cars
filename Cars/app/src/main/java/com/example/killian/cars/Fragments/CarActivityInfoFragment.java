package com.example.killian.cars.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.constants.DBConstants;
import com.example.killian.cars.models.Car;
import com.example.killian.cars.R;
import com.example.killian.cars.utils.AnimationUtils;
import com.example.killian.cars.db.SQLiteHelper;

/**
 * This class (@code CarActivityInfoFragment) governs the framework for the information about
 * a specific car to be displayed on its info tab
 *
 * @author Killian
 * @since 12/07/2016.
 */
public class CarActivityInfoFragment extends Fragment {

    private TextView model;
    private ImageView color;
    private TextView price;
    private TextView description;
    private int bundle_id;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_car_info, container, false);
        initBundleVariables(getActivity().getIntent().getExtras());

        model = (TextView) view.findViewById(R.id.carModel);
        color = (ImageView) view.findViewById(R.id.carColor);
        price = (TextView) view.findViewById(R.id.carPrice);
        description = (TextView) view.findViewById(R.id.carDescription);

        SQLiteHelper db = new SQLiteHelper(getActivity().getApplicationContext());
        Car car = db.getCar(bundle_id);

        model.setText(car.getModel());
        color.setBackgroundColor(0xFF000000);
        price.setText(car.getPrice());
        description.setText(car.getDescription());

        initAnimations();

        return view;
    }

    private void initAnimations() {
        model.setAnimation(AnimationUtils.get_slide_up(this.getContext(), 900, 0));
        color.setAnimation(AnimationUtils.get_slide_up(this.getContext(), 900, 0));
        price.setAnimation(AnimationUtils.get_slide_up(this.getContext(), 1150, 0));
        description.setAnimation(AnimationUtils.get_slide_up(this.getContext(), 1350, 0));
    }

    private void initBundleVariables(Bundle bundle) {
        if (bundle != null) {
            bundle_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
        } else {
            bundle_id = -1;
        }
    }
}
