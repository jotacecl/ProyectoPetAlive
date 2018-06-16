/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaJaulas;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaJaulas extends JPanel implements ActionListener{
    
    public PanelJaulas pJaulas;
    public PanelBotones pBotones;
    public JButton btnActualizar;
    
    public PestagnaJaulas(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Jaulas");
        
        this.pJaulas = new PanelJaulas();
        this.add(this.pJaulas, BorderLayout.CENTER);
        
        this.btnActualizar = new JButton("Actualizar");
        this.add(this.btnActualizar, BorderLayout.SOUTH);
        
        this.btnActualizar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(this.btnActualizar == e.getSource()){
//            this.removeAll();
//            this.updateUI();
//            this.repaint();    
            this.pJaulas = new PanelJaulas();
            this.add(this.pJaulas, BorderLayout.CENTER);
            System.out.println(""+this.pJaulas.cantidadJaulasL+this.pJaulas.cantidadJaulasM+this.pJaulas.cantidadJaulasS);
        }
        
    }
    
}
