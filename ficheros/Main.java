import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final String RUTA = "archivos/padron.txt";
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int opcion;
	// Bucle del programa
	do {
	    System.out.println("\nPadron de Habitantes de Villanueva del Trabuco");
	    System.out.println("==============================================");
	    System.out.println("Elija una opcion:\n1. Registrar habitante");
	    System.out.println("2. Mostrar padron\n3. Salir\n¿Opcion?");
	    String sOpcion = null;
	    
	    // Bucle de opcion correcta
	    do {
		sOpcion = input.nextLine();
		switch (sOpcion) {
		case "1":
		    opcion = 1;
		    break;
		case "2":
		    opcion = 2;
		    break;
		case "3":
		    System.out.println("Saliendo");
		    return;
		default:
		    System.out.println("Opcion no valida (1-3):");
		    opcion = -1;
		}
	    } while (opcion == -1);

	    // Registrar habitante
	    if (opcion == 1) {
		boolean salirOpcion1 = false;
		System.out.println("DNI?");
		do {
		    String DNI = input.nextLine();
		    boolean yaRegistrado = false;
		    // Leer archivo para ver si ya esta registrado
		    try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
			String linea = "";
			while (linea != null && !yaRegistrado) {
			    linea = br.readLine();
			    yaRegistrado = DNI.equalsIgnoreCase(linea);
			}
		    } catch (FileNotFoundException fnfe) {
			System.out.println("ERROR: no se encuentra " + RUTA);
		    } catch (IOException ioe) {
			System.out.println("ERROR al leer padron en opcion 1");
		    }

		    if (yaRegistrado) {
			System.out.println("El habitante ya esta registrado. Indique otro DNI:");
		    } else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true))) {
			    bw.append(DNI).append(System.lineSeparator());
			} catch (IOException e) {
			    System.out.println("ERROR al escribir nuevo DNI en " + RUTA);
			}
			System.out.println("Habitante registrado");
			salirOpcion1 = true;
		    }
		} while (!salirOpcion1);
	    }
	    // Mostrar padron
	    else if (opcion == 2) {
		try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
		    String linea = "";
		    while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		    }
		} catch (FileNotFoundException fnfe) {
		    System.out.println("ERROR: no se encuentra " + RUTA);
		} catch (IOException ioe) {
		    System.out.println("ERROR al leer padron en opcion 2");
		}
	    }
	} while (opcion != 3);
    }
}
