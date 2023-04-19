package ficheros;
/*
1A. Fichero poema.txt (Varias lineas)
    Copio el contenido de poema.txt a salida.dat
1B. Copio en salida.dat el contenido de poema.txt precedido de nº de linea +:
2. Fichero poema.txt mostrar cada palabra por pantalla una debajo de otra (...por espacios)
*/
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioClase {

    public static void main(String[] args) {
        String rutaEntrada = "src/ficheros/poema.txt";
        String rutaSalida = "src/ficheros/salida.dat";
        //Flujos para lectura
        FileReader lector = null;
        BufferedReader mibuffer = null;
        //Flujos para escritura
        FileWriter escritor = null;
        BufferedWriter paquito = null;
        try {
            //2-Creamos los flujos de datos
            //Para leer
            lector = new FileReader(rutaEntrada);
            mibuffer = new BufferedReader(lector);
            //Para escribir
            escritor = new FileWriter(rutaSalida);
            paquito = new BufferedWriter(escritor);

            int contador = 0;

            String linea = "";
            
            do {
                linea = mibuffer.readLine();
                contador++;
                if (linea != null) {
                    paquito.write(contador + ":" + linea);
                    paquito.newLine();
                }
            } while (linea != null);

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
