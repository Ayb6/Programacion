package Cafeteras;

public class Cafetera {

    int capacidadmaxima;
    int capacidadactual;
    int cafe;
    int servir;

    public Cafetera() {
        this.capacidadmaxima = 1000;
        this.capacidadactual = 0;
    }

    public void echarcafe(int cafe) {
        this.capacidadactual = cafe;
        System.out.println("se ha echado " + cafe + " cc de cafe");
        if (cafe > 1000) {
            this.capacidadactual = capacidadmaxima;
            System.out.println("se ha echado " + cafe + " cc de cafe");
        }

    }

    public void llenarcafetera() {
        if (capacidadactual >= capacidadmaxima) {
            System.out.println("Ya está llena");
        } else {
            this.capacidadactual = capacidadmaxima;
            System.out.println("se ha llenado la cafetera");
        }

    }

    public void vaciarcafetera() {
        if (capacidadactual <= 0) {
            System.out.println("Ya está vacia");
        } else {
            this.capacidadactual = 0;
            System.out.println("Se ha vaciado la cafetera");
        }

    }

    public void servirtaza(int servir) {
        if (capacidadactual<servir) {
            System.out.println("No se puede servir");
        } else{
            capacidadactual -= servir;
        System.out.println("Se ha servido " + servir + " cc de cafe");
        }

    }

    public void cantidadcafe() {
        System.out.println("Queda: " + capacidadactual + "cc de café en la cafetera");
    }
}
