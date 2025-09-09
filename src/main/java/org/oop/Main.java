package org.oop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");

//        String st = "This is a test for File handling in Java using FileWriter class.";
//        FileWriter fw = new FileWriter(file);
//        fw.write(st);
//        fw.flush();
//        fw.close();

         FileReader fr = new FileReader(file);
         char[] a = new char[(int)file.length()];
         fr.read(a);

         for (char c : a){
            System.out.print(c);
         }
         fr.close();


    }
}