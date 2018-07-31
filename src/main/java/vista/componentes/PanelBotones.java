
package vista.componentes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelBotones extends JPanel{
    
    private JLabel labBuscar;
    public JTextField txtBuscar;
    public BotonIcono btnBuscar;
    public JButton btnEliminar, btnAbrir, btnAnnadir;
    public JButton btnGuardar, btnCancelar, btnAceptar;
    
    
    public PanelBotones(int op){
        this.iniciarComponentes();
        if(op == 1){
            this.generarBotonesAAE();
        }else if(op == 2){
            this.generarBotonesAC();
        }else if(op == 3){
            this.generarBotonesGC();
        }else if(op == 4){
            this.generarBotonesAAEG();
        }
        
    }
    
    public void iniciarComponentes(){
        this.btnAbrir = new JButton("Abrir");
        this.btnAnnadir = new JButton("Añadir");
        this.btnEliminar = new JButton("Eliminar");
        this.btnAceptar = new JButton("Aceptar");
        this.btnGuardar = new JButton("Guardar");
        this.btnCancelar = new JButton("Cancelar");
        this.btnBuscar = new BotonIcono("","data/icon/search.png","data/icon/search.png");        
    }
    
    public void generarBotonesAAE(){        
               
        this.add(this.btnAbrir);                
        this.add(this.btnAnnadir);                
        this.add(this.btnEliminar);                        
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
    public void generarBotonesAAEG(){
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.labBuscar = new JLabel("RUT");
        this.txtBuscar = new JTextField("",20);
               
        this.add(this.btnAbrir);                
        this.add(this.btnAnnadir);                
        this.add(this.btnEliminar);        
        
        JPanel pnlBuscar = new JPanel();
        TitledBorder border = new TitledBorder("Buscador");       
        pnlBuscar.setBorder(border);
        pnlBuscar.add(this.labBuscar);
        pnlBuscar.add(this.txtBuscar);
        pnlBuscar.add(this.btnBuscar);
        pnlBuscar.setBackground(new java.awt.Color(134, 204, 161));
        
        this.add(pnlBuscar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
    public void generarBotonesAC(){
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        
        this.add(this.btnAceptar);
                
        this.add(this.btnCancelar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
    public void generarBotonesGC(){
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        
        this.add(this.btnGuardar);
        
        
        this.add(this.btnCancelar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
}
