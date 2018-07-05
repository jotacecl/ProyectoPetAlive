
package modelo;

/**
 *
 * @author Juan Carlos
 */
public class Cita {
    
    private String idPaciente;
    private String paciente;
    private String rutCliente;
    private String fechaIngreso;
    private String fechaCita;
    private String motivoCita;
    
    public Cita(){
        
    }

    public Cita(String idPaciente, String paciente, String rutCliente, String fechaIngreso, String fechaCita, String motivoCita) {
        this.idPaciente = idPaciente;
        this.paciente = paciente;
        this.rutCliente = rutCliente;
        this.fechaIngreso = fechaIngreso;
        this.fechaCita = fechaCita;
        this.motivoCita = motivoCita;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }
    
    
    
}
