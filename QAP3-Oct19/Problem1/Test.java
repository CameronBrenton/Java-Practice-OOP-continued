
/*
* This is the Testing class
*/


public class Test {
	
	public static void main(String[] args){

		System.out.println();
		Person bob = new Person("Coach Bob", 27, "M");
		System.out.println(bob);
		Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
		System.out.println(lynne);
		Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
		System.out.println(mrJava);
		CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
		System.out.println(ima);
		System.out.println();

		Person cam = new Person("Cam Newton", 27, "M");
		System.out.println(cam);
		Student carl = new Student("Carl Wayne", 35, "M", "ABV443", 3.2);
		System.out.println(carl);
		Teacher janice = new Teacher("Janice Cloverfield", 45, "F", "Neuroscience", 60000);
		System.out.println(janice);
		CollegeStudent nicole = new CollegeStudent("Nicole Lewis", 23, "F", "ISL008", 3.3, 2, "Software Development");
		System.out.println(nicole);

	}
}
