
package controlador.manejoSistema;

import vista.vistaTratamiento.VentanaTratamiento;

/**
 *
 * @author Juan Carlos
 */
public class SisTratamiento {
    
    public VentanaTratamiento vTrat;    
    private String texto;    
    
    public void iniciarTratamiento(SisFichaPaciente sFP, int index){
        
        if(sFP.listaPacientes.size()!=0){
            this.getTratamiento(sFP, index);   
        }else{
           this.vTrat = new VentanaTratamiento(2, ""); 
        }                   
    }
    
    public void getTratamiento(SisFichaPaciente sFP, int index){                   
        
        if(sFP.listaPacientes.get(index).getTratamiento() == null){
            this.vTrat = new VentanaTratamiento(2, "");
        }else{
            this.texto = sFP.listaPacientes.get(index).getTratamiento();
            this.vTrat = new VentanaTratamiento(1, this.texto);
        }                        
    }        
    
    public void setTratamiento(SisFichaPaciente sFP, int index){
        this.getAllDataTratamiento();
        
        sFP.listaPacientes.get(index).setTratamiento(this.texto);        
    }
    
    public void getAllDataTratamiento(){
        this.texto = this.vTrat.pnlTexto.areaTexto.getText();        
    }
        
        
    
}
