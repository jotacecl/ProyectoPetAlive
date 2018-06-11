/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFicheros;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import vistaClientes.PestagnaClientes;
import vistaPacientes.PestagnaPacientes;
import vistaPdtosYServicios.PestagnaProductos;
import vistaPdtosYServicios.PestagnaServicios;
import vistaPersonal.PestagnaPersonal;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaFicheros extends JTabbedPane{
    
    public PestagnaClientes pClientes;
    public PestagnaPacientes pPacientes;
    public PestagnaPersonal pPersonal;
    public PestagnaProductos pProductos;
    public PestagnaServicios pServicios;
    
    private final String Icono1 = "data/icon/client.png";
    private final String Icono2 = "data/icon/pet.png";
    private final String Icono3 = "data/icon/personal.png";
    private final String Icono4 = "data/icon/productos.png";
    private final String Icono5 = "data/icon/servicio.png";
    
    public PestagnaFicheros(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setName("Ficheros");
        
        this.pClientes = new PestagnaClientes();
        this.pPacientes = new PestagnaPacientes();
        this.pPersonal = new PestagnaPersonal();
        this.pProductos = new PestagnaProductos();
        this.pServicios = new PestagnaServicios();
        
        this.add(pClientes);
        this.add(pPacientes);
        this.add(pPersonal);
        this.add(pProductos);
        this.add(pServicios);
        
        this.setIconAt(0, new ImageIcon(Icono1));
        this.setIconAt(1, new ImageIcon(Icono2));
        this.setIconAt(2, new ImageIcon(Icono3));
        this.setIconAt(3, new ImageIcon(Icono4));
        this.setIconAt(4, new ImageIcon(Icono5));
        
    }
    
}
