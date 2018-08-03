
package controlador.manejoSistema;

import java.util.ArrayList;
import modelo.Cita;
import vista.vistaCitas.VentanaCita;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisCitas {
    
    public VentanaCita vCitas;
    public final ArrayList<Cita> listaCitas = new ArrayList<>();
    private String idPaciente;
    private String paciente;
    private String rutCliente;
    private String fechaIngreso;
    private String fechaCita;
    private String motivo;
    
    /**
     * Metodo para iniciar la ventana de Citas, se desplega con o sin info segun se requiera.
     * @param btnSeleccionado
     * @param p 
     */
    public void iniciarCitas(int btnSeleccionado, PestagnasInicio p){
        int index = p.pCitas.pnlTabla.tabla.getSelectedRow();
        if(btnSeleccionado == 1){           
            this.setDatosCitas(index);
        }else if(btnSeleccionado == 2){
            this.vCitas = new VentanaCita(3, "", "", "", " ", "", "");
        }
    }
    
    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     * @param index 
     */
    public void setDatosCitas(int index){
       this.idPaciente = this.listaCitas.get(index).getIdPaciente();
       this.paciente = this.listaCitas.get(index).getPaciente();
       this.rutCliente = this.listaCitas.get(index).getRutCliente();
       this.fechaIngreso = this.listaCitas.get(index).getFechaIngreso();
       this.fechaCita = this.listaCitas.get(index).getFechaCita();
       this.motivo = this.listaCitas.get(index).getMotivoCita();
       
       this.vCitas = new VentanaCita(2,
               idPaciente,
               paciente,
               rutCliente,
               fechaIngreso,
               fechaCita,
               motivo);
    }
    
    /**
     * Metodo para crear una Cita nueva.
     * @param p 
     */
    public void crearCita(PestagnasInicio p){
        this.getAllDataCita();
                
        Cita c = new Cita(this.idPaciente,
                            this.paciente,
                            this.rutCliente,
                            this.fechaIngreso,
                            this.fechaCita,
                            this.motivo);
        this.listaCitas.add(c);
        
        Object[] fila = new Object[]{c.getIdPaciente(),
            c.getPaciente(),
            c.getRutCliente(),
            c.getFechaIngreso(),
            c.getFechaCita(),
            c.getMotivoCita()};              
        p.pCitas.pnlTabla.modelo.addRow(fila);                           
        
    }
    
    /**
     * Metodo para editar una Cita ya exitente.
     * @param index
     * @param p 
     */
    public void editarCita(int index, PestagnasInicio p){
        this.getAllDataCita();
        
        this.listaCitas.get(index).setIdPaciente(this.idPaciente);
        this.listaCitas.get(index).setPaciente(this.paciente);
        this.listaCitas.get(index).setFechaIngreso(this.fechaIngreso);
        if(!this.fechaCita.equals("null-null-null")){
            this.listaCitas.get(index).setFechaCita(this.fechaCita);
        }
        this.listaCitas.get(index).setMotivoCita(this.motivo);
        
        Cita c = this.listaCitas.get(index);
                
        p.pCitas.pnlTabla.modelo.setValueAt(c.getIdPaciente(), index, 0);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getPaciente(), index, 1);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getRutCliente(), index, 2);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getFechaIngreso(), index, 3);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getFechaCita(), index, 4);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getMotivoCita(), index, 5);
                
    }
    
    public void buscarCita(String rut){
        
    }
    
    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataCita(){        
        this.idPaciente = this.vCitas.pnlDatos.txtID.getText();
        this.paciente = this.vCitas.pnlDatos.txtPaciente.getText();
        this.rutCliente = this.vCitas.pnlDatos.txtRUT.getText();
        this.fechaIngreso = this.vCitas.pnlDatos.txtFIngreso.getText();   
        
        String fechaSeleccionada = String.format(this.vCitas.pnlDatos.FORMATO, 
                this.vCitas.pnlDatos.calendario.getDate());
        this.fechaCita = fechaSeleccionada;
        
        this.motivo = this.vCitas.pnlDatos.txtMotivo.getText();
    }
    
}