

package Practicando_Composicion;


public class Arma2 {
    private String nombre;
    private int resistencia;
    private int poder;
    
    public Arma2 (String nombre, int resistencia, int poder){
        this.nombre=nombre;
        this.resistencia=resistencia;
        this.poder=poder;
    }
    
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getResistencia(){
        return this.resistencia;
    }
    public int getPoder(){
        return this.poder;
    }
    
    //Setter
    public void setResistencia(int nuevo){
        this.resistencia=nuevo;
    }
    
    public String toString(){
        String res="";
        res+="El nombre del arma es "+nombre+", su resistencia es "+resistencia+" y su poder es "+poder;
        return res;
    }
}
