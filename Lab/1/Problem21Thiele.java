/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem2.pkg1thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem21Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a degree for Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheit = (1.8) * celsius + 32;
        System.out.println( celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
    
}
