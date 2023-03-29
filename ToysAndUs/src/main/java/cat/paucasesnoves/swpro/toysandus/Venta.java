/* Hacer como si fuera una factura
 * 
 */
package cat.paucasesnoves.swpro.toysandus;
import java.util.Date;
/**
 *
 * @author Virgi
 */
public class Venta {
    private Juguete juguete;
    private Proveedor proveedor;
    private Cliente cliente;
    private Compra compra;
    private int precio;
    private Date fecha;

    // Constructor
    public Venta(Juguete juguete, Proveedor proveedor, Cliente cliente, Compra compra, int precio, Date fecha) {
        this.juguete = juguete;
        this.proveedor = proveedor;
        this.cliente = cliente;
        this.compra = compra;
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
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
    
    //ToString

    @Override
    public String toString() {
        return "Venta{" + "juguete=" + juguete + ", proveedor=" + proveedor + ", cliente=" + cliente + ", compra=" + compra + ", precio=" + precio + ", fecha=" + fecha + '}';
    }
    
    
    
}
