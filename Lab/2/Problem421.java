/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem421;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem421 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
         //Prompt the user for an input
         System.out.print("Enter a SSN: ");
         
         String ssn = input.nextLine();
         
         if (ssn.length() == 9) {
             System.out.println( ssn + "is a valid social security number");
         }
             
             else {
                    System.out.println(ssn + " Is not a valid social security number");
                     }
             
             
             
          
             
           
    }
    
}

