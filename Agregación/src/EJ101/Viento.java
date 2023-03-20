
package EJ101;

public abstract class Viento extends Instrumento{
    boolean metal; //Si es false es madera.
    public Viento(String marca, String fecha, Partitura P1, boolean metal){
        super(marca, fecha, P1);
        this.metal=metal;
}

    @Override
    public abstract String tocarPartitura();


    @Override
    public abstract String pararDeTocar();
    
    public abstract String afinar();

}
