
package gestiondeempleados;

import java.util.ArrayList;


public class Departamento {
    //Atributos 
    private String idDepartamento, nombreDepartamento;
    private ArrayList<Empleado> listaDeEmpleados;
    
 //Constructor

    public Departamento(String idDepartamento, String nombreDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.listaDeEmpleados =new ArrayList<>();
    }
    
    //Método para agregar empleados
    public void agregarEmpleado(Empleado empleadoParaAgregar){
        listaDeEmpleados.add(empleadoParaAgregar);
    }
    
    //Método para calcular el costo total de los sueldos
    
    public double calcularCostoTotalSueldos(){
        double total = 0.0;
        for(Empleado EmpleadoEncontradoPorElFor : listaDeEmpleados){
            total += EmpleadoEncontradoPorElFor.calcularSalario();
        }
        System.out.println(total);
        return  total;
    }
    
    //Método para mostrar info de departamento y sus empleados
    public void mostrarEmpleados(){
        System.out.println("Departamento: "+ nombreDepartamento );
        for (Empleado empleadoEncontrado : listaDeEmpleados){
            System.out.println(empleadoEncontrado.getNombreEmpleado() + "Salario total:" + empleadoEncontrado.calcularSalario());
        }
    }
    
}
