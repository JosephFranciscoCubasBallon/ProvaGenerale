package main;

import entitiesSchool.EntityEnum;
import entitiesSchool.Student;
import model.DAOFactory;

public class TESTDAOFactory {

	public static void main(String[] args) {
		
		DAOFactory entityFactory = new DAOFactory();
		
		Student student = (Student) entityFactory.getEntity(EntityEnum.STUDENT);
		
		student.toString();
		

	}

}
