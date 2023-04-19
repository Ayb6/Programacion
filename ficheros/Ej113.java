
package ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej113 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ruta="src/ficheros/Ej112.dat";
        
        //Flujos para escritura
        FileWriter escritor = null;
        BufferedWriter mibuffer = null;
        
        try {
            //2-Creamos los flujos de datos
            //Para escribir
            escritor = new FileWriter(ruta);
            mibuffer = new BufferedWriter(escritor);
            
            String respuesta="";
            do {                
                System.out.println("Introduce frase");
                respuesta = teclado.nextLine();
                mibuffer.write(respuesta);
                mibuffer.newLine();
            } while (!respuesta.equals("") /*respuesta.length() != 0*/);

            //Cierro los flujos (de lectura y escritura)
            mibuffer.close();
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
