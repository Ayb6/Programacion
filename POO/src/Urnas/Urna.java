
public class Urna {

    private int blancas;
    private int negras;

    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    public int totalBolas() {
        return blancas + negras;
    }

    public char extraerBola() {
        if (((int) (Math.random() * totalBolas() + 1)) <= blancas) {
            blancas--;
            return 'b';
        } else {
            negras--;
            return 'n';
        }
    }

    public void meterBola(char color) {
        switch (color) {
            case 'b':
                blancas++;
                break;
            case 'n':
                negras++;
                break;
            default:
                System.out.println("Error: Color invalido.");
        }
    }

    public int getBlancas() {
        return blancas;
    }

    public int getNegras() {
        return negras;
    }
}
