/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem413;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem413 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     
        Scanner input= new Scanner (System.in);
         //Prompt the user for an input
         System.out.print("Enter a letter: ");
         
      
          String PossibleCharacter = input.nextLine();
          
		 if (PossibleNumber == 0-9) { // JA: This is not right. You need to check the range >= '0' && <= '9'
			
			System.out.print(PossibleNumber + "is an invalid input");
		}
		 else if (PossibleCharacter.equals("A")) {
			
			System.out.print("A is a vowel");
		}
		 else if (PossibleCharacter.equals("E")) {
			
			System.out.print(" E is a vowel");
		}
		 else if (PossibleCharacter.equals("I")) {
			
			System.out.print(PossibleCharacter+ "I is a vowel");
		}
		 else if (PossibleCharacter.equals("O")) {
			
			System.out.print(PossibleCharacter+ "O is a vowel");
		}
		 else if (PossibleCharacter.equals("U")) {
			
			System.out.print("U is a vowel");
		}
			
		 else {
			
			System.out.print(PossibleCharacter + " is a consonant");
		}
          
    }
         
 }
    

