package com.java.eight.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _08_ChaningConsumers {


    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Raghava", "Keshava", "Madhava");
//        1. Convert to Uppercase
//        2. Append 121 number to it.
//        3. Printing the name as it is.
        Consumer<String> convertToUpperCase = name -> System.out.println(name.toUpperCase());
        Consumer<String> append121 = name -> System.out.println(name.concat("121"));
        Consumer<String> printName = name -> System.out.println(name);
        Consumer<String> printSeperator = name -> System.out.println("\n---------------------------");

        stringList.forEach(printName.andThen(convertToUpperCase).andThen(append121).andThen(printSeperator));


    }
}
