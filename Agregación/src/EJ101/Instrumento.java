
package EJ101;


public abstract class Instrumento {

    String marca;
    String fecha;
    Partitura P1;
    boolean roto;
    public Instrumento(String marca, String fecha, Partitura diablo) {
        this.marca = marca;
        this.fecha = fecha;
        this.P1 = diablo;
        roto=false;
    }

    public Instrumento(String marca, String fecha) {
        this.marca = marca;
        this.marca = fecha;
        roto=false;
        P1 = new Partitura("Desconocido", "Desconocido");
        for (int i = 0; i < (int) (Math.random() * 91 + 10); i++) {
            int nota = (int) (Math.random() * 7 + 1);
            int tiempo = (int) (Math.random() * 5 + 1);
            String nota2;
            switch (nota) {
                case 1:
                    nota2 = "DO";
                    break;
                case 2:
                    nota2 = "RE";
                    break;
                case 3:
                    nota2 = "MI";
                    break;
                case 4:
                    nota2 = "FA";
                    break;
                case 5:
                    nota2 = "SOL";
                    break;
                case 6:
                    nota2 = "LA";
                    break;
                default:
                    nota2 = "SI";
            }
            P1.addNota(new Nota(nota2, tiempo));
        }
    }

    public boolean aniadirNota() {
        boolean puede = false;
        if (P1.numNotas() < 100) {
            puede = true;
            int nota = (int) (Math.random() * 7 + 1);
            int tiempo = (int) (Math.random() * 5 + 1);
            String nota2;
            switch (nota) {
                case 1:
                    nota2 = "DO";
                    break;
                case 2:
                    nota2 = "RE";
                    break;
                case 3:
                    nota2 = "MI";
                    break;
                case 4:
                    nota2 = "FA";
                    break;
                case 5:
                    nota2 = "SOL";
                    break;
                case 6:
                    nota2 = "LA";
                    break;
                default:
                    nota2 = "SI";
            }
            P1.addNota(new Nota(nota2, tiempo));
        }

        return puede;
    }
   public abstract String tocarPartitura();
   public abstract String pararDeTocar();
   
   public Partitura getPartitura(){
   return P1;
   }
}
