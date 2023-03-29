/* Marcas
 * Saber el nombre y datos de contacto. Tienen proveedores.
 */
package cat.paucasesnoves.swpro.toysandus;

/**
 *
 * @author Virgi
 */
public class Marca {
    private String nombreMarca;
    private int telefono;
    private String email;
    private String direccion;
    
    // Constructor

    public Marca(String nombreMarca, int telefono, String email, String direccion) {
        this.nombreMarca = nombreMarca;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }
    
    // Getters
    public String getNombreMarca() {
        return nombreMarca;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }


    // Setters

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
    // ToString
    @Override
    public String toString() {
        return "Marca{" + "nombreMarca=" + nombreMarca + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion +'}';
    }
    
    
}
