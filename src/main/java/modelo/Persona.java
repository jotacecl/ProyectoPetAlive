
package modelo;

/**
 *
 * @author HernySenpai
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private String direccion;
    private String ciudad;
    private String region;
    private int telefono;
    private int movil;
    private String email;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String rut, String direccion, String ciudad,String region, int telefono, int movil, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.region = region;
        this.telefono = telefono;
        this.movil = movil;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getRegion(){
        return region;
    }
    
    public void setRegion(String region){
        this.region = region;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
