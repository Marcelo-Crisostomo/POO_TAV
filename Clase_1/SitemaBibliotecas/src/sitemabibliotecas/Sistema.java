
package sitemabibliotecas;

import java.util.ArrayList;


public class Sistema {
    private ArrayList<Libro>catalogoLibros;
    private ArrayList<Usuario>listaUsuarios;

    public Sistema() {
        this.catalogoLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    public ArrayList<Libro> getCatalogoLibros() {
        return catalogoLibros;
    }

    public void setCatalogoLibros(ArrayList<Libro> catalogoLibros) {
        this.catalogoLibros = catalogoLibros;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    //Registrar o agregar libro
    public void agregarLibro(Libro libro){
        catalogoLibros.add(libro);//Agregando un libro a la lista
        System.out.println("Libro agregado: "+ libro.getTitulo());
        
    }
    
    //Registrar o añadir usuario
      public void agregarUsuario(Usuario usuario){
      listaUsuarios.add(usuario);
      System.out.println("Usuario agregado: "+ usuario.getNombre());
    }
      
    //método verificar disponibilidad = estado booleano
      public boolean verificarDisponibilidad(String codigo){
          //Recorremos la lista libros
          for (Libro libro: catalogoLibros){
              //Si el código del libro es igual al código de la lista
              if(libro.getCodigo().equals(codigo)){
                  return libro.obtenerEstado();
                  
              }
          }
          return false;
      }
      
      //Método para generar un informe
      public void generarInforme(){
          System.out.println("Estado actual de la biblioteca");
          for (Libro libro : catalogoLibros){//   ? = if 
              System.out.println("Título: "+ libro.getTitulo() + "Estado: "+ (libro.obtenerEstado()? "Disponible":"No disponible"));
          }
      }
    
}
