/* 60.- Crea un programa que cree una matriz de 10x10 e introduzca los resultados de las
tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por
pantalla (en forma de matriz).*/

public class Ejercicio60_matriz {


    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                matriz[i][k]=i*k;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print(matriz[i][k]+" ");
            }
            System.out.println("");
        }
    }

}
