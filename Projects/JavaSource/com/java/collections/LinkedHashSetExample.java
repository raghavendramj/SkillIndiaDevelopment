package com.java.collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet();
        names.add("Keshav");
        names.add("Satya");
        names.add("Reetanj");
        names.add("Reetanj");
        names.add("Reetanj");
        names.add("Priayank");
        names.add("Batula");
        names.add("Keshav");
        names.add("Manisha");
        names.add("Satya");

        System.out.println("LinkedHashSet is " + names);



    }
}
