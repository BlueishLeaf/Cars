package com.example.killian.cars.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.Activities.CarActivity;
import com.example.killian.cars.Constants.DBConstants;
import com.example.killian.cars.Models.CarItem;
import com.example.killian.cars.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * The class (@code MyAdapter) binds data from the database to the car item list
 *
 * @author Killian.
 * @since 06/07/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<CarItem> carItemList;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
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
                    intent.putExtras(bundle);
                    itemView.getContext().startActivity(intent);

                }
            });

        }

    }

    public MyAdapter(List<CarItem> carItemList, Context context) {
        this.carItemList = carItemList;
        this.context = context;

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
        Picasso.with(context).load(carItem.getUrl()).fit().into(holder.carImageView);

    }

    @Override
    public int getItemCount() {
        return carItemList.size();

    }

}