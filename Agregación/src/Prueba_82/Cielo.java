package Prueba_82;

public class Cielo {

    private int Nfilas;
    private int Ncolumnas;
    private Estrella[][] fondo;

    public Cielo(int Nfilas, int Ncolumnas) {
        fondo = new Estrella[Nfilas][Ncolumnas];

    }

    public void colocarestrellas(int estrellasAcolocar) {
        int posicionAleatoria1;
        int posicionAleatoria2;
        int estrellascolocadas = 0;
        while (estrellascolocadas < estrellasAcolocar) {
            posicionAleatoria1= (int) (Math.random() * fondo.length);
            posicionAleatoria2 = (int) (Math.random() * fondo[0].length);
            if (fondo[posicionAleatoria1][posicionAleatoria2] == null) {
                fondo[posicionAleatoria1][posicionAleatoria2] = new Estrella(posicionAleatoria1, posicionAleatoria2);
                estrellascolocadas++;
            }

        }
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < fondo.length; i++) {
            for (int j = 0; j < fondo[i].length; j++) {
                if (fondo[i][j] == null) {
                    res += " ";
                } else {
                    res += fondo[i][j].toString();
                }
            }
            res += "\n";
        }
        return res;
    }
}
