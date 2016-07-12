package com.example.killian.cars.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.killian.cars.R;

import java.util.List;

/**
 * Created by Killian on 12/07/2016.
 */
public class CarActivityPagerAdapter extends PagerAdapter {
    private List<String> carIds;
    private LayoutInflater layoutInflater;

    public CarActivityPagerAdapter(Context context, List<String> carIds) {
        this.carIds = carIds;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return carIds.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View item_view = layoutInflater.inflate(R.layout.car_pager_item, container, false);
        ImageView imageView = ButterKnife.findById(item_view, R.id.carPagerImage);
        imageView.setImageResource(Integer.parseInt(carIds.get(position)));
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
