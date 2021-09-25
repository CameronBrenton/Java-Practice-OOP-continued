public class Widget{
	private String color;
	private double alignment;
	static int count;

	public Widget(){
		color = "";
		alignment = 0;
		count++;
	}

	public Widget(String color, double alignment){
		this.color = color;
		this.alignment = alignment;
		count++;
	}

	public void draw(){
		System.out.println("***The widget is being drawn to the screen with the color of =" + color + " and the alignment of =" + alignment);
	}

	public static int getCount(){
		return count;
	}

	public String getColor(){
		return color;
	}

	public void set_color(String color){
		this.color = color;
	}
}