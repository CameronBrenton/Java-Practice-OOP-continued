

public class TestMyCircle {
	public static void main(String[] args){
		System.out.println("Hello!");
		MyPoint mypoint1 = new MyPoint(2,4);
		System.out.println("**The mypoint1 x coordinate is " + mypoint1.getX() + 
		" and the y coordinate is " + mypoint1.getY());

		MyCircle circle1 = new MyCircle();
		System.out.println("**The dimensions for circle1: " + circle1.toString());
		circle1.setRadius(100);
		System.out.println("**The new dimensions for circle1 after setting the radius: " + circle1.toString());
		circle1.setCenter(new MyPoint(19, 19));
		System.out.println("**The new center for circle1 after setting a new center: " + circle1.getCenter());
		System.out.println("**The new dimensions for circle1 after setting a new center: " + circle1.toString());
		circle1.setCenterX(3);
		circle1.setCenterY(3);
		System.out.println("**The new dimensions for circle1 after setting the x & y: " + circle1.toString());
		circle1.setCenterXY(4, 44);
		System.out.println("**The new dimensions for circle1 after setting the x & y using setCenterXY(): " + circle1.toString());


	


		MyCircle circle2 = new MyCircle(11, 22, 25);
		System.out.println("**The dimensions for circle2: " + circle2.toString());

		MyCircle circle3 = new MyCircle(mypoint1, 7);
		System.out.println("**The dimensions for circle3 that has a MyPoint" +
		" in the constructor: " + circle3.toString());
		System.out.println("The area of circle3 is: " + circle3.getArea());

		MyCircle circle4 = new MyCircle(50,75, 99);
		System.out.println("**The dimensions for circle2: " + circle4.toString());
		System.out.println("**The circumference for circle1 is: " + circle1.getCircumference());

		System.out.println("**The distance from this MyCircle instance to circle4 MyCircle instance is: " + circle4.distance(circle4));
		System.out.println("**The distance from this MyCircle instance to circle3 MyCircle instance is: " + circle4.distance(circle3));
		System.out.println("**The distance from this MyCircle instance to circle2 MyCircle instance is: " + circle4.distance(circle2));
		System.out.println("**The distance from this MyCircle instance to circle1 MyCircle instance is: " + circle4.distance(circle1));


		

		
	
	}
}
