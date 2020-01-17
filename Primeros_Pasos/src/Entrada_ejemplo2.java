import javax.swing.*;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		int convertString = Integer.parseInt(edad);
		
		convertString++;
		
		System.out.println("Hola " + nombre_usuario + ". El próximo año tendrás " + convertString + " años");
	}

}
