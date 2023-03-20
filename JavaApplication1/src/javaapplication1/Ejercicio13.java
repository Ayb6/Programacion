
package javaapplication1;

import java.util.Scanner;
public class Ejercicio13 {

    
    public static void main(String[] args) {
        double habitacionancho;
        double habitacionlargo;
        double baldosacentimetros;
        double preciobaldosa;
        
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese en metros el ancho de la habitación");
        habitacionancho=teclado.nextDouble();
        System.out.println("Ingrese en metros el largo de la habitación");
        habitacionlargo=teclado.nextDouble();
        System.out.println("Ingrese en centimetros el lado de la baldosa");
        baldosacentimetros=teclado.nextDouble();
        System.out.println("Ingrese en euros el precio de cada baldosa");
        preciobaldosa=teclado.nextDouble();
        
        System.out.println("El numero de baldosas total que hay que colocar es "+ (habitacionlargo/(baldosacentimetros/100)* habitacionancho/(baldosacentimetros/100)));
        System.out.println("El precio total a invertir es "+ (habitacionlargo/(baldosacentimetros/100)* habitacionancho/(baldosacentimetros/100))*preciobaldosa);
    }

}
