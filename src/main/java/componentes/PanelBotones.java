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
        this.iniciarBotones();
        if(op == 1){
            this.generarBotonesAAE();
        }else if(op == 2){
            this.generarBotonesAC();
        }else if(op == 3){
            this.generarBotonesGC();
        }
        
    }
    
    public void iniciarBotones(){
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
        
        this.btnCancelar = new JButton("Cancelar");
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
