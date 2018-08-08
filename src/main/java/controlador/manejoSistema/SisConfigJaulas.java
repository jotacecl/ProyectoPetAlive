
package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
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

    public SisConfigJaulas(PestagnasInicio p) {
        this.mD = new ManejoDeDatos();
        this.cargarDatos(p);
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
     * Metodo para ingresar los datos en los JTextfields de la ventana.
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
     * Metodo que permite cargar los datos desde un documento al programa cuando este se inicie.
     * @param p 
     */
    public void cargarDatos(PestagnasInicio p){
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA+ARCHIVO);         
        if(aux!=null){
            this.cantidadJaulas = aux;
            this.actualizarJaulas(p);
        }             
        
    }
    
}
