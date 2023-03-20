
public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	public void echarCafe(int cantidadCafe) {
		cantidadActual += cantidadCafe;
		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}

	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}

	public void vaciarCafetera() {
		cantidadActual = 0;
	}

	public void servirTaza(int capacidadTaza) {
		if (cantidadActual < capacidadTaza) {
			System.out.println("No es posible servir la taza.");
		} else {
			cantidadActual -= capacidadTaza;
			System.out.println("Taza servida.");
		}
	}

	public void cantidadCafe() {
		System.out.println("Queda " + cantidadActual + " cc de cafe en la cafetera.");
	}
}
