
public class Persona {

	private String nombre;
	private int edad;
	private char sexo;
	private String pais;

	public Persona(String nombre, int edad, char sexo, String pais) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.pais = pais;
	}

	public String saludar() {
		return "Hola me llamo " + nombre + " y soy de " + pais;
	}

	public String saludar(int numero) {
		switch (numero) {
		case 1:
			return "Hey, soy " + nombre;
		case 2:
			return "Tengo " + edad + " y me llamo " + nombre;
		case 3:
			return "Llamame " + nombre + " mi sexo es " + sexo;
		default:
			return "Error";
		}
	}

	public void mostrarDatos() {
		System.out.print(toString());
	}

	public boolean esMayorEdad() {
		return edad >= 18;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += "Nombre: " + nombre + " Edad: " + edad;
		cadena += " Sexo: " + sexo + " Pais: " + pais;
		return cadena;
	}

}
