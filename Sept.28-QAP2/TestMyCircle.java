// This is the TestMyCircle file

public class TestMyCircle {
	public static void main(String[] args){

		System.out.println("Hello!");

		// Create new MyPoint object
		MyPoint mypoint1 = new MyPoint(2,4);
		// Print the x and y coordinates of the MyPoint object
		System.out.println("**The mypoint1 x coordinate is " + mypoint1.getX() + 
		" and the y coordinate is " + mypoint1.getY());

		// Create new MyCircle object
		MyCircle circle1 = new MyCircle();
		// Print the values for the radius and the center of the circle1 object
		System.out.println("**The dimensions for circle1: " + circle1.toString());
		// set a new radius for the object
		circle1.setRadius(100);
		// Print the values for the radius and the center of the circle1 object
		System.out.println("**The new dimensions for circle1 after setting the radius: " + circle1.toString());
		// set a new MyPoint object center for circle1
		circle1.setCenter(new MyPoint(19, 19));
		// Print the center values for circle1
		System.out.println("**The new center for circle1 after setting a new center: " + circle1.getCenter());
		// Print the radius and center values for circle1 using toString()
		System.out.println("**The new dimensions for circle1 after setting a new center: " + circle1.toString());
		// set a new center x value for circle1
		circle1.setCenterX(3);
		// set a new center y value for circle1
		circle1.setCenterY(3);
		// Print the radius and center values for circle1
		System.out.println("**The new dimensions for circle1 after setting the x & y: " + circle1.toString());
		// Set a new Center x and y value
		circle1.setCenterXY(4, 44);
		// Print the radius and center values for circle1
		System.out.println("**The new dimensions for circle1 after setting the x & y using setCenterXY(): " + circle1.toString());	

		// Create new MyCircle object
		MyCircle circle2 = new MyCircle(11, 22, 25);
		// Print the radius and center values for circle1
		System.out.println("**The dimensions for circle2: " + circle2.toString());

		// Create new MyCircle object using the overloaded/copy constructor
		MyCircle circle3 = new MyCircle(mypoint1, 7);
		// Print the values for the radius and center for circle3
		System.out.println("**The dimensions for circle3 that has a MyPoint" +
		" in the constructor: " + circle3.toString());
		// Print the area for circle 3
		System.out.println("The area of circle3 is: " + circle3.getArea());

		// Create new MyCircle object
		MyCircle circle4 = new MyCircle(50,75, 99);
		// Print the values of the radius and center for circle4 object.
		System.out.println("**The dimensions for circle2: " + circle4.toString());
		// Print the values for the circumference for circle4 object.
		System.out.println("**The circumference for circle1 is: " + circle1.getCircumference());

		// Print the values for the distance between two different MyCircle instances.
		System.out.println("**The distance from this MyCircle instance to circle4 MyCircle instance is: " + circle4.distance(circle4));
		System.out.println("**The distance from this MyCircle instance to circle3 MyCircle instance is: " + circle4.distance(circle3));
		System.out.println("**The distance from this MyCircle instance to circle2 MyCircle instance is: " + circle4.distance(circle2));
		System.out.println("**The distance from this MyCircle instance to circle1 MyCircle instance is: " + circle4.distance(circle1));


		

		
	
	}
}
