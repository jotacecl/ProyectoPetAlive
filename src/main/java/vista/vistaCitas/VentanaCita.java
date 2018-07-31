
package vista.vistaCitas;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCita extends JFrame implements ActionListener{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;
    
    public VentanaCita(int btnSeleccionado, String idPaciente, String paciente, String rut, String fIngreso, String fCita, String motivo){
        this.iniciarComponentes(btnSeleccionado,idPaciente,paciente,rut,fIngreso,fCita,motivo);
    }
    
    private void iniciarComponentes(int btnSeleccionado,String idPaciente, String paciente, String rut, String fIngreso, String fCita, String motivo){
        
        this.pnlDatos = new PanelDatos(idPaciente,paciente,rut,fIngreso,fCita,motivo);
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);        
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Citas programadas");
        this.setLocation(50,50);        
        this.setResizable(false);
        pack();
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
