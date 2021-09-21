package model;

import java.util.ArrayList;
import java.util.List;

import entitiesSchool.Student;
import entitiesSchool.Teacher;

public interface DB {
	
	List<Student> students = new ArrayList<Student>();
	List<Teacher> teachers = new ArrayList<Teacher>();
 
}
