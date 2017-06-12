package com.example.eka.resafood.Data;

import java.util.Date;

/**
 * Created by eka on 2017. 6. 12..
 */

public class FoodListChild {
    String img;
    String title;
    Date added_date;

    public FoodListChild(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getAdded_date() {
        return added_date;
    }

    public void setAdded_date(Date added_date) {
        this.added_date = added_date;
    }
}
