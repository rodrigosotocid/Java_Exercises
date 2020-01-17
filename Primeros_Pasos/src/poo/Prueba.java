package poo;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados empleado1 = new Empleados("Paco");
		Empleados empleado2 = new Empleados("Ana");
		Empleados empleado3 = new Empleados("Antonio");
		Empleados empleado4 = new Empleados("María");

		empleado1.SetCambiaSeccion("RRHH");

		System.out.println(empleado1.GetDevuelveDato() + "\n" + empleado2.GetDevuelveDato() + "\n"
				+ empleado3.GetDevuelveDato() + "\n" + empleado4.GetDevuelveDato());
		
		System.out.println(Empleados.GetDameIdSiguiente());

	}

}

class Empleados {

	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;

	public Empleados(String nom) {

		nombre = nom;

		seccion = "Administración";

		Id = IdSiguiente;
		IdSiguiente++;

	}

	public void SetCambiaSeccion(String seccion) {

		this.seccion = seccion;

	}

	public String GetDevuelveDato() {

		return "El nombre es: " + nombre + " y la sección es " + seccion + " y el Id=" + Id;
	}

	public static String GetDameIdSiguiente() {

		return "El Id siguiente es: " + IdSiguiente;
	}

}
