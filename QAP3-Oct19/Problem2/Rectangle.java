/*
* This is the Rectangle subclass of the Person class
*/

public class Rectangle extends Shape{
	//Instance variables
	private double width;
	private double length;

	// Default constructor
	public Rectangle(){
		this.width = 1.0;
		this.length = 1.0;
	}

	// Parameterized Constructor
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	// Overloaded constructor
	public Rectangle(double width, double length, String color, boolean filled){
		// Call the superclass constructor
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	// Getters
	public double getWidth(){
		return this.width;
	}

	public double getLength(){
		return this.length;
	}

	public double getArea(){
		return length * width;
	}

	public double getPerimeter(){
		return length * width * 2;
	}

	// Setters
	public void setWidth(double width){
		this.width = width;
	}

	public void setLength(double length){
		this.length = length;
	}

	// Description
	@Override
	public String toString(){
		return "A Rectangle with width= " + getWidth() + " and length= " + getLength() + ", which is a subclass of " + super.toString();
	}


}
