/*
* This is the CollegeStudent subclass of Student.
*/


public class CollegeStudent extends Student{
	protected String major; // College student's class major
	protected int year; // College student's current enrollment year

	// Class constructor
	public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year, String major){
		super(myName, myAge, myGender, myIdNum, myGPA);
		this.year = year;
		this.major = major;
	}

	// Getters for the class variables
	public int getYear(){
		return year;
	}

	public String getMajor(){
		return major;
	}

	// Setters for the class variables
	public void setYear(int year){
		this.year = year;
	}

	public void setMajor(String major){
		this.major = major;
	}

	// Description
	public toString(){
		return super.toString() + ", Major: " + major + ", year: " + year;
	}
}
