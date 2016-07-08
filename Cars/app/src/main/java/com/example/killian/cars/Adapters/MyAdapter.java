package com.example.killian.cars.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.Models.CarItem;
import com.example.killian.cars.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Killian on 06/07/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<CarItem> carItemList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView carTitleTextView;
        public ImageView carImageView;

        public MyViewHolder(View view) {
            super(view);
            carTitleTextView = (TextView) view.findViewById(R.id.car_item_title);
            carImageView = (ImageView) view.findViewById(R.id.car_item_image);
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
        Picasso.with(context).load(carItem.getUrl()).into(holder.carImageView);
        //holder.carImageView.setImage(movie.getGenre());
    }

    @Override
    public int getItemCount() {
        return carItemList.size();
    }
}