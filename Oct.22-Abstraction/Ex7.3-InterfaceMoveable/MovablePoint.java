/*
* This is the MoveablePoint class that implements the Moveable class.
*/

public class MovablePoint implements Movable{
	// Instance variables
	int x, y, xSpeed, ySpeed; // package access

	// Constructor
	public MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// Abstract methods
	@Override
	public void moveUp(){
		y -= ySpeed;
	}

	@Override
	public void moveDown(){
		y += ySpeed;
	}

	@Override
	public void moveLeft(){
		x -= xSpeed;
	}

	@Override
	public void moveRight(){
		x += xSpeed;
	}


	// Describe itself
	public String toString(){
		return "MoveablePoint[ x=" + x + " y=" + y + " xSpeed=" + xSpeed + " ySpeed=" + ySpeed + "]";
	}
}
