package com.java.eight.concepts.streams;

public class Dish {

    private String foodName;
    private int caloires;

    public Dish(String foodName, int caloires) {
        this.foodName = foodName;
        this.caloires = caloires;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getCaloires() {
        return caloires;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "foodName='" + foodName + '\'' +
                ", caloires=" + caloires +
                '}';
    }
}
