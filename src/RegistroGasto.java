public class RegistroGasto extends Gastos {
    // Constructor
    public RegistroGasto(int id, String descripcion, double monto,String fecha, String categoria) {
        super(id, descripcion, monto, fecha, categoria);
    }

    // Metodo get
    public String getFecha() {
        return super.getFecha();
    }

    // Metodo set
    public void setFecha(String fecha) {
        super.setFecha(fecha);
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
    }
}
