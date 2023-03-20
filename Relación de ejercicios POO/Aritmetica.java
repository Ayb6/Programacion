
public class Aritmetica {

	private double v1;
	private double v2;

	public Aritmetica(double v1, double v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public double suma() {
		return v1 + v2;
	}

	public double resta() {
		return v1 - v2;
	}

	public double multiplicacion() {
		return v1 * v2;
	}

	public double division() {
		return (v2 != 0 ? v1 / v2 : 0);
	}

	public double potencia() {
		return Math.pow(v1, v2);
	}
}
