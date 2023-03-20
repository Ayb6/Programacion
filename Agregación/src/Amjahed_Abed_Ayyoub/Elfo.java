package Amjahed_Abed_Ayyoub;

public class Elfo extends Heroe {

    public Elfo(String nombre) {
        super(nombre);
        super.inteligencia = (int) ((Math.random() * (15 - 7 + 1)) + 1);
        super.fuerza = (int) ((Math.random() * (14 - 5 + 1)) + 1);
        super.destreza = (int) ((Math.random() * (20 - 12 + 1)) + 1);
        super.muerto = false;
        super.vida = (int) ((Math.random() * (15 - 5 + 1)) + 1);
    }

    public void rapidez() {
        if (super.fuerza > 5) {
            super.destreza += 5;
            super.fuerza -= 5;
            System.out.println(super.nombre + " ha usado rapidez. Ahora su destreza es " + super.destreza + " su fuerza es " + super.fuerza);
        }
        else{
            System.out.println("No se ha podido usar rapidez");
        }
    }
    
    public void atacar(){
          //He dejado este metodo asi porque sino el programa me pita ya que me dice que la clase heroe es abstracta y tiene este metodo. Algo raro que no he podido solucionar.
    }
    
    public void atacar (Heroe defensor) {      //Creo el metodo atacar el cual realiza estos pasos si el defensor no esquiva 6
        if (!defensor.esquivar()) {
            if (defensor instanceof Guerrero) {
                ((Guerrero) defensor).vida -= super.fuerza;
            }
             if (defensor instanceof Mago) {
                ((Mago) defensor).vida-=super.fuerza/2;
            }
        }
    }

    @Override
    public boolean esquivar() {  //creo el metodo esquivar el cual nos permite esquivar si la destreza es mayor al numero aleatorio que generamos 
        int aleatorio = (int)((Math.random()*(50-4+1))+1);
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
