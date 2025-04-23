package com.example.freelancerproject.CustomerSupport;

import java.io.Serializable;

public class Feedback  implements Serializable {
    int feedbackid;
    String subject,description;

    public Feedback(int feedbackid, String subject, String description) {
        this.feedbackid = feedbackid;
        this.subject = subject;
        this.description = description;
    }

    public int getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(int feedbackid) {
        this.feedbackid = feedbackid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackid=" + feedbackid +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
