package calculadora.de.notas.medac;

import java.util.Scanner;

public class CalculadoraDeNotasMedac {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

         
        // Pedimos al usuario el número de prácticas
        System.out.print("¿Cuántas prácticas has realizado? ");
        int numPracticas = scanner.nextInt();

        // Pedimos las notas de las prácticas
        double sumaPracticas = 0.0;
        for (int i = 1; i <= numPracticas; i++) {
            System.out.print("Introduce la nota de la práctica " + i + ": ");
            try {
                double notaPractica = scanner.nextDouble();
                sumaPracticas += notaPractica;
            } catch (Exception e) {
                System.out.println("Valor introducido no es válido. Introduce un número con decimales.");
                scanner.nextLine(); // Limpiamos el buffer de entrada
                i--; // Repetimos el ciclo para introducir la nota de nuevo
            }
        }

        // Calculamos la nota media de las prácticas
        double notaMediaPracticas = sumaPracticas / numPracticas;

        // Pedimos la nota del examen teórico
        System.out.print("Introduce la nota del examen teórico: ");
        try {
            double examenTeorico = scanner.nextDouble();

            // Calculamos la nota final
            double notaFinal = (notaMediaPracticas * 0.6 + examenTeorico * 0.4);

            // Mostramos la nota final
            System.out.println("Tu nota final es: " + notaFinal);
        } catch (Exception e) {
            System.out.println("Valor introducido no es válido. Introduce un número con decimales.");
        }
    }
}
        
        
    

