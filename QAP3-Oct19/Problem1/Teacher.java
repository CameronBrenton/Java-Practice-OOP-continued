/*
* This is the Teacher subclass of Person.
*/


public class Teacher extends Person{
	protected String subject; // Course subject the teacher is taking
	protected double salary; // Teacher's annual salary

	public Teacher(String myName, int myAge, String myGender, String subject, double salary){
		// Access the parent class variable's
		super(myName, myAge, myGender);
		this.subject = subject;
		this.salary = salary;
	}

	// Getters
	public String getSubject(){
		return this.subject;
	}

	public double getSalary(){
		return this.salary;
	}

	// Setters
	public void setSubject(String subject){
		this.subject = subject;
	}

	public void setSalary(String salary){
		this.salary = salary;
	}

	// Describe itself
	public String toString(){
		return super.toString() + ", subject: " + subject + ", salary: " + salary;
	}
	
	
}
