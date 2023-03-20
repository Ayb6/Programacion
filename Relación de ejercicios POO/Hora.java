
public class Hora {

	private int horas;
	private int minutos;
	private int segundos;

	public Hora(int horas) {
		this.horas = horas;
		minutos = 0;
		segundos = 0;
	}

	public Hora(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
		segundos = 0;
		corregirHora();
	}

	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		corregirHora();
	}

	public void setHora(int horas) {
		this.horas = horas;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
		corregirHora();
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
		corregirHora();
	}

	private void corregirHora() {
		minutos += segundos / 60;
		segundos %= 60;
		horas += minutos / 60;
		minutos %= 60;
	}

	public void mostrarHora() {
		System.out.print((horas > 0 ? (horas + " horas ") : ""));
		System.out.print((minutos > 0 ? (minutos + " minutos ") : ""));
		System.out.println((segundos > 0 ? (segundos + " segundos") : ""));
	}
}
