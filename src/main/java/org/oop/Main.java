package org.oop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");

//        BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(file, true));
//        bw.newLine();
//        bw.write("BufferedWriter Example");
//        bw.newLine();
//        bw.write("This is a test file.");
//        bw.newLine();
//        bw.write("This file is created using BufferedWriter.");
//        bw.flush();
//        bw.close();

        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line).append(System.lineSeparator());
            System.out.println(line);
        }

    }
}