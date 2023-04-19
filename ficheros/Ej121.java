package ficheros;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
21 .- Padrón de Habitantes
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
public class Ej121 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String rutaEntrada = "src/ficheros/poema.txt";
        String rutaSalida = "src/ficheros/salida.dat";
        //Flujos para lectura
        FileReader lector = null;
        BufferedReader mibuffer = null;
        //Flujos para escritura
        FileWriter escritor = null;
        BufferedWriter paquito = null;
        do {
            System.out.println("Padrón de Habitantes de Villanueva del Trabuco\n"
                    + "==============================================\n"
                    + "1. Registrar habitante\n"
                    + "2. Mostrar padrón\n"
                    + "3. Salir\n"
                    + "¿Opción?");
            opcion = teclado.nextInt();
            teclado.nextLine();
            do {                
                switch (opcion) {
                case 1:
                    opcion = 1;
                    break;
                case 2:
                    opcion = 2;
                    break;
                case 3:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("debes introducir una de las opciones");
                    opcion = -1;
            }
            } while (opcion == -1);
            
        } while (opcion != 3);

        try {
            //2-Creamos los flujos de datos
            //Para leer
            lector = new FileReader(rutaEntrada);
            mibuffer = new BufferedReader(lector);
            //Para escribir
            escritor = new FileWriter(rutaSalida);
            paquito = new BufferedWriter(escritor);

            //Cierro los flujos (de lectura y escritura)
            mibuffer.close();
            lector.close();
            paquito.close();
            escritor.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR fichero no encontrado.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR leyendo o cerrando datos.");
            System.out.println(e.getMessage());
        }

    }
}
