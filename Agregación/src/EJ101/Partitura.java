
package EJ101;


public class Partitura {

    private String nombre;
    private String autor;
    protected Nota[] listaNotas;

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        listaNotas = new Nota[100];
        for (int i = 0; i < listaNotas.length; i++) {
            listaNotas[i] = null;
        }
    }

    public int numNotas() {
        int cont = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] != null) {
                cont++;
            }
        }
        return cont;
    }

    public boolean addNota(Nota nueva) {
        boolean added = false;
        if (nueva.getValor().equalsIgnoreCase("DO") || nueva.getValor().equalsIgnoreCase("RE") || nueva.getValor().equalsIgnoreCase("MI") || nueva.getValor().equalsIgnoreCase("FA") || nueva.getValor().equalsIgnoreCase("SOL") || nueva.getValor().equalsIgnoreCase("LA") || nueva.getValor().equalsIgnoreCase("SI")) {
            for (int i = 0; i < listaNotas.length; i++) {
                if (listaNotas[i] == null) {
                    listaNotas[i] = nueva;
                    added = true;
                }
            }
        }
        return added;
    }

    public String toString() {
        String res = "";
        res += this.nombre + " de " + this.autor + "\n";
        for (int i = 0; i > listaNotas.length; i++) {
            res += listaNotas[i].toString();
            if (i % 10 == 0) {
                res += "\n";
            }
        }
        return res;
    }
}
