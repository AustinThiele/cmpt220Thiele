/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6.pkg5thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem65Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.print("Enter 3 numbers to have them sorted least to greatest: ");
        double num1  = input.nextInt();
        double num2 = input.nextInt();
        double num3 = input.nextInt();
       
     
    }
    public static void displaySortedNumbers( double num1, double num2, double num3) {
       int greatestValue=0;
       int midValue=0;
       int leastValue=0;
       
        
        if (num1 > num2 && num1> num3) {
           num1 = greatestValue;
       }
        if (num3 > num2 && num2> num3) {
           num2 = greatestValue;
       }
        if (num3 > num2 && num3 > num1) {
           num3 = greatestValue;
       }
        if (num1> num2 && num1 < num3) {
            num1=midValue;
        }
        if (num2> num1 && num2 < num3) {
            num2=midValue;
 }
        if (num3> num2 && num3 < num1) {
            num3=midValue;
        }
        if (num1<num2 && num1<num3) {
            num1= leastValue;
        }
         if (num2<num1 && num2<num3) {
            num2= leastValue;
        }
          if (num3<num2 && num3<num1) {
            num1= leastValue;
        }
         
           int order = leastValue + midValue + greatestValue;
        
          
        
        }

    }
    




 /*/ double greatestValue=0;
        double midValue=0;
        double leastValue=0;
 if (num1>num2) {
     num1= greatestValue;
 }
 if (num1>num3) {
     num1= greatestValue;
 }
 if (num2>num1) {
     num2= greatestValue;
 }
 if (num2>num3) {
     num2= greatestValue;
 }
 if (num3>num1){
     num3 = greatestValue;
 }
 if (num3>num2) {
     num3 = greatestValue;
      System.out.print(greatestValue); /*/