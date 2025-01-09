/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class Hote {
    private ArrayList<Reserva> reservas;

    public Hote() {
        this.reservas = new ArrayList<>();
    }

    public boolean agregarReserva(Reserva reserva) {
        if (reserva.getNombre().isEmpty() || reserva.getFechaReserva().isEmpty()) {
            System.out.println("Error: El nombre y la fecha no pueden estar vacíos.");
            return false;
        }
        for (Reserva r : reservas) {
            if (r.getIdReserva().equals(reserva.getIdReserva())) {
                System.out.println("Error: El ID de la reserva debe ser único.");
                return false;
            }
        }
        reservas.add(reserva);
        System.out.println("Reserva agregada con éxito.");
        return true;
    }

    public void buscarReservaPorNombre(String nombre) {
        boolean encontrada = false;
        for (Reserva r : reservas) {
            if (r.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(r);
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontraron reservas para el nombre: " + nombre);
        }
    }
}
