package main;

import entitiesSchool.Entity;
import entitiesSchool.Student;
import model.DAOEntities;
import model.DB;
import model.StudentDao;

public class TESTStudentDao {

	public static void main(String[] args) {
		
		Entity entity1 = new Student(1, "joseph", 27, "M", "5b", null);
		Entity entity2 = new Student(2, "vale", 24, "F", "5b", null);
		Entity entity3= new Student(3, "gianella", 25, "F", "5b", null);
		Entity entity4 = new Student(4, "johanna", 29, "F", "5b", null);
		DAOEntities student = new StudentDao();
		
		// SET/CREATE
		System.out.println("QUI TESTIAMO IL SET\n");
		student.setEntity(entity1);
		student.setEntity(entity2);
		student.setEntity(entity3);
		student.setEntity(entity4);
		
		System.out.println(DB.students.toString());
		
		
		// DELETE
		student.deleteEntity(2);
		System.out.println("\n QUI TESTIAMO IL DELETE \n");
		System.out.println(DB.students.toString());
		
		
		// UPDATE
		Entity entity5 = new Student(4, "federica", 39, "F", "6b", null);
		student.updateEntity(entity5);
		System.out.println("\n QUI TESTIAMO L'UPDATE \n");
		System.out.println(DB.students.toString());
		
		//GET
		
		System.out.println("\n QUI TESTIAMO IL GET \n");
		System.out.println(student.getEntity(4).toString());
		
	}

}
