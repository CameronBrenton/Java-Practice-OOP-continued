public class Course {
	private String courseName;
	private Instructor instructor;
	private TextBook textbook;

	public Course(String courseName, Instructor instructor, TextBook textbook){
		this.courseName = courseName;
		this.instructor = instructor;
		this.textbook = textbook;
	}

	@Override
	public String toString(){
		return this.courseName + " has textbook" + this.textbook.toString() + " taught by " + this.instructor.toString();
	}

}
