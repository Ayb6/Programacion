package composicion;

public class Arbol {

    double altura;
    String especie;
    int edad;
    hoja[] hojas;

    public Arbol(String especie, int age, double altura, int nhojas) {
        this.especie = especie;
        this.edad = age;
        this.altura = altura;

        double anchuraAle, alturaAle;

        this.hojas = new hoja[nhojas];
        for (int i = 0; i < nhojas; i++) {
            anchuraAle = Math.random() * 80 + 1;
            alturaAle = Math.random() * 120 + 1;
            hojas[i] = new hoja(anchuraAle, alturaAle);
        }
    }

    public void crecer() {
        this.edad++;
        this.altura *= 1.1;

    }

    @Override
    public String toString() {
        String res = "";
        res += this.especie + " con " + altura + " de altura, " + edad + " años " + "\n";
        for (int i = 0; i < hojas.length; i++) {
            res += this.hojas[i].toString() + "\n";
        }
        return res;
    }
}
