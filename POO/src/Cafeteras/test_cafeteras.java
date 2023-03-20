
package Cafeteras;


public class test_cafeteras {


    public static void main(String[] args) {
        Cafetera cafetera1;
        cafetera1=new Cafetera();
        
        cafetera1.echarcafe(900);
        cafetera1.llenarcafetera();
        cafetera1.llenarcafetera();
        cafetera1.vaciarcafetera();
        cafetera1.vaciarcafetera();
        cafetera1.echarcafe(250);
        cafetera1.servirtaza(300);
        cafetera1.servirtaza(250);
        cafetera1.cantidadcafe();
        cafetera1.llenarcafetera();
        cafetera1.servirtaza(600);
        cafetera1.cantidadcafe();
        cafetera1.llenarcafetera();
        cafetera1.cantidadcafe();
    }

}
