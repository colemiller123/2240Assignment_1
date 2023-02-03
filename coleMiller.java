public class main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(1, 1.5, 1);
	    triangle.setColor("yellow");
	    triangle.setFilled(true);

	    System.out.println(triangle);
	    System.out.println("The area is " + triangle.getArea());
	    System.out.println("The perimeter is " + triangle.getPerimeter());
	    System.out.println(triangle);
	}
}
abstract class GeometricObject {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;

	  /** Construct a default geometric object */
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }

	  /** Construct a geometric object with color and filled value */
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }

	  /** Return color */
	  public String getColor() {
	    return color;
	  }

	  /** Set a new color */
	  public void setColor(String color) {
	    this.color = color;
	  }

	  /** Return filled. Since filled is boolean,
	   *  the get method is named isFilled */
	  public boolean isFilled() {
	    return filled;
	  }

	  /** Set a new filled */
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }

	  /** Get dateCreated */
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  @Override
	  public String toString() {
	    return "created on " + dateCreated + "\ncolor: " + color +
	  " and filled: " + filled;
	  }

	  /** Abstract method getArea */
	  public abstract double getArea();

	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();
	}
class Triangle extends GeometricObject {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	//Constructor
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Get
	public double getSideOne() {
		return side1;
	}
	public double getSideTwo() {
		return side2;
	}
	public double getSideThree() {
		return side3;
	}
	
	//Set
	public void setSideOne(double side1) {
		this.side1 = side1;
	}
	public void setSideTwo(double side2) {
		this.side2 = side2;
	}
	public void setSideThree(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		//Using Heron's formula, s = semi-perimeter
		final double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
		
		return area;
	}
  
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}

