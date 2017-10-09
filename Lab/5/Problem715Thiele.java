/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem715thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem715Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter 10 numbers:  ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.print("The distinct numbers are: ");
		numbers = eliminateDuplicates(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	// JA: This logic doesn't work
	public static int[] eliminateDuplicates(int[] list) {
		boolean isDuplicate;
		int[] duplicates = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			isDuplicate = false;
			for (int j = i++; j < list.length; j++) {
				if (list[i] != list[j]) {
					continue;
				}
				else {
					isDuplicate = true;
				}
				if (!isDuplicate) {
					duplicates[i] = list[i];
				}
			}
		}
		return duplicates;
	}
}
