package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _04_FilteringElements {


    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(
                new Dish("Baby Back Ribs", 234),
                new Dish("Chimichanga", 145),
                new Dish("Fried Shrimp", 34),
                new Dish("Spring Roll", 354),
                new Dish("Dahi Kachori", 147),
                new Dish("Malai Kofta", 256)
        );


        Predicate<Dish> isGreaterThan200 = dish -> dish.getCaloires() > 200;
        List<String> filteredDishes = dishes.stream()
                .filter(isGreaterThan200) //Intermediate operation
                .map(dish -> dish.getFoodName()) //Intermediate operation
                .collect(Collectors.toList()); //Terminal operation

        System.out.println("filteredDishes -> " + filteredDishes);

    }
}
