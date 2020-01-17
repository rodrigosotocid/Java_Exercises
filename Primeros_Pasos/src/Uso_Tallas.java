import java.util.Scanner;

public class Uso_Tallas { // VIDEO Nº48 (REPASAR)

	/*
	 * enum Talla {
	 * 
	 * MINI, MEDIANO, GRANDE, MUY_GRANDE };
	 */

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) {

			this.abreviatura = abreviatura;
		}

		public String GetAbreviatura() {

			return abreviatura;
		}

		private String abreviatura;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

		String entradaDatos = entrada.next().toUpperCase();

		Talla la_talla = Enum.valueOf(Talla.class, entradaDatos);

		System.out.println("Talla = " + la_talla);

		System.out.println("Abreviatura = " + la_talla.abreviatura);

	}

}
