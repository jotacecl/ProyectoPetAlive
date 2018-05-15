/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaJaulas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaJaulas extends JFrame implements ActionListener{
    
    private int cantidadJaulas;
    public ArrayList<Jaula> jaulas;
    
    public VentanaJaulas(){        
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout(((int)(cantidadJaulas/10)), 10);
        this.setLayout(distribucion);
        
        this.jaulas = new ArrayList<>();
        for(int i=0; i<cantidadJaulas; i++){
            this.jaulas.add(new Jaula());            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
