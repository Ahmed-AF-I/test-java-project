package org.oop;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Test.txt", true)))) {
           pw.println("Hello World");
           pw.println(79);
           pw.print(true);
           //pw.flush(); ---- not needed because of try-with-resources
        }catch(IOException e) {
            e.printStackTrace();
        }


//        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
//        String line;
//        StringBuilder sb = new StringBuilder();
//        while ((line = br.readLine()) != null) {
//            sb.append(line).append(System.lineSeparator());
//            System.out.println(line);
//        }

    }
}