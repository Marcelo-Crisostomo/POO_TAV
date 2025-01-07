
package tiendaropa;

import java.util.ArrayList;


public class Proveedor {
    private int codigoProveedor;
    private String nombreProveedor;
    private ArrayList<Prenda> prendasSuministradas;
    
    //C

    public Proveedor(int codigoProveedor, String nombreProveedor) {
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.prendasSuministradas = new ArrayList<>();
    }
    
    //

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public ArrayList<Prenda> getPrendasSuministradas() {
        return prendasSuministradas;
    }

    public void setPrendasSuministradas(ArrayList<Prenda> prendasSuministradas) {
        this.prendasSuministradas = prendasSuministradas;
    }
    
    public void suministrarPrendas(Prenda prenda){
        prendasSuministradas.add(prenda);
        prenda.reponer();
        System.out.println(nombreProveedor+" ha suministrado la prenda " + prenda.getNombre());
        
    }
    
}
