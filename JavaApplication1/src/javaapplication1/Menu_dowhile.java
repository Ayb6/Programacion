package javaapplication1;

import java.util.Scanner;

public class Menu_dowhile {

    public static void main(String[] args) {
        int opcion;
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("1. Dime nombre");
            System.out.println("2. Imprime nombre");
            System.out.println("3. salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca nombre");
                    nombre = teclado.next();
                    break;
                case 2:
                    if (nombre.equals("")) {
                        System.out.println("No ha introducido ningun nombre");
                    } else {
                        System.out.println("Su nombre es: " + nombre);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("error");
            }
        } while (opcion != 3);

    }

}
