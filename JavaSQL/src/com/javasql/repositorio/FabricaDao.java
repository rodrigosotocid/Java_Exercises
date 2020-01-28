package com.javasql.repositorio;


import com.javasql.modelo.Persona;

public class FabricaDao {
	
	public static Dao<Persona> getInstancia(String tipo){
		switch(tipo) {
		case "memoria": return PersonaTreeMap.getInstancia();
		case "mysql": return PersonaMySQL.getInstancia();
		default: throw new AccesoDatosException("No conozco el tipo " + tipo);
		}
	}

}
