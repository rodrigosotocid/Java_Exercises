package com.sqlaccesodatos.repositorio;

public interface Dao<T> {

	public Iterable<T> getAll();
	public T getById(Long id);
	
	public T insert(T object);
	public T update(T object);
	public T delete(T object);
	
	public T delete(Long id);
	
}
