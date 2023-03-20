package Persona;

public class Persona {

    String nombre;
    int edad;
    boolean sexo;
    String pais;
    boolean mayor;

    public Persona(String nombre, int edad, boolean sexo, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
    }

    public void saludar() {
        System.out.println("Hola! Me llamo " + nombre + " y soy de " + pais);
    }

    public void mostrardatos() {
        System.out.println(toString());
    }

    public void esmayoredad() {
        if (edad >= 18) {
            mayor = true;
        } else {
            mayor = false;
        }
    }

    public void saludar(int num) {
        switch (num) {
            case 1:
                System.out.println("Hola!1");
                break;
            case 2:
                System.out.println("Hola!2");
                break;
            case 3:
                System.out.println("Hola!3");
                break;
            default:
                System.out.println("No te llevas ningun saludo por no poner un numero entre 1 y 3");
        }
    }

    public String toString() {
        String res;

        res = this.nombre + "\n";
        res += "Edad: " + this.edad + " Sexo: " + this.sexo + " Pais: " + this.pais;
        if (this.edad >= 18) {
            res += " y es mayor de edad";
        } else {
            res += " y es menor de edad";
        }
        res += "\n";

        return res;

    }

}
