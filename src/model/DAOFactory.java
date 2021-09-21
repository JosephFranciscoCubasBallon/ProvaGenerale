package model;

import entitiesSchool.Entity;
import entitiesSchool.EntityEnum;
import entitiesSchool.Student;
import entitiesSchool.Teacher;

public class DAOFactory {
	
	public DAOFactory() {}
	
	public Entity getEntity(EntityEnum entity) {
		Entity result = null;
		switch(entity) {
		
			case STUDENT:
				result = new Student(0, null, 0, null, null, null);
				break;
			case TEACHER:
				result = new Teacher(0, null, 0, null, null);
				break;
		}
		
		return result;
			
		
	}

}
