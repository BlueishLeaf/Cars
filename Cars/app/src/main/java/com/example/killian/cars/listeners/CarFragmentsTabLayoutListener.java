package com.example.killian.cars.listeners;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

/**
 * This class (@code CarFragmentsTabLayoutListener) listens for a touch command from user
 *
 * @author Killian.
 * @since 12/07/2016.
 */
public class CarFragmentsTabLayoutListener implements TabLayout.OnTabSelectedListener {
    private ViewPager viewPager;

    public CarFragmentsTabLayoutListener(ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }
}