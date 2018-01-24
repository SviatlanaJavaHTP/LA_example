package by.htp.library.dao;

import by.htp.library.bean.Entity;

public interface BaseDao<T extends Entity> {
	
	// C R U D 
	void create(T t);
	T read();
	void update(T t);
	void delete(T t);
	

}
