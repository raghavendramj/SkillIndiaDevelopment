package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(2);
        firstList.add(5);
        firstList.add(8);

        firstList.add(2, 56);
        // [2, 5, 56, 6]
        firstList.add(1, 67);
        // [2, 67, 5, 56, 6]

        System.out.println("After add : " + firstList);

        firstList.remove(new Integer(56));
        //[2, 67, 5,  6]
        firstList.remove(3);
        //[2, 67, 5]

        System.out.println("After removal : " + firstList);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.addAll(firstList);
        //List1 ->  [2, 67, 5], List2 -> [] => addAll => List2 -> [2, 67, 5]


        System.out.println("List 1 -> " + firstList); //[2, 67, 5]
        System.out.println("List 2 -> " + secondList);//[2, 67, 5]

        Collections.addAll(firstList, 23, 45, 89);
        //L1 -> [2, 67, 5, 23, 45, 89]

        System.out.println("List 1 -> " + firstList);

        firstList.removeAll(secondList);

        //L1 -> [2, 67, 5, 23, 45, 89]  -  L2 -> [2, 67, 5] => [23, 45, 89]

        System.out.println("After removeAll ->  List 1 : " + firstList); //23, 45, 89
        System.out.println("After removeAll ->  List 2 : " + secondList); //[2, 67, 5]

        firstList.clear(); //Remove all the elements L1 -> []
        Collections.addAll(firstList, 2, 5, 23, 45, 89, 12, 15, 6, 8);
        //L1 -> [2, 5, 23, 45, 89, 12, 15, 6, 8]

        System.out.println("***************************************************");
        System.out.println("Before retainAll ->  List 1 : " + firstList);
        System.out.println("Before retainAll ->  List 2 : " + secondList);

        firstList.retainAll(secondList);
        //[2, 5, 23, 45, 89]  retainAll  [2, 67, 5] => [2, 5]
        System.out.println("***************************************************");
        System.out.println("After retainAll ->  List 1 : " + firstList);
        System.out.println("After retainAll ->  List 2 : " + secondList);


        boolean contains67 = firstList.contains(67);
        System.out.println("Does firstList contains 67 ? " + contains67);  //false
        System.out.println("Does firstList contains 2 ? " + firstList.contains(2)); //true

        System.out.println("***************************************************");

        // L1-> [2, 5], L2-> [2, 67, 5]
        boolean containsAll = firstList.containsAll(secondList);
        System.out.println("Does firstList.containsAll(secondList) ? " + containsAll); //false

        firstList.add(67);
        // L1-> [2, 67, 5], L2-> [2, 67, 5]
        System.out.println("Does firstList.containsAll(secondList) ? " + firstList.containsAll(secondList)); //true
        System.out.println("***************************************************");

        Iterator<Integer> iterator = firstList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("Each Element is  " + next);
        }
    }
}
