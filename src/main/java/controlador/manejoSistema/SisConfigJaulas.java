
package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import modelo.Paciente;
import vista.vistaJaulas.VentanaCJaulas;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisConfigJaulas {
    
    public ManejoDeDatos mD;
    public VentanaCJaulas vCJaulas;
    public ArrayList<String> cantidadJaulas = new ArrayList<>(3);
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO = "jaulas.json";

    public SisConfigJaulas(PestagnasInicio p, SisFichaPaciente sFP) {
        this.mD = new ManejoDeDatos();
        this.cargarDatos(p, sFP);
    }        
    
    /**
     * Metodo para iniciar la ventana de Configuracion de Jaulas.
     */
    public void iniciarCJaulas(){
        
        if(cantidadJaulas.size() == 3){
            this.vCJaulas = new VentanaCJaulas(cantidadJaulas.get(0), 
                    cantidadJaulas.get(1), 
                    cantidadJaulas.get(2));
        }else{
            this.vCJaulas = new VentanaCJaulas("","","");            
        }        
    }
    
    /**
     * Metodo para obtener los datos en los JTextfields de la ventana.
     */
    public void setDatosJaula(){
        try{
            if(this.cantidadJaulas.isEmpty()){
                for(int i = 0; i<3 ;i++){
                this.cantidadJaulas.add("");            
                }
            }
            this.cantidadJaulas.set(0, this.vCJaulas.pnlCJaulas.txtCL.getText());
            this.cantidadJaulas.set(1, this.vCJaulas.pnlCJaulas.txtCM.getText());
            this.cantidadJaulas.set(2, this.vCJaulas.pnlCJaulas.txtCS.getText()); 
            mD.escritura(this.cantidadJaulas, RUTA+ARCHIVO);
        }catch(Exception e){
            e.getCause();
        }
    }
    
    /**
     * Metodo para actualizar la pestaña de Jaulas.
     * @param p 
     */
    public void actualizarJaulas(PestagnasInicio p){
        try{
            p.pJaulas.pJaulas.setCantidadJaulasL(Integer.valueOf(cantidadJaulas.get(0)));
            p.pJaulas.pJaulas.setCantidadJaulasM(Integer.valueOf(cantidadJaulas.get(1)));
            p.pJaulas.pJaulas.setCantidadJaulasS(Integer.valueOf(cantidadJaulas.get(2)));
            p.pJaulas.pJaulas.removeAll();
            p.pJaulas.pJaulas.updateUI();
            p.pJaulas.pJaulas.repaint();
            p.pJaulas.pJaulas.iniciarComponentes();
        }catch(Exception e){
            e.getCause();
        }
    }  
    
    /**
     * Metodo para cambiar el icono de la Jaula en la pestaña Jaulas.
     * @param ocupada
     * @param tamannoJaula
     * @param nroJaula
     * @param p 
     */
    public void setJaulaOcupada(boolean ocupada, String tamannoJaula,int nroJaula, PestagnasInicio p){
        try{
            if(!p.pJaulas.pJaulas.jaulasL.isEmpty() && 
                    !p.pJaulas.pJaulas.jaulasM.isEmpty() && 
                    !p.pJaulas.pJaulas.jaulasS.isEmpty()){
                if(tamannoJaula.equals("L")){
                 p.pJaulas.pJaulas.jaulasL.get(nroJaula-1).setOcupada(ocupada);
                 p.pJaulas.pJaulas.jaulasL.get(nroJaula-1).pintar();
                 this.actualizarJaulas(p);
                }else if(tamannoJaula.equals("M")){
                    p.pJaulas.pJaulas.jaulasM.get(nroJaula-1).setOcupada(ocupada);
                    p.pJaulas.pJaulas.jaulasM.get(nroJaula-1).pintar();
                    this.actualizarJaulas(p);
                }else if(tamannoJaula.equals("S")){
                    p.pJaulas.pJaulas.jaulasS.get(nroJaula-1).setOcupada(ocupada);
                    p.pJaulas.pJaulas.jaulasS.get(nroJaula-1).pintar();
                    this.actualizarJaulas(p);
                }

            }
        }catch(Exception e){
            e.getCause();
        }
     }
    
    /**
     * Metodo que permite pintar las jaulas ocupadas al cargarse los datos
     * de un documento.
     * @param sFP
     * @param p 
     */
    public void cargarJaulaOcupada(SisFichaPaciente sFP, PestagnasInicio p){
        for(Paciente paciente: sFP.listaPacientes){
            if(paciente.getInternado().equals("si")){
                this.setJaulaOcupada(true, paciente.getTamannoJaula(), paciente.getNroJaula(), p);
            }else if(paciente.getInternado().equals("no")){
                this.setJaulaOcupada(false, paciente.getTamannoJaula(), paciente.getNroJaula(), p);
            }
        }       
    }
    
    
    /**
     * Metodo que permite cargar los datos desde un documento al programa cuando este se inicie.
     * @param p 
     */
    public void cargarDatos(PestagnasInicio p, SisFichaPaciente sFP){
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA+ARCHIVO);         
        if(aux!=null){
            this.cantidadJaulas = aux;
            this.actualizarJaulas(p);
            this.cargarJaulaOcupada(sFP, p);
        }             
        
    }
    
}
