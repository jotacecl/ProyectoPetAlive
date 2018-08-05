
package controlador.manejoSistema;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Producto;
import vista.vistaProductos.VentanaProducto;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisProducto {
    
    public VentanaProducto vProducto;
    private final ArrayList<Producto> listaProductos = new ArrayList<>();
    public final ArrayList<String> listaTipoProductos = new ArrayList<>();   
    private String nombre;
    private String tipo;
    private String descripcion;
    private int stock;
    private int precio;
    
    public void iniciarProductos(int btnSeleccionado, PestagnasInicio p){
        int index = p.pFicheros.pProductos.pnlTabla.tabla.getSelectedRow();        
        if(btnSeleccionado == 1){            
            this.setDatosProducto(index);
        }else if(btnSeleccionado == 2){
            this.vProducto = new VentanaProducto(3, null);
            if(this.vProducto.pnlDatos.cbTipo.getItemAt(1) != ("    ")){
                this.vProducto.pnlDatos.cbTipo.removeAllItems();
                for(Object l:listaTipoProductos){
                    this.vProducto.pnlDatos.cbTipo.addItem(l);
                }                               
            }
        }
    }
    
    public void setDatosProducto(int index){ 
        Producto p = this.listaProductos.get(index);               
        
        this.vProducto = new VentanaProducto(2, p);
        this.vProducto.pnlDatos.cbTipo.removeAllItems();
        for(Object l:listaTipoProductos){
                    this.vProducto.pnlDatos.cbTipo.addItem(l);
                }
        this.vProducto.pnlDatos.cbTipo.setSelectedItem(tipo);
        
    }
    
    public void crearProducto(PestagnasInicio p){
        this.getAllDataProducto();
        
        Producto pr = new Producto(                
                this.nombre,
                this.tipo,
                this.descripcion,
                this.stock,
                this.precio
        );
        
        this.listaProductos.add(pr);
        
        Object[] fila = new Object[]{
            pr.getNombre(),
            pr.getTipo(),
            pr.getDescripcion(),
            pr.getStock(),
            pr.getPrecio()
        };                       
        p.pFicheros.pProductos.pnlTabla.modelo.addRow(fila);
    }
    
    public void editarProducto(int index, PestagnasInicio p){
        this.getAllDataProducto();
                
        this.listaProductos.get(index).setNombre(this.nombre);
        this.listaProductos.get(index).setTipo(this.tipo);
        this.listaProductos.get(index).setDescripcion(this.descripcion);
        this.listaProductos.get(index).setStock(this.stock);
        this.listaProductos.get(index).setPrecio(this.precio);
        
        Producto pr = this.listaProductos.get(index);        
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getNombre(), index, 0);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getTipo(), index, 1);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getDescripcion(), index, 2);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getStock(), index, 3);
        p.pFicheros.pProductos.pnlTabla.modelo.setValueAt(pr.getPrecio(), index, 4);
        
    }
    
    public void getAllDataProducto(){
                
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
    
    public void editarTipo(String tipoEditado){
         if(tipoEditado != null){
             this.eliminarTipo();
             this.setTipo(tipoEditado);
         }else{
            System.out.println("null");
        } 
    }
    
    public void eliminarTipo(){
        for(int i=0; i<listaTipoProductos.size(); i++){
            if((String)this.vProducto.pnlDatos.cbTipo.getSelectedItem() == this.listaTipoProductos.get(i)){
                this.listaTipoProductos.remove(i);
            }
        }
        this.vProducto.pnlDatos.cbTipo.removeItemAt(this.vProducto.pnlDatos.cbTipo.getSelectedIndex());
    }
    
}
