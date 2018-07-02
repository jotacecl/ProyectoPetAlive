/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.util.ArrayList;
import modelo.Tratamiento;
import vistaVentanaTratamiento.VentanaTratamiento;

/**
 *
 * @author Juan Carlos
 */
public class SisTratamiento {
    
    public VentanaTratamiento vTrat;
    private final ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
    private String texto;
    private int idPaciente;
    private int index;
    
    public void iniciarTratamiento(int idPaciente, boolean tratamiento){
        if(tratamiento == true){
            this.compararID(idPaciente, 1);
        }else{
            this.vTrat = new VentanaTratamiento(2, "");
        }        
    }
    
    public void setTratamiento(int index, int btnSeleccionado){        
        this.idPaciente = this.listaTratamientos.get(index).getIdPaciente();
        this.texto = this.listaTratamientos.get(index).getTextoTratamiento();
        
        this.vTrat = new VentanaTratamiento(btnSeleccionado, this.texto);
    }
    
    public void crearTratamiento(int id){
        this.getAllDataTratamiento(id);
        
        Tratamiento t = new Tratamiento(this.texto,
                                        this.idPaciente);
        
        this.listaTratamientos.add(t);
        
    }
    
    public void editarTratamiento(int id){
        this.getAllDataTratamiento(id);
        
        this.listaTratamientos.get(this.index).setTextoTratamiento(this.texto);
        this.listaTratamientos.get(this.index).setIdPaciente(this.idPaciente);
    }
    
    public void getAllDataTratamiento(int idPaciente){
        this.texto = this.vTrat.pnlTexto.areaTexto.getText();
        this.idPaciente = idPaciente;
    }
    
    public void compararID(int idPaciente, int btnSeleccionado){
        for(int i=0; i<this.listaTratamientos.size();i++){
            if(this.listaTratamientos.get(i).getIdPaciente()==idPaciente){
                this.setTratamiento(i, btnSeleccionado);
                this.index = i;
                break;
            }
        }        
    }
        
    
}
