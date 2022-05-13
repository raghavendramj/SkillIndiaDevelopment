package com.java.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {


    public static void main(String[] args) {
        //TreeSet<String> namesSec = new TreeSet<>(Collections.reverseOrder());
        TreeSet<String> namesSec = new TreeSet<>();
        namesSec.add("Keshav");
        namesSec.add("Satya");
        namesSec.add("Reetanj");
        namesSec.add("Reetanj");
        namesSec.add("Reetanj");
        namesSec.add("Priayank");
        namesSec.add("Batula");
        namesSec.add("Keshav");
        namesSec.add("Manisha");
        namesSec.add("Satya");

        System.out.println("Ascending TreeSet is " + namesSec);
        System.out.println("Descending  TreeSet is " + namesSec.descendingSet());


        System.out.println("First Element "+  namesSec.first());
        System.out.println("Last Element "+  namesSec.last());


        System.out.println("Head Set Last element exclusive is " + namesSec.headSet("Priayank"));
        System.out.println("Head Set Last element inclusive is " + namesSec.headSet("Priayank", true));
        System.out.println("Tail set  TreeSet is " + namesSec.tailSet("Batula"));
        System.out.println("Sub set  TreeSet is " + namesSec.subSet("Keshav", true, "Reetanj", true));


    }
}
