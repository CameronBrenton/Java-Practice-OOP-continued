public class CourseDemo {
	public static void main(String[] args){
		Instructor instructor = new Instructor("Cameron", "Brenton", "11");
		TextBook textBook = new TextBook("Java", "Paul", "Pearson");
		Course  advancedJavaProgramming = new Course("Advanced Java Programming", instructor, textBook);

		System.out.println(advancedJavaProgramming.toString());
	}
}
