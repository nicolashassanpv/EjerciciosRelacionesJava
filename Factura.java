import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    public Factura() {
        this.detallesFactura = new ArrayList<>();
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(ArrayList<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    public void calcularMontoTotal() {
        double total = 0;
        for (DetalleFactura detalle : detallesFactura) {
            total += detalle.getSubtotal();
        }
        this.totalCalculadoFactura = total;
    }

    public void agregarDetalleFactura(DetalleFactura detalle) {
        detallesFactura.add(detalle);
    }
}