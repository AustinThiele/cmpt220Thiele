/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmpt220;

import java.util.Scanner;
import Cmpt220.Triangle;

/**
 *
 * @author austinthiele
 */
public class Problem125Thiele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		
		System.out.print("Is the triangle filled (true or false)? ");
		boolean filled = input.nextBoolean();
                
                
                System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
                        
                        try {
				// Create triangle object with user input
				Triangle triangle = new Triangle(side1, side2, side3);
					
				triangle.setColor(color);
				triangle.setFilled(filled);
		
				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
				System.out.println("Color: " + triangle.getColor());
				System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
					+ "filled");
                                throw new IllegalTriangleException(Triangle.getSide1,Triangle.getSide2,Triangle.getSide3);
			}
			catch (IllegalTriangleException ex) {
				System.out.println(ex.getMessage());
			}
	

    
}
}
