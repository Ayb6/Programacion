package javaapplication1;


import java.util.Scanner;

public class Do_while_Menu {

    public static void main(String[] args) {
        int opcion;
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("1. Dame el nombre");
            System.out.println("2. Imprime el nombre");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre");
                    nombre = teclado.next();
                    break;
                case 2:
                    if (nombre.equals("")) {
                        System.out.println("Error, no has introducido un nombre para mostrar por pantalla");
                    } else {
                        System.out.println("Su nombre es " + nombre);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("El numero que has introducido es incorrecto");
            }

        } while (opcion != 3);
        System.out.println("Has salido");
    }

}
