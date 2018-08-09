
package vista.vistaClientes;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HernySenpai
 */
public class PanelBotones extends JPanel {
    public JButton btnCancelar;
    public JButton btnAceptar;
    public JButton btnGuardar;
    public JTextField txtDeuda;
    private JLabel labDeuda;
    
    public PanelBotones(int btnSelect, String deuda){
        this.iniciarComponentes(btnSelect, deuda);
    }
    
    private void iniciarComponentes(int btnSelect, String deuda){
        
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        
        this.labDeuda = new JLabel("Deuda ");
        this.add(this.labDeuda);
        
        this.txtDeuda = new JTextField(deuda, 2);
        this.txtDeuda.setEditable(false);
        this.add(this.txtDeuda);
        
        this.btnGuardar = new JButton("Guardar");
        this.btnAceptar = new JButton("Aceptar");
        if(btnSelect == 1){            
            this.add(this.btnAceptar);
        }else if(btnSelect == 2){            
            this.add(this.btnGuardar);
        }
        
        this.btnCancelar = new JButton("Cancelar");
        this.add(this.btnCancelar);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setLayout(distribucion);
    }
    
}
