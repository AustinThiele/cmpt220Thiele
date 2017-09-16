/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem27thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem27Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int hours = (minutes/60);
        int days = (hours/24);
        int years = (days/365);
        int daysLeft= (days % 365);
        System.out.print( minutes + " minutes is approximately " + years + " years and " + daysLeft + " days");
    }
    
}
