public class Ingrediente {
    String nombre;
    double cantidad;
    String unidadDeMedida;

    public Ingrediente(String nombre, double cantidad, String unidadDeMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Unidad de Medida: " + unidadDeMedida);
    }
}
