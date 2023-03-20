
package Cuenta2;


public class Prueba_cuenta2 {


    public static void main(String[] args) {
        Cuenta2 cuentaAyyoub = new Cuenta2("Juan");
        Cuenta2 cuentaX = new Cuenta2("Alberto", 500);
        cuentaX.ingresar(200);
        cuentaAyyoub.ingresar(100);
        cuentaX.retirar(100);
        cuentaAyyoub.retirar(150);
        System.out.println(cuentaAyyoub);
        System.out.println(cuentaX);
    }

}
