package Amjahed_Abed_Ayyoub;

public class Pluma {
    //Especifico propiedades
    private double ancho;
    private double largo;
    private String color;
    
    //Creo constructor
    public Pluma(double ancho, double largo, String color){
        this.ancho=ancho;
        this.largo=largo;
        switch (color) { // Creo un Switch para que solo pueda entrar en color los 3 colores que se piden
            case "negro":
                this.color="negro";
                break;
            case "verde":
                this.color="verde";
                        break;
            default:
                this.color="blanco";
        }
    }
    
  
    //Creo metodo toString para representar la clase
    public String toString(){
        String res="";
        res+= "B ["+this.ancho+", "+this.largo+": "+this.color +"]";
        return res;
    }
}
