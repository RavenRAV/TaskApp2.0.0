package com.example.raven42taskapp2;

import java.io.Serializable;

public class Task implements Serializable {
    private String title;
    private String description;



    public Task() {
    }


    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }


    public String getDesk() {
        return description;
    }

    public void setDesk(String desk) {
        this.description = desk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
