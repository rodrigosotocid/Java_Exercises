import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 100);

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int intentos = 0;

		while (numero != aleatorio) {

			System.out.println("Introduce un número");

			numero = entrada.nextInt();
			intentos++;

			if (aleatorio < numero) {

				System.out.println("Más bajo!, Prueba Otra vez");

			} else if (aleatorio > numero) {

				System.out.println("Mas alto!, Prueba Otra vez");
			}

		}

		System.out.println("Correcto!!, Has necesitado " + intentos + " intentos");

	}

}
