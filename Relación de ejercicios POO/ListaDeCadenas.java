
import java.util.Arrays;

public class ListaDeCadenas {

    private String[] lista;
    private final int size;
    private int siguienteVacio;

    public ListaDeCadenas(int size) {
        lista = new String[size];
        this.size = size;
        siguienteVacio = 0;
        Arrays.fill(lista, "");
    }

    public void aniadir(String elemento) {
        if (actualizarSiguienteVacio()) {
            lista[siguienteVacio] = elemento;
            actualizarSiguienteVacio();
        } else {
            System.out.println("Error: No se puede meter");
        }
    }

    public void aniadir(String elemento, int pos) {
        if (pos >= 0 && pos <= size - 1) {
            lista[pos] = elemento;
            actualizarSiguienteVacio();
        } else {
            System.out.println("Error: No existe la posicion");
        }
    }

    private boolean actualizarSiguienteVacio() {
        for (int i = 0; i < size; i++) {
            if (lista[i].equals("")) {
                siguienteVacio = i;
                return true;
            }
        }
        return false;
    }

    public int tamanio() {
        int tam = 0;
        for (int i = 0; i < size; i++) {
            if (!lista[i].equals("")) {
                tam++;
            }
        }
        return tam;
    }

    public boolean vacia() {
        for (int i = 0; i < size; i++) {
            if (!lista[i].equals("")) {
                return false;
            }
        }
        return true;
    }

    public String obtener(int pos) {
        if (pos >= 0 && pos <= size - 1) {
            return lista[pos];
        } else {
            System.out.println("Error: No existe la posicion");
            return null;
        }
    }

    public int buscar(String elemento) {
        for (int i = 0; i < size; i++) {
            if (lista[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void borrar() {
        Arrays.fill(lista, "");
        actualizarSiguienteVacio();
    }

    public void borrar(String elemento) {
        int pos = buscar(elemento);
        if (pos != -1) {
            lista[pos] = "";
            actualizarSiguienteVacio();
        } else {
            System.out.println("No se puede borrar nada");
        }
    }

    public String[] trozo(int pos1, int pos2) {
        // Ordeno ascendentemente
        if (pos1 > pos2) {
            int aux = pos2;
            pos2 = pos1;
            pos1 = aux;
        }
        if (pos1 < 0 || pos2 >= size - 1) {
            String[] res = {};
            return res;
        } else {
            String[] res = new String[pos2 - pos1 + 1];
            for (int i = 0; i < res.length; i++) {
                res[i] = lista[pos1 + i];
            }
            return res;
        }
    }

}
