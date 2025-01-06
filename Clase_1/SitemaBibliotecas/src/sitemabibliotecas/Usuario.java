package sitemabibliotecas;

import java.util.ArrayList;


public class Usuario {
    //Atributos
    private String run, nombre;
    private ArrayList<Libro> librosPrestados;
    
    //Constructor

    public Usuario(String run, String nombre) {
        this.run = run;
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();//Inicializamos la lista como vacía
    }
    
    //Getters y Setters

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
    //tomarPrestado      trabaja con la clase libro
    public void tomarPrestado(Libro libro){
        if(libro.obtenerEstado()==true){
            librosPrestados.add(libro);//agregamos el libro a la lista de prestados
            libro.prestar();// Marque el libro como no disponible= false y me entregue un msg por consola
        }else{
            System.out.println("El libro no está disponible para ser prestado ");
        }
    }
    
    //devolverLibro trabaja con la clase libro
    public void devolverLibro(Libro libro){
        //Si la lista de librosPrestados tine algún libro
        if(librosPrestados.contains(libro)){
            librosPrestados.remove(libro);
            libro.devolver();//Cambiar el estado de de false a true;
        }else{
            System.out.println("El libro no fue solicitado por este usuario");
        }
    }
    
}
