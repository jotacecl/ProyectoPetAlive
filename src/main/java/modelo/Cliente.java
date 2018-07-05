
package modelo;

/**
 *
 * @author HernySenpai
 */
public class Cliente extends Persona{
    
    private int deuda;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String rut,String direccion, String ciudad, String region, int telefono, int movil, String email) {
        super(nombre, apellido, rut, direccion, ciudad, region, telefono, movil, email);
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }
        
    
}
