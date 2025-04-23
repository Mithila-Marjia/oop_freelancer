package com.example.freelancerproject.freelancerfinal;

public class Project {

    private int id ;
    private String title,level,type;

    public Project() {
    }

    public Project(int id, String title, String level, String type) {
        this.id = id;
        this.title = title;
        this.level = level;
        this.type = type;
    }

    public Project(String text, String text1, String value, String value1) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
