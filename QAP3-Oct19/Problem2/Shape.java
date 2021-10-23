/*
* This is the Shape superclass
*/


public class Shape {
	protected String color; // colour of the shape
	protected boolean filled; // Is the shape filled? "Y" or "N"

	// Default class constructor
	public Shape(){
		color = "red";
		filled = true;
	}

	// Parameterized class constructor
	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	// Getters
	public String getColor(){
		return this.color;
	}

	// Setters
	public void setColor(String color){
		this.color = color;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	// True/False
	public boolean isFilled(){
		return filled;
	}

	// Description
	public String toString(){
		return "A Shape with color of " + color + " and filled/Not filled: " + filled;
	}
}
