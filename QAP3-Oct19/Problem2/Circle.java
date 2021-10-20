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

	
}
