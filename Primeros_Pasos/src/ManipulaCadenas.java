
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Rodrigo";

		System.out.println("Mi nombre es: " + nombre);

		System.out.println("Mi nombre tiene " + nombre.length() + " letras");

		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

		int ultimaLetra = nombre.length();
		
		System.out.println("...y la última letra es la " + nombre.charAt(ultimaLetra-1));
		

	}

}
