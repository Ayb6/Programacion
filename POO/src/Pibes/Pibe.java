/*
Queremos crear un juego en el que vamos a tener unas criaturas llamadas “Pibes”.
Para ello hay que crear una clase que represente estas criaturas.
De cada Pibe necesitamos guardar su nombre, sus puntos de esfuerzo, sus vidas totales,
sus puntos de hambre y su estado (vivo o muerto). Además, cada Pibe puede comer,
comunicarse, jugar y dormir.
De momento, las reglas que rigen  el juego son:
•El constructor sólo necesita el nombre del Pibe.
•Un Pibe empieza con 10 puntos de esfuerzo, 3 puntos de hambre, 7 vidas y,
obviamente, VIVO.
•Los valores de esfuerzo, hambre y vidas no pueden superar los valores iniciales.
•Al jugar gasta 3 puntos de esfuerzo y 1 de hambre.
•Al comunicarse gasta 1 punto de esfuerzo.
•Si come, gasta dos puntos de esfuerzo y gana dos de hambre. Pero si además
come su comida favorita, ganará 3 puntos de hambre.
•Al dormir gana 5 puntos de esfuerzo.
•Si los puntos de esfuerzo o de hambre llegan a cero, el Pibe perderá una vida y
volverá a vivir con los valores por defecto.
•Si el Pibe pierde todas las vidas, muere, todos sus atributos tomarán el valor -1 y
no podrá realizar ninguna acción .
 */
package Pibes;

public class Pibe {

    String nombre;
    int puntosesfuerzo;
    int vidas;
    int puntoshambre;
    boolean vivo;
    final int MAX_ESFUERZO = 10;
    final int MAX_HAMBRE = 3;

    public Pibe(String nombre) {
        this.nombre = nombre;
        this.puntosesfuerzo = MAX_ESFUERZO;
        this.puntoshambre = MAX_HAMBRE;
        this.vidas = 7;
        this.vivo = true;
    }

    public void jugar() {
        if (vivo) {
            System.out.println("El pibe está jugando");
            this.puntosesfuerzo -= 3;
            this.puntoshambre -= 1;
            //Llamo al metodo para comprobar si muere
            this.comprobarexistencia();
        } else {
            System.out.println("El pibe esta muerto");
        }

    }

    public void comuncarse() {
        if (vivo) {
            System.out.println("El pibe se está comunicando");
            this.puntosesfuerzo -= 1;
            this.comprobarexistencia();
        } else {
            System.out.println("El pibe está muerto");
        }

    }

    public void comer() {
        if (vivo) {
            System.out.println("El pibe está comiendo");
            this.puntosesfuerzo -= 2;
            this.comprobarexistencia();
            this.puntoshambre += 2;
            if (this.puntoshambre > MAX_HAMBRE) {
                this.puntoshambre = MAX_HAMBRE;
            }
        } else {
            System.out.println("El pibe está muerto");
        }

    }

    public void dormir() {
        if (vivo) {
            System.out.println("El pibe está durmeindo");
            this.puntosesfuerzo += 5;
            if (this.puntosesfuerzo > MAX_ESFUERZO) {
                this.puntosesfuerzo = MAX_ESFUERZO;
            }
        } else {
            System.out.println("El pibe está muerto");
        }

    }
    
    public String toString(){
        String res;
        
        res=this.nombre+"\n";
        res+="Esfuerzo: "+this.puntosesfuerzo+" Hambre: "+ this.puntoshambre+" Vidas: "+this.vidas;
        res+="\n";
        if (this.vivo) {
            res+="Esta vivo";
        }
        else{
            res+="Esta muerto";
        }
        return res;
        
    }
    
    
    public void comprobarexistencia() {
        if (this.puntosesfuerzo <= 0 || this.puntoshambre <= 0) {
            this.vidas -= 1;
            if (this.vidas <= 0) {
                System.out.println("El pibe ha muerto");
                this.vivo = false; //Ha muerto
                this.puntosesfuerzo = -1;
                this.puntoshambre = -1;
                this.vidas = -1;
            } else {
                this.puntosesfuerzo = MAX_ESFUERZO;
                this.puntoshambre = MAX_HAMBRE;
            }

        }
    }

}
