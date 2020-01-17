package presentacion;

//import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import accesodatos.ClienteMemoria;
import accesodatos.Dao;
import entidades.Cliente;


public class PresentacionConsola {

	//private static final SimpleDateFormat FECHA_CORTA = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void main(String[] args) {

		Dao<Cliente> dao = ClienteMemoria.getInstancia();
		
		System.out.println(dao.agregar(new Cliente(4L, "rr","yy","12345678L",new GregorianCalendar(1983,12-1, 6).getTime())));
		
		
		
		

	}

}
