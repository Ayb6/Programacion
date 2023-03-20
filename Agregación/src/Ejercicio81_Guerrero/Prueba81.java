package Ejercicio81_Guerrero;

public class Prueba81 {

    public static void main(String[] args) {
        arma armaM4 = new arma("Scar", 75, 35);
        Guerrero guerrero1 = new Guerrero("MikeTyson", 100, 80, 45, armaM4);
        Guerrero guerrero2 = new Guerrero("Floyd Mayweather", 100, 50, 85, armaM4);
        
        guerrero1.atacar(guerrero2);
        guerrero2.atacar(guerrero1);
    }

}
