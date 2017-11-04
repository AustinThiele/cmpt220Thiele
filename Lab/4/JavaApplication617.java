/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication617;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class JavaApplication617 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n:  ");
    int n = input.nextInt();
    printMatrix(n);
  }
  public static void printMatrix(int n) {
	for (int i = 0; i < n; i++) {  
      for (int j = 0; j < n; j++) {
    	    System.out.printf("%d", ((int)(Math.random() * 2)));
    	    if (j != (n-1)) {
    	    	  System.out.print(" ");
    	    }
      }
      if (i != (n-1)) {
        System.out.print("\n");
      }
    }
  }
}


       
        
        

