package com.java.basics;


interface RBI {
    //Inside interface, by DEFAULT,
    // all the variables are public final
    // all the methods are public abstract
    void deposit(int amount);

    int balance();

    int withDraw(int amount);
}

class ICICI implements RBI {

    private int accBalance = 0;

    @Override
    public void deposit(int amount) {
        accBalance += amount;
    }

    @Override
    public int balance() {
        return accBalance;
    }

    @Override
    public int withDraw(int amount) {
        if (amount > accBalance) {
            System.out.println("Insufficent Balance!");
            return -1;
        }
        accBalance = accBalance - amount;
        return amount;
    }
}

class HDFC implements RBI {

    private int accBalance;

    @Override
    public void deposit(int amount) {

        if (amount > 5000) {
            System.out.println("You have crossed the limit of deposit, please try again");
        }

        accBalance += amount;
    }

    @Override
    public int balance() {
        return accBalance;
    }

    @Override
    public int withDraw(int amount) {
        if (amount > 5000) {
            System.out.println("Your limit has breached!");
        }

        if (amount > accBalance) {
            System.out.println("Insufficient Funds!");
        }

        accBalance -= amount;
        return amount;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        icici.deposit(10000);
        System.out.println("Balance : "+ icici.balance());
        icici.withDraw(2000);
        System.out.println("Balance : "+ icici.balance());
    }
}
