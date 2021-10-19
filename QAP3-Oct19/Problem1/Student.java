/*
* This is the Student subclass of Person.
*/

public class Student extends Person{
	protected String myIdNum;    // Student Id Number
	protected double myGPA;      // grade point average
	
	public Student(String name, int age, String gender, String idNum, double gpa)  {
		// use the super class’ constructor
		super(name, age, gender);
		// initialize what’s new to Student
		myIdNum = idNum;
		myGPA = gpa;
	}

}
