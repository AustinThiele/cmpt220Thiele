/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem719thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem719Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   	Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the list:  ");
		int size = input.nextInt();
		System.out.println("Enter the contents of the list:  ");
		int[] list1 = new int[size];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		System.out.printf("The list has %d integers:  ", size);
		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
		}
		System.out.println();
		if (isSorted(list1)) {
			System.out.println("The list is sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
		
	}
	
	public static boolean isSorted(int[] list) {
		boolean isSorted = true;
		for (int i = 0; i < list.length; i++) {
			if (i != list.length - 1) {
				if (list[i] <= list[i + 1]) {
					continue;
				}
				else {
					isSorted = false;
					//break;
				}
			}
			else {
				if (list[i] < list[i - 1]) {
					isSorted = false;
				}
			}
			
		}
		return isSorted;
	}
}
