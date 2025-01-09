
package tiendaropa;


public class Prenda {
    //Atributos
    private String codigo, nombre, marca, categoria;
    private boolean disponibilidad;
    
    //Constructor

    public Prenda(String codigo, String nombre, String marca, String categoria, boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }
    //Get y Set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    //Vender
    public void vender(){
        if(disponibilidad){
            disponibilidad= false;
            System.out.println("La prenda: "+ nombre +" ha sido vendida");
        }
        
        else{
            System.out.println("La prenda no está disponible");
        }
    }
    
    //Reposición
    public void reponer(){
        disponibilidad = true;
        System.out.println("La prenda: "+ nombre + " ha sido reponida");
    }
}
