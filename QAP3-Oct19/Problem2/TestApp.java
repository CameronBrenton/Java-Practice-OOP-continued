/*
* This is the TestApp file to test our classes and methods
*/

public class TestApp {

	public static void main(String[] args){
		// Instantiate the objects
		Shape S = new Shape("Red", true);
		Circle C = new Circle(5.0);
		Circle C1 = new Circle(5.0,"blue",true);
		Rectangle R = new Rectangle(2.0,3.0);
		Rectangle R1 = new Rectangle(2.0,3.0,"green",false);
		Square Sq = new Square(4.0);
		Square Sq1 = new Square(4.0,"yellow",true);

		// Print the objects
		System.out.println();
		System.out.println(S.toString());
		System.out.println(C.toString());
		System.out.println(C1.toString());
		System.out.println(R.toString());
		System.out.println(R1.toString());
		System.out.println(Sq.toString());
		System.out.println(Sq1.toString());
		System.out.println();
		
		// Print the objects area and perimeter
		System.out.println("Circle C[ Area: " + C.getArea() + " Perimeter: " + C.getPerimeter() + " ]");
		System.out.println("Circle C1[ Area: " + C1.getArea() + " Perimeter: " + C1.getPerimeter()+ " ]");
		System.out.println("Rectangle R[ Area: " + R.getArea() + " Perimeter: " + R.getPerimeter()+ " ]");
		System.out.println("Rectangle R1[ Area: " + R1.getArea() + " Perimeter: " + R1.getPerimeter()+ " ]");
		System.out.println("Square Sq [ Area: " + Sq.getArea() + " Perimeter: " + Sq.getPerimeter()+ " ]");
		System.out.println("Square Sq1 [ Area: " + Sq1.getArea() + " Perimeter: " + Sq1.getPerimeter()+ " ]");
	}


}
