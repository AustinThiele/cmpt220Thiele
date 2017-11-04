/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem3.pkg5thiele;

import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem35Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
         //Prompt the user for an input
         System.out.print("Enter today's day as an integer, Sunday being 0: ");
         int dayOfTheWeek = input.nextInt();
        
         //Prompt the user for another input
         System.out.print("Enter the number of days elapsed since today: ");
         
         int numberOfDays = input.nextInt();
         String today = null;
         String future = null;
         
         switch(dayOfTheWeek){
             case 0: today = "Sunday"; break; // JA
             case 1: today = "Monday"; break; // JA
             case 2: today = "Tuesday"; break; // JA
             case 3: today = "Wednesday"; break; // JA
             case 4: today = "Thursday"; break; // JA
             case 5: today = "Friday"; break; // JA
             case 6: today = "Saturday"; break; // JA
		 } // JA    
             int futureDay = (dayOfTheWeek + numberOfDays)  % 7;
             
             if (futureDay==0)
                 future = "Sunday";
             else if (futureDay==1)
                 future = "Monday";
             else if (futureDay==2)
                 future = "Tuesday";
             else if (futureDay==3)
                 future = "Wednesday";
             else if (futureDay==4)
                 future = "Thursday";
             else if (futureDay==5)
                 future = "Friday";
             else if (futureDay==6)
                 future = "Saturday";
       
                
         System.out.print("Today is " + today + " and the future day is " + future);
     
        
            
    }  
    }
         