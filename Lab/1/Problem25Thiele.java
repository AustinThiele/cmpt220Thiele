/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2.pkg5thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem25Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        
        System.out.print("Enter the gratuity: ");
        double gratuity = input.nextDouble();
        double gratuityRate = (gratuity / 100) ;
        
        double realGratuity= (gratuityRate * subtotal);
        double realTotal= (subtotal + realGratuity);
        
        System.out.println(" The gratuity is $" + realGratuity + " and the total is $" + realTotal);
        
        
     
                
    }
    
}
