/*
* This is the MovableRectangle class which implements the Movable Interface
*/

public class MovableRectangle implements Movable {
	// Instance variables
	// 2 MovablePoints to represent the top-left and bottom-right corners
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	// Parameterized Constructor using our Movable points
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
		//Construct the MovablePoint topLeft and MovablePoint bottomLeft objects
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	// Abstract methods
	@Override
	public void moveUp(){
		topLeft.y -= topLeft.ySpeed;
		bottomRight.y -= bottomRight.ySpeed;
	}

	@Override
	public void moveDown(){
		topLeft.y += topLeft.ySpeed;
		bottomRight.y += bottomRight.ySpeed;
	}

	@Override
	public void moveLeft(){
		topLeft.x -= topLeft.xSpeed;
		bottomRight.x -= bottomRight.xSpeed;
	}

	@Override
	public void moveRight(){
		topLeft.x += topLeft.xSpeed;
		bottomRight.x += bottomRight.xSpeed;
	}

	// Describe itself
	public String toString(){
		return "MovableRectangle[ topLeft=" + topLeft.toString() + " " + "bottomLeft=" + bottomRight.toString();
	}
}
