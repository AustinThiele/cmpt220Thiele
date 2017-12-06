
public class Problem1011Thiele {
	
	public static void main(String[] args) {

		Circle2D c1 = new Circle2D(3, 3, 6.1);

		System.out.println("Circle1 area: " + c1.getArea()); 
		System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
		System.out.println(
			"Does circle1 contain the point (3, 4)? " + c1.contains(3, 4)); 
		System.out.println(
			"Does circle1 contain the circle centered at (6, 6) and radius 12.2? " 
			+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap the circle centered at (3, 5) and radius 2.1? " 
			+ c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}

