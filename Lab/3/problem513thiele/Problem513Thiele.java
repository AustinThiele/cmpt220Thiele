/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem513thiele;

/**
 *
 * @author austinthiele
 */
public class Problem513Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 0;
       
       while(Math.pow(n+1, 3) < 12000) {
           n++;
       }
       System.out.println("Largest integer n such that n^3 is less than 12,000 is" +n);
       }
    }
    

