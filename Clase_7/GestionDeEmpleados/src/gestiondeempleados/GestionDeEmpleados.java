
package gestiondeempleados;


public class GestionDeEmpleados {

    
    public static void main(String[] args) {
       //Crear un departamento 
       Departamento depto1 = new Departamento("001", "Contabilidad");
        Departamento depto2 = new Departamento("002", "Informática");
        
        
       //Crear empleados
       Empleado empleado1 = new EmpleadoContratado("001","Marcelo", 500000.0);
       Empleado empleado3 = new EmpleadoContratado("001","Benjamín", 500000.0);
       //int horasTrabajadas, double precioPorHora, String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado
       Empleado empleado2 = new EmpleadoPartTime(100, 10000.0 , "002", "Raúl", 100000 );
       

       ///Asignar empleados a un departamento
        depto1.agregarEmpleado(empleado2);
        depto2.agregarEmpleado(empleado3);
        depto2.agregarEmpleado(empleado1);
                
                
       //mostrar la información de los deptos y los empleados
       depto1.mostrarEmpleados();
       depto2.mostrarEmpleados();
       
       //Calcular el costo total de los sueldos
       
        System.out.println("Costo total de los sueldos");
        depto1.calcularCostoTotalSueldos();
        depto2.calcularCostoTotalSueldos();
    }
    
}
