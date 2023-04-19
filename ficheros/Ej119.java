/*
119. Supongamos un fichero de texto que se usa como inventario de un juego, el 
cual tiene los datos en cada linea estructurados de la siguiente forma:
amuleto:200:5
pocion:50:20
espada:1000:1
antorcha:30:9
cuerda:120:3
Diseña un programa que, tomando un fichero con la estructura antes indicada, muestre
por pantalla de forma clara el inventario que representa.
*/
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ej119 {

    public static void main(String[] args) {
        String path="src/ficheros/Ej119.txt";
        try(FileReader lector = new FileReader (path); BufferedReader buffer = new BufferedReader (lector)){
            String linea=" ";
            while(linea!=null){
                linea=buffer.readLine();
                if(linea!=null){
                System.out.println("Item:     "+linea.substring(0,linea.indexOf(":")));
                System.out.println("Precio:   "+linea.substring(linea.indexOf(":")+1, linea.lastIndexOf(":")));
                System.out.println("Cantidad: "+linea.substring(linea.lastIndexOf(":")+1));
                }
                System.out.println("");
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
        }catch(IOException e){
            System.out.println("Ocurrió un error inesperado.");
        }

    }

}


/*
package ficheros;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ej119 {

    public static void main(String[] args) {
        String ruta = "src/ficheros/119.txt";
        //Flujos para lectura
        FileReader lector = null;
        BufferedReader mibuffer = null;
        //Flujos para escritura
        FileWriter escritor = null;
        BufferedWriter paquito = null;
        try {
            //2-Creamos los flujos de datos
            //Para leer
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);
            //Para escribir
            escritor = new FileWriter(ruta);
            paquito = new BufferedWriter(escritor);

            String linea = "";
            do {                
                
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
*/