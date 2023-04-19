package ficheros;

//Importamos
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class escritura {

    public static void main(String[] args) {
        String ruta = "src/ficheros/salida.txt";
        FileWriter escritor = null;
        BufferedWriter paquito = null;
        try {
            //2. Creamos Flujos de datos
            escritor = new FileWriter(ruta, true);
            paquito = new BufferedWriter(escritor);

            //3. Escribir
            paquito.write("Kakota");
            paquito.newLine();
            paquito.write("Del norte");

        } catch (IOException e) {
            System.out.println("Error en escritura: " + e.getMessage());
        } finally {
            try {
                //4. Cerrar
                if (paquito != null) paquito.close();
                if (escritor != null) escritor.close();
            } catch (IOException e) {
                System.out.println("ERROR Cerrando recursos: "+e.getMessage());
            }
        }
    }

}
