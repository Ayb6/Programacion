

package Amjahed_Abed_Ayyoub;


public class Prueba_cuenta_corriente {

 
    public static void main(String[] args) {
        //Creo la cuenta estableciendo el nombre y el DNI.
        CuentaCorriente cuenta1 = new CuentaCorriente("Jaime Hormiga", "23567897F");
        cuenta1.setLimite(50); //Con el metodo set introduzco 50 euros en la cuenta
        
        cuenta1.ingresarDinero(1000); 
        cuenta1.sacarDinero(300);
        cuenta1.sacarDinero(700);
        cuenta1.sacarDinero(200);
        System.out.println(cuenta1);
        
        CuentaCorriente cuenta2 =new CuentaCorriente(cuenta1); //Gracias al construcor de copia, copiamos los datos de la cuenta de Jaime Hormiga a la cuenta 2.
        cuenta2.setSaldo(9000);
        cuenta2.sacarDinero(500);
        System.out.println(cuenta2); 
        
        
    }

}
