
package hotel;

import java.util.Scanner;

public class Hotel {

    
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        Hote hotel = new Hote();
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nueva reserva");
            System.out.println("2. Buscar reserva por nombre");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del huésped: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el ID de la reserva: ");
                    String idReserva = scanner.nextLine();
                    System.out.print("Ingrese la fecha de la reserva: ");
                    String fechaReserva = scanner.nextLine();
                    hotel.agregarReserva(new Reserva(nombre, idReserva, fechaReserva));
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del huésped: ");
                    String nombreBusqueda = scanner.nextLine();
                    hotel.buscarReservaPorNombre(nombreBusqueda);
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
    
}
