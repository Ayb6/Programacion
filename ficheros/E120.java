package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E120 {
    //Al principio al no haber el fichero buscado, se va a generar uno aleatorio con el nombre que se ponga.
    //Si se desea alterar esos datos, se cambian en el archivo creado (se podría hacer desde el programa pero no esta implementado)

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String path = "src/E120_Hipodromo/", path2 = "src/E120_Hipodromo/horses.dat";//ruta fija
        String nombreJugador = "", elegido = "";
        String copiaFicheroUsuario = "";
        String copiaFicheroCaballos = "";
        boolean primeraParteCorrecta = false, caballoExistente = false;
        double apuesta = 0;
        System.out.println("Bienvenido al hipodromo MEDAC.");//La tilde la quitamos

        System.out.print("Indique su nombre de jugador: ");
        nombreJugador = input.next();
        nombreJugador = nombreJugador.replaceAll("/", " ");//Para controlar la barra
        nombreJugador = nombreJugador.replaceAll("\\\\", " ");//Seguramente habra mas caracteres
        path += nombreJugador.toLowerCase();
        path += ".dat";//sumamos el nombre en minuscula y el .dat a la ruta inicial.
        try {
            Thread.sleep(1000);//Perdida de tiempo 
        } catch (Exception e) {

        }
        try ( FileReader lector = new FileReader(path);  BufferedReader bufferLector = new BufferedReader(lector)) {
            //Abrimos flujo de lectura
            String linea = "";
            while (linea != null) {//Estructura while para copiar el archivo original en una copia local
                linea = bufferLector.readLine();
                if (linea != null) {
                    copiaFicheroUsuario += linea + "\n";
                    //Aquí ya tenemos copiado el fichero copiado
                }
            }
        } catch (FileNotFoundException e) {//También se podrían pedir estos datos por teclado, están puestos aleatorios.
            //Programamos el caso de que el archivo no exista
            try ( FileWriter escritor = new FileWriter(path);  BufferedWriter bufferEscritor = new BufferedWriter(escritor)) {
                //Abrimos el flujo de escritura
                //Escribimos el archivo.
                int apuestasTotales = (int) calcularAleatorio(0, 30);
                //Esta la creamos de antemano para usarlo de tope en el aleatorio de ganadas.
                String usuarioPorDefecto = "nombre:" + nombreJugador + "\ndinero:" + (int) calcularAleatorio(14, 1000) + "\n"
                        + "aput:" + apuestasTotales + "\napug:" + (int) calcularAleatorio(0, apuestasTotales);
                //Los valores de apuestas ganadas y apuestas jugadas están aleatorios...igual deberían empezar en 0.

                bufferEscritor.write(usuarioPorDefecto);//Esto habría que programarlo con un try

                copiaFicheroUsuario = usuarioPorDefecto;//Nos quedamos en la variable local el documento generado.

            } catch (IOException a) {
                System.out.println("Error inesperado a la hora de escribir.\n" + e.getMessage());
                //Segunda posible salida del programa por error inesperado
            }
            
        } catch (IOException e) {
            System.out.println("Error inesperado a la hora de leer.\n" + e.getMessage());
            //Primera posible salida del programa por error inesperado
        }
        //Almacenamos las estadisticas numericas del jugador en un array.(Nos saltamos la casilla 0 con el nombre
        String[] datosDelUsuario = copiaFicheroUsuario.split("\n");

        double[] estadisticasUsuario = new double[datosDelUsuario.length - 1];
        for (int i = 1; i < datosDelUsuario.length; i++) {
            estadisticasUsuario[i - 1] = Integer.parseInt(datosDelUsuario[i].substring(datosDelUsuario[i].indexOf(":") + 1));
        }//En este for pasamos los datos numéricos a un array de estadisticas de tres posiciones, dinero, apuestas, victorias
        //Mostramos los datos del usuario
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Estos son los datos de su usuario: \n" + copiaFicheroUsuario);
        System.out.println("--------------------------------------------------------\n");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("Cargando la base de datos de los caballos...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        //Ahora tratamos de leer el documento horses.dat, si no existe, se acaba el programa.
        try ( FileReader lector = new FileReader(path2);  BufferedReader bufferLector = new BufferedReader(lector)) {
            String linea = "";
            while (linea != null) {//Estructura while para copiar el archivo original en una copia local
                linea = bufferLector.readLine();
                if (linea != null) {
                    copiaFicheroCaballos += linea + "\n";
                    //Aquí ya tenemos copiado el fichero copiado

                }

            }
            System.out.println("Base de datos de los caballos cargada con éxito.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            primeraParteCorrecta = true;
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo acceder a la base de datos, las carreras no pueden realizarse.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error inesperado.");
        }
        if (primeraParteCorrecta) {
            String[] plantillaCaballos = copiaFicheroCaballos.split("\n");//Array con los renglones (nºcaballos)        
            String[] nombresCaballos = new String[plantillaCaballos.length];//Array con los nombres de los caballos
            int[] victoriasCaballos = new int[plantillaCaballos.length];//Array con el numero de victoria de los caballos
            for (int i = 0; i < plantillaCaballos.length; i++) {//Asignamos los valores
                nombresCaballos[i] = plantillaCaballos[i].substring(0, plantillaCaballos[i].indexOf(":"));
                victoriasCaballos[i] = Integer.parseInt(plantillaCaballos[i].substring(plantillaCaballos[i].indexOf(":") + 1));
            }

            boolean seguirApostando = false;//Por si después de terminar una apuesta quiere volver
            input.nextLine();//Limpiamos el buffer
            //Creamos arrays

            do {
                System.out.println("-----------------------------");
                System.out.println("BIENVENIDO A LA ZONA DE CARRERAS");
                System.out.println("-----------------------------");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                //Nos aseguramos con otro bucle que se apuesta a un caballo existente
                do {
                    caballoExistente = false;//En caso de segunda apuesta volver a desactivar este booleano
                    System.out.println("Caballos:");
                    System.out.println("-----------------------");

                    for (int i = 0; i < plantillaCaballos.length; i++) {
                        System.out.println((i + 1) + "o)Nombre: " + nombresCaballos[i]);
                        System.out.println("Victorias: " + victoriasCaballos[i]);
                        System.out.println("-----------------------");
                    }

                    System.out.print("Indique el nombre del caballo: ");
                    elegido = input.nextLine().toLowerCase();//Buscamos el nombre de ese caballo
                    try {//try dentro de bucle...
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }

                    for (int i = 0; (i < nombresCaballos.length) && (!caballoExistente); i++) {
                        if (elegido.equals(nombresCaballos[i].toLowerCase())) {
                            System.out.println("Esperemos que " + nombresCaballos[i] + " tenga su dia.");
                            caballoExistente = true;//Recorremos el bucle buscando un caballo con ese nombre
                            //Si no, volvemos a mostrar los caballos
                        }
                    }
                    if (!caballoExistente) {
                        System.out.println("No hemos encontrado a " + elegido + " en la base de datos");
                    }
                } while (!caballoExistente);
                //Bloque de codigo de la apuesta.
                /*
        Pedimos cantidad de la apuesta, debe ser correcta y mayor(o igual) de 15€, si el usuario no tiene 
        15€ se acaba el programa.       
                 */
                if (estadisticasUsuario[0] < 15) {//Si tiene menos de 15euros lo sacamos de la app
                    System.out.println("No tienes suficientes fondos para apostar, minimo 15€.");
                } else {//Si no tiene 15, tiene que salir del programa
                    do {
                        primeraParteCorrecta = false;
                        System.out.print("Cuanto quiere apostar por su caballo?");

                        try {
                            apuesta = input.nextDouble();
                            if (apuesta < 15) {
                                throw new Exception("La apuesta debe ser mayor de 15E");
                            }//Excepciones para los casos concretos que no queremos, menores de 15 o mayor que el dinero q tiene
                            if (apuesta > estadisticasUsuario[0]) {
                                throw new Exception("No tienes suficientes fondos");
                            }
                            apuesta = Math.round(apuesta * 100.0) / 100.0;//Reducimos a un numero de dos decimales por si vienen con muchos
                            input.nextLine();
                            System.out.print("Confirmas tu apuesta de: " + apuesta + "?");
                            if (!input.nextLine().equalsIgnoreCase("si")) {//Podríamos aceptar aquí la letra S, la y... programado para solo si
                                primeraParteCorrecta = false;
                                System.out.println("Para confirmar necesitamos un si.");
                            } else {
                                primeraParteCorrecta = true;
                                Thread.sleep(2000);//Metodo para hacer un pequeño paron y darle emocion
                                System.out.println("Mucha suerte!");
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Necesitamos un número...");
                            input.nextLine();
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                            input.nextLine();
                        }

                    } while (!primeraParteCorrecta);
                    //La carrera                    
                    System.out.println("-----------");
                    System.out.println("LA CARRERA");
                    System.out.println("-----------");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }

                    int caballoGanador = (int) calcularAleatorio(nombresCaballos.length - 1, 0);
                    for (int i = 0; i < 3; i++) {//Pondremos tres mensajes en cada carrera, igual podríamos poner aleatorias veces

                        int aleatorio = (int) calcularAleatorio(nombresCaballos.length - 1, 0);
                        System.out.println(nombresCaballos[aleatorio] + fraseRandom((int) calcularAleatorio(5, 1)));
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            //Por cada iteracion, un nombre aleatorio de caballo + un mensaje aleatorio y 2 segundos de pausa.                              
                        }
                    }
                    System.out.println("Increible victoria de " + nombresCaballos[caballoGanador]);
                    victoriasCaballos[caballoGanador]++;
                    if (nombresCaballos[caballoGanador].equalsIgnoreCase(elegido)) {
                        System.out.println("Suma una ganancia de " + apuesta * 1.5);
                        estadisticasUsuario[0] += apuesta * 1.5;
                        System.out.println("Su saldo actualizado es de " + estadisticasUsuario[0]);
                        estadisticasUsuario[1]++;//Sumamos 1 a las partidas ganadas
                        estadisticasUsuario[2]++;//Sumamos otra a las paritdas jugadas

                    } else {
                        System.out.println("Perdio su apuesta de " + apuesta);
                        estadisticasUsuario[0] -= apuesta;
                        System.out.println("Su saldo actualizado es de " + estadisticasUsuario[0]);
                        estadisticasUsuario[1]++;//Sumamos uno a las partigas jugadas
                    }

                }
                if (estadisticasUsuario[0] > 15) {
                    System.out.println("Quiere seguir apostando?");
                    if (input.nextLine().equalsIgnoreCase("si")) {
                        seguirApostando = true;
                    } else {
                        seguirApostando = false;
                        System.out.println("Ha sido un placer! \nHasta la proxima " + nombreJugador);
                    }

                }
                if (estadisticasUsuario[0] < 15) {
                    seguirApostando = false;
                    System.out.println("Se quedó sin fondos suficientes!");
                }
            } while (seguirApostando);
            //Finalizamos el programa, sobreescribiendo los archivos.
            copiaFicheroCaballos = "";
            for (int i = 0; i < nombresCaballos.length; i++) {
                copiaFicheroCaballos += nombresCaballos[i] + ":" + victoriasCaballos[i] + "\n";
            }
            copiaFicheroUsuario = "nombre:" + nombreJugador + "\n";
            copiaFicheroUsuario += "dinero:" + (int) (Math.round(estadisticasUsuario[0])) + "\n";
            copiaFicheroUsuario += "aput:" + (int) estadisticasUsuario[1] + "\n";
            copiaFicheroUsuario += "apug:" + (int) estadisticasUsuario[2] + "\n";

            //En teoría tenemos los nuevos ficheros actualizados. A aplastarlos.
            try ( FileWriter escritor = new FileWriter(path);  BufferedWriter bufferEscritor = new BufferedWriter(escritor)) {
                //Actualizamos los datos del usuario
                bufferEscritor.write(copiaFicheroUsuario);

            } catch (IOException e) {
                System.out.println("Ocurrio un error, no se actualizaron los datos");
            }
            try ( FileWriter escritor = new FileWriter(path2);  BufferedWriter bufferEscritor = new BufferedWriter(escritor)) {
                //Actualizamos los datos del usuario
                bufferEscritor.write(copiaFicheroCaballos);

            } catch (IOException e) {
                System.out.println("Ocurrio un error, no se actualizaron los datos");
            }
        }
    }
    //Funciones usadas:
    public static double calcularAleatorio(int max, int min) {
        return ((Math.random() * (max - min + 1)) + min);
    }

    public static String fraseRandom(int aleatorio) {//Frases que da un poco igual pero dan ambiente
        String mensaje = "";
        switch (aleatorio) {
            case 1:
                mensaje = " va tomando la delantera";
                break;
            case 2:
                mensaje = " se le ve renqueante";
                break;
            case 3:
                mensaje = " parece que se pone las pilas";
                break;
            case 4:
                mensaje = " puede hacer el milagro";
                break;
            case 5:
                mensaje = " velocidad total!!";
                break;
        }
        return mensaje;
    }
}
