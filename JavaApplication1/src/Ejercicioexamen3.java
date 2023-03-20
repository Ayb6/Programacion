
import java.util.Scanner;

public class Ejercicioexamen3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas, aux1, aux2;
        System.out.println("Introduzca el numero de horas trabajadas durante la semana: ");
        horas = teclado.nextInt();
        if (horas <= 40) {
            System.out.println("El sueldo semanal es de: " + horas * 12 + " euros");
        } else {
            aux1=40*12;
            aux2=(horas-40)*16;
            System.out.println("El sueldo semanal es de: " + (aux2+aux1)+" euros");
        }
        teclado.close();
    }
    
}