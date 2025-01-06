
package sitemabibliotecas;


public class SitemaBibliotecas {

    
    public static void main(String[] args) {
      //Crear una instancia del sistema
      Sistema sistema = new Sistema();
      
      //Crear libros
      //String codigo, String titulo, String autor, String genero
      
      Libro libro1 = new Libro("001","Papelucho","Marcela Paz","Infantil");
      Libro libro2 = new Libro("002","Metamorfosis","Franz Kafka","ficción");
      //Crear Usuarios
      //String run, String nombre
      Usuario usuario1 = new Usuario("21121212","Benjamín");
      
      
      //Registrar libros 
      sistema.agregarLibro(libro1);
      sistema.agregarLibro(libro2);
      
      //registrar usuario
      
      sistema.agregarUsuario(usuario1);
      //Probar funcionalidad
      
      //Benjamín toma prestado el libro metamorfosís
      usuario1.tomarPrestado(libro2);
      usuario1.tomarPrestado(libro1);
      
      sistema.generarInforme();
      
      usuario1.devolverLibro(libro2);
      
      sistema.generarInforme();
      
      
    }
    
}
