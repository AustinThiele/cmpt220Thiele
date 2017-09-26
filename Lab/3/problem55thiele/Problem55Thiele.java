/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem55thiele;

/**
 *
 * @author austinthiele
 */
public class Problem55Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.printf("%s &7s %4s %7s %11s", "Kilograms", "Pounds", "l", "Pounds", "Kilograms");
       int pound = 20;
       for (int i=1; i<200; i+=2) {
           System.out.printf("%-10d %-9.1f %-2s %-8d %.1f\n", i, (i*2.2), "l", pound, (pound/1.609));
       }
    }
    
}
