package model;

import entitiesSchool.Entity;

public interface DAOEntities {
	
	//crud - create, retrieve, update, delete
	
	void setEntity(Entity entity);
	Entity getEntity(int id);
	boolean updateEntity(Entity entity);
	boolean deleteEntity (int id);

}
