
package EJ101;


public class Nota {
   private String valor;
   private int duracion;
   
   public Nota(String val, int dur){
   this.valor=val;
   this.duracion=dur;
   }
   public String getValor(){
   return valor;
   }
   public int getDuracion(){
       return duracion;
   }
   public String toString(){
   return "["+this.valor+" , "+this.duracion+"]\n";
   }
    
}
