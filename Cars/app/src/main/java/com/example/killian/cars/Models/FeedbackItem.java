package com.example.killian.cars.Models;

/**
 * Created by Killian on 14/07/2016.
 */
public class FeedbackItem {

    private int id;
    private String username;
    private String avatarUrl;
    private String feedback;

    public FeedbackItem(final int id, final String username, final String avatarUrl, final String feedback){

        this.id = id;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.feedback = feedback;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getAvatarUrl(){
        return avatarUrl;
    }

    public String getFeedback(){
        return feedback;

}
}
