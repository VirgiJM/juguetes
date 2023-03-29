/* Marca, nombre y descripción para enseñar a la web.
 * Tipos de juguetes, como de mesa. Últimamente se han añadido los de Nintendo.
 * Están clasificados por rango de edad: 0-3, 4-8, 8-12, 12-17, +18.
 * Hay que controlar las cantidad.
 */
package cat.paucasesnoves.swpro.toysandus;

/**
 *
 * @author Virgi
 */
public class Juguete {
    private Marca marca;
    private String nombreJuguete;
    private String descripcion;
    private String tipoJuguete;
    private int cantidad;
    private boolean finExistencias = false;
    private int rango;
    /* Rango 1: 0-3.
    Rango 2: 4-8
    Rango 3: 8-12
    Rango 4: 13-17
    Rango 5: +18
    
    Creo que se podría hacer un método o algo para informar que edades incluye cada rango.
    */
    
    /* Hacer método con el que comprobaremos si hay fin de cantidad. Si cantidad = 0, entonces finExistencia será true. Habrá que avisar al sistema
    de que ya no quedan juguetes de ese tipo.
    */
    
    // Constructor

    public Juguete(Marca marca, String nombreJuguete, String descripcion, String tipoJuguete, int rango, int cantidad) {
        this.marca = marca;
        this.nombreJuguete = nombreJuguete;
        this.descripcion = descripcion;
        this.tipoJuguete = tipoJuguete;
        this.rango = rango;
        this.cantidad = cantidad;
    }
    
    // Getters y Setters

    public Marca getNombreMarca() {
        return marca;
    }

    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipoJuguete() {
        return tipoJuguete;
    }

    public int getRango() {
        return rango;
    }

    public int getcantidad() {
        return cantidad;
    }

    public boolean isfinExistencias() {
        return finExistencias;
    }
    
    
    // Método para el rango de edad. Quizás no es necesario.
    public String rangoEdades (int rango) {
        return switch (rango) {
            case 1 -> "Rango 1: 0-3";
            case 2 -> "Rango 2: 4-8";
            case 3 -> "Rango 3: 8-12";
            case 4 -> "Rango 4: 13-17";
            case 5 -> "Rango 5: +18";
            default -> null;
        };
    }
    
    // Método para comprobar si quedan copias de un juguete o si se han terminado
    public boolean cantidadJuguete (String nombreDelJuguete) {
        if (nombreDelJuguete.equals(getNombreJuguete())) {
            if (cantidad > 0) {
            finExistencias = true;
            return finExistencias;
        } else {
            return finExistencias;
        }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "nombreMarca=" + marca + ", nombreJuguete=" + nombreJuguete + ", descripcion=" + descripcion + ", tipoJuguete=" + tipoJuguete + ", rango=" + rango + ", cantidad=" + cantidad + /*", finExistencias=" + finExistencias*/ + '}';
    }
    
    
}
