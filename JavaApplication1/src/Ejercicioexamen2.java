
import java.util.Scanner;

public class Ejercicioexamen2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacion1, calificacion2, calificacion3, media;
        System.out.println("Introduce primera nota: ");
        calificacion1 = teclado.nextInt();
        System.out.println("Introduce segunda nota: ");
        calificacion2 = teclado.nextInt();
        System.out.println("Introduce tercera nota: ");
        calificacion3 = teclado.nextInt();
        media = (calificacion1 + calificacion2 + calificacion3) / 3;
        if (calificacion1 < 0 || calificacion1 > 10) {
            System.out.println("Error 1");
        } else if (calificacion2 < 0 || calificacion2 > 10) {
            System.out.println("error 2");
        } else if (calificacion3 < 0 || calificacion3 > 10) {
            System.out.println("error 3");
        } else if (media >= 0 && media <= 4) {
            System.out.println("la media es insuficiente");
        } else if (media == 5 || media == 6) {
            System.out.println("La media es suficiente");
        } else if (media == 7 || media == 8) {
            System.out.println("La media es notable");
        } else if (media == 9 || media == 10) {
            System.out.println("La media es sobresaliente");
        }
        {

        }
    }

}
