/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Producto;
import vistaPdtosYServicios.VentanaProducto;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisProducto {
    
    public VentanaProducto vProducto;
    private final ArrayList<Producto> listaProductos = new ArrayList<>();
    public final ArrayList<String> listaTipoProductos = new ArrayList<>();
    private String idProducto, nombre, tipo, descripcion;
    private int stock, precio;
    
    public void iniciarProductos(int btnSeleccionado, PestagnasInicio p){
        int index = p.pFicheros.pProductos.pnlTabla.tabla.getSelectedRow();        
        if(btnSeleccionado == 1){            
            this.setDatosProducto(index);
        }else if(btnSeleccionado == 2){
            this.vProducto = new VentanaProducto(3, "", "", "", "", "");
            if(this.vProducto.pnlDatos.cbTipo.getItemAt(1) != ("    ")){
                this.vProducto.pnlDatos.cbTipo.removeAllItems();
                for(Object l:listaTipoProductos){
                    this.vProducto.pnlDatos.cbTipo.addItem(l);
                }                               
            }
        }
    }
    
    public void setDatosProducto(int index){        
        this.idProducto = this.listaProductos.get(index).getId();        
        this.nombre = this.listaProductos.get(index).getNombre();        
        this.tipo = this.listaProductos.get(index).getTipo();        
        this.descripcion = this.listaProductos.get(index).getDescripcion();        
        this.stock = this.listaProductos.get(index).getStock();
        this.precio = this.listaProductos.get(index).getPrecio();
        
        this.vProducto = new VentanaProducto(2, idProducto, nombre, descripcion, Integer.toString(stock), Integer.toString(precio));
        this.vProducto.pnlDatos.cbTipo.removeAllItems();
        for(Object l:listaTipoProductos){
                    this.vProducto.pnlDatos.cbTipo.addItem(l);
                }
        this.vProducto.pnlDatos.cbTipo.setSelectedItem(tipo);
        
    }
    
    public void crearProducto(PestagnasInicio p){
        this.getAllDataProducto();
        
        Producto pr = new Producto(
                this.idProducto,
                this.nombre,
                this.tipo,
                this.descripcion,
                this.stock,
                this.precio
        );
        
        this.listaProductos.add(pr);
        
        Object[] fila = new Object[6];
        fila[0] = pr.getId();
        fila[1] = pr.getNombre();
        fila[2] = pr.getTipo();
        fila[3] = pr.getDescripcion();
        fila[4] = pr.getStock();
        fila[5] = pr.getPrecio();        
        p.pFicheros.pProductos.pnlTabla.modelo.addRow(fila);
    }
    
    public void editarProducto(int index, PestagnasInicio p){
        this.getAllDataProducto();
        
        this.listaProductos.get(index).setId(this.idProducto);
        this.listaProductos.get(index).setNombre(this.nombre);
        this.listaProductos.get(index).setTipo(this.tipo);
        this.listaProductos.get(index).setDescripcion(this.descripcion);
        this.listaProductos.get(index).setStock(this.stock);
        this.listaProductos.get(index).setPrecio(this.precio);
        
        Producto pr = this.listaProductos.get(index);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getId(), index, 0);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getNombre(), index, 1);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getTipo(), index, 2);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getDescripcion(), index, 3);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getStock(), index, 4);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getPrecio(), index, 5);
        
    }
    
    public void getAllDataProducto(){
        
        this.idProducto = this.vProducto.pnlDatos.txtID.getText();
        this.nombre = this.vProducto.pnlDatos.txtNombre.getText();
        this.tipo = (String)this.vProducto.pnlDatos.cbTipo.getSelectedItem();
        this.descripcion = this.vProducto.pnlDatos.txtDescripcion.getText();
        this.stock = Integer.parseInt(this.vProducto.pnlDatos.txtStock.getText());
        this.precio = Integer.parseInt(this.vProducto.pnlDatos.txtPrecio.getText());
        
        
    }
    
    public void setTipo(String tipo){
         if(tipo != null){
            this.listaTipoProductos.add(tipo);
            Collections.sort(this.listaTipoProductos);
            this.vProducto.pnlDatos.cbTipo.removeAllItems();
            for(String l:listaTipoProductos){
            this.vProducto.pnlDatos.cbTipo.addItem(l);
            }
             System.out.println("Tipo: "+tipo+" agregado.");
        }else{
            System.out.println("null");
        } 
    }    
    
}
