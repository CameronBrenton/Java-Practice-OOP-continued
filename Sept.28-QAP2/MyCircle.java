package com.keyin;

public class MyCircle {
	private MyPoint center = new MyPoint();
	private int radius = 1;
	private Object MyPoint;

	public MyCircle(){
		center = new MyPoint(0,0);
		this.radius = 1;
	}

	public MyCircle(int x, int y, int radius){
		center = new MyPoint(x, y);
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius){
		this.center = center;
	}

	public int getRadius(){
		return radius;
	}

	public void setRadius(int radius){
		this.radius = radius;
	}

	public MyPoint getCenter(){
		return center;
	}

	public void setCenter(MyPoint center){
		this.center = center;
	}

	public int getCenterX(){
		return center.getX();
	}

	public void setCenterX(int x){
		this.center.setX(x);
	}

	public int getCenterY(){
		return center.getY();
	}

	public void setCenterY(int y){
		this.center.setY(y);
	}

	public void setCenterXY(int x, int y){
		this.center.setX(x);
		this.center.setY(y);
	}

	public String toString(){
		return "MyCircle[radius = " + radius + ", center = " + MyPoint + "]";
	}

	public int getArea(){
		return x * y;
	}

	public double getCircumference(){
		return 2*(3.14*radius);
	}

	public double distance(MyCircle myCircle){
		return center.distance(myCircle.center);
	}
}
