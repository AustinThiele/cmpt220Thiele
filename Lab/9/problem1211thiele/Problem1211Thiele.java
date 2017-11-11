/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1211thiele;

import java.io.*;
import java.util.*;
public class Problem1211Thiele {
    
     public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("invalid argument");
            System.out.println("java Exercise12_11 John filename");
            System.exit(1);
        }

        
        File filename = new File(args[1]);
        if (!filename.exists()) {
            System.out.println(args[1] + " does not exist!");
            System.out.println(2);
        }

       String r = "";
        
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                r += input.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        r = r.replaceAll(args[0], "");
       
        try {
            PrintWriter output = new PrintWriter(filename);
            System.out.println(r);
            output.write(r);
            output.close();
        } 
        
        catch (FileNotFoundException e) {
            e.getMessage();
        }

        System.out.println("Complete");
    }
}

