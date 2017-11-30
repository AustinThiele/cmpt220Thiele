package cmpt220;

public class Problem137Thiele {

	public static void main(String[] args) {
		
		GeometricObject[] squaresArray = {new Square(4.5), 
			new Square(14), 
		    new Square(8.2), 
			new Square(12), 
			new Square(10)};
		
		
		for (int i = 0; i < squaresArray.length; i++) {
		 	System.out.println("Square " + (i + 1));
		 	System.out.println("Area: " + squaresArray[i].getArea());
		 	System.out.println("How to color: " + ((Square)squaresArray[i]).howToColor());
		 } 
}
