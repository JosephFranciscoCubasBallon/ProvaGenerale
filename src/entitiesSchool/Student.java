package entitiesSchool;

import java.util.List;
import java.util.Objects;

public class Student extends Person{

	private String classRoom;
	private List<Course> courses;
	
	public Student(int id, String name, int age, String gender, String classRoom, List<Course> courses) {
		super(id, name, age, gender);
		this.classRoom = classRoom;
		this.courses = courses;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(classRoom, courses);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(classRoom, other.classRoom) && Objects.equals(courses, other.courses);
	}

	@Override
	public String toString() {
		return "Student [classRoom=" + classRoom + ", courses=" + courses + "] --- " + super.toString();
	} 


}
