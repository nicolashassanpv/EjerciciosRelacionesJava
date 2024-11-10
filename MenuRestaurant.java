import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        System.out.println("Ingrese la cantidad de platos:");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("Ingrese el nombre completo del plato " + (i + 1) + ":");
            String nombreCompleto = scanner.nextLine();
            System.out.println("Ingrese el precio del plato " + (i + 1) + ":");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.println("¿Es una bebida? (true/false):");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea

            Plato plato = new Plato(nombreCompleto, precio, esBebida);

            if (!esBebida) {
                System.out.println("Ingrese la cantidad de ingredientes para el plato " + (i + 1) + ":");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                if (cantidadIngredientes < 1) {
                    System.out.println("Debe ingresar al menos un ingrediente.");
                    cantidadIngredientes = 1; // Asegurarse de que se ingrese al menos un ingrediente
                }

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.println("Ingrese el nombre del ingrediente " + (j + 1) + ":");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.println("Ingrese la cantidad del ingrediente " + (j + 1) + ":");
                    double cantidadIngrediente = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.println("Ingrese la unidad de medida del ingrediente " + (j + 1) + ":");
                    String unidadDeMedida = scanner.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadDeMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            platosMenu.add(plato);
        }

        System.out.println("MENÚ");
        for (Plato plato : platosMenu) {
            plato.mostrarInformacion();
        }

        scanner.close();
    }
}
