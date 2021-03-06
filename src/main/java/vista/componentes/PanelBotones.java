
package vista.componentes;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Carlos
 */
public class PanelBotones extends JPanel{
        
    public JTextField txtBuscar;
    public BotonIcono btnBuscar;
    public JButton btnEliminar, btnAbrir, btnAnnadir;
    public JButton btnGuardar;
    public JButton btnCancelar;
    public JButton btnAceptar;
    
    public PanelBotones(int op){
        this.iniciarComponentes();
        if(op == 1){
            this.generarBotonesAAE();
        }else if(op == 2){
            this.generarBotonesAC();
        }else if(op == 3){
            this.generarBotonesGC();
        }
        
    }
    
    public void iniciarComponentes(){
        this.btnAbrir = new JButton("Abrir");
        this.btnAnnadir = new JButton("Añadir");
        this.btnEliminar = new JButton("Eliminar");
        this.btnAceptar = new JButton("Aceptar");
        this.btnGuardar = new JButton("Guardar");
        this.btnCancelar = new JButton("Cancelar");                
    }
    
    public void generarBotonesAAE(){        
               
        this.add(this.btnAbrir);                
        this.add(this.btnAnnadir);                
        this.add(this.btnEliminar);                        
        
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
