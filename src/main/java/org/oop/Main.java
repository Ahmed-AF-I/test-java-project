package org.oop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");

        String st = "This is a test for File handling in Java using FileWriter class.";
        FileWriter fr = new FileWriter(file);
        fr.write(st);
        fr.flush();
        fr.close();
    }
}