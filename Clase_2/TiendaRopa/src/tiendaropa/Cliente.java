
package tiendaropa;

import java.util.ArrayList;


public class Cliente {
    private int numeroCliente ;
    private String nombreCliente;
    private ArrayList<Prenda>prendasAdquiridas;
    
    //Cons

    public Cliente(int numeroCliente, String nombreCliente) {
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.prendasAdquiridas = new ArrayList<>();
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Prenda> getPrendasAdquiridas() {
        return prendasAdquiridas;
    }

    public void setPrendasAdquiridas(ArrayList<Prenda> prendasAdquiridas) {
        this.prendasAdquiridas = prendasAdquiridas;
    }
    //Venta
    public void realizarCompra(Prenda prenda){
        //Está disponible?
        if(prenda.isDisponibilidad()){
            //Agrego la prenda a la lista
            prendasAdquiridas.add(prenda);
            //Realizo la venta y queda como no disponible = false
            prenda.vender();
            
        }else{
            System.out.println("La prenda: " + prenda.getNombre()+ " No está disponible.");
        }
    }
    
    //Devolución 
    public void devolverPrenda(Prenda prenda){
        //Si el cliente tiene algo en su lista de prendas adquiridas
        if(prendasAdquiridas.contains(prenda)){
            prendasAdquiridas.remove(prenda);
            prenda.reponer();
        }
    }
    
    
}
