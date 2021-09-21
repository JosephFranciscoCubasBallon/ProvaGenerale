package model;

import entitiesSchool.Entity;
import entitiesSchool.Student;

public class StudentDao implements DAOEntities{
	
	@Override
	public void setEntity(Entity entity) {
		
		try {
			if(entity!=null & entity.getClass().equals(Student.class)) {
				//entity.setId(entity.getId());
				DB.students.add((Student) entity);
			}
				
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
		}
	}

	@Override
	public Entity getEntity(int id) {
		try {
			if(id>=0)
				for(int i=0;i<DB.students.size();i++) {
					if(DB.students.get(i).getId()==id)
						return DB.students.get(i);
				}
				
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
		}
		return null;
	}

	@Override
	public boolean updateEntity(Entity entity) {
		try {
			Student student = (Student) entity;
			if(entity!=null && entity.getId()>=0) {
				
				for(int i =0;i<DB.students.size();i++) {
					
					if(DB.students.get(i).getId()== student.getId()) {
						DB.students.get(i).setAge(student.getAge());
						DB.students.get(i).setClassRoom(student.getClassRoom());
						DB.students.get(i).setCourses(student.getCourses());
						DB.students.get(i).setGender(student.getGender());
						DB.students.get(i).setName(student.getName());
					}
						
				}
				return true;
			}
				
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			
		}
		return false;
	}

	@Override
	public boolean deleteEntity(int id) {
		
		try {
			if(id>=0) {
				for(int i=0;i<DB.students.size();i++) {
					if(DB.students.get(i).getId() == id)
						DB.students.remove(i);
				};
				return true;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
		}
		return false;	
	}

}
