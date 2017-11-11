/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1213thiele;

/**
 *
 * @author austinthiele
 */

import java.io.*;
import java.util.*;


public class Problem1213Thiele {

	public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error, invalid arguments");
            System.exit(1);
        }
        File file1 = new File(args[0]);
        if (!file1.exists()) {
            System.out.println(file1 + " does not exist.");
            System.exit(1);
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            Scanner input = new Scanner(file1);
            while (input.hasNext()) {
                String a = input.nextLine();
                lines++;
                characters += a.length();
                String[] split = a.split(" ");
                for (String word : split) {
                    words++;
                }
            }

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

        System.out.printf("Characters ", characters);
        System.out.printf("Words ", words);
        System.out.printf("Lines ", lines);


    }
}
