
package Practicando_Composicion;


public class Prueba_Guerra2 {


    public static void main(String[] args) {
        
        Arma2 Scar;
        Scar=new Arma2("Scarache", 85, 52);
        Guerrero2 luchador=new Guerrero2("Floyd Mayweather", 95, 65, 95, Scar);
        Arma2 AK= new Arma2("AK-47", 90, 45);
        Guerrero2 luchado2=new Guerrero2("Gervonta Davis", 85, 80, 85, AK);
        
        
    }

}
