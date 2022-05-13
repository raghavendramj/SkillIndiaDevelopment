package com.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String city;


    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    //Id Sorting
//    public int compareTo(Employee employee) {
//
//        if (this.id == employee.id)
//            return 0;
//        if (this.id > employee.id)
//            return -1;
//        else
//            return 1;
//    }

    //Name Sorting
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CityComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() == o2.getId())
            return 0;
        if (o1.getId() > o2.getId())
            return 1;
        else
            return -1;
    }
}


public class ComparableExample {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Manisha", "Delhi");
        Employee e2 = new Employee(2, "Aparna", "Mumbai");
        Employee e3 = new Employee(3, "Reddy", "Lucknow");
        Employee e4 = new Employee(5, "Batula Raju", "Ahemadabad");
        Employee e5 = new Employee(4, "Behera", "Jharkhand");

        List<Employee> employeeList = Arrays.asList(e3, e4, e2, e1, e5);

        Collections.sort(employeeList, new IdComparator());
        Collections.sort(employeeList, new CityComparator());
        System.out.println(employeeList);


    }
}
