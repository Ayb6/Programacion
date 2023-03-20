package Pibes;

public class Test_pibe {

    public static void main(String[] args) {
        Pibe morales = new Pibe("Raul");
        
        morales.comprobarexistencia();
        
        morales.jugar();
        morales.comuncarse();
        morales.comer();

        System.out.println(morales);

        
    }

}
