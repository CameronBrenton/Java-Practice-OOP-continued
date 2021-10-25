/*
* This is the MoveableCircle class that implements the Moveable class
*/

public class MovableCircle implements Movable{
	// Instance variables
	private int radius; // radius of the MoveableCircle
	private MovablePoint center; // center of the MoveablePoint is a MoveablePoint object

	// Constructer
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
		// Call the MoveablePoint's constructor to allocate the center instance.
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	// Abstract methods
	@Override
	public void moveUp(){
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown(){
		center.y += center.ySpeed;
	}

	@Override
	public void moveLeft(){
		center.x -= center.xSpeed;
	}

	@Override
	public void moveRight(){
		center.x += center.xSpeed;
	}

	// Description itself
	public String toString(){
		return "MovableCircle[" +  "radius=" + radius + " " + center.toString();
	}
}
