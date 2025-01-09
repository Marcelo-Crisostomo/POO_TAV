/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ropa;

/**
 *
 * @author marce
 */
public class Ropa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Crear el sistema
        Sistema sistema = new Sistema();

        // Crear prendas, clientes y proveedores
        Prenda prenda1 = new Prenda("001", "Chaqueta", "Nike", "Ropa Deportiva", true);
        Prenda prenda2 = new Prenda("002", "Pantalón", "Adidas", "Ropa Casual", true);
        //String numeroCliente, String nombre
        Cliente cliente1 = new Cliente("C001", "Juan Pérez");
 
        Proveedor proveedor1 = new Proveedor("P001", "Moda Express");
        cliente1.setNombre("Juan Gonzalez");
        // Registrar entidades en el sistema
        sistema.registrarPrenda(prenda1);
        sistema.registrarPrenda(prenda2);
        sistema.registrarCliente(cliente1);
        sistema.registrarProveedor(proveedor1);
        sistema.registrarCliente(cliente1);

        // Simular transacciones
        cliente1.realizarCompra(prenda1);
        proveedor1.suministrarPrenda(prenda1);
        sistema.generarInformeVentas();
    
    }
    
}
