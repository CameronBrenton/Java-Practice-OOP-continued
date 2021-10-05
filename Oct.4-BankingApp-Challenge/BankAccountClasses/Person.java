package BankAccountClasses;
public class Person{
	private String firstName;
	private String lastName;
	private Address home;

	public Person(String firstName, String lastName, Address home){
		this.firstName = firstName;
		this.lastName = lastName;
		this.home = home;
	}

	public String toString(){
		return "Person[firstname = " + firstName + "lastname = " + lastName +  home + "]";
	}
}