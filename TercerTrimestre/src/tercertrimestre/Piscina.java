
package tercertrimestre;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) {
        if (nivel-cantidad<=0) {
            throw new ArithmeticException("No se puede quitar agua");
        }
        
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) {
        if (nivel+cantidad>=MAXNIVEL) {
            throw new ArithmeticException("No se puede poner agua");
        }
        this.nivel += cantidad;
    }
}
