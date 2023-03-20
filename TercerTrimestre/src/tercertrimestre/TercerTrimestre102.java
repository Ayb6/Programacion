
package tercertrimestre;

import java.util.Scanner;


public class TercerTrimestre102 {
/*Crea un programa que pida al usuario una cadena de texto y un numero  entero N.
A continuación, el programa indicará el carácter de la cadena situado en la posición N.
En caso de que no se pueda realizar dicha acción debe mostrarse el mensaje: “No existe
la posición N en la cadena” (Siendo N el número indicado por el usuario).*/

    public static void main(String[] args) {
        String cadena;
        int n;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        cadena = teclado.nextLine();
        System.out.println("Introduzca un numero");
        n=teclado.nextInt();
        
    }

}
