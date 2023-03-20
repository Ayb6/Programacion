
public class Array_ejercicio1 {

    public static void main(String[] args) {

        int[] lista = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * (23 - 10 + 1)) + 10);
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }

}
