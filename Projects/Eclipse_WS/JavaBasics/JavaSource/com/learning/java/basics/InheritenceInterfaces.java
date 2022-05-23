package com.java.basics;


interface Product{
    //By Default all the variables are public final static
    int maxCount = 100;

    void useOfProduct();
    int productCost();
}

interface VehicleSpareParts extends Product{
    String getSparePartName(int number);
    int getValidity(String prodName);
}


public class InheritenceInterfaces implements  VehicleSpareParts{
    @Override
    public void useOfProduct() {
        System.out.println("Wiper - to wipe the windows");

        int conut = VehicleSpareParts.maxCount;
    }

    @Override
    public int productCost() {
        return 350;
    }

    @Override
    public String getSparePartName(int number) {
        return "Front glass wipers";
    }

    @Override
    public int getValidity(String prodName) {
        return 1;
    }
}
