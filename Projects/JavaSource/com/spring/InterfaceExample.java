package com.learning.spring;


public class InterfaceExample {

     interface GreetingService {
        void greet(String name);
    }

    static class EnglishGreetingService implements GreetingService {
        @Override
        public void greet(String name) {
            System.out.println("Hello " + name);
        }
    }

    static class FrenchGreetingService implements GreetingService {
        @Override
        public void greet(String name) {
            System.out.println("Bonjour " + name);
        }
    }


    public static void main(String[] args) {
        GreetingService greetingService = new FrenchGreetingService();
        greetingService.greet("Raghavendra M J");
    }
}
