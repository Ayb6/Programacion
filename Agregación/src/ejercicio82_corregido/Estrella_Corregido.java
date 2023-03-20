
package ejercicio82_corregido;

public class Estrella_Corregido {

    private int x;
    private int y;
    private char forma;

    public Estrella_Corregido(int x, int y) {
        this.x = x;
        this.y = y;

        //Decidimos la forma
        int alf = (int) (Math.random() * 4);
        if (alf == 1) {
            this.forma = '*';
        }
        else{
            this.forma = '.';
        }
    }
    
    public String toString(){
        return this.forma+"";
    }
}
