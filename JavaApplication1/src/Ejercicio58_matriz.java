
import java.util.Scanner;

/* 58.-   Realizar   un   programa   que   pida   al   usuario   un   numero   N   entre   3   y   5   y,   a
continuación, cree una matriz NxN (N filas, N columnas) cuyos elementos se le van a ir
pidiendo al usuario.*/ 

public class Ejercicio58_matriz {


    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n;
        do {            
            System.out.println("Introduce numero entre 3 y 5");
            n=teclado.nextInt();
        } while (n<3||n>5);
        int array [][] =new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.println("Introduce numero");
                array [i][k]=teclado.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k]+" ");
            }
            System.out.println("");
        }
        teclado.close();
    }

}
