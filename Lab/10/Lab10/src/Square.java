

	public class Square extends GeometricObject implements Colorable {
		private double side;
		
		Square() {
		}
		
		Square(double side) {
	     
	        this.side = side;
	    }
		
		@Override
		public double getArea() {
			return Math.pow(side, 2);
		}
		
		 @Override
		    public double getPerimeter() {
		        return side * 4;
		 }
		 
		 @Override
		    public String howToColor() {
		        return "Color all four sides.";
		    }
		 
		 public double getSide() {
		        return side;
		    }

		    public void setSide(double side) {
		        this.side = side;
		    }
		
		
}
