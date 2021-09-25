public class TestTime {
	public static void main(String args[]){
		Time time1 = new Time(21, 11, 7);
		System.out.println("Time 1 before time set: " + time1.toString());
		time1.setTime(21, 10, 15);
		System.out.println("Time 1 after time set: " + time1.toString());
		time1.nextSecond();
		time1.previousSecond();
		System.out.println("Time 1 after nextSecond method call: " + time1.toString());

		
		Time time2 = new Time(12, 5, 1);
		System.out.println("Time 2 before time set: " + time2.toString());
		time2.setTime(10, 20, 25);
		System.out.println("Time 2 after time set: " + time2.toString());
		time2.previousSecond();
		System.out.println("Time 2 after previousSecond method call: " + time2.toString());

		Time time3 = new Time(0, 0, 0);
		for (int i = 0; i < 60; i++){
			time3.nextSecond();
			System.out.println("Time 3: " + time3.toString());
		}
	}
}
