package com.example.freelancerproject.freelancerfinal;

public class M_advertisement {

    private int watched;
    private String event,publish,filter;


    public M_advertisement() {
    }

    public M_advertisement(int watched, String event, String publish, String filter) {
        this.watched = watched;
        this.event = event;
        this.publish = publish;
        this.filter = filter;
    }

    public M_advertisement(String text, String nevent, String value) {
    }

    public int getWatched() {
        return watched;
    }

    public void setWatched(int watched) {
        this.watched = watched;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "M_advertisement{" +
                "watched=" + watched +
                ", event='" + event + '\'' +
                ", publish='" + publish + '\'' +
                ", filter='" + filter + '\'' +
                '}';
    }
}
