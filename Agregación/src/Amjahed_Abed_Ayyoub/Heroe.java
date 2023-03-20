

package Amjahed_Abed_Ayyoub;


public abstract class Heroe {
    protected String nombre; //Establezco propiedades del heroe
    protected int inteligencia;
    protected int fuerza;
    protected boolean muerto;
    protected int destreza;
    protected int vida;
    
    public Heroe(String nombre){ //Creo el constructor del heroe
        this.nombre=nombre;
        this.inteligencia=0;
        this.fuerza=0;
        this.muerto=false;
        this.destreza=0;
        this.vida=0;
    }
    
    public abstract void atacar(); //Creo los metodos abstractos
    
    public abstract boolean esquivar(); 
    
    public String toString (){ //Creo el metodo toString
        String res="";
        res+="Nombre: " +this.nombre+"\n";
        res+="Inteligencia "+this.inteligencia+"\n";
        res+="Fuerza "+this.fuerza+"\n";
        res+="Destreza "+this.destreza+"\n";
        res+="Vida "+this.vida+"\n";
        return res;
    }
}
