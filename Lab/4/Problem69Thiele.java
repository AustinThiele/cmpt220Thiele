/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem69thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem69Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
   	System.out.println("Feet\tMeters\t|\tMeters\tFeet\n-------------------------------------");
	double j = 20.0;
	for (double i = 1.0; i <= 10; i++) {
	  System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f\n", i, footToMeter(i), j, meterToFoot(j));
	  j += 5;
	}
  }
  public static double footToMeter(double foot) {
    return (.305 * foot);	
  }
  
  public static double meterToFoot(double meter) {
	  return (3.279 * meter);
  }

}
   
    
