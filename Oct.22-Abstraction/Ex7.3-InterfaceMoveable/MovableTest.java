/*
* This is the MovableTest test program class
*/

public class MovableTest {
	public static void main(String args[]){

		// Test the MovablePoint
		Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		m1.moveDown();
		System.out.println(m1);
		System.out.println();
		
		// Test the MovableCircle
		Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		m2.moveLeft();
		System.out.println(m2);
		System.out.println();

		// Test the MovableRectangle
		MovableRectangle m3 = new MovableRectangle(10, 10, 35, 35, 40, 40);
		System.out.println(m3);
		m3.moveUp();
		System.out.println(m3);
		m3.moveLeft();
		System.out.println(m3);


	}	
}
