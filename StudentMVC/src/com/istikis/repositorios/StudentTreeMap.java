package com.istikis.repositorios;

import java.util.GregorianCalendar;
import java.util.TreeMap;
import com.istikis.modelos.Student;

public class StudentTreeMap implements Dao<Student> {
	
	private TreeMap<Long, Student> students = new TreeMap<>();
	
	// Patrón SINGLETON
	private final static StudentTreeMap INSTANCIA = new StudentTreeMap(); 
	
	private StudentTreeMap() {
		addStudent(new Student(null, "Rodrigo","Soto","male",new GregorianCalendar(1982, 2-1, 28).getTime()));
		addStudent(new Student(null, "Guillermo","Orale","male",new GregorianCalendar(1979, 8-1, 9).getTime()));
		addStudent(new Student(null, "Camila","Tapia","female",new GregorianCalendar(1989, 11-1, 16).getTime()));
		addStudent(new Student(null, "Angela","Valenzuela","female",new GregorianCalendar(1975, 8-1, 7).getTime()));
		addStudent(new Student(null, "Aintzane","Cendoia","female",new GregorianCalendar(1990, 4-1, 3).getTime()));
		addStudent(new Student(null, "Zuriñe","Gamboa","female",new GregorianCalendar(1975, 8-1, 7).getTime()));
		addStudent(new Student(null, "Pamela","Alvial","female",new GregorianCalendar(1989, 11-1, 16).getTime()));
		addStudent(new Student(null, "Asier","Ora","male",new GregorianCalendar(1979, 8-1, 9).getTime()));
		addStudent(new Student(null, "Cesar","Cid","male",new GregorianCalendar(1982, 2-1, 28).getTime()));
		addStudent(new Student(null, "María","Lopez","female",new GregorianCalendar(1990, 4-1, 3).getTime()));
	}
	
	public static StudentTreeMap getInstancia() { return INSTANCIA;	}
	
	// Fin SINGLETON

	@Override
	public Iterable<Student> getAll() {
		return students.values();
	}

	@Override
	public Student getById(Long id) {
		return students.get(id);
	}

	@Override
	public void addStudent(Student student) {
		// Comprobamos si la colección está vacía y en ese caso ponemos el id a 1
		// En caso contrario ponemos el id al último id + 1
		Long id = students.size() == 0 ? 1L : students.lastKey() + 1;
		// se confirma el id que nos pasan
		student.setId(id);
		// se añade el nuevo objeto
		students.put(id, student);
		
	}

	@Override
	public void updateStudent(Student student) {
		// se actualizan los datos con el método "put(key, value)"
		students.put(student.getId(), student);	
	}

	@Override
	public void deleteStudent(Long id) {
		//throw new UnsupportedOperationException("NO ESTÁ IMPLEMENTADO");
		students.remove(id);
	}

}
