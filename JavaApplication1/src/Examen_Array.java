
import java.util.Scanner;

public class Examen_Array {

    public static void main(String[] args) {
        final int TAMPEQ = 14;
        final int TAMGRAND = 10;
        String[] p = new String[TAMPEQ];
        String[] g = new String[TAMGRAND];
        int opcion, plaza;
        boolean habiahueco = false;
        String tam = "", otro;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < p.length; i++) {
            p[i] = "L";
        }
        for (int i = 0; i < g.length; i++) {
            g[i] = "L";
        }
        do {
            System.out.println("\nAPARCAMIENTOS WEB NOVA");
            System.out.println("---------------------------------------");
            System.out.println("1) Aparcar vehículo");
            System.out.println("2) Sacar vehículo");
            System.out.println("3) Mostrar aparcamiento");
            System.out.println("4) salir");
            System.out.println("Opción?");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do {

                        do {
                            System.out.println("Tamaño del vehiculo (G/P)?");
                            tam = teclado.next();
                        } while (!tam.equalsIgnoreCase("G") && !tam.equalsIgnoreCase("P"));
                        if (tam.equalsIgnoreCase("G")) {
                            for (int i = 0; i < g.length; i++) {

                                if (g[i].equalsIgnoreCase("L")) {
                                    g[i] = "O";
                                    System.out.println("Vehiculo aparcado en " + i);
                                    i = g.length;
                                    habiahueco = true;
                                }
                            }
                            if (!habiahueco) {
                                System.out.println("No hay hueco");
                            }
                            habiahueco = false;
                        } else if (tam.equalsIgnoreCase("P")) {
                            for (int i = 0; i < p.length; i++) {
                                if (p[i].equalsIgnoreCase("L")) {
                                    p[i] = "O";
                                    System.out.println("Vehiculo aparcado en " + i);
                                    i = p.length;
                                    habiahueco = true;
                                }
                            }
                            if (!habiahueco) {
                                for (int i = 0; i < g.length; i++) {

                                    if (g[i].equalsIgnoreCase("L")) {
                                        g[i] = "O";
                                        System.out.println("Vehiculo aparcado en " + i);
                                        i = g.length;
                                        habiahueco = true;
                                    }
                                }
                            }
                            if (!habiahueco) {
                                System.out.println("No hay hueco");
                            }
                            habiahueco = false;
                        }
                        System.out.println("Aparcar otro? S/N");
                        otro = teclado.next();
                    } while (!otro.equalsIgnoreCase("N"));
                    break;

                case 2:
                    do {

                        do {
                            System.out.println("Tamaño del vehiculo (G/P)?");
                            tam = teclado.next();
                        } while (!tam.equalsIgnoreCase("G") && !tam.equalsIgnoreCase("P"));
                        if (tam.equalsIgnoreCase("G")) {
                            do {
                                System.out.println("Numero de plaza?");
                                plaza = teclado.nextInt();
                            } while (plaza < 0 || plaza >= g.length);
                            if (g[plaza].equalsIgnoreCase("O")) {
                                g[plaza] = "L";
                                System.out.println("La plaza queda disponible");
                            } else {
                                System.out.println("Imposible. En esta plaza no hay ningún vehiculo.");
                            }
                        }
                        if (tam.equalsIgnoreCase("P")) {
                            do {
                                System.out.println("Numero de plaza?");
                                plaza = teclado.nextInt();
                            } while (plaza < 0 || plaza >= p.length);
                            if (p[plaza].equalsIgnoreCase("O")) {
                                p[plaza] = "L";
                                System.out.println("La plaza queda disponible");
                            } else {
                                System.out.println("Imposible. En esta plaza no hay ningún vehiculo.");
                            }
                        }
                        do {
                            System.out.println("Sacar otro vehiculo? S/N");
                            otro = teclado.next();
                            if (!otro.equalsIgnoreCase("S") && !otro.equalsIgnoreCase("N")) {
                                System.out.println("Debes introducir la S o la N");
                            }
                        } while (!otro.equalsIgnoreCase("S") && !otro.equalsIgnoreCase("N"));
                    } while (!otro.equalsIgnoreCase("N"));
                    break;

                case 3:
                    System.out.println("Situación del aparcamiento:");
                    System.out.print("Plazas G= ");
                    System.out.print("[");
                    for (int i = 0; i < p.length - 1; i++) {
                        System.out.print(p[i] + " ");
                    }
                    System.out.println(p[p.length - 1] + "]");
                    System.out.println("");
                    System.out.print("Plazas P= ");
                    System.out.print("[");
                    for (int i = 0; i < g.length - 1; i++) {
                        System.out.print(g[i] + " ");
                    }
                    System.out.println(g[g.length - 1] + "]");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Debes introducir una opción válida");
            }
        } while (opcion != 4);
        System.out.println("Aparcamientos Web Nova os desea un feliz halloween");
        teclado.close();
    }

}
