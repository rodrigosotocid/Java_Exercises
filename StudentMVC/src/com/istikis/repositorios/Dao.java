package com.istikis.repositorios;

public interface Dao<T>  {
	
	Iterable<T> getAll();
	T getById(Long id);
	
	void addStudent(T student);
	void updateStudent(T student);
	void deleteStudent(Long id);

}
