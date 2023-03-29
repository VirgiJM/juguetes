/* Compradores: 
 * Se guarda un registro de los productos que han comprado, la fecha, cantidad, precio del juguete en ese momento y el descuento que se le hizo.
 * 
 */
package cat.paucasesnoves.swpro.toysandus;
import java.util.Date;
/**
 *
 * @author Virgi
 */
public class Cliente {
    private int cantidadProductosComprados;
    // Hacer arrayList de los productos que compró (nombre y tal).
    private String fecha;
    private int precio;
    private int descuento;
    
    // Constructor
    public Cliente(int cantidadProductosComprados, String fecha, int precio, int descuento) {
        this.cantidadProductosComprados = cantidadProductosComprados;
        this.fecha = fecha;
        this.precio = precio;
        this.descuento = descuento;
    }
    
    // Getters
    
    // ToString

    public int getCantidadProductosComprados() {
        return cantidadProductosComprados;
    }

    public void setCantidadProductosComprados(int cantidadProductosComprados) {
        this.cantidadProductosComprados = cantidadProductosComprados;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cantidadProductosComprados=" + cantidadProductosComprados + ", fecha=" + fecha + ", precio=" + precio + ", descuento=" + descuento + '}';
    }

    
}
