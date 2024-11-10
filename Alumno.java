import java.util.ArrayList;

public class Alumno {
    String nombreCompleto;
    long legajo;
    ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.notaExamen;
        }
        return suma / notas.size();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Legajo: " + legajo);
        System.out.println("Notas:");
        for (Nota nota : notas) {
            System.out.println("  Cátedra: " + nota.catedra + ", Nota: " + nota.notaExamen);
        }
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println();
    }
}
