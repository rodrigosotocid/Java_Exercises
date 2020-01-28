package com.javasql.consola;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.javasql.modelo.Persona;
import com.javasql.repositorio.Dao;
import com.javasql.repositorio.FabricaDao;


public class PresentacionConsola {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties configuracion = new Properties();
		configuracion.load(new FileInputStream("crudable.properties"));
		
		//DAO: Data Access Object
				Dao<Persona> dao = FabricaDao.getInstancia(
						configuracion.getProperty("crudable"));
				
				System.out.println(dao.insert(new Persona(4L, "Nuevo", "Nuevez")));
		
		for(Persona persona: dao.getAll()) {
			System.out.println(persona);
		}
		

	}

}
