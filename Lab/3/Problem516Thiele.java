/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem516thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem516Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter an integer: ");
        int integer = input.nextInt();
        int order = 2;
        
        while(integer/order !=1) { // JA: This should be >=
            if(integer%order==0) {
                System.out.print(order + ", ");
                integer /= order;
                
            }
            else
                order++;
        }
        System.out.println(order + " . ");
            }
        }
    
    

