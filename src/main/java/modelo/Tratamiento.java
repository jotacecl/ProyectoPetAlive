/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Carlos
 */
public class Tratamiento {    
    
    private String textoTratamiento;
    private int idPaciente;

    public Tratamiento() {
    }        

    public Tratamiento(String textoTratamiento, int idPaciente) {
        this.textoTratamiento = textoTratamiento;
        this.idPaciente = idPaciente;
    }                

    public String getTextoTratamiento() {
        return textoTratamiento;
    }

    public void setTextoTratamiento(String textoTratamiento) {
        this.textoTratamiento = textoTratamiento;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    
    
}
