/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem49thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem49Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
         //Prompt the user for an input
         System.out.print("Enter a character: ");
         
          String charEntered = input.nextLine();
         
        //Check to see if a character was entered
         if (charEntered.length()>1) {
             System.out.println("You must enter exactly one character!");
         }
         int charUnicode = charEntered.charAt(0);
         System.out.println( "The value of " + charEntered + " is " + (int)charUnicode );
    }
    
}
