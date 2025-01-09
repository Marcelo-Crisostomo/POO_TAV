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
public class Cliente {
        // Atributos de la clase Cliente
    private String numeroCliente;
    private String nombre;
    private ArrayList<Prenda> prendasAdquiridas;

    // Constructor
    public Cliente(String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.prendasAdquiridas = new ArrayList<>();
    }
    public Cliente (){
        
    }
  
    

    // Métodos getter
    public String getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      

    // Método para realizar una compra
    public void realizarCompra(Prenda prenda) {
        if (prenda.isDisponible()) {
            prendasAdquiridas.add(prenda);
            prenda.vender();
        } else {
            System.out.println("La prenda " + prenda.getNombre() + " no está disponible.");
        }
    }

    // Método para devolver una prenda
    public void devolverPrenda(Prenda prenda) {
        if (prendasAdquiridas.contains(prenda)) {
            prendasAdquiridas.remove(prenda);
            prenda.reponerInventario();
        } else {
            System.out.println("La prenda no fue adquirida por este cliente.");
        }
    }
}
