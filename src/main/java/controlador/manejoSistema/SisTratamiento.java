
package controlador.manejoSistema;

import vista.vistaTratamiento.VentanaTratamiento;

/**
 *
 * @author Juan Carlos
 */
public class SisTratamiento {
    
    public VentanaTratamiento vTrat;    
    private String texto;    
    
    /**
     * Metodo para iniciar la ventana de Tratamiento, se desplega con o sin info segun se requiera.
     * @param index
     * @param sFP 
     */
    public void iniciarTratamiento(SisFichaPaciente sFP, int index){        
            if(sFP.listaPacientes.size()!=0){
                this.getTratamiento(sFP, index);   
            }else{
               this.vTrat = new VentanaTratamiento(2, ""); 
            }           
    }
    
    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     * @param sFP
     * @param index
     */
    public void getTratamiento(SisFichaPaciente sFP, int index){  
        try{
        if(!sFP.listaPacientes.isEmpty()){
            if(sFP.listaPacientes.get(index).getTratamiento() == null){
               this.vTrat = new VentanaTratamiento(2, "");
            }else{
               this.texto = sFP.listaPacientes.get(index).getTratamiento();
               this.vTrat = new VentanaTratamiento(1, this.texto);
            }     
        }                              
        }catch(Exception e){
            e.getCause();
        }
    }        
    
    /**
     * Metodo para ingresar el tratamiento. 
     * @param sFP
     * @param index
     */
    public void setTratamiento(SisFichaPaciente sFP, int index){
        try{
            this.getAllDataTratamiento();
            if(!sFP.listaPacientes.isEmpty()){
                sFP.listaPacientes.get(index).setTratamiento(this.texto);  
            }
        }catch(NullPointerException e){
            e.getCause();
        }
    }
    
    /**
     * Metodo para obtener la info del Tratamiento. 
     */
    public void getAllDataTratamiento(){
        try{
            this.texto = this.vTrat.pnlTexto.areaTexto.getText();        
        }catch(NullPointerException e){
            e.getCause();
        }
    }
        
        
    
}
