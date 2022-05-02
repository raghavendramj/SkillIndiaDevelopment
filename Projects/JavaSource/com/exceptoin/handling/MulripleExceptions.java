package com.exceptoin.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MulripleExceptions {

    public static void main(String[] args) {
        try {
            // Integer.parseInt("null"); -> NumberFormatException
            Integer.parseInt("12");
            //  FileReader fileReader = new FileReader("dummy"); -> FileNotFoundException
            FileReader fileReader = new FileReader("C:\\Users\\Raghavendra M J\\OneDrive\\Desktop\\Online_Classes\\Skill_Development_India\\Projects\\JavaSource\\com\\exceptoin\\handling\\myFile.txt");

            // Object test = "null";test.equals("raghav") -> NullPointerException
            Object test = "keshav";
            test.equals("raghav");

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("First finally");
        }
     }
}
