package com.exceptoin.handling.checked;

import java.io.FileReader;

public class FNFException {

    public static void main(String[] args) {
        try {
            //Checked / Compile Time Exception
            FileReader fileReader = new FileReader("myFile.txt");
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}
