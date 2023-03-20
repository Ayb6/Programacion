package Ejercicio81_Guerrero;

public class arma {

    private String nombre;
    private int resistencia;
    private int poder;
    private int nivel;

    public arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
        this.nivel = 1;
    }

    public void subirNivel() {
        this.nivel++;
        this.resistencia += 2;
        this.poder += 1;
    }

    public String getnombre() {
        return this.nombre;
    }

    public int getresistencia() {
        return this.resistencia;
    }

    public int getpoder() {
        return this.poder;
    }

    public void setresistencia(int nuevo) {
        this.resistencia = nuevo;
    }

    public String toString() {
        String res = "";
        res = "El nombre es " + this.nombre;
        res += "La resistencia actual es " + this.resistencia;
        res += "El poder es " + this.poder;
        return res;
    }

}
