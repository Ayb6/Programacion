package Amjahed_Abed_Ayyoub;

public class Guerrero extends Heroe {

    public Guerrero(String nombre) {
        super(nombre);
        super.inteligencia = (int) ((Math.random() * (5 - 3 + 1)) + 1);
        super.fuerza = (int) ((Math.random() * (27 - 12 + 1)) + 1);
        super.destreza = (int) ((Math.random() * (8 - 2 + 1)) + 1);
        super.muerto = false;
        super.vida = (int) ((Math.random() * (20 - 8 + 1)) + 1);
    }

    public void furia() {
        if (vida > 6) {
            vida -= 6;
            super.fuerza += 5;
        }
    }
    
    public void atacar(){
          //He dejado este metodo asi porque sino el programa me pita ya que me dice que la clase heroe es abstracta y tiene este metodo. Algo raro que no he podido solucionar.
    }
    
    public void atacar (Heroe defensor) {             //Creo el metodo atacar el cual realiza estos pasos si el defensor no esquiva 
        if (!defensor.esquivar()) {
            if (defensor instanceof Elfo) {
                ((Elfo) defensor).vida -= super.fuerza/3;
            }
             if (defensor instanceof Mago) {
                ((Mago) defensor).vida-=super.fuerza/2;
            }
        }
    }

    @Override
    public boolean esquivar() { //creo el metodo esquivar el cual nos permite esquivar si la destreza es mayor al numero aleatorio que generamos 
        int aleatorio = (int)((Math.random()*(30-3+1))+1);
        boolean devuelve=false;
        if (aleatorio<super.destreza) {
            devuelve = true;
        }      
        return devuelve;
    }
    
    public String toString (){
        String res ="";
        res += super.toString();
        return res;
    }
}
