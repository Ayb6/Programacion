package javaapplication1;

import java.util.Scanner;

public class Ejercicio14 {


    public static void main(String[] args) {
        
        double segundos;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el número de segundos transcurridos");
        segundos=teclado.nextDouble();
        
        System.out.println("En el segundo "+segundos+" nos encontramos en el minuto " + segundos/59); 
            
    }

}
