/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication613;

/**
 *
 * @author austinthiele
 */
public class JavaApplication613 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.printf("i\tm(i)\n--------------\n");
    for (int i = 1; i <= 20; i++) {
    	  System.out.printf("%d\t%.4f\n", i, summation((double)i));
    }
  }
  public static double summation(double number) {
	double finalSum = 0;
	double tempSum = 0;
	for (int i = 1; i <= number; i++) {
	  tempSum = ((double)i/(i+1));
	  finalSum += tempSum;
	}
    return finalSum;
  }

}

      

        
    
   
            
       
    
    

