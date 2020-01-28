package com.sqlaccesodatos.repositorio;

import java.util.TreeMap;

import com.sqlaccesodatos.modelo.Persona;

public class PersonaTreeMap implements Dao<Persona>{
	
	private TreeMap<Long, Persona> personas  = new TreeMap<>();
	
	//SINGLETON
	
	private PersonaTreeMap() {
		personas.put(1L, new Persona(1L, "Rodrigo", "Soto"));
		personas.put(2L, new Persona(2L, "Pepe", "Pérez"));
		personas.put(3L, new Persona(3L, "Arizona", "Winter"));
	}
	
	private final static PersonaTreeMap INSTANCIA = new PersonaTreeMap();
	
	public static PersonaTreeMap getInstancia() {
		return INSTANCIA;
	}
	
	//FIN SINGLETON

	@Override
	public Iterable<Persona> getAll() {
		return personas.values();
	}

	@Override
	public Persona getById(Long id) {
		return personas.get(id);
	}

	@Override
	public Persona insert(Persona persona) {
		personas.put(persona.getId(), persona);
		return persona;
	}

	@Override
	public Persona update(Persona persona) {
		return personas.put(persona.getId(), persona);
	}

	@Override
	public Persona delete(Persona persona) {
		throw new UnsupportedOperationException("NO ESTÁ NI QUIERO QUE ESTÉ IMPLEMENTADO");
	}

	@Override
	public Persona delete(Long id) {
		return personas.remove(id);
	}
	
	

}
