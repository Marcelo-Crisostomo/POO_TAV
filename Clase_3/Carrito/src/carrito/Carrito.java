
package carrito;

public class Carrito {

    public static void main(String[] args) {
        //crear 
        //String idProducto, String nombreProducto, double precio
        Producto producto1 = new Producto("001","Mouse Logi",15000.0);
        Producto producto2 = new Producto("002","TecladoHP",20000.0);
        Producto producto3 = new Producto("003","Notebook Dell",600000.0);
        
        //Crear cliente
        Cliente cliente1 = new Cliente("0001CLI","Benjamín Mella");
        
        //Mostrar info cliente
        cliente1.mostrarInfoCliente();
        
        //cliente
        cliente1.comprarProducto(producto1);
        cliente1.comprarProducto(producto2);
        cliente1.comprarProducto(producto3);
        
        //Mostrar info cliente
        cliente1.mostrarInfoCliente();
        
    }
    
}
