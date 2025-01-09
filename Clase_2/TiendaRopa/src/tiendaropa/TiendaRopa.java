

package tiendaropa;


public class TiendaRopa {

    
    public static void main(String[] args) {
        InventarioSistema sistema = new InventarioSistema();
        
        //prendas 
        //String codigo, String nombre, String marca, String categoria, boolean disponibilidad
        Prenda prenda1 = new Prenda("0001","Polera", "Adidas", "Hombre", true);
        Prenda prenda2 = new Prenda("0002","Gorro", "New Era", "Hombre", true);
        //Cliente
        Cliente cliente1 = new Cliente(001,"Benjamín");
        
        
        //proveedor
        Proveedor proveedor1 = new Proveedor(001,"Adidas");
        
        //Registrar prendas clientes y proveedores
        sistema.registrarPrenda(prenda1);
        sistema.registrarPrenda(prenda2);
        
        sistema.registrarCliente(cliente1);
        sistema.registrarProveerdor(proveedor1);
        
        ///compra, venta e informe
        cliente1.realizarCompra(prenda1);
        proveedor1.suministrarPrendas(prenda2);
        proveedor1.suministrarPrendas(prenda1);
        sistema.generarInforme();
    }
    
}
