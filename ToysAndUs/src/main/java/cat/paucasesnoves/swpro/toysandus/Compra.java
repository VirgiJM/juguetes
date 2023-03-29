/*
 * 
 */
package cat.paucasesnoves.swpro.toysandus;
import java.util.Date;
/**
 *
 * @author Virgi
 */
public class Compra {
    private Juguete juguete;
    private Proveedor proveedor;
    private Cliente cliente;
    private int precio;
    private Date fecha;
    
    
    // Constructor
     public Compra(Juguete juguete, Proveedor proveedor, Cliente cliente, int precio, Date fecha) {
        this.juguete = juguete;
        this.proveedor = proveedor;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = fecha;
    }
    
    // Getters y Setters
    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    // ToString

    @Override
    public String toString() {
        return "Compra{" + "juguete=" + juguete + ", proveedor=" + proveedor + ", cliente=" + cliente + ", precio=" + precio + ", fecha=" + fecha + '}';
    }

    

   
}
