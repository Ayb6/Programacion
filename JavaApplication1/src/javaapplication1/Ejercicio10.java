
package javaapplication1;

import java.util.Scanner;
public class Ejercicio10 {


    public static void main(String[] args) {
    String usuario, contraseña;
    int contador=1;
    final int MAXIMO=3;
    
    Scanner teclado=new Scanner(System.in);
    System.out.println("Ingrese el usuario");
    usuario=teclado.nextLine();
    System.out.println("Ingrese la contraseña");
    contraseña=teclado.nextLine();
    
        while (!usuario.equals("albertoj36")&&(!contraseña.equals("medacAlberto"))&&(contador<=MAXIMO)){
            System.out.println("contraseña o usuario incorrectos, llevas "+contador+ " intentos");
            System.out.println("Usuario");
            usuario=teclado.nextLine();
            System.out.println("Contraseña");
            contraseña=teclado.nextLine();
            contador++;            
        }
        if (contador<=MAXIMO) {
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("Ha superado el numero maximo de intentos");
        }
    }

}
