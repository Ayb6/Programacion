package Practicando_Composicion;

public class Guerrero2 {

    private String nombre;
    private int saludMaxima;
    private int ataque;
    private int escudo;
    private int saludActual;
    private Arma2 weapon;
    private boolean muerto;

    public Guerrero2(String nombre, int salud, int ataque, int escudo, Arma2 gun) {
        this.nombre = nombre;
        this.saludMaxima = salud;
        this.ataque = ataque;
        this.escudo = escudo;
        this.saludActual = saludMaxima;
        this.weapon = gun;
    }

    public int atacar() {
        if (muerto) {
            System.out.println("El guerrero está muerto");
            return 0;
        } else {
            return this.ataque + this.weapon.getPoder();
        }
    }

    public void atacar(Guerrero2 defensor) {
        if (!muerto) {
            //Compruebo la resistencia del arma
            if (this.weapon.getResistencia() > 0) { //Si el arma tiene resistencia, se usa
                defensor.saludActual -= (this.ataque + this.weapon.getPoder()) - defensor.escudo;
            }
            else{ //No se usará el arma en el ataque
                defensor.saludActual -= this.ataque  - defensor.escudo;
            }
            // Compruebo la salud del defensor
            if (defensor.saludActual <= 0) {
                muerto = true;
            } else {
                muerto = false;
            }
            
            //Quito un punto a la resistencia del arma           
            int resistenciaArma = this.weapon.getResistencia();
            resistenciaArma--;
            this.weapon.setResistencia(resistenciaArma);
            //this.gun.setResistencia(this.weapon.getresistencia()-1)

        } else {
            System.out.println("El guerrero está muerto");
        }
    }
}
