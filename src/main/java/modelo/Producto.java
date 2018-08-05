
package modelo;

/**
 *
 * @author HernySenpai
 */
public class Producto {    
    private String nombre;
    private String tipo;
    private String descripcion;
    private int Stock;
    private int precio;

    public Producto() {
    }

    public Producto(String nombre, String tipo, String descripcion, int Stock, int precio) {        
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.Stock = Stock;
        this.precio = precio;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
