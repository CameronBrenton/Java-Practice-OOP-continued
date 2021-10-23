/*
* This is the Circle subclass of the Person class
*/


public class Circle extends Shape{
	protected double radius; // Radius of the circle

	// No-arg default class constructor
	public Circle(){
		radius = 1.0;
	}

	// Parameterized class constructor
	public Circle(double radius){
		this.radius = radius;
	}

	// Overloaded parameterized class constructor
	public Circle(double radius, String color, boolean filled){
		// Call the Shape superclass to access the color and filled variables.
		super(color, filled);
		this.radius = radius;
	}

	// Getters
	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return radius * radius * 3.14;
	}

	public double getPerimeter(){
		return 2 * 3.14 * radius;
	}

	// Setters
	public void setRadius(double radius){
		this.radius = radius;
	}

	// Description
	public String toString(){
		return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
	}
	
}
