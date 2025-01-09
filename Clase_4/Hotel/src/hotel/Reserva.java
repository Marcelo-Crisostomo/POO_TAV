/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author marce
 */
public class Reserva {
    private String nombre;
    private String idReserva;
    private String fechaReserva;

    public Reserva(String nombre, String idReserva, String fechaReserva) {
        this.nombre = nombre;
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID Reserva: " + idReserva + ", Fecha: " + fechaReserva;
    }
}
