

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
		System.out.println("**The new dimensions for circle1 after setting a new center: " + circle1.toString());	


		MyCircle circle2 = new MyCircle(11, 22, 25);
		System.out.println("**The dimensions for circle2: " + circle2.toString());

		MyCircle circle3 = new MyCircle(mypoint1, 7);
		System.out.println("**The dimensions for circle3 that has a MyPoint" +
		" in the constructor: " + circle3.toString());


	}
}
