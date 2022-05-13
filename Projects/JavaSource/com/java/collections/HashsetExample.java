package com.java.collections;

import java.util.HashSet;

public class HashsetExample {

    public static void main(String[] args) {
        HashSet<Character> hashSet = new HashSet<>();


        hashSet.add('C');
        hashSet.add('B');
        hashSet.add('E');
        hashSet.add('Z');
        hashSet.add('A');
        hashSet.add('F');
        hashSet.add('A');
        hashSet.add('D');
        hashSet.add('E');

        System.out.println("********************************");
        System.out.println("Hashset contents are ... " + hashSet);
        System.out.println("Hashset size ... " + hashSet.size());

        hashSet.remove('E');
        hashSet.remove('A');
        System.out.println("********************************");
        System.out.println("Hashset contents are ... " + hashSet);


    }
}
