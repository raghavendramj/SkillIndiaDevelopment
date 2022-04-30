package com.exceptoin.handling;

public class ThrowBlockDemo {


    public static void main(String[] args) {


        ThrowBlockDemo throwBlockDemo = new ThrowBlockDemo();
        try {
            if (throwBlockDemo.validate(1)) {
                System.out.println("TRY -> Person can vote and lets go ahead");
            }
        } catch (PeronVoteException e) {
            System.out.println("CATCH ->  This person can't vote and Message :- " + e.getMessage());
//            e.printStackTrace();
        } finally {
            System.out.println("FINALLY -> Done with validation");
        }
        System.out.println("MAIN -> Lets move on next set of things");
    }

    public boolean validate(int age) throws PeronVoteException {
        if (age < 18) {
            throw new PeronVoteException("Person is not eligble for Voting!");
        }
        return true;
    }
}
