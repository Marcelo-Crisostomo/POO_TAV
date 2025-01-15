package gestiondeempleados;

public class EmpleadoPartTime extends Empleado implements BonusCalculable {
    private int horasTrabajadas;
    private double precioPorHora;
//Constructor
    public EmpleadoPartTime(int horasTrabajadas, double precioPorHora, String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado) {
        super(idEmpleado, nombreEmpleado, sueldoBaseEmpleado);
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }
    
       //Implementar el método de la interface
    @Override
    public double calcularBono(){
        return horasTrabajadas * precioPorHora * 0.05;//Un bono del 5% al empleado
    }
    
    //Calcular salario
    @Override
    public double calcularSalario(){
    /// sueldo base + bono 
        return horasTrabajadas * precioPorHora + calcularBono();
    }
    
}
