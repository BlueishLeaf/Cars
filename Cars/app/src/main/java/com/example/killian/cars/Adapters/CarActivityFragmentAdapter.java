package com.example.killian.cars.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.killian.cars.Fragments.CarActivityFeedbackFragment;
import com.example.killian.cars.Fragments.CarActivityInfoFragment;

/**
 * Created by Killian on 12/07/2016.
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