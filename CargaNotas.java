import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.println("Ingrese la cantidad de alumnos:");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre completo del alumno " + (i + 1) + ":");
            String nombreCompleto = scanner.nextLine();
            System.out.println("Ingrese el legajo del alumno " + (i + 1) + ":");
            long legajo = scanner.nextLong();
            scanner.nextLine(); // Consumir el salto de línea

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            System.out.println("Ingrese la cantidad de notas para el alumno " + (i + 1) + ":");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (cantidadNotas < 1) {
                System.out.println("Debe ingresar al menos una nota.");
                cantidadNotas = 1; // Asegurarse de que se ingrese al menos una nota
            }

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese la cátedra de la nota " + (j + 1) + ":");
                String catedra = scanner.nextLine();
                System.out.println("Ingrese la nota del examen " + (j + 1) + ":");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }

        System.out.println("Información de los alumnos:");
        for (Alumno alumno : alumnos) {
            alumno.mostrarInformacion();
        }

        scanner.close();
    }
}