package com.assignment;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
           /* FileWriter writer1 = new FileWriter("file1.txt");
            FileWriter writer2 = new FileWriter("file2.txt");
            writer1.write("Abhi 71\n" +
                    "Bhavani 68\n" +
                    "Mahesh 89\n" +
                    "Vikas 92\n" +
                    "Shloka 84\n" +
                    "Shyam 81\n" +
                    "Suresh 56\n" +
                    "Nalini 62\n" +
                    "\n");
            System.out.println("done");
            writer2.write("Abhi 71\n" +
                    "Bhavani 68\n" +
                    "Mahesh 89\n" +
                    "Nalini 62\n" +
                    "Shloka 84\n" +
                    "Kaya 84\n" +
                    "Siya 56\n" +
                    "Vikas 92");
            System.out.println("done"); */
            BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            boolean areEqual = true;
            int lineNum = 1;
            while (line1 != null || line2 != null) {
                if (line1 == null || line2 == null) {
                    areEqual = false;
                    break;
                }
                else if (! line1.equalsIgnoreCase(line2)) {
                    areEqual = false;
                    break;
                }
                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum ++;
            }
            if (areEqual) {
                System.out.println("Two files have same content.");
            }
            else {
                System.out.println("Two files have different content.");
                System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
            }
            reader1.close();
            reader2.close();

           /* writer1.close();
            writer2.close(); */

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
