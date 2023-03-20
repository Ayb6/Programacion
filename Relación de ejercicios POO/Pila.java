
public class Pila {

    private int[] numeros;
    private int indiceCima;

    public Pila(int size) {
        numeros = new int[size];
        indiceCima = -1;
    }

    public void insertar(int elemento) {
        if (!llena()) {
            numeros[indiceCima + 1] = elemento;
            indiceCima++;
        } else {
            System.out.println("Error: No se puede insertar. Pila llena");
        }
    }

    public int cima() {
        if (!vacia()) {
            return numeros[indiceCima];
        }
        return Integer.MAX_VALUE;
    }

    public int extraer() {
        if (!vacia()) {
            indiceCima--;
            return numeros[indiceCima + 1];
        }
        return Integer.MAX_VALUE;
    }

    public boolean vacia() {
        return indiceCima == -1;
    }

    public boolean llena() {
        return indiceCima == numeros.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila: [");
        for (int i = 0; i <= indiceCima; i++) {
            sb.append(numeros[i]).append(" ");
        }
        sb.append("]");

        return sb.toString();
    }
}
