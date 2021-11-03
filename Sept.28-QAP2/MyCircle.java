// This is the MyCircle class

public class MyCircle {
	// Class variables
	private MyPoint center = new MyPoint();
	private int radius = 1;

	// MyCircle Default no-argument constructor
	public MyCircle(){
		center = new MyPoint(0,0);
		this.radius = 1;
	}

	// MyCircle Parameterized constructor
	public MyCircle(int x, int y, int radius){
		center = new MyPoint(x, y);
		this.radius = radius;
	}

	// Overloaded/copy constructor using a MyPoint object as center
	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}

	// return the radius 
	public int getRadius(){
		return radius;
	}
	

	// return the center in the form of a MyPoint object
	public MyPoint getCenter(){
		return center;
	}

	// return the center object's x value
	public int getCenterX(){
		return center.getX();
	}

	// return the center object's y value	
	public int getCenterY(){
		return center.getY();
	}

	// return the area
	public double getArea(){
		return 3.14*(radius * 2);
	}

	// return the circumference
	public double getCircumference(){
		return 2*(3.14*radius);
	}

	// return the distance between two MyCircle center instances
	public double distance(MyCircle myCircle){
		return center.distance(myCircle.center);
	}

	// set a new radius
	public void setRadius(int radius){
		this.radius = radius;
	}

	// set a new MyPoint object center 
	public void setCenter(MyPoint center){
		this.center = center;
	}

	// set the center object's x value
	public void setCenterX(int x){
		this.center.setX(x);
	}

	// set the center object's 7 value
	public void setCenterY(int y){
		this.center.setY(y);
	}

	// set the center object's x and y value
	public void setCenterXY(int x, int y){
		this.center.setX(x);
		this.center.setY(y);
	}

	// Print the MyCircle's radius and center values
	public String toString(){
		return "MyCircle[radius = " + radius + ", center = " + center + "]";
	}
}
