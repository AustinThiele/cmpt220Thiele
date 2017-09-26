/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6.pkg1thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem61Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer to receieve the Pentagonal Number of that integer: ");
        int numberEntered = input.nextInt();
        System.out.println("The Pentagonal Number of " + numberEntered + " is " + getPentagonalNumber(numberEntered));
        
        
    }
     public static int testGetPentagonalNumber() {
     Scanner input = new Scanner (System.in);
        System.out.print("Enter the number 1 to view all Pentagonal Numbers from 1 to 100: ");
        int n = input.nextInt();
        
        for (n = 1; n<=100; n++) {
         System.out.println(getPentagonalNumber(n));
     }
      
    }

    
    
  public static int getPentagonalNumber(int n) {
      
      return n*(3*n-1)/2;
      
      
          
      }
}
  
  
        

