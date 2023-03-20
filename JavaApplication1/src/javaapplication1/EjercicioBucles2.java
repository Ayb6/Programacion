
package javaapplication1;

import java.util.Scanner;
public class EjercicioBucles2 {


    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        int menor, mayor, aux1, aux2, suma = 0;

        System.out.print("Mete el mayor: ");
        mayor = t.nextInt();
        System.out.print("Mete el menor: ");
        menor = t.nextInt();

        aux1 = menor;
        aux2 = menor;

        while (aux1 <= mayor) {
            System.out.print(aux1+" ");
            suma += aux1;
            aux1++;
        }
        System.out.println("\n------------------------------------------------");
        while (aux2 <= mayor) {
            if (aux2 % 2 == 0) {
                System.out.print(aux2+" ");
            }
            aux2++;
        }
        System.out.println("\n------------------------------------------------");
        System.out.println("La suma es " + suma);
    }

}
