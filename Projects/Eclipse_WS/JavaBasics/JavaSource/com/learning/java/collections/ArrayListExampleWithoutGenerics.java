package com.java.collections;

import java.util.ArrayList;

public class ArrayListExampleWithoutGenerics {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add(2);
        arrayList.add(true);
        arrayList.add('4');
        arrayList.add(new Object());


        arrayList.add(1, "Raghav");


        int number = (int) arrayList.get(1);
        System.out.println("number -> "+ number);

        System.out.println("Arraylist : "+ arrayList);

    }
}
