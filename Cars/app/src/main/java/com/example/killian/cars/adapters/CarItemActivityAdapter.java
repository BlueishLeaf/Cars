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
import com.example.killian.cars.constants.DBConstants;
import com.example.killian.cars.models.CarItem;
import com.example.killian.cars.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * The class (@code CarItemActivityAdapter) binds data from the database to the car item list
 *
 * @author Killian.
 * @since 06/07/2016.
 */

public class CarItemActivityAdapter extends RecyclerView.Adapter<CarItemActivityAdapter.MyViewHolder> {

    private List<CarItem> carItemList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView carTitleTextView;
        public ImageView carImageView;

        public MyViewHolder(final View itemView) {
            super(itemView);
            carTitleTextView = (TextView) itemView.findViewById(R.id.car_item_title);
            carImageView = (ImageView) itemView.findViewById(R.id.car_item_image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), CarActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt(DBConstants.BUNDLE_CAR_ID, itemView.getId());
                    bundle.putString("car_url", itemView.getTag(R.id.image_url_tag).toString());
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
                .inflate(R.layout.caritemrow, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CarItem carItem = carItemList.get(position);
        holder.carTitleTextView.setText(carItem.getModel());
        holder.itemView.setId(carItem.getId());
        holder.itemView.setTag(R.id.image_url_tag, carItem.getUrl());
        Picasso.with(holder.itemView.getContext()).load(carItem.getUrl()).fit().into(holder.carImageView);
    }

    @Override
    public int getItemCount() {
        return carItemList.size();
    }
}
