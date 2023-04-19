package ficheros;

/*
    - Pasar a while las lecturas
    - 

 */
//Importamos
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class lectura1 {

    public static void main(String[] args) {
        FileReader lector = null;
        BufferedReader mibuffer = null;
        try {
            //2-Creamos los flujos de datos
            String ruta = "src/ficheros/prueba.txt";
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);

            //3 - Leer como necesite y/o digan
            String linea = "";
            do {
                linea = mibuffer.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            } while (linea != null);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR leyendo o cerrando datos");
            System.out.println(e.getMessage());
        } finally {
            try {
                //4 - Cerramos todos los flujos (NIVEL JUNIOR)
                if (mibuffer != null) {
                    mibuffer.close();
                }
                if (lector != null) {
                    lector.close();
                }
                {
            }
            } catch (IOException e) {
                System.out.println("ERROR leyendo o cerrando datos");
                System.out.println(e.getMessage());
            }

        }
    }

}
