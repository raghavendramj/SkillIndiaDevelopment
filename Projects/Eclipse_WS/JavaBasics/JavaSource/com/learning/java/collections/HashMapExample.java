package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> propsMap = new HashMap<>();

//        [name -> "Raghav"] -> One Entry
//	    [id ->25] -> Second entry
//        city -> "Bangalore"
        propsMap.put("name", "John Doe");
        propsMap.put("id", "25");
        propsMap.put("city", "Bangalore");
        propsMap.put("email", "john@gmail.com");

        System.out.println("Only Keys "+propsMap.keySet());
        System.out.println("Only Values "+propsMap.values());

        Set<Map.Entry<String, String>> entries = propsMap.entrySet();
        System.out.println("Entry Set -> "+ entries);

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        System.out.println("**************************************************");
        while(iterator.hasNext()){
            Map.Entry<String, String> currentEntry = iterator.next();
            System.out.println("Current Entry is "+ currentEntry);
            System.out.println("Current Key is "+ currentEntry.getKey());
            System.out.println("Current Value is "+ currentEntry.getValue());
            System.out.println("------------------------");
        }
        System.out.println("**************************************************");

        System.out.println("propsMap.containsKey('city') :- "+propsMap.containsKey("city"));

        System.out.println(propsMap);
        System.out.println(" propsMap.get('id') VALUE -> "+  propsMap.get("id"));

        propsMap.remove("city");
        System.out.println("After removal propsMap -> "+  propsMap);

        propsMap.remove("email", "john@gmail.com");
        System.out.println("After removal(k=v) propsMap -> "+  propsMap);

    }
}
