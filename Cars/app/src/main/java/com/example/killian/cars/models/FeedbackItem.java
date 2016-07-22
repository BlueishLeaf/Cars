package com.example.killian.cars.models;


/**
 * The class (@code FeedbackItem) models a comment displayed on the feedback
 * section of a selected car
 *
 * @author Killian.
 * @since 14/07/2016.
 */
public class FeedbackItem {

    private int id;
    private String username;
    private String avatarUrl;
    private String feedback;
    private String date;

    public FeedbackItem(final int id, final String username, final String avatarUrl, final String feedback, final String date) {
        this.id = id;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.feedback = feedback;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getDate() {
        return date;
    }
}
