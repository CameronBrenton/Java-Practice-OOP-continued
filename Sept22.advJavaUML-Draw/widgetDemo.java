public class widgetDemo {
		public static void main(String args[]){
			
			Widget widget1 = new Widget();
			System.out.println("Number of widget instances: " + Widget.getCount());

			Widget widget2 = new Widget();
			Widget widget3 = new Widget();
			Widget widget4 = new Widget();
			Widget widget5 = new Widget("blue", 7.7);
			
			widget5.set_color("green");
			System.out.println("Number of widget instances: " + Widget.getCount());

			widget5.draw();
		}
}
