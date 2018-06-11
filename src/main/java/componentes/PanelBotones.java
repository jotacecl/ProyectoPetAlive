/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelBotones extends JPanel{
    
    public JButton btnEliminar, btnAbrir, btnAnnadir;
    public JButton btnGuardar, btnCancelar, btnAceptar;
    
    
    public PanelBotones(int op){
        if(op == 1){
            this.generarBotonesAAE();
        }else if(op == 2){
            this.generarBotonesAC();
        }else if(op == 3){
            this.generarBotonesGC();
        }
        
    }
    
    private void generarBotonesAAE(){
        this.btnAbrir = new JButton("Abrir");
        this.add(this.btnAbrir);
        
        this.btnAnnadir = new JButton("Añadir");
        this.add(this.btnAnnadir);
        
        this.btnEliminar = new JButton("Eliminar");
        this.add(this.btnEliminar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
    private void generarBotonesAC(){
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        this.btnAceptar = new JButton("Aceptar");
        this.add(this.btnAceptar);
        
        this.btnCancelar = new JButton("Cancelar");
        this.add(this.btnCancelar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
    private void generarBotonesGC(){
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        this.btnGuardar = new JButton("Guardar");
        this.add(this.btnGuardar);
        
        this.btnCancelar = new JButton("Cancelar");
        this.add(this.btnCancelar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
}
