
package gestiondeempleados;


public abstract class Empleado {
    private String idEmpleado, nombreEmpleado;
    private double sueldoBaseEmpleado;
    
 //Constructor

    public Empleado(String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBaseEmpleado = sueldoBaseEmpleado;
    }
    
    //G&S

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSueldoBaseEmpleado() {
        return sueldoBaseEmpleado;
    }

    public void setSueldoBaseEmpleado(double sueldoBaseEmpleado) {
        this.sueldoBaseEmpleado = sueldoBaseEmpleado;
    }
    
    //TS

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", sueldoBaseEmpleado=" + sueldoBaseEmpleado + '}';
    }
    
    //Método para calcular el sueldo
    public double calcularSalario(){
        return sueldoBaseEmpleado;
    }
    
}
