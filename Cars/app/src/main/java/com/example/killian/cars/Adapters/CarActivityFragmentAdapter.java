package com.example.killian.cars.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.killian.cars.fragments.CarActivityFeedbackFragment;
import com.example.killian.cars.fragments.CarActivityInfoFragment;

/**
 * The class (@code CarActivityFragmentAdapter) binds the car's data from
 * the database to the fragment
 *
 * @author Killian.
 * @since 12/07/2016.
 */

public class CarActivityFragmentAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;

    public CarActivityFragmentAdapter(FragmentManager fragmentManager, int numOfTabs) {
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CarActivityInfoFragment();
            case 1:
                return new CarActivityFeedbackFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

}