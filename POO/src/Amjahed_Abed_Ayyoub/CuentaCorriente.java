package Amjahed_Abed_Ayyoub;

public class CuentaCorriente {
    //Establezco propiedades(privadas)
    private double saldo;
    private double limite;
    private String nombre;
    private String dni;
    protected String banco; 

    //Creo constructor
    public CuentaCorriente(String nombre, String dni) {
        this.saldo = 0;
        this.limite = 100;
        this.nombre = nombre;
        this.dni = dni;
        this.banco="Sr Hormiga Bank";
    }
    //Sobrecarga
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.limite = 0;
        this.nombre = "Sin datos";
        this.dni = "Sin datos";
    }
    
    public CuentaCorriente(double saldo, double limite, String dni) {
        this.saldo = saldo;
        this.limite = limite;
        this.nombre = "Sin datos";
        this.dni = dni;
    }
    
    public CuentaCorriente(CuentaCorriente cuenta_corriente){
        this.saldo=cuenta_corriente.saldo;
        this.limite=cuenta_corriente.limite;
        this.nombre=cuenta_corriente.nombre;
        this.dni=cuenta_corriente.dni;
        this.banco=cuenta_corriente.banco;
    }
    
    //Creo el método para sacar dinero el cual sacará dinero SOLO si la cantidad de dinero que se quiere sacar es menos que la suma del saldo mas el límite.
    public double sacarDinero(double dineroSacado) {
        double saldoTotal = this.saldo + this.limite;
        if (dineroSacado <= saldoTotal) {
            this.saldo -= dineroSacado;
            return saldo;
        } else {
            return 0;
        }
    }
    
    //Creo el método ingresar dinero el cual devolverá el saldo mas la cantidad de dinero ingresada, UNICAMENTE si esta cantidad ingresada es positiva.
    public double ingresarDinero(double dineroIngresado) {
        if (dineroIngresado > 0) {
            saldo += dineroIngresado;
            return saldo;
        } else {
            return 0;
        }
    }
    
    //Getters y setters
    public double getSaldo(){
        return this.saldo;
    }
    public double getLimite(){
        return this.limite;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public void setLimite(double limite){
        this.limite=limite;
    }
    public String getDni(){
        return this.dni;
    }
  
    
    
    //Creo el método toString el cual me va a representar la clase 
    @Override
    public String toString(){
        String res="";
        res+=this.banco+"\n";
        res+="-----------------------------------"+"\n";
        res+="Titular: "+nombre+" Dni: "+dni+"\n";
        res+="Saldo: "+saldo+"\n";
        res+="Limite: "+limite;
        
        return res;
    }

}
