package Practicando;

public class Coche {

    String color;
    int anchura;
    int altura;
    int npuertas;
    int nruedas;
    boolean arrancado = false;
    int gasolina;
    int litros;
    boolean chequeado;

    //Constructor
    public Coche(String color, int anchura, int altura, int npuertas) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.npuertas = npuertas;
        this.gasolina = 30;

        this.nruedas = 4;
    }

    //metodos
    public void arrancar() {
        
            if (this.gasolina >= 5) {
                if (this.arrancado) {
                    System.out.println("el coche ya esta arrancado");
                } else {
                    System.out.println("el coche se ha arrancado");
                    this.arrancado = true;
                    this.gasolina -= 5;
                }
            }
        else {
            System.out.println("El coche no tiene suficiente gasolina para arrancar");
        }
    }

    public void parar() {
        if (this.arrancado) {
            System.out.println("el coche ha frenando");
            this.arrancado = false;
        } else {
            System.out.println("el coche no puede parar porque no está arrancado");
        }
    }

    public void desplazarse() {
        if (this.gasolina > 20) {
            if (this.arrancado) {
                System.out.println("el coche se está desplazando");
                this.gasolina -= 20;
            } else {
                System.out.println("el coche no puede desplazarse porque no está arrancado");
            }
        } else {
            System.out.println("el coche no tiene suficiente gasolina para desplazarse");
        }
    }

    public void echargasolina(int litros) {
        if (this.arrancado) {
            System.out.println("Para echar gasolina el coche no puede estar arrancado");
        } else {
            System.out.println("echando gasolina");
            gasolina += litros;
        }
    }

    public void chequear() {
        if (gasolina > 0) {
            chequeado = true;
            System.out.println("El coche tiene gasolina");
        } else {
            chequeado = false;
            System.out.println("El coche no tiene gasolina");
        }
    }
}
