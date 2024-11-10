import java.util.ArrayList;

public class Plato {
    String nombreCompleto;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void mostrarInformacion() {
        System.out.println(nombreCompleto);
        System.out.println("Precio: $" + precio);
        if (!esBebida) {
            System.out.println("Ingredientes");
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println("Nombre: " + ingrediente.nombre);
                System.out.println("Cantidad: " + ingrediente.cantidad);
                System.out.println("Unidad de Medida: " + ingrediente.unidadDeMedida);
            }
        }
        System.out.println();
    }
}
