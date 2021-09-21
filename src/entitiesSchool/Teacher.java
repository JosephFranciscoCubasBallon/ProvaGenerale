package entitiesSchool;

public class Teacher extends Person {
	
	Course course;

	public Teacher(int id, String name, int age, String gender, Course course) {
		super(id, name, age, gender);
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Teacher [course=" + course + "] --- " + super.toString() ;
	}
	
	

}
