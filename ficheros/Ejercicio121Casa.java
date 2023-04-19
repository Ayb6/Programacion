package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
121 .- Padrón de Habitantes
El padrón de habitantes contiene la lista de todos los habitantes de una población.
Diseña un programa que implemente un padrón básico con dos opciones:
1. Registrar habitante. El programa aceptara una cadena que representa el DNI de
un habitante. Se intentará añadir el DNI a un fichero padron.txt que
contiene en cada línea el DNI ya añadido al padrón. Si cuando vamos a añadir
no existe, añadimos el DNI al final del fichero. En caso de que ya existiera,
mostrará un error al usuario: “Habitante ya registrado”
2. Mostrar padrón. El programa mostrara todos los DNIs almacenadas en el
fichero padron.txt


 */
public class Ejercicio121Casa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BufferedReader lector = null;
        BufferedWriter escritor = null;
        String ruta = "src/ficheros/padron.txt";
        String dni;
        int opcion = 0;
        System.out.println("Padron noseque");
        System.out.println("----------------------");
        try {
            do {
                System.out.println("elige una opcion");
                System.out.println("1. Registrar habitante");
                System.out.println("2. Mostrar padron");
                System.out.println("3. Salir");
                System.out.println("opcion ?");
                opcion = teclado.nextInt();

                if (opcion == 1) {
                    System.out.println("Introduce dni");
                    dni = teclado.next();
                    try {
                        escritor = new BufferedWriter(new FileWriter(ruta, true));
                        lector = new BufferedReader(new FileReader(ruta));
                        boolean encontrado = false;
                        String linea = "";
                        while (linea != null) {
                            if (linea.equals(dni)) {
                                encontrado = true;
                            }
                            linea = lector.readLine();
                        }
                        if (!encontrado) {
                            System.out.println("Habitante registrado");
                            escritor.write(dni);
                            escritor.newLine();
                        } else {
                            System.out.println("Ya existe");
                        }
                    } catch (IOException e) {
                        System.out.println("Error");
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (lector != null) {
                                lector.close();
                            }
                            if (escritor != null) {
                                escritor.close();
                            }
                        } catch (IOException e) {
                            System.out.println("Error al cerrar");
                            System.out.println(e.getMessage());
                        }
                    }
                }
                if (opcion == 2) {
                    try {
                        lector = new BufferedReader(new FileReader(ruta));
                        String linea = "";
                        while (linea != null) {
                            System.out.println(linea);
                            linea = lector.readLine();
                        }
                    } catch (IOException e) {
                        System.out.println("Error");
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (lector != null) {
                                lector.close();
                            }
                            if (escritor != null) {
                                escritor.close();
                            }
                        } catch (IOException e) {
                            System.out.println("Error al cerrar");
                            System.out.println(e.getMessage());
                        }
                    }
                }
                if (opcion < 0 || opcion > 3) {
                    System.out.println("Valor incorrecto");
                }
            } while (opcion != 3);
        } catch (Exception e) {
            System.out.println("error: "+ e.getMessage());
        }

    }

}
