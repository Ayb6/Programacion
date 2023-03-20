package tercertrimestre;

public class testPiscina {

    /*  Programa   un   archivo   main   que   se   encargue   de   crear   una   piscina   con   un   valor
aleatorio entre 1 y 100. A continuación, en un bucle FOR de 5 vueltas, llena la piscina
con un numero aleatorio entre 1 y 25 mostrando el nivel de la piscina en cada vuelta.
Seguidamente,   haz   lo   mismo   pero   vaciando   la   piscina  (mismas   vueltas   y   números
aleatorios)*/
    public static void main(String[] args) {
        int random, random2;

        random = (int) ((Math.random() * (100 - 1 + 1)) + 1);
        random2 = (int) ((Math.random() * (25 - 1 + 1)) + 1);

        Piscina piscina1 = new Piscina(random);

        for (int i = 0; i < 5; i++) {
            try {
                piscina1.ponerAgua(random2);
                System.out.println(piscina1.getNivel() + " litros");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < 5; i++) {
            try {
                piscina1.quitarAgua(random2);
                System.out.println(piscina1.getNivel() + " litros");
            } catch (Exception e) {
                System.out.println(e.getMessage() );
            }

        }
    }

}
