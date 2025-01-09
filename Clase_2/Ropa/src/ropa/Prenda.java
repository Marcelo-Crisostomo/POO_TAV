/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropa;

/**
 *
 * @author marce
 */
public class Prenda {
        // Atributos de la clase Prenda
    private String codigo;
    private String nombre;
    private String marca;
    private String categoria;
    private boolean disponibilidad;

    // Constructor
    public Prenda(String codigo, String nombre, String marca, String categoria, boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    // Métodos getter y setter
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Método para vender la prenda
    public void vender() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("La prenda " + nombre + " ha sido vendida.");
        } else {
            System.out.println("La prenda " + nombre + " no está disponible.");
        }
    }

    // Método para reponer el inventario
    public void reponerInventario() {
        disponibilidad = true;
        System.out.println("La prenda " + nombre + " ha sido repuesta en el inventario.");
    }
}
