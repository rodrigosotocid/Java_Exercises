package com.istikis.masajes.repositorios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.istikis.masajes.repositorios.AccesoDatosException;
import com.istikis.masajes.repositorios.ActuacionesMySQL;
import com.istikis.masajes.modelo.Actuaciones;

public class FabricaDao {
	
	private String pathConfiguracion;
	private String tipo;
	
	//SINGLETON
	private static FabricaDao instancia;
	

	public static FabricaDao getInstancia(String pathConfiguracion) {
		if(instancia == null) {
			instancia = new FabricaDao(pathConfiguracion);
		}
		return instancia;
	}

	private FabricaDao(String pathConfiguracion) {
		
		this.pathConfiguracion = pathConfiguracion;
		
		Properties configuracion = new Properties();
		
		try {
			configuracion.load(new FileInputStream(pathConfiguracion));
			tipo = configuracion.getProperty("tipo");
		}catch (IOException e) {
			throw new AccesoDatosException("No se ha podido leer el fichero de configuración");
		}
	}
	//FIN SINGLETON
	
	public Dao<Actuaciones> getInstanciaActuaciones() {
		if(tipo == "mysql") {
			
		   return ActuacionesMySQL.getInstancia(pathConfiguracion);
		
		}else {
			throw new AccesoDatosException("No se reconoce el tipo " + tipo);
		}
		
	}
	
	

}
