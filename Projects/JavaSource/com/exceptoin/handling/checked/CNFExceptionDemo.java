package com.exceptoin.handling.checked;

public class CNFExceptionDemo {

    public static void main(String[] args) {
       try{
           Class.forName(" CNFExceptionDemo");
           System.out.println("No Exception thrown!");
       }catch (ClassNotFoundException e){
           System.out.println("Exceptio caught : "+ e.getMessage());
       }
    }
}


