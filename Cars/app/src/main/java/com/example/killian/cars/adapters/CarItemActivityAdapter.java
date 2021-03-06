package com.example.killian.cars.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.activities.CarActivity;
import com.example.killian.cars.constants.ActivityConstants;
import com.example.killian.cars.models.CarItem;
import com.example.killian.cars.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * The class (@code CarItemActivityAdapter) binds data from the database to the car item list
 *
 * @author Killian.
 * @since 06/07/2016.
 */

public class CarItemActivityAdapter extends RecyclerView.Adapter<CarItemActivityAdapter.MyViewHolder> {

    private List<CarItem> carItemList;

    private int lastAnimatedPosition;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.car_item_title)
        TextView carTitleTextView;

        @BindView(R.id.car_item_image)
        ImageView carImageView;

        public MyViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), CarActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt(ActivityConstants.BUNDLE_CAR_ID, itemView.getId());
                    bundle.putString(ActivityConstants.BUNDLE_CAR_URL, itemView.getTag(R.id.image_url_tag).toString());
                    intent.putExtras(bundle);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

    public CarItemActivityAdapter(List<CarItem> carItemList) {
        this.carItemList = carItemList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.car_row_item, parent, false);
        return new MyViewHolder(itemView);

    }
    private void animate(View view, final int pos) {
        if(lastAnimatedPosition < pos) {
            view.animate().cancel();
            view.setTranslationY(100);
            view.setAlpha(0);
            view.animate().alpha(1.0f).translationY(0).setDuration(300).setStartDelay(pos * 100);
        }
        else {
            view.animate().cancel();
            view.setTranslationY(-100);
            view.setAlpha(0);
            view.animate().alpha(1.0f).translationY(0).setDuration(300).setStartDelay(pos * 100);
        }
        lastAnimatedPosition=pos;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CarItem carItem = carItemList.get(position);
        holder.carTitleTextView.setText(carItem.getModel());
        holder.itemView.setId(carItem.getId());
        holder.itemView.setTag(R.id.image_url_tag, carItem.getUrl());
        Picasso.with(holder.itemView.getContext()).load(carItem.getUrl()).fit().into(holder.carImageView);
        animate(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return carItemList.size();
    }
}
