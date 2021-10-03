// This is the Person class

package Problem2;

public class Person {
	// Class variables
	private String lastName;
	private String firstName;
	private Address home;

	// Person parameterized constructor
	public Person(String lastName, String firstName, Address home){
		this.lastName = lastName;
		this.firstName = firstName;
		this.home = home;
	}

	// toString method()
	public String toString(){
		return "Person[" + lastName + ", " + firstName + ", " + home + "]";
	}
}
