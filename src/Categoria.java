public class Categoria extends Gastos {
    private String tipo;
    private String[] categoriasDisponibles;

    // Constructor
    public Categoria(int id, String descripcion, double monto,String fecha, String categoria, String tipo) {
        super(id, descripcion, monto, fecha, categoria);
        this.tipo = tipo;
        this.categoriasDisponibles = new String[]{"Hogar", "Alimentación", "Transporte", "Entretenimiento", "Impuestos", "Salud"};
    }

    // Metodo get
    public String getTipo() {
        return tipo;
    }

    public String[] getCategoriasDisponibles() {
        return categoriasDisponibles;
    }

    // Metodo set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCategoriasDisponibles(String[] categoriasDisponibles) {
        this.categoriasDisponibles = categoriasDisponibles;
    }

    public void seleccionarCategoria(int index) {
        if (index >= 0 && index < categoriasDisponibles.length) {
            setCategoria(categoriasDisponibles[index]);
        } else {
            System.out.println("Índice de categoría no válido.");
        }
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tipo: " + tipo);
    }
}

