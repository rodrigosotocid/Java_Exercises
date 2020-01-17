package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		 * 
		 * Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
		 * 
		 * Empleado empleado3 = new Empleado("María Martín", 105000, 2001, 03, 15);
		 * 
		 * empleado1.SetSubeSueldo(5);
		 * 
		 * empleado2.SetSubeSueldo(5);
		 * 
		 * empleado3.SetSubeSueldo(5);
		 * 
		 * System.out.println("Nombre: " + empleado1.GetNombre() + "\nSueldo: " +
		 * empleado1.GetSueldo() + "\nFecha de Alta: " + empleado1.GetFechaContrato() +
		 * "\n********************************************");
		 * 
		 * System.out.println("Nombre: " + empleado2.GetNombre() + "\nSueldo: " +
		 * empleado2.GetSueldo() + "\nFecha de Alta: " + empleado2.GetFechaContrato() +
		 * "\n********************************************");
		 * 
		 * System.out.println("Nombre: " + empleado3.GetNombre() + "\nSueldo: " +
		 * empleado3.GetSueldo() + "\nFecha de Alta: " + empleado3.GetFechaContrato() +
		 * "\n********************************************");
		 */

		Jefatura jefe_RRHH = new Jefatura("Rodrigo Soto", 55000, 2006, 9, 25);

		jefe_RRHH.SetIncentivo(2570);

		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("María Martín", 105000, 2001, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernández");
		misEmpleados[4] = jefe_RRHH;// Polimorfismo en acción. Principio de sustitución.
		misEmpleados[5] = new Jefatura("María Peña", 95000, 1999, 5, 12);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.SetIncentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.GetNombre() + " tiene un bonus de: " + jefa_Finanzas.establece_bonus(500));
		System.out.println("El currante "+ misEmpleados[3].GetNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		/*
		 * //Usamos el principio de sustitución Empleado director_comercial = new
		 * Jefatura("Sandra",85000, 2012,05,05);
		 * 
		 * Comparable ejemplo=new Empleado("Elisabeth", 95000, 2011, 06,07);
		 * 
		 * if(director_comercial instanceof Empleado) {
		 * System.out.println("Es de tipo Jefatura"); }
		 * 
		 * if(ejemplo instanceof Comparable) {
		 * System.out.println("Implenta la interfaz comparable"); }
		 */
		
		/*
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * misEmpleados[i].SetSubeSueldo(5); }
		 * 
		 * 
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * System.out.println("Nombre: " + misEmpleados[i].GetNombre() + "\nSueldo: " +
		 * misEmpleados[i].GetSueldo() + "\nFecha de Alta: " +
		 * misEmpleados[i].GetFechaContrato()); }
		 */

		for (Empleado e : misEmpleados) { // SUBIMOS SUELDO A LOS EMPLEADOS

			e.SetSubeSueldo(5);
		}

		// Clase Array y su método sort permite ordenar un array de objetos que además nos obliga
		// a implementar la interfaz comparable y su método compareTo(Object miObjeto)
		Arrays.sort(misEmpleados);
		
		for (Empleado e : misEmpleados) {
			
			System.out.println("Nombre: " + e.GetNombre() + "\nSueldo: " + e.GetSueldo() + "\nFecha de Alta: "
					+ e.GetFechaContrato());
		}
	}
}

class Empleado implements Comparable, Trabajadores{

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altaContrato = calendario.getTime();

	}
	
	public double establece_bonus( double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}

	public Empleado(String nom) {

		this(nom, 30000, 200, 01, 01);

	}

	public String GetNombre() {

		return nombre;
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
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}		
			return 0;
			
		
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;

}

class Jefatura extends Empleado implements Jefes {

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la desicion de: " + decision;
	}
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
	}

	public void SetIncentivo(double b) {

		incentivo = b;	}

	public double GetSueldo() {

		double sueldoJefe = super.GetSueldo();
		return sueldoJefe + incentivo;
	}

	private double incentivo;

}
