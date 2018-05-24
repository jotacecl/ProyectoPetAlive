/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import javax.swing.JTabbedPane;

/**
 *
 * @author Juan Carlos
 */
public class Pestagna extends JTabbedPane{
    
    public PestagnaPaciente pPac;
    public PestagnaResponsable pResp;
    
    public Pestagna(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.pPac = new PestagnaPaciente();
        this.pResp = new PestagnaResponsable();
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        
        this.setName("Ficha del paciente");        
        this.add(pPac);
        this.add(pResp);
        
    }
    
}
