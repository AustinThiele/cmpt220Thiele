/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem81thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem81Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a 3x4 matrix: ");

//create 3x4 matrix
double[][] matrix = new double[3][4];
for(int row=0; row<matrix.length; row++)
for(int column = 0; column<matrix[row].length; column++)
matrix[row][column] = input.nextDouble();


for(int i=0; i<matrix[0].length; i++)
System.out.println("Sum of the elements at column " +i+ " is " +sumColumn(matrix,i));



}
public static double sumColumn(double[][] m, int columnIndex) {
double total = 0;
for(int row = 0; row<m.length; row++) {
total +=m[row][columnIndex];
}
return total;
}
}