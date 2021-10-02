package Problem2;

public class Person {
	private String lastName;
	private String firstName;
	private String home;

	public Person(String lastName, String firstName, String home){
		this.lastName = lastName;
		this.firstName = firstName;
		this.home = home;
	}

	public toString(){
		return "Person[" + lastName + ", " + firstName + ", " + home + "]";
	}
}
