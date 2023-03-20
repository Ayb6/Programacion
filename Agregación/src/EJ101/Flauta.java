
package EJ101;

public class Flauta extends Viento {

    private boolean travesera; //Si es false es dulce.
    private String lengueta;

    public Flauta(String marca, String fecha, Partitura P1, boolean metal, boolean trave, String leng) {
        super(marca, fecha, P1, metal);
        this.travesera = trave;
        this.lengueta = leng;
    }

    public void cambiarLengueta(String nueva) {
        if (nueva.equalsIgnoreCase("plastico") || nueva.equalsIgnoreCase("madera") || nueva.equalsIgnoreCase("metal")) {
            this.lengueta = nueva;
        } else {
            System.out.println("La legueta no se ha podido cambiar porque no es de ningun de los 3 tipos que hay.");
        }
    }

    @Override
    public String tocarPartitura() {
        String res = "";
        if (!roto) {
            for (int i = 0; i < super.P1.numNotas(); i++) {
                switch (super.getPartitura().listaNotas[i].getValor()) {
                    case "DO":
                        res += "flo";
                        for (int k = 0; k < super.P1.listaNotas[i].getDuracion(); i++) {
                            res += "*";
                        }
                        break;
                    case "RE":
                        res += "fle";
                        for (int k = 0; k < super.P1.listaNotas[i].getDuracion(); i++) {
                            res += "*";
                        }
                        break;
                   case "MI":
                        res += "fli";
                        for (int k = 0; k < super.P1.listaNotas[i].getDuracion(); i++) {
                            res += "*";
                        }
                        break;
                    case "FA":
                        res += "fla";
                        for (int k = 0; k < super.P1.listaNotas[i].getDuracion(); i++) {
                            res += "*";
                        }
                        break;
                    case "SOL":
                        res += "flon";
                        for (int k = 0; k < super.P1.listaNotas[i].getDuracion(); i++) {
                            res += "*";
                        }
                        break;
                   case "LA":
                        res += "flan";
                        for (int k = 0; k < super.P1.listaNotas[i].getDuracion(); i++) {
                            res += "*";
                        }
                        break;
                    default:
                        res += "flin";
                        for (int k = 0; k < super.P1.listaNotas[i].getDuracion(); i++) {
                            res+="*";
                        }
                        break;
                }
            }
        }
        return res;
    }

    @Override
    public String pararDeTocar() {
        return "Has parado de tocar el instrumento";
    }

    @Override
    public String afinar() {
        String tipo = "";
        if (travesera) {
            tipo = "travesera";
        } else {
            tipo = "dulce";
        }
        return "Se ha usado una baqueta para afinar correctamente la flauta tipo " + tipo + " con un tipo de lengueta " + this.lengueta;

    }

}
