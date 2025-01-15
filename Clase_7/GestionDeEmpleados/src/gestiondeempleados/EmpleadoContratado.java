
package gestiondeempleados;

public class EmpleadoContratado extends Empleado implements BonusCalculable {
    //Constructor
    public EmpleadoContratado(String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado) {
        super(idEmpleado, nombreEmpleado, sueldoBaseEmpleado);
    }
    
    //Implementar el método de la interface
    @Override
    public double calcularBono(){
        return getSueldoBaseEmpleado() * 0.10;//Un bono del 10% al empleado
    }
    
    //Calcular salario
    public double calcularSalario(){
    /// sueldo base + bono 
        return getSueldoBaseEmpleado() + calcularBono();
    }
    
    
    
}
