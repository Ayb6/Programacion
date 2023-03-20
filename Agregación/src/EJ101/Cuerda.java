
package EJ101;

public abstract class Cuerda extends Instrumento {
    int nCuerdas;
    boolean pulsada; //Si no es pulsada es percutida
    
    public Cuerda(String marca, String fecha, Partitura P1,int nCuerdas, boolean pulsada){
    super(marca, fecha, P1);
    if(nCuerdas<1){
    this.nCuerdas=1;
    }
    else{
    this.nCuerdas=nCuerdas;
    }
    this.pulsada=pulsada;
    }

    @Override
    public abstract String tocarPartitura();
    
    @Override
    public abstract String pararDeTocar();
    
    public abstract String afinar();
}
