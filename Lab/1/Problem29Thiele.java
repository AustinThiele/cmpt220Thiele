/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem29thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem29Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        System.out.print("Enter v0: ");
        double v0= input.nextDouble();
        
     
        System.out.print("Enter v1: ");
        double v1= input.nextDouble();
        
        System.out.print("Enter t: " );
        double t= input.nextDouble();
        
        double acceleration = (v1 - v0) / t;
        
        System.out.print(" The average accelaration is " + acceleration);
        
        
    }
    
}
