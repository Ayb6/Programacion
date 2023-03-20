
public class Array_ejercicio49 {

    public static void main(String[] args) {
        int[] lista = new int[100];
        int i;
        for (i = 0; i < lista.length; i++) {
            lista[i]=(int)(Math.random()*(100-1+1)+1);
            System.out.print(lista[i]+ " ");
        }        
        System.out.println("");
        int min=101;
        for (i = 0; i< lista.length; i++) {
            if (min>lista[i]) {
                min=lista[i];
            }
        }
        System.out.println(min);
    }

}
