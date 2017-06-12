package com.example.eka.resafood.Data;

import java.util.Date;

/**
 * Created by eka on 2017. 6. 12..
 */

public class FoodListGroup {
    String title;
    int foodcount;
    Date modified_date;

    public FoodListGroup(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFoodcount() {
        return foodcount;
    }

    public void setFoodcount(int foodcount) {
        this.foodcount = foodcount;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }
}
