package com.istikis.accesodatos;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.istikis.accesodatos.AccesoDatosException;
import com.istikis.accesodatos.AlumnoArrayList;
import com.istikis.modelo.Alumno;

public class AlumnoArrayList implements Dao<Alumno> {

	private static Long ultimoId = 0L;

	private ArrayList<Alumno> alumnos = new ArrayList<>();

	// START SINGLETON

	private static final AlumnoArrayList INSTANCIA = new AlumnoArrayList();

	private AlumnoArrayList() {
		// Constructor
		agregar(new Alumno(null, "Rodrigo", "Soto", "79224857T", new GregorianCalendar(1982, 2 - 1, 28).getTime()));
		agregar(new Alumno(null, "Alejandro", "Cid", "79224857T", new GregorianCalendar(1982, 2 - 1, 28).getTime()));
		agregar(new Alumno(null, "Javier", "Lete García", "12345678Z", new GregorianCalendar(1980, 5 - 1, 5).getTime()));
		agregar(new Alumno(null, "Pepe", "Pérez García", "84908444B", new GregorianCalendar(1982, 1 - 1, 10).getTime()));
	}

	public static AlumnoArrayList getInstancia() {
		return INSTANCIA;
	}
	// END SINGLETON

	@Override
	public Iterable<Alumno> obtenerTodos() {
		return alumnos;
	}

	private Integer obtenerIndicePorId(Long id) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getId() == id) {
				return i;
			}
		}

		return null;
	}

	@Override
	public Alumno obtenerPorId(Long id) {
		Integer i = obtenerIndicePorId(id);

		if (i == null) {
			return null;
		}

		return alumnos.get(i);
	}

	@Override
	public Alumno agregar(Alumno alumno) {
		if (alumno == null) {
			throw new AccesoDatosException("No se aceptan alumnos nulos");
		}

		Long id = ++ultimoId;

		if (alumno.getId() == null) {
			alumno.setId(id);
		} else {
			throw new AccesoDatosException("No debes pasar un ID");
		}

		alumnos.add(alumno);

		return alumno;
	}

	@Override
	public Alumno modificar(Alumno alumno) {
		Integer i = obtenerIndicePorId(alumno.getId());

		if (i == null) {
			throw new AccesoDatosException("No se ha encontrado ese ID");
		}

		return alumnos.set((int) i, alumno);
	}

	@Override
	public void borrar(Long id) {
		Integer i = obtenerIndicePorId(id);

		if (i == null) {
			throw new AccesoDatosException("No se ha encontrado ese ID");
		}

		alumnos.remove((int) i);
	}

}
