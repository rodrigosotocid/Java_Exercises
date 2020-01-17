package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas = new Persona[2];

		lasPersonas[0] = new Empleado2("Rodrigo Soto", 50000, 2009, 2, 28);
		lasPersonas[1] = new Alumno("Zuriñe Legarretaetxebarria", "Biología");

		for (Persona p : lasPersonas) {

			System.out.println(p.GetNombre() + " " + p.GetDescription());
		}

	}

}

//*************************************************************************************

abstract class Persona {

	private String nombre;

	public Persona(String nom) {

		nombre = nom;
	}

	public String GetNombre() {

		return nombre;
	}

	public abstract String GetDescription();
}

//*************************************************************************************

class Empleado2 extends Persona {

	public Empleado2(String nom, double sue, int agno, int mes, int dia) {

		super(nom);
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altaContrato = calendario.getTime();

		++IdSiguiente;
		Id = IdSiguiente;

	}

	public String GetDescription() {

		return "Este empleado tiene un Id: " + Id + " Con un sueldo: " + sueldo;
	}

	public double GetSueldo() {

		return sueldo;
	}

	public Date GetFechaContrato() {

		return altaContrato;
	}

	public void SetSubeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}

	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;

}

class Alumno extends Persona {

	public Alumno(String nom, String car) {

		super(nom);
		carrera = car;

	}

	public String GetDescription() {

		return " Este alumno está estudiando la carrera de  " + carrera;
	}

	private String carrera;
}
