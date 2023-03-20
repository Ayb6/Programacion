/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ101;

/**
 *
 * @author usuario
 */
public class Bongo extends Percusion {

    int nCajas;
    boolean sintetico; //Si es false son naturales

    public Bongo(String marca, String fecha, Partitura P1, boolean tiene, int nCajas, boolean sinte) {
        super(marca, fecha, P1, tiene);
        if (nCajas < 2) {
            this.nCajas = 2;
        } else {
            this.nCajas = nCajas;
        }

        this.sintetico = sinte;

    }
    @Override
    public String afinar(){
    return "Se han afinado las "+nCajas*4+ " pernas de los bongos";
    }
    
    @Override
   public String tocarPartitura(){
    String res = "";
        if (!roto) {
            for (int i = 0; i < super.P1.numNotas(); i++) {
                switch (super.getPartitura().listaNotas[i].getValor()) {
                    case "DO":
                        res += "tom";
                        
                        break;
                    case "RE":
                        res += "tem";
                      
                        break;
                   case "MI":
                        res += "tim";
                        
                        break;
                    case "FA":
                        res += "tam";
                        
                        break;
                    case "SOL":
                        res += "totom";
                        
                        break;
                   case "LA":
                        res += "tatam";
                        
                        break;
                    default:
                        res += "tutim";
                        
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
   

}
