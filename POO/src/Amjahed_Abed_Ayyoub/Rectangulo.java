

package Amjahed_Abed_Ayyoub;


public class Rectangulo {
    //Establezco propiedades(privadas)
    private double base;
    private double altura;
    
    //Creo constructor
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    //Establezco método para calcular el area
    public double calcularArea(){
        double area;
        area=base*altura;
        return area;
    }
    //Establezco método para calcular el perímetro
    public double calcularPerimetro(){
        double perimetro;
        perimetro= 2*(base+altura);
        return perimetro;
    }
    
   //Creo el método toString que representa la clase
    public String toString(){
        String res="";
        res+="Rectángulo con base "+base+" y altura "+altura+"\n";
        res+= "Area: "+calcularArea()+"\n";
        res+="Perimetro: "+calcularPerimetro();
        return res;
    }
}
