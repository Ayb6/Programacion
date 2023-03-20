
package Practicando;


public class test_coche {


    public static void main(String[] args) {
        Coche coche1;
        coche1 = new Coche("azul",2,1,5);
        System.out.println(coche1.color);
        System.out.println(coche1.anchura);
        System.out.println(coche1.altura);
        System.out.println(coche1.npuertas);
        System.out.println(coche1.nruedas);
        System.out.println("--------------------");
        System.out.println(coche1.gasolina);
        coche1.parar();
        System.out.println(coche1.gasolina);
        coche1.desplazarse();
        System.out.println(coche1.gasolina);
        coche1.arrancar();
        System.out.println(coche1.gasolina);
        coche1.desplazarse();
        System.out.println(coche1.gasolina);
        coche1.parar();
        System.out.println(coche1.gasolina);
        coche1.echargasolina(10);
        System.out.println(coche1.gasolina);
        coche1.chequear();
        coche1.arrancar();
        coche1.arrancar();
        System.out.println(coche1.gasolina);
        coche1.parar();
        System.out.println(coche1.gasolina);
        coche1.arrancar();
        System.out.println(coche1.gasolina);
        coche1.parar();
        System.out.println(coche1.gasolina);
        coche1.desplazarse();
        System.out.println(coche1.gasolina);
        coche1.arrancar();
        System.out.println(coche1.gasolina);
        coche1.desplazarse();
        System.out.println(coche1.gasolina);
        coche1.parar();
        System.out.println(coche1.gasolina);
        coche1.arrancar();
        System.out.println(coche1.gasolina);
        coche1.parar();
        System.out.println(coche1.gasolina);
        coche1.arrancar();
        System.out.println(coche1.gasolina);
        coche1.chequear();
        coche1.echargasolina(20);
        coche1.chequear();
        System.out.println(coche1.gasolina);
    }

}
