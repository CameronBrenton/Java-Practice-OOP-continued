public class Instructor {
	private String firstName;
	private String lastName;
	private String officeNumber;

	public Instructor(String firstName, String lastName, String officeNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeNumber = officeNumber;
	}

	public Instructor(Instructor instructor){
		this.firstName = instructor.firstName;
		this.lastName = instructor.lastName;
		this.officeNumber = instructor.officeNumber;
	}

	public String toString(){
		return firstName + " " + lastName + " is in office # " + officeNumber;
	}

}
