
package controlador.manejoSistema;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Paciente;
import vista.vistaFichaPaciente.VentanaFichaPaciente;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisFichaPaciente {
    public VentanaFichaPaciente vFPaciente;
    private final ArrayList<String> listaEspecies = new ArrayList<>();
    public final ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public String nombreP;
    public String especie;
    public String raza;
    public String color;
    public String fNac;
    public String tamannoJaula;
    public String internado;
    public String sexo;
    public String antMed;
    public String rut;
    private int nroJaula;
    private int idPaciente;
    
    /**
     * Metodo para iniciar la ventana de Ficha Paciente, se desplega con o sin info segun se requiera.
     * @param btnSeleccionado
     * @param p 
     */
    public void iniciarFPaciente(int btnSeleccionado, PestagnasInicio p){
        int index = p.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
        if(btnSeleccionado == 1){
            this.setDatosFPaciente(index);
        }else if(btnSeleccionado == 2){
            this.vFPaciente = new VentanaFichaPaciente(null, false, 3);
            this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for(Object l:listaEspecies){
                this.vFPaciente.pnlDatos.cbTipo.addItem(l);
            }
        }
    }
    
    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     * @param index 
     */
    public void setDatosFPaciente(int index){
        
        Paciente p = this.listaPacientes.get(index);
                
        this.antMed = this.listaPacientes.get(index).getAntecedentes();
        
        if(this.internado.equals("si")){
            this.vFPaciente = new VentanaFichaPaciente(
                    p, 
                    true, 
                    2);
            this.vFPaciente.pnlDatos.grupoRB2.setSelected(this.vFPaciente.pnlDatos.rbSi.getModel(), true);
        }else if(this.internado.equals("no")){
            this.vFPaciente = new VentanaFichaPaciente(
                    p, 
                    false, 
                    2);
            this.vFPaciente.pnlDatos.grupoRB2.setSelected(this.vFPaciente.pnlDatos.rbNo.getModel(), true);
        }
        
        if(this.sexo.equals("macho")){
            this.vFPaciente.pnlDatos.grupoRB.setSelected(this.vFPaciente.pnlDatos.rbMacho.getModel(), true);
        }else if(this.sexo.equals("hembra")){
            this.vFPaciente.pnlDatos.grupoRB.setSelected(this.vFPaciente.pnlDatos.rbHembra.getModel(), true);
        }
        
        this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for(String l:listaEspecies){
            this.vFPaciente.pnlDatos.cbTipo.addItem(l);
            }
        this.vFPaciente.pnlDatos.cbTipo.setSelectedItem(this.especie);
        
        this.vFPaciente.pnlDatos.cbTJaula.setSelectedItem(this.tamannoJaula);        
        this.vFPaciente.pnlDatos.cbNJaula.removeAllItems();
             
        if(this.nroJaula == 0){            
            this.vFPaciente.pnlDatos.cbNJaula.addItem(1);   
            this.vFPaciente.pnlDatos.cbNJaula.setSelectedItem(1);
        }else{
            this.vFPaciente.pnlDatos.cbNJaula.addItem(this.nroJaula);   
            this.vFPaciente.pnlDatos.cbNJaula.setSelectedItem(this.nroJaula);
        }
        
    }
    
    /**
     * Metodo para crear una ficha de paciente nueva.
     * @param pi 
     */
    public void crearFPaciente(PestagnasInicio pi){
        this.getAllDataPaciente();
        
        if(!this.nombreP.equals("")&&!this.especie.equals("")&&!this.raza.equals("")&&!this.rut.equals("")){
                            
        Paciente p = new Paciente(Integer.toString(this.idPaciente),
                                    this.nombreP,
                                    this.especie,
                                    this.raza,
                                    this.color,
                                    this.fNac,
                                    this.sexo,
                                    this.internado,                                
                                    this.rut,
                                    this.tamannoJaula,   
                                    this.nroJaula,
                                    this.antMed);
        this.listaPacientes.add(p);        
        
        Object[] fila = new Object[]{
            p.getId(),
            p.getNombre(),
            p.getEspecie(),
            p.getRaza(),
            p.getColor(),
            p.getfNacimiento(),
            p.getSexo(),
            p.getInternado(),
            p.getTamannoJaula()+" "+p.getNroJaula()
        };
        
        pi.pFicheros.pPacientes.pnlTabla.modelo.addRow(fila);         
        }        
        
    }
    
    /**
     * Metodo para editar una ficha ya exitente.
     * @param index
     * @param pi 
     */
    public void editarFPaciente(int index, PestagnasInicio pi){
        this.getAllDataPaciente();
        
        this.listaPacientes.get(index).setNombre(this.nombreP);
        this.listaPacientes.get(index).setEspecie(this.especie);
        this.listaPacientes.get(index).setRaza(this.raza);
        this.listaPacientes.get(index).setColor(this.color);
        if(!this.fNac.equals("null-null-null")){  
            this.listaPacientes.get(index).setfNacimiento(this.fNac);
        }
        this.listaPacientes.get(index).setSexo(this.sexo);
        this.listaPacientes.get(index).setInternado(this.internado);
        this.listaPacientes.get(index).setTamannoJaula(this.tamannoJaula);
        this.listaPacientes.get(index).setNroJaula(this.nroJaula);
        this.listaPacientes.get(index).setRutCliente(this.rut);
        
        Paciente p = this.listaPacientes.get(index);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getNombre(), index, 1);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getEspecie(), index, 2);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getRaza(), index, 3);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getColor(), index, 4);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getfNacimiento(), index, 5);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getSexo(), index, 6);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getInternado(), index, 7);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getTamannoJaula()+" "+p.getNroJaula(), index, 8);
        
    }
    
    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataPaciente(){
        this.idPaciente = this.listaPacientes.size();
        this.nombreP = this.vFPaciente.pnlDatos.txtPaciente.getText();
        this.especie = (String)this.vFPaciente.pnlDatos.cbTipo.getSelectedItem();
        this.raza = this.vFPaciente.pnlDatos.txtRaza.getText();
        this.color = this.vFPaciente.pnlDatos.txtColor.getText();
        
        String fechaSeleccionada = String.format(this.vFPaciente.pnlDatos.FORMATO, this.vFPaciente.pnlDatos.calendario.getDate());
        this.fNac = fechaSeleccionada;
        
        if(this.vFPaciente.pnlDatos.grupoRB.getSelection() == this.vFPaciente.pnlDatos.rbMacho.getModel()){
                this.sexo = "macho";
        }else if(this.vFPaciente.pnlDatos.grupoRB.getSelection() == this.vFPaciente.pnlDatos.rbHembra.getModel()){
                this.sexo = "hembra";
        }
        
        if(this.vFPaciente.pnlDatos.grupoRB2.getSelection() == this.vFPaciente.pnlDatos.rbSi.getModel()){
                this.internado = "si";
                this.tamannoJaula = (String)this.vFPaciente.pnlDatos.cbTJaula.getSelectedItem();                
                this.nroJaula = (int) this.vFPaciente.pnlDatos.cbNJaula.getSelectedItem();
        }else if(this.vFPaciente.pnlDatos.grupoRB2.getSelection() == this.vFPaciente.pnlDatos.rbNo.getModel()){
                this.internado = "no";
                this.tamannoJaula = "0";
                this.nroJaula = 0;
        }
                
        this.rut = this.vFPaciente.pnlDatos.txtCliente.getText();
        this.antMed = this.vFPaciente.pnlAMedicos.ingAntecedentesMedicos.getText();
    }
    
    /**
     * Metodo para agregar una especie nueva al JComboBox y la lista de especies.
     * @param especie 
     */
    public void setEspecie(String especie){
         if(especie != null){
            this.listaEspecies.add(especie);
            Collections.sort(this.listaEspecies);
            this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for(String l:listaEspecies){
            this.vFPaciente.pnlDatos.cbTipo.addItem(l);
            }
             System.out.println("Especie: "+especie+" agregada.");
        }else{
            System.out.println("null");
        } 
    }
    
    /**
     * Metodo para editar la especie seleccionada en el JComboBox.
     * @param especieEditada 
     */
    public void editarEspecia(String especieEditada){
        if(especieEditada != null){
            this.eliminarEspecie();
            this.setEspecie(especieEditada);
        }else{
            System.out.println("null");
        } 
    }

    /**
     * Metodo para eliminar la especie seleccionada en el JComboBox
     */
    public void eliminarEspecie(){
        for(int i =0; i<listaEspecies.size(); i++){
            if((String)this.vFPaciente.pnlDatos.cbTipo.getSelectedItem()==this.listaEspecies.get(i)){
                this.listaEspecies.remove(i);
            }
        }
        this.vFPaciente.pnlDatos.cbTipo.removeItemAt(this.vFPaciente.pnlDatos.cbTipo.getSelectedIndex());
    }
    
    /**
     * Metodo para rellenar la lista de jaulas en el JComboBox de Ficha Paciente.
     * @param cantidadJaulas 
     */
    public void setJaulas(int cantidadJaulas){
        if(cantidadJaulas != -1){                       
            this.vFPaciente.pnlDatos.cbNJaula.removeAllItems();            
            for(int i=0; i<cantidadJaulas; i++){
            this.vFPaciente.pnlDatos.cbNJaula.addItem(i+1);            
            }             
        }else{
            System.out.println("null");
        }                
    }
    
}
