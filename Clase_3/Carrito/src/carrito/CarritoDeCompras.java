
package carrito;

public class CarritoDeCompras {
  //Atributos  // simula una lista ...
    private String productos;
    private double total;
    
    //c

    public CarritoDeCompras() {
        this.productos = "";
        this.total= 0.0;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //Método para agregar un productoal carrito 
    
    public void agregarProducto(Producto producto){
        //Evaluar si no la lista de productos está vacía
        //si está vacia
        //si la lista contiene algo 
        if(! productos.isEmpty()){
            productos += ", ";
        }
        productos += producto.getNombreProducto();
        total += producto.getPrecio();
        System.out.println("Producto agregado: " + producto.getNombreProducto());
    }
    
    //Método para mostrar el contenido del carrito
    public void mostrarContenido(){
        System.out.println("Productos Carrito"+ productos);
        System.out.println("Total del carrito: "+ total);
    }
    
}
