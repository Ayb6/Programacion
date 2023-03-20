package Ejercicio81_Guerrero;

public class Guerrero {

    private String nombre;
    private int saludMax;
    private int ataque;
    private int escudo;
    private int saludActual;
    private boolean muerto;
    private arma gun;
    private int nivel;
    private int expActual;
    private int siguienteNivel;

    public Guerrero(String nombre, int salud, int ataque, int escudo, arma weapon) {
        this.nombre = nombre;
        this.saludMax = salud;
        this.ataque = ataque;
        this.escudo = escudo;
        this.saludActual = this.saludMax;
        this.muerto = false;
        this.gun = weapon;
        this.nivel=1;
        this.expActual=0;
        this.siguienteNivel=(int)Math.ceil(this.nivel*10+this.nivel*1.5);
    }

    public int atacar() {
        if (muerto) {
            System.out.println("El guerrero está muerto ");
            return 0;
        } else {
            return this.ataque + this.gun.getpoder();
        }
    }

    public void atacar(Guerrero defensor) {
        if (!this.muerto) {
            int hostion;
            if (this.gun.getresistencia() > 0) {
                hostion = (this.ataque + this.gun.getpoder()) - defensor.escudo;
                defensor.saludActual -= hostion;
                this.expActual +=3;
                //Compruebo que el daño es positivo
                if (hostion > 0) {
                    defensor.saludActual -= hostion; //meto la hostia
                }
                //Veo si he matado al defensor
                if (defensor.saludActual <= 0) {
                    defensor.muerto = true;
                }
                //Quito resistencia al arma
                int kaka = this.gun.getresistencia();
                kaka--;
                this.gun.setresistencia(kaka);

                //this.gun.setResistencia(this.weapon.getresistencia()-1)
            } else {
                hostion = this.ataque - defensor.escudo;
                this.expActual +=5;
            }
        } else {
            System.out.println("El guerrero está muerto ");
        }
    }

    public void mejorarArma(String nombre) {
        if (this.gun.getnombre().equals(nombre)) {
            this.gun.subirNivel();
        }
    }

    public boolean subir(){
        if (this.expActual >= this.siguienteNivel) {
            return true;
        }
        else{
            return false;
        }
        //return this.expActual >= this.siguienteNivel;
    }
    
    public void subidaNivel (){
        this.nivel++;
        this.expActual = 0;
        this.siguienteNivel = (int)Math.ceil(this.nivel*10+this.nivel*1.5);
        this.ataque++;
        this.escudo++;
        this.saludMax += 10; 
   }
    
    public String toString() {
        String res = "";
        res = "El nombre es " + this.nombre;
        res += "La salud actual es " + this.saludActual;
        res += "El ataque es " + this.ataque;
        res += "El escudo es " + this.escudo;
        return res;
    }

}
