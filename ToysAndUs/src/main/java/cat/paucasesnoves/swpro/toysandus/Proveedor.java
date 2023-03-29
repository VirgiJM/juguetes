/*Proveedores: 
 * Sirven diferentes juguetes de diferentes marcas.
 * Ponerse en contacto con ellos y saber que juguetes ofrecen y su precio.
 */
package cat.paucasesnoves.swpro.toysandus;

/**
 *
 * @author Virgi
 */
public class Proveedor {

    private Juguete juguete;
    private Marca marca;
    private int precioJuguete;
    private Compra compra;

    // Constructor

    public Proveedor(Juguete juguete, Marca marca, int precioJuguete, Compra compra) {
        this.juguete = juguete;
        this.marca = marca;
        this.precioJuguete = precioJuguete;
        this.compra = compra;
    }

    
    
    // Getters

    public Juguete getjuguete() {
        return juguete;
    }

    public Marca getmarca() {
        return marca;
    }

    public int getPrecioJuguete() {
        return precioJuguete;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public Marca getMarca() {
        return marca;
    }

    public Compra getCompra() {
        return compra;
    }

    
    // ToString
    @Override
    public String toString() {
        return "Proveedor{" + "juguete=" + juguete + ", marca=" + marca + ", precioJuguete=" + precioJuguete + '}';
    }
    
    
}
