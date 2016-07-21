package com.example.killian.cars.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Killian on 21/07/2016.
 */
public class FeedbackItemRecyclerView extends RecyclerView {

    public FeedbackItemRecyclerView(Context context) {
        this(context, null);
    }

    public FeedbackItemRecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FeedbackItemRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        for (int i = 0; i < getChildCount(); i++) {
            animate(getChildAt(i), i);

            if (i == getChildCount() - 1) {
                getHandler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, i * 100);
            }
        }
    }

    private void animate(View view, final int pos) {
        view.animate().cancel();
        view.setAlpha(0);
        view.animate().alpha(1.0f).setDuration(300).setStartDelay(pos * 50);
    }
}
