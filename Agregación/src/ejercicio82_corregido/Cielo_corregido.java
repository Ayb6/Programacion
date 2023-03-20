package ejercicio82_corregido;

public class Cielo_corregido {
//array bidimensional de objetos 

    private Estrella_Corregido estrellitas[][];

    public Cielo_corregido(int nfilas, int ncolumnas) {

        //CREANDO EL ARRAY ESTRELLA 
        this.estrellitas = new Estrella_Corregido[nfilas][ncolumnas];

        for (int i = 0; i < estrellitas.length; i++) {
            for (int j = 0; j < estrellitas[i].length; j++) {
                estrellitas[i][j] = null;
            }
        }
    }

    public void ponerEstrellas(int nestrellas) {

        //int tamTotal = this.estrellitas.length * this.estrellitas[0].length;
        for (int i = 0; i < nestrellas; i++) {
            int xAle = (int) (Math.random() * this.estrellitas.length);
            int yAle = (int) (Math.random() * this.estrellitas[0].length);
            if (this.estrellitas[xAle][yAle] == null) {
                this.estrellitas[xAle][yAle] = new Estrella_Corregido(xAle, yAle);
            } else {
                i--;
            }
        }
    }

    public String toString() {
        String salida = "";
        for (int i = 0; i < this.estrellitas.length; i++) {
            for (int j = 0; j < this.estrellitas[i].length; j++) {
                if (estrellitas[i][j] == null) {
                    salida += " ";
                } else {
                    salida += estrellitas[i][j].toString();
                }
                salida+="\n";
            }
        }
        return salida;
    }
}
