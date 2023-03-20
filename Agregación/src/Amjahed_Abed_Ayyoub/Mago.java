

package Amjahed_Abed_Ayyoub;


public class Mago extends Heroe{ 
    public Mago (String nombre){ 
        super(nombre); //Creo el constructor, le doy valores aleatorios a las propiedades
        super.inteligencia = (int)((Math.random()*(22-12+1))+1);
        super.fuerza= (int)((Math.random()*(10-5+1))+1);
        super.destreza= (int)((Math.random()*(12-5+1))+1);
        super.muerto=false;
        super.vida = (int)((Math.random()*(12-2+1))+1);
    }
    
    public void curarse (){ //Creo el metodo curarse el cual añade 3 de vida unicamente si la vida +3 es menor a la vida actual
        if (vida+3<vida) {
            super.vida+=3;
            System.out.println(super.nombre+ " se ha curado 3 puntos");   
        }
    }
    
    public void atacar(){
        //He dejado este metodo asi porque sino el programa me pita ya que me dice que la clase heroe es abstracta y tiene este metodo. Algo raro que no he podido solucionar.
    }
    
    public void atacar (Heroe defensor) {    //Creo el metodo atacar el cual realiza estos pasos si el defensor no esquiva 
        if (!defensor.esquivar()) {
            if (defensor instanceof Elfo) {
                ((Elfo) defensor).vida -= super.fuerza/3;
            }
             if (defensor instanceof Guerrero) {
                ((Guerrero) defensor).vida-=super.fuerza;
            }
        }
    }
    
    @Override //creo el metodo esquivar el cual nos permite esquivar si la destreza es mayor al numero aleatorio que generamos 
    public boolean esquivar(){
        int aleatorio = (int)((Math.random()*(40-2+1))+1);
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
