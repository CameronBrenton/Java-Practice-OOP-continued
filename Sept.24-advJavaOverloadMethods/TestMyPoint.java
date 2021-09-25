public class TestMyPoint {
	public static void main(String[] args){
		MyPoint point1 = new MyPoint();
		System.out.println(point1);
		point1.setX(10);
		point1.setY(20);
		System.out.println("x is now: " + point1.getX());
		System.out.println("y is now: " + point1.getY());
		point1.setXY(3, 0);
		System.out.println("The x and y coordinates in array form are = " + point1.getXY());
		System.out.println("The x coordinate[0] in the point1 array is = " + point1.getXY()[0]);
		System.out.println("The y coordinate[1] in the point1 array is = " + point1.getXY()[1]);
		System.out.println(point1);

		MyPoint point2 = new MyPoint(0, 9);
		System.out.println(point2);
		System.out.println(point1.distance(point2));
		System.out.println(point2.distance(point1));
		System.out.println(point1.distance(3, 8));
		System.out.println(point2.distance());

		MyPoint point3 = new MyPoint(1, 1);
		System.out.println(point3);
		point3.setXY(2, 2);
		System.out.println("The new X coordinate is = " + point3.getX() + " and the new Y coordinate is = " + point3.getY());
	}
	

}
