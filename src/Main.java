public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(1, "Gasto personal", 250000, "2024-10-24", "Entretenimento","Alex","alex154464@gmail.com","reto156464");
        usuario.imprimirDetalles();


        RegistroGasto registroGasto = new RegistroGasto(2, "Compra de libros",35000, "2024-10-24", "Educación");
        registroGasto.imprimirDetalles();


        Categoria categoria = new Categoria(3, "Compra de alimentos",40000,"2024-10-24", "Hogar","Hogar");
        categoria.imprimirDetalles();


        categoria.seleccionarCategoria(2);  // Selecciona "Transporte"
        System.out.println("Categoría seleccionada: " + categoria.getCategoria());
    }
}


