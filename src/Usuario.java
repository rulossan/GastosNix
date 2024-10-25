public class Usuario extends Gastos {
    private String nombre;
    private String email;
    private String contraseña;

    // Constructor
    public Usuario(int id, String descripcion, double monto,String fecha, String categoria, String nombre, String email, String contraseña) {
        super(id, descripcion, monto, fecha, categoria);
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }
}
