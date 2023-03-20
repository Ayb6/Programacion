
public class Cuenta {

	private String titular;
	private double cantidad;

	public Cuenta(String titular) {
		this.titular = titular;
		cantidad = 0;
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public void ingresar(int cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}

	public void retirar(int cantidad) {
		if (this.cantidad >= cantidad) {
			this.cantidad -= cantidad;
		} else {
			System.out.println("Error: No hay suficiente dinero");
		}
	}

	@Override
	public String toString() {
		return ("Esta cuenta pertenece a " + titular + " y posee actualmente una cantidad de " + cantidad + " €");
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
}
