package Amjahed_Abed_Ayyoub;

public class Pajaro {
    
    //Establezco propiedades, agrego un array de plumas
    private String tipo;
    private int edad;
    private Pluma[] plumas;

    public Pajaro(String tipo, int edad) { //Creo el constructor , el cual me pide por parametros unicamente el tipo y la edad, creo un aleatorio para el tamaño del array
        this.tipo = tipo;
        this.edad = edad;
        int aleatorio = (int)((Math.random()*(85-5+1))+1);
        plumas = new Pluma[aleatorio];

        int aleatorioColor = (int)((Math.random()*(3-1+1))+1); // Creo un random para el color

        String colorAleatorio;
        switch (aleatorioColor) {
            case 1:
                colorAleatorio = "negro";
                break;
            case 2:
                colorAleatorio = "verde";
                break;
            default:
                colorAleatorio = "blanco";
                break;
        }

        for (int i = 0; i < plumas.length; i++) { //Relleno las plumas, siempre tienen el mismo color, pero la anchura y el largo es aleatorio
            double aleatorioAncho = (int)((Math.random()*(5-1+1))+1);
            double aleatorioLargo = (int)((Math.random()*(8-2+1))+1);
            plumas[i] = new Pluma(aleatorioAncho, aleatorioLargo, colorAleatorio);
        }
    }
    
    //Metodo toString para representar la clase, se usa un for para poder mostrar todas las plumas
    public String toString() {
        String res = "";
        res += "Pajaro " + this.tipo + " de " + this.edad + " años" + "\n";
        res += "Plumaje " + "\n";
        for (int i = 0; i < plumas.length; i++) {
            res += plumas[i] + "\n";
        }
        return res;
    }
}
