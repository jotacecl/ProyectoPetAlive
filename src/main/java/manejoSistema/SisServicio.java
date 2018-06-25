/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.util.ArrayList;
import modelo.Servicios;
import vistaPdtosYServicios.VentanaServicio;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisServicio {
    
    public VentanaServicio vServicio;
    private final ArrayList<Servicios> listaServicios = new ArrayList<>();
    private String nombre, descripcion;
    private int precio;
    
    public void iniciarServicios(int btnSeleccionado, PestagnasInicio p){
        
        int index = p.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow();
        if(btnSeleccionado == 1){
            this.setDatosServicio(index);
        }else if(btnSeleccionado == 2){
            this.vServicio = new VentanaServicio(3, "", "", "");
        }
                
    }
    
    public void setDatosServicio(int index){
        
        this.nombre = this.listaServicios.get(index).getNombre();
        this.descripcion = this.listaServicios.get(index).getDescripcion();
        this.precio = this.listaServicios.get(index).getPrecio();
        
        this.vServicio = new VentanaServicio(2, nombre, descripcion, Integer.toString(precio));                
        
    }
    
    public void crearServicio(PestagnasInicio p){
        
        this.getAllDataServicio();
        
        Servicios s = new Servicios(
                this.nombre,
                this.descripcion,
                this.precio
        );
        
        this.listaServicios.add(s);
        
        Object[] fila = new Object[3];
        fila[0] = s.getNombre();
        fila[1] = s.getDescripcion();
        fila[2] = s.getPrecio();
        p.pFicheros.pServicios.pnlTabla.modelo.addRow(fila);
        
    }
    
    public void editarServicio(int index, PestagnasInicio p){
        
        this.getAllDataServicio();
        
        this.listaServicios.get(index).setNombre(this.nombre);
        this.listaServicios.get(index).setDescripcion(this.descripcion);
        this.listaServicios.get(index).setPrecio(this.precio);
        
        Servicios s = this.listaServicios.get(index);
        p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getNombre(), index, 0);
        p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getDescripcion(), index, 1);
        p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getPrecio(), index, 2);
    }
    
    public void getAllDataServicio(){
        
        this.nombre = this.vServicio.pnlDatosS.txtNombre.getText();
        this.descripcion = this.vServicio.pnlDatosS.txtDescripcion.getText();
        this.precio = Integer.parseInt(this.vServicio.pnlDatosS.txtPrecio.getText());
        
    }
    
    
}
