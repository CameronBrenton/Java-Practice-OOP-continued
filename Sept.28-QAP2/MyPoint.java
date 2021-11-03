// This is the MyPoint class

public class MyPoint {
	//class variables
	private int x = 0;
	private int y = 0;
	
	// Default no-arg constructor
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}

	// Parameterized constructor
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	// return the instance's x value
	public int getX(){
		return x;
	}

	// set the instance's x value
	public void setX(int x){
		this.x = x;
	}

	// return the instance's y value
	public int getY(){
		return y;
	}

	// set the instance's y value
	public void setY(int y){
		this.y = y;
	}

	//get the instance's x and y values
	public int[] getXY(){
		int[] xy = {x, y};
		return xy;
	}


	// set the instance's x and y value
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}

	// Print the instance's x and y values
	public String toString(){
		return "(x = " + x + ", y = " + y + ")";
	}

	// Return the distance between this object's x and y to another x and y point
	public double distance(int x, int y){
		int differenceOfX = this.x - x;
		int differenceOfY = this.y - y;
		return Math.sqrt(differenceOfX*differenceOfX + differenceOfY*differenceOfY);
	
	}

	// Return the difference between this object's x and y to another MyPoint object's x and y
	public double distance(MyPoint myPoint){
		int differenceOfX = this.x - myPoint.x;
		int differenceOfY = this.y - myPoint.y;
		return Math.sqrt(differenceOfX*differenceOfX + differenceOfY*differenceOfY);
	}

	// Return the difference from the current x and y to the x and y values (0,0)
	public double distance(){
		int differenceOfX = this.x - 0;
		int differenceOfY = this.y - 0;
		return Math.sqrt(differenceOfX*differenceOfX + differenceOfY*differenceOfY);
	}


}
