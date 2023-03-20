/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ101;

/**
 *
 * @author usuario
 */
public abstract class Percusion extends Instrumento {

    boolean baquetas;

    public Percusion(String marca, String fecha, Partitura P1, boolean baquetas) {
        super(marca, fecha, P1);
        this.baquetas = baquetas;
    }

    @Override
    public abstract String tocarPartitura();

    @Override
    public abstract String pararDeTocar();
    

    public abstract String afinar();
}
