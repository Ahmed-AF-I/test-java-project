package org.oop;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("Test.txt", true);

        BufferedWriter bw = new BufferedWriter(file);

        PrintWriter pw = new PrintWriter(bw,true);

        pw.println(97);
        pw.println("AAAA");
        pw.println('B');

//        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
//        String line;
//        StringBuilder sb = new StringBuilder();
//        while ((line = br.readLine()) != null) {
//            sb.append(line).append(System.lineSeparator());
//            System.out.println(line);
//        }

    }
}