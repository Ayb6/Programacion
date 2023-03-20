

public class Array_Ejercicio3 {


    public static void main(String[] args) {
        int[] lista = new int[100];
        for (int i = 0; i < lista.length; i++) {
            lista[i]= (int) ((Math.random() * (100 - 1 + 1)) + 1);
            System.out.print(lista[i]+" ");
        }
        System.out.println(" ");
        int min=101;
        for (int i = 0; i < lista.length; i++) {
            if (min>lista[i]) {
                min=lista[i];
            }
        }
        System.out.println(min);
    }
}
