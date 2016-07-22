package com.example.killian.cars.listeners;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.killian.cars.R;

/**
 * The class (@code CarPagerImageListener) allows the pager indicator dots to be
 * drawn by determining what image is in view
 *
 * @author Ronan.
 * @since 20/07/2016.
 */
public class CarPagerImageListener implements ViewPager.OnPageChangeListener {

    private Context context;
    private LinearLayout linearLayout;
    private int dotsCount;

    public CarPagerImageListener(LinearLayout linearLayout, int dotsCount, Context context) {
        this.linearLayout = linearLayout;
        this.dotsCount = dotsCount;
        this.context = context;
        drawPageSelectionIndicators(0, linearLayout, dotsCount, context);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        drawPageSelectionIndicators(position, linearLayout, dotsCount, context);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

    public void drawPageSelectionIndicators(int position, LinearLayout linearLayout, int dotsCount, Context context) {
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        ImageView[] dots = new ImageView[dotsCount];
        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(context);
            if (i == position)
                dots[i].setImageDrawable(context.getResources().getDrawable(R.drawable.item_selected, context.getTheme()));
            else
                dots[i].setImageDrawable(context.getResources().getDrawable(R.drawable.item_unselected, context.getTheme()));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4, 0, 4, 0);
            assert linearLayout != null;
            linearLayout.addView(dots[i], params);
        }
    }
}
