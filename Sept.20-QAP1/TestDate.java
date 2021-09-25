public class TestDate {
	public static void main(String args[]){
		Date date1 = new Date(20, 9, 2021);
		System.out.println("Date 1: " + date1.toString());

		Date date2 = new Date(21, 9, 2021);
		System.out.println("Date 2: " + date2.toString());

		date2.setDate(21, 9, 2021);
		System.out.println("Date 2 after updating the date: " + date2.toString());

		Date date3 = new Date(23, 9, 2021);
		System.out.println("Date 3: " + date3.toString());

		System.out.println("Day 1: " + date1.getDay() + "," + " Day 2: " + date2.getDay() + "," + " Day 3: " + date3.getDay());
	}
}
