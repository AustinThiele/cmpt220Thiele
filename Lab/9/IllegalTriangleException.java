/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmpt220;

/**
 *
 * @author austinthiele
 */
public class IllegalTriangleException extends Exception {

    private double side1;
	private double side2;
	private double side3;
        
        public IllegalTriangleException(double side1, double side2, double side3) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** Return side1 */
	public double getSide1() {
		return side1;
	}

	/** Return side2 */
	public double getSide2() {
		return side2;
	}

	/** Return side3 */
	public double getSide3() {
		return side3;
	}
        
        
}

        
        
