
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        String plazasGrandes[] = {"L", "L", "L", "L ", "L", "L", "L", "L", "L", "L"}, plazasPequeñas[] = {"L", "L", "L", "L ", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"};
        int num = 0, plaza = 0;
        String tamaño = "", otraVez = "";
        boolean peque = true;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("APARCAMIENTOS WEB NOVA");
            System.out.println("---------------------------------------");
            System.out.println("1) Aparcar vehículo.");
            System.out.println("2) Sacar vehículo.");
            System.out.println("3) Mostrar aparcamiento.");
            System.out.println("4) Salir");
            System.out.print("Opcion? ");
            num = teclado.nextInt();
            switch (num) {
                case 1:
                    do {
                        do {
                            System.out.print("Tamaño del vehiculo(G/P)?");
                            tamaño = teclado.next();
                        } while (!tamaño.equalsIgnoreCase("G") && !tamaño.equalsIgnoreCase("P"));

                        if (tamaño.equalsIgnoreCase("G")) {
                            for (int i = 0; i < plazasGrandes.length; i++) {
                                if (plazasGrandes[i].equalsIgnoreCase("L")) {
                                    plazasGrandes[i] = "O";
                                    System.out.println("Vehiculo aparcado en G" + i);
                                    i = plazasGrandes.length;
                                }
                                if (i == plazasGrandes.length - 1) {
                                    System.out.println("No se ha podido aparcar el vehiculo");
                                }
                            }
                        } else if (tamaño.equalsIgnoreCase("P")) {
                            for (int i = 0; i < plazasPequeñas.length; i++) {
                                if (plazasPequeñas[i].equalsIgnoreCase("L")) {
                                    plazasPequeñas[i] = "O";
                                    System.out.println("Vehiculo aparcado en P" + i);
                                    i = plazasPequeñas.length;
                                }
                                if (i == plazasPequeñas.length - 1) {
                                    peque = false;
                                }
                            }
                            if (!peque) {
                                for (int i = 0; i < plazasGrandes.length; i++) {
                                    if (plazasGrandes[i].equalsIgnoreCase("L")) {
                                        plazasGrandes[i] = "O";
                                        System.out.println("Vehiculo aparcado en G" + i);
                                        i = plazasGrandes.length;
                                    }
                                    if (i == plazasGrandes.length - 1) {
                                        System.out.println("No se ha podido aparcar el vehiculo");
                                    }
                                }
                            }
                        }
                        System.out.print("Aparcar otro(S/N)?  ");
                        otraVez = teclado.next();
                    } while (otraVez.equalsIgnoreCase("S"));
                    break;
                case 2:
                    do {
                        do {
                            System.out.print("Tamaño del vehiculo(G/P)?");
                            tamaño = teclado.next();
                        } while (!tamaño.equalsIgnoreCase("G") && !tamaño.equalsIgnoreCase("P"));
                        System.out.print("Numero de plaza? ");
                        plaza = teclado.nextInt();
                        if (tamaño.equalsIgnoreCase("G") && (plazasGrandes.length < plaza || plazasGrandes.length > plaza)) {
                            plazasGrandes[plaza] = "L";
                            System.out.println("La plaza queda disponible");
                        } else if (tamaño.equalsIgnoreCase("P") && (plazasPequeñas.length < plaza || plazasPequeñas.length > plaza)) {
                            plazasPequeñas[plaza] = "L";
                            System.out.println("La plaza queda disponible");
                        } else {
                            System.out.println("IMPOSIBLE: en esa plaza no hay ningún vehiculo");
                        }
                        System.out.print("Aparcar otro(S/N)?  ");
                        otraVez = teclado.next();
                    } while (otraVez.equalsIgnoreCase("S"));
                    break;
                case 3:
                    System.out.println("Situacion del aparcamiento: ");
                    System.out.print("Plazas G = [");
                    for (int i = 0; i < plazasGrandes.length - 1; i++) {
                        System.out.print(plazasGrandes[i] + ", ");
                    }
                    System.out.println(plazasGrandes[plazasGrandes.length - 1] + "]");
                    System.out.print("Plazas de P = [");
                    for (int i = 0; i < plazasPequeñas.length - 1; i++) {
                        System.out.print(plazasPequeñas[i] + ", ");
                    }
                    System.out.println(plazasPequeñas[plazasPequeñas.length - 1] + "]");
                    break;
                case 4:
                    System.out.println("Aparcamientos Web Nova le desea Feliz Halloween!!");
                    break;
                default:
                    System.out.println("No es un numero valido");
            }

        } while (num != 4);
        teclado.close();
    }

}
