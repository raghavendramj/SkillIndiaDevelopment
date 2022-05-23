package com.java.collections;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> names = new TreeMap<>();

        names.put(10, "Amit");
        names.put(5, "Kushal");
        names.put(3, "Shiv");
        names.put(12, "Pavan");
        names.put(15, "Savon");
        names.put(6, "Madhu");
        names.put(16, "Shashi");
        names.put(7, "Nikhil");

        System.out.println("Treemap contents : " + names);
        System.out.println("descendingMap "+ names.descendingMap());

        System.out.println("Head map "+ names.headMap(6, true));
        System.out.println("Tail map "+ names.tailMap(6));
        System.out.println("Sub Map "+ names.subMap(7, true, 15, true));
    }
}
