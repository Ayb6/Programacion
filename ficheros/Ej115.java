package ficheros;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej115 {

    public static void main(String[] args) {
        String ruta = "src/ficheros/numeros.txt";
        //Flujos para lectura
        FileReader lector = null;
        BufferedReader mibuffer = null;
        //Flujos para escritura

        try {
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);

            int max = 0;
            int contador1 = 0;
            int min = 999999999;
            int contador2 = 0;
            String linea = "";
            int num;
            do {
                linea = mibuffer.readLine();
                if (linea != null) {
                    num = Integer.parseInt(linea);
                    if (num > max) {
                        max = num;
                        contador1 = 0;
                    }
                    if (num < min) {
                        min = num;
                        contador2 = 0;
                    }
                    if (num == max) {
                        contador1++;
                    }
                    if (num == min) {
                        contador2++;
                    }
                }
            } while (linea != null);
                System.out.println("El numero mayor es: "+max+" y se repite "+contador1);
                System.out.println("El numero menor es: "+min+" y se repite "+contador2);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR fichero no encontrado.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR leyendo o cerrando datos.");
            System.out.println(e.getMessage());
        }
    }

}
