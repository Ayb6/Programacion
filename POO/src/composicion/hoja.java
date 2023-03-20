package composicion;

public class hoja {

    String color;
    double ancho;
    double largo; 
    String colores []= {"verde","amarillo","marron"};

    public hoja(double ancho, double largo) {
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        int posAle= (int)(Math.random()*this.colores.length);
        this.color=this.colores[posAle];
        
    }

    public void crecer() {
        this.ancho = this.ancho * 1.0255;
        this.largo = this.largo * 1.0253;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Hoja(" + "color=" + color + ", ancho= " + ancho + ", largo=" + largo + ")";
        return res;
    }
}
