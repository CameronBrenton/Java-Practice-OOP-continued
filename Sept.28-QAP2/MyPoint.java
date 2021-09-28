package com.keyin;

public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public void setX(int x){
		this.x = x;
	}

	public int getY(){
		return y;
	}

	public void setY(int y){
		this.y = y;
	}

	public int[] getXY(){
		int[] xy = {x, y};
		return xy;
	}


	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "(x = " + x + ", y = " + y + ")";
	}

	public double distance(int x, int y){
		int differenceOfX = this.x - x;
		int differenceOfY = this.y - y;
		return Math.sqrt(differenceOfX*differenceOfX + differenceOfY*differenceOfY);
	
	}

	public double distance(MyPoint myPoint){
		int differenceOfX = this.x - myPoint.x;
		int differenceOfY = this.y - myPoint.y;
		return Math.sqrt(differenceOfX*differenceOfX + differenceOfY*differenceOfY);
	}

	public double distance(){
		int differenceOfX = this.x - 0;
		int differenceOfY = this.y - 0;
		return Math.sqrt(differenceOfX*differenceOfX + differenceOfY*differenceOfY);
	}


}
