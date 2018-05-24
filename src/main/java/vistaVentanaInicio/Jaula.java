/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import javax.swing.JButton;

/**
 *
 * @author Juan Carlos
 */
public class Jaula extends JButton{
    
    private boolean ocupada;    
    
    public Jaula(){        
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocuapada) {
        this.ocupada = ocuapada;
    }
    
    public void pintar(boolean ocupado){
        
    }
    
}
