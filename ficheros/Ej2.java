
package ficheros;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej2 {
    public static void main(String[] args) {
        String ruta = "src/ficheros/poema.txt";

        try {
            //2-Creamos los flujos de datos
            FileReader lector = new FileReader(ruta);
            BufferedReader mibuffer = new BufferedReader(lector);
            
            String linea="";
            do{
                linea = mibuffer.readLine();
                if (linea != null){
                    String palabras[] = linea.split(" ");
                    for (int i = 0; i < palabras.length; i++) {
                        System.out.println(palabras[i]);
                    }
                }   
            }while(linea != null);

            //Cierro los flujos de datos
            mibuffer.close();
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR fichero no encontrado.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR leyendo o cerrando datos.");
            System.out.println(e.getMessage());
        }
    }
}
