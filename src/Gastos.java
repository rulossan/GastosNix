public class Gastos {
    private int id;
    private String descripcion;
    private double monto;
    private String fecha;
    private String categoria;


    // Constructor
    public Gastos(int id, String descripcion, double monto,  String fecha, String categoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.categoria = categoria;
    }


    // Métodos get
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }



    // Métodos set
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }



    public void imprimirDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Monto: " + monto);
        System.out.println("Fecha: " + fecha);
        System.out.println("Categoría: " + categoria);
    }
}
