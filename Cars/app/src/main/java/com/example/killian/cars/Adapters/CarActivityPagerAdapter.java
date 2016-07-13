package com.example.killian.cars.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.killian.cars.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * The class (@code CarActivityPagerAdapter) binds the URLs from the database
 * to the viewPager element in the Car page
 *
 * @author Killian.
 * @since 12/07/2016.
 */
public class CarActivityPagerAdapter extends PagerAdapter {

    //Defining the list of URLs
    private List<String> carImageUrls;
    private LayoutInflater layoutInflater;
    private Drawable currentImageView;


    public CarActivityPagerAdapter(Context context, List<String> carIds) {
        this.carImageUrls = carIds;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return carImageUrls.size();

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View item_view = layoutInflater.inflate(R.layout.car_pager_item, container, false);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.carPagerImage);
        Picasso.with(imageView.getContext()).load(carImageUrls.get(position)).fit().into(imageView);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    public Drawable getCurrentImageView() {
        return currentImageView;
    }
}
