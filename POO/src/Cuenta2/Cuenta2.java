package Cuenta2;

public class Cuenta2 {

    private String titular;
    private int cantidad;

    public Cuenta2(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public Cuenta2(String titular, int cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public void ingresar(int DineroIngresado){
        if (DineroIngresado>0) {
            this.cantidad+=DineroIngresado;
            System.out.println("Se ha ingresado el dinero en la cuenta de "+this.titular);
        }
        else{
            System.out.println("La cantidad introducida es negativa");
        }
    }
    
    public void retirar(int DineroRetirado){
        if (DineroRetirado<=cantidad) {
            this.cantidad-=DineroRetirado;
            System.out.println("Se ha retirado el dinero en la cuenta de "+this.titular);
        }
        else{
            System.out.println("Error");
        }
    }
    
    @Override
    public String toString(){
        String res="";
        res+="Esta cuenta pertenece a "+titular+" y posee actualmente una cantidad de "+cantidad+" €";
        return res;
    }
    
    public String gettitular(){
        return this.titular;
    }
    public int getcantidad(){
        return this.cantidad;
    }
    
    public void settitular(String titular){
        this.titular=titular;
    }
    public void setcantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    

}
