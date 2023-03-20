
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class IF24 {


    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in) ;
        String user1, user2;
        Random rnd=new Random();
        int dado1, dado2;
        
        System.out.println("Nombre del jugador 1");
        user1=teclado.nextLine();
        System.out.println("Nombre del jugador 2");
        user2=teclado.nextLine();
        dado1=rnd.nextInt(7-1)+1;
        dado2=rnd.nextInt(7-1)+1;
        System.out.println(user1+" lanza el dado y aparece un  "+dado1);
        System.out.println(user2+ " lanza el dado y aparece un  "+dado2);

        
        
        
    }

}
