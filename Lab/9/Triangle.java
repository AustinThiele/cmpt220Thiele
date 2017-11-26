/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmpt220;

import cmpt220.GeometricObject;

/**
 *
 * @author austinthiele
 */
public class Triangle extends GeometricObject{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() {
	
	}
	
	// JA: This was supposed to check for the triangle sides and throw an exception 
	// when they were not valid
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double areaSide = (side1+side2+side3)/2;
		return Math.sqrt(areaSide*(areaSide-side1)*(areaSide-side2)*(areaSide-side3));
	}
	
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	public String toString() {
		return"Triangle side1 = "+ side1 + "side2 = "+ side2 + " side3 = " +side3;
	}
	
}
