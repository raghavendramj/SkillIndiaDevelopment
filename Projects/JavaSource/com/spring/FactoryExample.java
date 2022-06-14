package com.learning.spring;

import java.util.Arrays;
import java.util.List;

public class FactoryExample {

    public static void main(String[] args) {

        GreetingFactory factory = new GreetingFactory();

        try {
            GreetingService greetingService = factory.getGreetingService("French");
            greetingService.greet("Raghav");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

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

    static class GreetingFactory {

        List<String> languages = Arrays.asList("English", "French");

        GreetingService getGreetingService(String factoryLanguage) throws RuntimeException {
            if (!languages.contains(factoryLanguage)) {
                throw new RuntimeException("FROM EXCEPTION :: INVALID Language!");
            }

            if (factoryLanguage == "english") {
                return new EnglishGreetingService();
            } else if (factoryLanguage == "French") {
                return new FrenchGreetingService();
            } else {
                return null;
            }

        }
    }


}
