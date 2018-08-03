
package modelo;


/**
 *
 * @author Juan Carlos
 */
public class Insumo {
    
    private String nombre;
    private String cantidad;
    private int costo;   
    private int idPaciente;
    
    public Insumo() {
    }  

    public Insumo(String nombre, String cantidad, int costo) {
        this.nombre = nombre;
        this.cantidad= cantidad;
        this.costo = costo;        
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }           
            
}
