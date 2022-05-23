package com.java.basics;

import java.net.URISyntaxException;

public class ObjectClassDem {
    public static void main(String[] args) throws URISyntaxException {
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println("object -> " + object1.getClass());
        System.out.println("object -> " + object1.hashCode());
        System.out.println("object -> " + object1.equals(object2));
        System.out.println("object -> " + object1.toString());

    }
}

