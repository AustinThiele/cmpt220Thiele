
public class Problem1311Thiele {
	
	
	public static void main(String[] args) {
		
		Octagon octagonArray = new Octagon(5);

		
		System.out.println("Octagon: Area: " + octagonArray.getArea() + 
			"Perimeter: " + octagonArray.getPerimeter());

try {
		Octagon octagon2 = (Octagon)octagonArray.clone();
}

catch (Exception e) {
	 System.out.println("Exception occurred");
		}
		
//Not sure why Octagon2 cannot be resolved to a variable when exception is taken care of above?
		int result = (octagonArray.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is > its clone.");
		else if (result == -1)
			System.out.println("Octagon is < its clone."); 
		else
			System.out.println("Octagon is = its clone.");
	}
}
