
package javaapplication1;

import java.util.Random;
import java.util.Scanner;


public class IF25 {


    public static void main(String[] args) {
        String nick, email, contraseña;
        Random rnd=new Random();
        int numero;
        numero=rnd.nextInt(5000-1000)+1000;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su nick");
        nick=teclado.nextLine();
        System.out.println("Ingrese su email");
        email=teclado.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña=teclado.nextLine();
        if ((!nick.equals("h"))&&(!email.equals("b"))&&(!contraseña.equals("c"))) {
            System.out.println("error");
        }
        else  {         
            System.out.println(numero);
            System.out.println("ingrese el email");
            email=teclado.nextLine();
            while (!email.equals("b")) {
                 System.out.println("error");
                 System.out.println("Ingrese el email");
                 email=teclado.nextLine();
           }
            System.out.println("Ingrese contraseña");
            contraseña=teclado.nextLine();
             while(!contraseña.equals("c")) {
                 System.out.println("error");
                 System.out.println("Ingrese contraseña");
                 contraseña=teclado.nextLine();
            }
            System.out.println("Ingrese el numero que ha recibido");
            numero=teclado.nextInt();
            System.out.println("Verificación aceptada. Bienvenid@: "+ nick);   
            }
            }
        }           



