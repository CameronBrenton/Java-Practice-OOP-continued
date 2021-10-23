/*
* This is the Person superclass.
*/



public class Person {
	protected String myName ;   // name of the person
	protected int myAge;        // person’s age
	protected String myGender;  // “M” for male, “F” for female
	
	// Parameterized constructor
	public Person(String name, int age, String gender)  {
		myName = name;
		myAge = age; 
		myGender = gender;
	}

	// Getters
	public String getName(){
		return this.myName;
	}

	public int getAge(){
		return this.myAge;
	}

	public String getGender(){
		return this.myGender;
	}

	// Setters
	public void setName(String name){
		this.myName = name;
	}

	public void setAge(int age){
		this.myAge = age;
	}

	public void setGender(String gender){
		this.myGender = gender;
	}

	// Describe itself
	public String toString()  {
		return myName + ", age: " + myAge + ", gender: " + myGender;
	}
		
}
