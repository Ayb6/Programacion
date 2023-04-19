
package E120_Hipodromo;


public class pruebaArrayNombres {

    public static void main(String[] args) {
        String texto = "Drogadicto:17\nGalleta:26\nIllo:13";
        System.out.println(texto);
        
        String [] lineas = texto.split("\n");
        String [] nombres= new String [lineas.length];
        int [] victorias= new int [lineas.length];
        for (int i=0 ; i < lineas.length ; i++){
            nombres[i]=lineas[i].substring(0,lineas[i].indexOf(":") );
            victorias[i]=Integer.parseInt(lineas[i].substring(lineas[i].indexOf(":")+1));
        }
        System.out.println("Nombres:");
        for(String nombre:nombres){
            System.out.println(nombre);
        }
        System.out.println("Victorias");
        for(int victoria:victorias){
            System.out.println(victoria);
        }
        //Conseguir un array con las estadísticas del jugador.
        String textoUsuario = "nombre:Jaime\ndinero:735\naput:56\napug:47";
        String [] usuario = textoUsuario.split("\n");
        int [] estadisticasUsuario = new int [usuario.length-1];
        for (int i=1 ; i< usuario.length ; i++){
            estadisticasUsuario[i-1]=Integer.parseInt(usuario[i].substring(usuario[i].indexOf(":")+1));
        }
        for (int estadistica:estadisticasUsuario){
            System.out.println(estadistica);
        }
        
        double aleatorio = ((Math.random()*(10-0+1))+1);
        
        System.out.println("Aleatorio: "+aleatorio);
        
        double aleatorioRedondeado=Math.round(aleatorio*100.0)/100.0;
        
        System.out.println("Aleatorio redondeado: "+aleatorioRedondeado);
        
        
        
        
        
        
        

    }

}
