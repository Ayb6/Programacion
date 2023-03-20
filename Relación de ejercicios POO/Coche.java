public class Coche {

	private String color;
	private double anchura;
	private double altura;
	private int numPuertas;
	private int numRuedas;

	private boolean arrancado;
	private int gasolina;

	public Coche(String color, double anchura, double altura, int numPuertas) {
		this.color = color;
		this.anchura = anchura;
		this.altura = altura;
		this.numPuertas = numPuertas;
		numRuedas = 4;

		arrancado = false;
		gasolina = 0;
	}

	public void arrancar() {
		if (!arrancado && gasolina >= 5 && chequear()) {
			gasolina -= 5;
			arrancado = true;
			System.out.println("El coche ha sido arrancado.");
		} else {
			System.out.println("No es posible arrancar.");
		}
	}

	public void parar() {
		if (arrancado) {
			arrancado = false;
			System.out.println("El coche ha sido parado.");
		} else {
			System.out.println("No es posible: ya estaba parado.");
		}
	}

	public void desplazarse() {
		if (arrancado && gasolina >= 20) {
			System.out.println("El coche se ha desplazado.");
		} else {
			System.out.println("No es posible desplazarse.");
		}
	}

	public void echarGasolina(int gasolina) {
		if (arrancado) {
			parar();
		}
		this.gasolina += gasolina;
		if (this.gasolina > 50) {
			this.gasolina = 50;
		}
		System.out.println("Gasolina echada.");
	}

	public boolean chequear() {
		return gasolina > 0;
	}

	public void pintar(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += "Coche (Color: " + color + ", Anchura: " + anchura;
		cadena += ", Altura: " + altura + ", Num Puertas: " + numPuertas;
		cadena += ", Num Ruedas: " + numRuedas + ", Arrancado: " + (arrancado ? "SI" : "NO");
		cadena += ", Gasolina: " + gasolina + ")";
		return cadena;
	}
}
