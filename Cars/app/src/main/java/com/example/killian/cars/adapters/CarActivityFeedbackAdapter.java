package com.example.killian.cars.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.killian.cars.models.FeedbackItem;
import com.example.killian.cars.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * The class (@code CarActivityFeedbackAdapter) binds data from the database to the feedback section
 *
 * @author Killian.
 * @since 14/07/2016.
 */
public class CarActivityFeedbackAdapter extends RecyclerView.Adapter<CarActivityFeedbackAdapter.MyViewHolder> {

    private List<FeedbackItem> feedbackItems;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView username;
        public ImageView avatarImage;
        public TextView feedback;

        public MyViewHolder(final View itemView) {
            super(itemView);
            username = (TextView) itemView.findViewById(R.id.user_name);
            avatarImage = (ImageView) itemView.findViewById(R.id.user_avatar);
            feedback = (TextView) itemView.findViewById(R.id.user_feedback);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.car_feedback_item, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FeedbackItem feedbackItem = feedbackItems.get(position);
        holder.username.setText(feedbackItem.getUsername());
        holder.feedback.setText(feedbackItem.getFeedback());
        holder.itemView.setId(feedbackItem.getId());
        Picasso.with(holder.itemView.getContext()).load(feedbackItem.getAvatarUrl()).fit().into(holder.avatarImage);
    }

    @Override
    public int getItemCount() {
        return feedbackItems.size();
    }

    public CarActivityFeedbackAdapter(List<FeedbackItem> feedbackItems) {
        this.feedbackItems = feedbackItems;
    }

    public void setFeedbackItems(final List<FeedbackItem> feedbackItems) {
        this.feedbackItems = feedbackItems;
    }
}
