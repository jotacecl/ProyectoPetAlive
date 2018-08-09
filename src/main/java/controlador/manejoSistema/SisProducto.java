
package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
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
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    public ArrayList<String> listaTipoProductos = new ArrayList<>();   
    private String nombre;
    private String tipo;
    private String descripcion;
    private int stock;
    private int precio;
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO1 = "producto.json";
    private final String ARCHIVO2 = "tipo producto.json";
    public ManejoDeDatos mD;
    
    /**
     * Metodo para iniciar la ventana de Productos, se desplega con o sin info segun se requiera.
     * @param btnSeleccionado
     * @param p 
     */
    
    
    
    public SisProducto(PestagnasInicio p){
        this.mD = new ManejoDeDatos();
        this.cargarDatosTipoProducto(p);
        this.cargarDatosProducto(p);
    }            

    public void iniciarProductos(int btnSeleccionado, PestagnasInicio p) {
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
    
    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     * @param index 
     */
    public void setDatosProducto(int index){
        if(!listaProductos.isEmpty()){
            Producto p = this.listaProductos.get(index);               
        
            this.vProducto = new VentanaProducto(2, p);
            this.vProducto.pnlDatos.cbTipo.removeAllItems();
            for(Object l:listaTipoProductos){
                        this.vProducto.pnlDatos.cbTipo.addItem(l);
                    }
            this.vProducto.pnlDatos.cbTipo.setSelectedItem(p.getTipo());
        }                
    }
    
    /**
     * Metodo para crear un Producto nuevo.
     * @param p 
     */
    public void crearProducto(PestagnasInicio p){
        try{
            this.getAllDataProducto();

            Producto pr = new Producto(                
                    this.nombre,
                    this.tipo,
                    this.descripcion,
                    this.stock,
                    this.precio
            );

            this.listaProductos.add(pr);
            mD.escritura(listaProductos, RUTA+ARCHIVO1);
            mD.escritura(listaTipoProductos, RUTA+ARCHIVO2);

            Object[] fila = new Object[]{
                pr.getNombre(),
                pr.getTipo(),
                pr.getDescripcion(),
                pr.getStock(),
                pr.getPrecio()
            };                       
            p.pFicheros.pProductos.pnlTabla.modelo.addRow(fila);
        }catch(NullPointerException e){
            e.getCause();
        }
    }
    
    /**
     * Metodo para editar un Producto ya exitente.
     * @param p 
     */
    public void editarProducto(int index, PestagnasInicio p){
        try{
            this.getAllDataProducto();

            if(!this.listaProductos.isEmpty()){
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
            mD.escritura(listaProductos, RUTA+ARCHIVO1);
            mD.escritura(listaTipoProductos, RUTA+ARCHIVO2);
        }catch(NullPointerException e){
            e.getCause();
        }
    }
    
    /**
     * Metodo para eliminar el producto seleccionado.
     * @param p 
     */
    public void eliminarProducto(PestagnasInicio p){
        try{
            this.listaProductos.remove(p.pFicheros.pProductos.pnlTabla.tabla.getSelectedRow());
            p.pFicheros.pProductos.pnlTabla.modelo.removeRow(p.pFicheros.pProductos.pnlTabla.tabla.getSelectedRow());
            mD.escritura(listaProductos, RUTA+ARCHIVO1);
        }catch(Exception e){
            e.getCause();
        }
    }
    
    /**
     * Metodo para obtener la info del producto. 
     */
    public void getAllDataProducto(){
                
        try{
            this.nombre = this.vProducto.pnlDatos.txtNombre.getText();
            this.tipo = (String)this.vProducto.pnlDatos.cbTipo.getSelectedItem();
            this.descripcion = this.vProducto.pnlDatos.txtDescripcion.getText();
            this.stock = Integer.parseInt(this.vProducto.pnlDatos.txtStock.getText());
            this.precio = Integer.parseInt(this.vProducto.pnlDatos.txtPrecio.getText());
        }catch(NullPointerException e){
            e.getCause();
        }
        
    }
    
    /**
     * Metodo para agregar un tipo de producto. 
     * @param tipo
     */
    public void setTipo(String tipo){
        try{
            if(tipo != null){
               this.listaTipoProductos.add(tipo);
               Collections.sort(this.listaTipoProductos);
               this.vProducto.pnlDatos.cbTipo.removeAllItems();
               for(String l:listaTipoProductos){
               this.vProducto.pnlDatos.cbTipo.addItem(l);
               mD.escritura(listaTipoProductos, RUTA+ARCHIVO2);
               }
                System.out.println("Tipo: "+tipo+" agregado.");
            }else{
               System.out.println("null");
            } 
        }catch(NullPointerException e){
            e.getCause();
        }
    }  
    
    /**
     * Metodo para editar el tipo de producto seleccionado. 
     * @param tipoEditado
     */
    public void editarTipo(String tipoEditado){
        try{
            if(tipoEditado != null){
                this.eliminarTipo();
                this.setTipo(tipoEditado);
            }else{
               System.out.println("null");
            }
            mD.escritura(listaTipoProductos, RUTA+ARCHIVO2);
        }catch(NullPointerException e){
            e.getCause();
        }
    }
    
    /**
     * Metodo para eliminar el tipo producto seleccionado. 
     */
    public void eliminarTipo(){
        try{
            for(int i=0; i<listaTipoProductos.size(); i++){

                if((String)this.vProducto.pnlDatos.cbTipo.getSelectedItem() == this.listaTipoProductos.get(i)){
                    this.listaTipoProductos.remove(i);
                }
            }
            this.vProducto.pnlDatos.cbTipo.removeItemAt(this.vProducto.pnlDatos.cbTipo.getSelectedIndex());
            mD.escritura(listaTipoProductos, descripcion);
        }catch(NullPointerException e){
            e.getCause();
        }
    }
    
    public void refrescar (PestagnasInicio p){
        p.pFicheros.pProductos.pnlTabla.modelo.setRowCount(0);
        for(Producto producto : listaProductos){
            Producto pr = producto;
            
            Object[] fila = new Object[]{
                pr.getNombre(),
                pr.getTipo(),
                pr.getDescripcion(),
                pr.getStock(),
                pr.getPrecio()
            };                       
            p.pFicheros.pProductos.pnlTabla.modelo.addRow(fila);
        }
    }
    public void cargarDatosProducto(PestagnasInicio p) {
        ArrayList<Producto> aux = mD.leerArchivoListaProducto(RUTA + ARCHIVO1);
        if (aux != null) {
            this.listaProductos = aux;
            this.refrescar(p);
        }
    }
    
    public void cargarDatosTipoProducto(PestagnasInicio p) {
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA + ARCHIVO2);
        if (aux != null) {
            this.listaTipoProductos = aux;
            this.refrescar(p);
        }
    }
    
    
}
