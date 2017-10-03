/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem51thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem51Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int negative = 0;
        int positive = 0;
        int count = 0;
        double total = 0;
        
        System.out.println("enter an integer, the input ends if it is 0: ");
        int userNumbers = input.nextInt();
        if(userNumbers == 0)
            System.out.println("No numbers are entered except 0");
        
        else {
            while (userNumbers !=0) {
                if (userNumbers < 0)
                    negative++;
                else 
                    positive++;
                total += userNumbers;
                count++;
                userNumbers = input.nextInt();
            }
        }
        
        double average = total/count;
        
        System.out.println("There are " + positive + " positive numbers.");
        System.out.println("There are " + negative + " negative numbers.");
        System.out.println("The thtoal of all the numbers is " +total);
        System.out.println("The average of all the inputs is " + average);
    }
    
}
