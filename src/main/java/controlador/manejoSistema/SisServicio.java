
package controlador.manejoSistema;

import java.util.ArrayList;
import modelo.Servicio;
import vista.vistaServicios.VentanaServicio;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisServicio {
    
    public VentanaServicio vServicio;
    private final ArrayList<Servicio> listaServicios = new ArrayList<>();
    private String nombre;
    private String descripcion;
    private int precio;
    
    public void iniciarServicios(int btnSeleccionado, PestagnasInicio p){
        
        int index = p.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow();
        if(btnSeleccionado == 1){
            this.setDatosServicio(index);
        }else if(btnSeleccionado == 2){
            this.vServicio = new VentanaServicio(null, 3);
        }
                
    }
    
    public void setDatosServicio(int index){
        Servicio s = this.listaServicios.get(index);
                        
        this.vServicio = new VentanaServicio(s, 2);                        
    }
    
    public void crearServicio(PestagnasInicio p){
        
        this.getAllDataServicio();
        
        Servicio s = new Servicio(
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
        
        Servicio s = this.listaServicios.get(index);
        p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getNombre(), index, 0);
        p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getDescripcion(), index, 1);
        p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getPrecio(), index, 2);
    }
    
    /**
     * Metodo para eliminar el servicio seleccionado.
     * @param p 
     */
    public void eliminarServicio(PestagnasInicio p){
        this.listaServicios.remove(p.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow());
        p.pFicheros.pServicios.pnlTabla.modelo.removeRow(p.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow());
    }
    
    public void getAllDataServicio(){
        
        this.nombre = this.vServicio.pnlDatosS.txtNombre.getText();
        this.descripcion = this.vServicio.pnlDatosS.txtDescripcion.getText();
        this.precio = Integer.parseInt(this.vServicio.pnlDatosS.txtPrecio.getText());
        
    }
    
    
}
