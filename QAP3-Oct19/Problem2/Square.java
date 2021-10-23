/*
* This is the Square subclass of the Rectangle class
*/


public class Square extends Rectangle{
	// No Instance variables

	// Default no-argument constructor
	public Square(){
		// Inherit the Rectangle class's default constructor
		super();
	}

	public Square(double side){
		// Call the Rectangle class's parameterized constructor
		super(side, side);
	}

	public Square(double side, String color, boolean filled){
		// Call the Rectangle class's overloaded constructor
		super(side, side, color, filled);
	}

	// Getters
	public double getSide(){
		return super.getLength();

	}

	// Setters
	public void setSide(double side){
		super.setLength(side);
	}

	@Override
	public void setWidth(double side){
		super.setWidth(side);
	}

	@Override
	public void setLength(double side){
		super.setLength(side);
	}

	@Override
	public String toString(){
		return "A Square with side= " + getSide() + ", which is a subclass of " + super.toString();
	}

}