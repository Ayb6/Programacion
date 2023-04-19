package ficheros;

import java.io.*;
import java.util.*;

public class PadronHabitantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("PADRÓN DE HABITANTES");
            System.out.println("1. Registrar habitante");
            System.out.println("2. Mostrar padrón");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    registrarHabitante();
                    break;
                case 2:
                    mostrarPadron();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            
        } while (opcion != 0);
        
        sc.close();
    }
    
    public static void registrarHabitante() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI del habitante: ");
        String dni = sc.nextLine();
        
        try {
            FileWriter fw = new FileWriter("padron.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            File file = new File("padron.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(dni)) {
                    System.out.println("Habitante ya registrado.");
                    scanner.close();
                    pw.close();
                    return;
                }
            }
            scanner.close();
            
            pw.println(dni);
            pw.close();
            System.out.println("Habitante registrado correctamente.");
            
        } catch (IOException e) {
            System.out.println("Error al registrar el habitante.");
        }
    }
    
    public static void mostrarPadron() {
        try {
            File file = new File("padron.txt");
            Scanner scanner = new Scanner(file);
            
            System.out.println("PADRÓN DE HABITANTES:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error al mostrar el padrón.");
        }
    }
}