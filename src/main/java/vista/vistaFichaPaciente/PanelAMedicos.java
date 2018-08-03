
package vista.vistaFichaPaciente;

import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import modelo.Paciente;

/**
 *
 * @author HernySenpai
 */
public class PanelAMedicos extends JPanel {
    
    private JLabel antecedentesMedicos;
    public JTextArea ingAntecedentesMedicos;
    public JScrollPane scroll;
    
    private void iniciarComponentes(Paciente p){
        
        
        
        Box caja = Box.createVerticalBox(); 
        FlowLayout distribucion = new FlowLayout(FlowLayout.LEFT);
        
        TitledBorder border = new TitledBorder("");        
        this.setBorder(border);
        
        JPanel pnlLabAnt = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.antecedentesMedicos = new JLabel("Antecedentes Medicos");
        pnlLabAnt.add(this.antecedentesMedicos);
        pnlLabAnt.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlLabAnt);
        
        this.ingAntecedentesMedicos = new JTextArea(10,35);        
        this.scroll = new JScrollPane(ingAntecedentesMedicos);
        if(p!=null){
            this.ingAntecedentesMedicos.setText(p.getAntecedentes());
        }else{
            this.ingAntecedentesMedicos.setText("");
        }
        caja.add(this.scroll);        
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setLayout(distribucion);
        
    }

    public PanelAMedicos(Paciente p) {
        this.iniciarComponentes(p);
    }
    
}
