package Persona;

import java.util.Scanner;

public class test_persona {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        String nombre, pais;
        boolean sexo;
        int edad;
        System.out.println("Introduce nombre ");
        nombre = teclado.next();
        System.out.println("Introduce edad ");
        edad = teclado.nextInt();
        System.out.println("Introduce sexo ");
        sexo = teclado.nextBoolean();
        System.out.println("Introduce país ");
        pais = teclado.next();
        */
        Persona persona1;
        persona1 = new Persona("Ayyoub", 22, false, "España");
        
        persona1.saludar();
        persona1.saludar(3);
        persona1.mostrardatos();
    }

}
