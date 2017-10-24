/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem317thiele;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author austinthiele
 */
public class Problem317Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Scissor (0), Rock(1), Paper (2): ");
        int userMove = input.nextInt();
        
        Random rand = new Random();
        int randNumber = rand.nextInt(3);        
        
        if(randNumber == 0){
            switch (userMove) {
                case 0:
                    System.out.println("The commputer chose Scissors. Its a tie!");
                    break;
                case 1:
                    System.out.println("The computer chose Scissors. Rock beats Scissors!");
                    break;
                case 2:
                    System.out.println("The computer chose Scissors. Scissors beats Paper!");
                    break;
                default:
                    break;
            }
        }
        if(randNumber == 1){
            switch (userMove) {
                case 0:
                    System.out.println("The commputer chose Rock. Rock beats scissors");
                    break;
                case 1:
                    System.out.println("The computer chose Rock. Its a tie!");
                    break;
                case 2:
                    System.out.println("The computer chose Rock. Paper beats Rock!");
                    break;
                default:
                    break;
            }
    }
        if(randNumber == 2){
            switch (userMove) {
                case 0:
                    System.out.println("The commputer chose Paper. Scissors beats paper!");
                    break;
                case 1:
                    System.out.println("The computer chose Paper. Paper beats rock!");
                    break;
                case 2:
                    System.out.println("The computer chose Paper. Its a tie!");
                    break;
                default:
                    break;
            }
        }
    }
}

