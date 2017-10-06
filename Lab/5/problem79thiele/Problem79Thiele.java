/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem79thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem79Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double[] numbers = new double[10];
  Scanner input = new Scanner(System.in);

  System.out.print("Enter 10 numbers: ");
  for (int i = 0; i < numbers.length; i++) {
	  numbers[i] = input.nextDouble();
  }
     System.out.println("The minimum number is: " + min(numbers));
    }

  public static double min(double[] array) {

    double min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (min > array[i]) min = array[i];
        }
    return min;
    }
}
