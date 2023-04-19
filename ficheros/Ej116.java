package ficheros;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej116 {

    public static void main(String[] args) {
        String ruta = "src/ficheros/116.txt";
        //Flujos para lectura
        FileReader lector = null;
        BufferedReader mibuffer = null;
        //Flujos para escritura

        try {
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);
            
            String linea="";
            String primeraLinea = "";
            String ultimaLinea = "";
            String todasLineas="";
            boolean primera=true;
            do {
                linea = mibuffer.readLine();
                if (linea != null) {             
                    if (linea.length() > primeraLinea.length()) {
                        primera=true;
                    }
                    if (primera) {
                        primeraLinea= linea;
                        todasLineas = "";
                        primera = false;
                    }
                    if (linea.length() == primeraLinea.length()) {
                        ultimaLinea = linea;
                        todasLineas += linea + "\n";
                    }
                }
            } while (linea != null);
            System.out.println("La primera linea es "+primeraLinea);
            System.out.println("La ultima linea es "+ultimaLinea);
            System.out.println("Todas las lineas es "+todasLineas);
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR fichero no encontrado.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR leyendo o cerrando datos.");
            System.out.println(e.getMessage());
        }
    }

}
