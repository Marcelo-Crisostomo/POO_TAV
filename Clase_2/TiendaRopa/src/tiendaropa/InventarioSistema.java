
package tiendaropa;

import java.util.ArrayList;


public class InventarioSistema {
    private ArrayList<Prenda>catalogoPrendas;
    private ArrayList<Cliente>clientesRegistrados;
    private ArrayList<Proveedor>proveedoresActivos;

    public InventarioSistema() {
        this.catalogoPrendas = new ArrayList<>();
        this.clientesRegistrados = new ArrayList<>();
        this.proveedoresActivos = new ArrayList<>();
    }
    
    //RegistrarPrenda
    public void registrarPrenda(Prenda prenda){
        catalogoPrendas.add(prenda);
        System.out.println("Prenda registrada" + prenda.getNombre());
    }
    
    
    //Registrar Proveedor
        public void registrarProveerdor(Proveedor proveedor){
        proveedoresActivos.add(proveedor);
        System.out.println("Proveedor registrado" + proveedor.getNombreProveedor());
    }
        
        public void registrarCliente(Cliente cliente){
        clientesRegistrados.add(cliente);
        System.out.println("Cliente registrado" + cliente.getNombreCliente());
    }
    
    // Verificar D
    public void verificarDisponibilidad(Prenda prenda){
        if(prenda.isDisponibilidad()){
            System.out.println("La prenda se encuentra disponible: " + prenda.getNombre());
        }else{
            System.out.println("La prenda no está disponible" + prenda.getNombre());
        }
        
        
    }
    //Generar Informe
    public void generarInforme(){
        System.out.println("Informe tienda");
        for(Prenda prenda : catalogoPrendas){
            System.out.println("Prenda: "+ prenda.getNombre()+ "diponibilidad: "+ (prenda.isDisponibilidad()?"Está disponible":"No está disponible"));
        }
        
    }
    
}
