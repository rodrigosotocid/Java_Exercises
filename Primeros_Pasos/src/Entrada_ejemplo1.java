import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre, please");

		String nombre_usuario = entrada.nextLine();

		System.out.println("Introduce tu edad, please");

		int edad = entrada.nextInt();

		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad + 1) + " años");

	}

}
