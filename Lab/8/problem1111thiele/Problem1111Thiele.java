/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1111thiele;

/**
 *
 * @author austinthiele
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Problem1111Thiele {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
ArrayList<Integer> list = new ArrayList<Integer>();
System.out.println("Enter five integers:");
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();
int num4 = input.nextInt();
int num5 = input.nextInt();
		
list.add(num1);
list.add(num2);
list.add(num3);
list.add(num4);
list.add(num5);
		
		sort(list);
		System.out.print(list);
		
	}
	
	public static void sort(ArrayList<Integer>list) {
		Collections.sort(list);
		
	}
}
