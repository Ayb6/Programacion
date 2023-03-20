/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ101;

/**
 *
 * @author usuario
 */
public class Piano extends Cuerda {
    private int teclas;
    private String tipo;
    
    public Piano(String marca, String fecha,Partitura P1, int nCuerdas, boolean pulsada, String tipo){
    super(marca, fecha, P1, nCuerdas, pulsada);
    this.teclas=(int)(Math.random()*40+49);
    this.tipo=tipo;
    }
    
    @Override
    public String afinar(){
        String res="";
    if(!roto){
    res="El piano no puede afinarse porque esta roto";
    }
    else{
        res="Se han tensado correctamente las "+this.nCuerdas+" del piano";
    }
    return res;
    }

    @Override
    public String tocarPartitura() {
        String res="";
        if(!roto){
        for(int i=0;i<super.P1.numNotas();i++){
        switch(super.getPartitura().listaNotas[i].getValor()){
            case "DO":
                for(int k=0; k<super.P1.listaNotas[i].getDuracion();i++){
                res+="ton ";
                }
                break;
                case "RE":
                for(int k=0; k<super.P1.listaNotas[i].getDuracion();i++){
                res+="ten ";
                }
                break;
                case "MI":
                for(int k=0; k<super.P1.listaNotas[i].getDuracion();i++){
                res+="tin ";
                }
                break;
                case "FA":
                for(int k=0; k<super.P1.listaNotas[i].getDuracion();i++){
                res+="tan ";
                }
                break;
                case "SOL":
                for(int k=0; k<super.P1.listaNotas[i].getDuracion();i++){
                res+="tun ";
                }
                break;
                case "LA":
                for(int k=0; k<super.P1.listaNotas[i].getDuracion();i++){
                res+="tean ";
                }
                break;
                default:
                for(int k=0; k<super.P1.listaNotas[i].getDuracion();i++){
                res+="tain";
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


    
    
    
}
