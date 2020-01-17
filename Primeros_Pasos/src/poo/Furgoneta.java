package poo;

public class Furgoneta extends Coche {

	private int capacidadCarga;
	private int plazasExtras;

	public Furgoneta(int plazasExtras, int capacidadCarga) {

		super(); // LLAMA AL CONSTRUCTOR DE LA CLASE "PADRE" O SUPERCLASE

		this.capacidadCarga = capacidadCarga;
		this.plazasExtras = plazasExtras;

	}

	public String GetDatosFurgoneta() {

		return "La capacidad de carga es: " + capacidadCarga + " y las plazas son: " + plazasExtras;
	}

}
