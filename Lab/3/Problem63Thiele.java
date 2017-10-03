/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem63thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem63Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a series of integers: ");
        int numbers = input.nextInt();
        
        System.out.println(numbers+(isPalindrome(numbers)?" is ":" is not ")+ " a palindrome");
        
    }
   public static boolean isPalindrome ( int numbers) {
       return numbers ==reverse(numbers);
   } 
   private static int reverse(int numbers) {
       String reverse = "";
       String n = numbers + "";
       for(int i = n.length()-1; i>=0; i--) {
           reverse += n.charAt(i);
       }
       return Integer.parseInt(reverse);
   }
}
