
import java.util.Arrays;

public class Estudiante {

    private String nombre;
    private String apellidos;
    private double notas[];

    public Estudiante(String nombre, String apellidos, int sizeNotas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        notas = new double[sizeNotas];
        Arrays.fill(notas, -1);
    }

    public boolean insertarNota(double nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == -1) {
                notas[i] = nota;
                return true;
            }
        }
        return false;
    }

    public String mostrarNotas() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < notas.length; i++) {
            sb.append(notas[i]);
            if (i != notas.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public double calcularMedia() {
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < notas.length && notas[i] != -1; i++) {
            suma += notas[i];
            contador++;
        }
        return suma / contador;
    }

    public int[] indicarRangos() {
        int[] rangos = {0, 0, 0, 0};
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 10) {
                if (notas[i] < 5) {
                    rangos[0]++;
                } else if (notas[i] < 7) {
                    rangos[1]++;
                } else if (notas[i] < 9) {
                    rangos[2]++;
                } else {
                    rangos[3]++;
                }
            }
        }
        return rangos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante: ").append(nombre).append(" ").append(apellidos);
        sb.append("Notas: ").append(mostrarNotas());
        sb.append("\nRangos: ");
        int[] rangos = indicarRangos();
        for (int i = 0; i < rangos.length; i++) {
            sb.append(rangos[i]).append(" ");
        }
        sb.append("Media: ").append(calcularMedia());

        return sb.toString();
    }
}
