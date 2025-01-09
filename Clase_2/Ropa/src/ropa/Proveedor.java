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
public class Proveedor {
     // Atributos de la clase Proveedor
    private String codigoProveedor;
    private String nombre;
    private ArrayList<Prenda> prendasSuministradas;

    // Constructor
    public Proveedor(String codigoProveedor, String nombre) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.prendasSuministradas = new ArrayList<>();
    }

    // Métodos
    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void suministrarPrenda(Prenda prenda) {
        prendasSuministradas.add(prenda);
        prenda.reponerInventario();
        System.out.println(nombre + " ha suministrado la prenda " + prenda.getNombre());
    }
}
