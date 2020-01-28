package conectaBD;

import java.sql.*;


public class ConsultaPreparada {

	private static final String user= "root";
	private static final String password = "admin";
	private static final String URL = "jdbc:mysql://localhost:3306/curso_sql?serverTimezone=UTC";
	
	public static void main(String[] args) throws SQLException {
		

		//1.- CREAR CONEXIÓN
		
		Connection miConexion = DriverManager.getConnection(URL, user, password);
		
		//2.- PREPARAR CONSULTA
		
		PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PAÍSDEORIGEN FROM PRODUCTOS" + "WHERE SECCIÓN=? AND PAÍSDEORIGEN=?");
		
		//3.- ESTABLECER PARÁMETROS DE CONSULTA
		
		miSentencia.setString(1, "deportes");
		miSentencia.setString(2, "USA");		
		
		//4.- EJECUTAR Y RECORRER CONSULTA
		
		ResultSet rs = miSentencia.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		
		rs.close();
		
		// REUTILIZACION DE CONSULTA SQL
		
		System.out.println("EJECUCIÓN SEGUNDA CONSULTA");
		
		
	}

}
