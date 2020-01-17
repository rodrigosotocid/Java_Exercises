import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicios {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Desde que número comenzamos la cuenta regresiva?");
		int numero = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= numero;) {
			System.out.println(numero);
			numero--;
		}
		
		
		

	}

}
