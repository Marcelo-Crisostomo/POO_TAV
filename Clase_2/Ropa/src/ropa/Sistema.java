/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropa;

import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class Sistema {
        // Atributos de la clase Sistema
    private ArrayList<Prenda> catalogoPrendas;
    private ArrayList<Cliente> clientesRegistrados;
    private ArrayList<Proveedor> proveedoresActivos;

    // Constructor
    public Sistema() {
        this.catalogoPrendas = new ArrayList<>();
        this.clientesRegistrados = new ArrayList<>();
        this.proveedoresActivos = new ArrayList<>();
    }

    // Métodos
    public void registrarPrenda(Prenda prenda) {
        catalogoPrendas.add(prenda);
        System.out.println("Prenda registrada: " + prenda.getNombre());
    }

    public void registrarCliente(Cliente cliente) {
        clientesRegistrados.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }

    public void registrarProveedor(Proveedor proveedor) {
        proveedoresActivos.add(proveedor);
        System.out.println("Proveedor registrado: " + proveedor.getNombre());
    }

    public void generarInformeVentas() {
        System.out.println("Informe de Ventas:");
        for (Prenda prenda : catalogoPrendas) {
            System.out.println("Prenda: " + prenda.getNombre() + " - Disponible: " + (prenda.isDisponible() ? "Sí" : "No"));
        }
    }
}
