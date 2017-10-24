/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem311thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem311Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the month # and the year: ");
        int month = input.nextInt();
        int year = input.nextInt();
        
        switch (month) {
            case 1: System.out.println("January " + year + " has 31 days");
            case 2:System.out.println("February " + year + "has 28 days");
            case 3:System.out.println("March " + year + "has 31 days");
            case 4:System.out.println("April " + year + "has 30 days");
            case 5:System.out.println("May " + year + "has 31 days");
            case 6:System.out.println("June " + year + "has 30 days");
            case 7:System.out.println("July " + year + "has 31 days");
            case 8:System.out.println("August " + year + "has 31 days");
            case 9:System.out.println("September " + year + "has 30 days");
           case 10:System.out.println("October " + year + "has 31 days");
           case 11:System.out.println("November " + year + "has 30 days");
           case 12:System.out.println("December " + year + "has 31 days");
        }
    }
    
}
