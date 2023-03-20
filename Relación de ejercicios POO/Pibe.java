
public class Pibe {

	private String nombre;
	private int esfuerzo;
	private int hambre;
	private int vidas;
	private boolean vivo;
	
	private final int ESFUERZO_INICIAL = 10;
	private final int HAMBRE_INICIAL = 3;

	public Pibe(String nombre) {
		this.nombre = nombre;
		esfuerzo = ESFUERZO_INICIAL;
		hambre = HAMBRE_INICIAL;
		vidas = 7;
		vivo = true;
	}

	public void jugar() {
		if (vivo) {
			esfuerzo -= 3;
			hambre -= 1;
			comprobarPuntos();
		} else {
			System.out.println("Muerto: No puede jugar");
		}

	}

	public void comunicarse() {
		if (vivo) {
			esfuerzo -= 1;
			comprobarPuntos();
		} else {
			System.out.println("Muerto: No puede comunicarse");
		}
	}

	public void comer(boolean favorito) {
		if (vivo) {
			esfuerzo -= 2;
			hambre += 2;
			if (favorito) {
				hambre += 3;
			}
			comprobarPuntos();
		} else {
			System.out.println("Muerto: No puede comer");
		}

	}

	public void dormir() {
		if (vivo) {
			esfuerzo += 5;
			comprobarPuntos();
		} else {
			System.out.println("Muerto: No puede dormir");
		}
	}

	private void comprobarPuntos() {
		// Comprobar si pierde 1 vida
		if (esfuerzo <= 0 || hambre <= 0) {
			vidas--;
			esfuerzo = ESFUERZO_INICIAL;
			hambre = HAMBRE_INICIAL;
		}
		
		// Validar que los valores no superen los iniciales
		if (esfuerzo > ESFUERZO_INICIAL) {
			esfuerzo = 10;
		}
		if (hambre > HAMBRE_INICIAL) {
			hambre = 3;
		}
		
		// Comprobar si muere
		if (vidas <= 0) {
			morir();
		}
	}

	private void morir() {
		esfuerzo = -1;
		hambre = -1;
		vivo = false;
		System.out.println(nombre + " ha muerto");
	}
}
