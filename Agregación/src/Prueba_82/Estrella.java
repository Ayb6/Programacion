
package Prueba_82;


public class Estrella {
    private int x;
    private int y;
    
    public Estrella(int posicionX, int posicionY){
        
        this.x=posicionX;
        this.y=posicionY;
    }
    
    public String toString(){
        String res="";
        int aleatorio=(int)(Math.random()*4);
        switch (aleatorio) {
            case 3:
                res+="*";
                break;
            case 2:
                res+=".";
                break;
            case 1:
                res+=".";
                break;
            case 0:
                res+=".";           
        }
        return res;
    }
}
