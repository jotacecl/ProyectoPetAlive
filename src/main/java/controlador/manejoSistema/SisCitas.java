
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
            this.vCitas = new VentanaCita(3, null);
        }
    }
    
    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     * @param index 
     */
    public void setDatosCitas(int index){
       Cita c = this.listaCitas.get(index);               
       
       this.vCitas = new VentanaCita(2,c);
    }
    
    /**
     * Metodo para crear una Cita nueva.
     * @param p 
     */
    public void crearCita(PestagnasInicio p) throws Exception{
        this.getAllDataCita();
          if(this.rutCliente.length()!=0 &&
                  this.paciente.length()!=0 &&
                  this.fechaIngreso.length()!=0){
            Cita c = new Cita(
                            this.paciente,
                            this.rutCliente,
                            this.fechaIngreso,
                            this.fechaCita,
                            this.motivo);
            this.listaCitas.add(c);
            
            Object[] fila = new Object[]{
            c.getPaciente(),
            c.getRutCliente(),
            c.getFechaIngreso(),
            c.getFechaCita(),
            c.getMotivoCita()};              
            p.pCitas.pnlTabla.modelo.addRow(fila);  
          }else{
              throw new Exception();
          }                                                         
    }
    
    /**
     * Metodo para editar una Cita ya exitente.
     * @param index
     * @param p 
     */
    public void editarCita(int index, PestagnasInicio p){
        this.getAllDataCita();
                
        this.listaCitas.get(index).setPaciente(this.paciente);
        this.listaCitas.get(index).setFechaIngreso(this.fechaIngreso);
        if(!this.fechaCita.equals("null-null-null")){
            this.listaCitas.get(index).setFechaCita(this.fechaCita);
        }
        this.listaCitas.get(index).setMotivoCita(this.motivo);
        
        Cita c = this.listaCitas.get(index);
                        
        p.pCitas.pnlTabla.modelo.setValueAt(c.getPaciente(), index, 0);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getRutCliente(), index, 1);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getFechaIngreso(), index, 2);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getFechaCita(), index, 3);
        p.pCitas.pnlTabla.modelo.setValueAt(c.getMotivoCita(), index, 4);
                
    }
    
    /**
     * Metodo para eliminar la cita seleccionada.
     * @param p 
     */
    public void eliminarCita(PestagnasInicio p){
        this.listaCitas.remove(p.pCitas.pnlTabla.tabla.getSelectedRow());
        p.pCitas.pnlTabla.modelo.removeRow(p.pCitas.pnlTabla.tabla.getSelectedRow());
    }
    
    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataCita(){               
        this.paciente = this.vCitas.pnlDatos.txtPaciente.getText();
        this.rutCliente = this.vCitas.pnlDatos.txtRUT.getText();
        this.fechaIngreso = this.vCitas.pnlDatos.txtFIngreso.getText();   
        
        String fechaSeleccionada = String.format(this.vCitas.pnlDatos.FORMATO, 
        this.vCitas.pnlDatos.calendario.getDate());
        this.fechaCita = fechaSeleccionada;
        
        this.motivo = this.vCitas.pnlDatos.txtMotivo.getText();
    }
    
}
