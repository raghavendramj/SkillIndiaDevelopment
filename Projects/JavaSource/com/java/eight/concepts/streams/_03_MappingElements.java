package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _03_MappingElements {


    public static void main(String[] args) {

        List<Dish> dishes = Arrays.asList(
                new Dish("Baby Back Ribs", 234),
                new Dish("Chimichanga", 145),
                new Dish("Fried Shrimp", 34),
                new Dish("Spring Roll", 354),
                new Dish("Dahi Kachori", 147),
                new Dish("Malai Kofta", 256)
        );

        Function<Dish, String> getDishName = dish -> dish.getFoodName();
        List<String> dishesNames = dishes.stream()
                .map(getDishName)
                .collect(Collectors.toList());
        System.out.println("dishesNames -> " + dishesNames);

        long overallCalories = dishes.stream().map(dish -> dish.getCaloires()).count(); //Terminal operations
        System.out.println("overallCalories -> "+ overallCalories);
    }
}
