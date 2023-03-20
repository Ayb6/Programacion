
public class Punto {

	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moverHorizontal(int desplazamiento) {
		x += desplazamiento;
	}

	public void moverVertical(int desplazamiento) {
		y += desplazamiento;
	}

	public void mostrar() {
		System.out.println("Punto (" + x + "," + y + ")");
	}
}
