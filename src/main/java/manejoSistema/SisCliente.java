
package manejoSistema;

import java.util.ArrayList;
import modelo.Cliente;
import vistaClientes.VentanaCliente;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisCliente {
       
    public VentanaCliente vCliente;
    public final ArrayList<Cliente> listaClientes = new ArrayList<>();
    private String nombre,apellido, rut,rutPart1, rutPart2, rutPart3, rutPart4,direccion,ciudad,region,telefono,movil,email, deuda;
    private GestorDatos gDatos;
    private ArrayList<String> partesRut = new ArrayList<>();

    public SisCliente() {
        this.gDatos = new GestorDatos();
    }        
    
    public void iniciarCliente(int btnSeleccionado, PestagnasInicio p, ArrayList listaCiudades, ArrayList listaRegiones){         
        int index = p.pFicheros.pClientes.pnlTabla.tabla.getSelectedRow();
        if(btnSeleccionado == 1){          
            this.setDatosCliente(index, listaCiudades, listaRegiones);
        }else if(btnSeleccionado == 2){
            this.vCliente = new VentanaCliente(2,"","","","","","","","","","","");
            if(this.vCliente.pnlDatos.cbCiudad.getItemAt(1) != ("    ")){
                this.vCliente.pnlDatos.cbCiudad.removeAllItems();
                for(Object l:listaCiudades){
                    this.vCliente.pnlDatos.cbCiudad.addItem(l);
                }
                this.vCliente.pnlDatos.cbRegion.removeAllItems();
                for(Object l:listaRegiones){
                    this.vCliente.pnlDatos.cbRegion.addItem(l);
                }                
            }
        }  
    }
    
    public void setDatosCliente(int index, ArrayList listaCiudades, ArrayList listaRegiones){
        this.gDatos = new GestorDatos();
        this.nombre = this.listaClientes.get(index).getNombre();       
        this.apellido = this.listaClientes.get(index).getApellido();
        this.rut = this.listaClientes.get(index).getRut();        
        this.partesRut = this.gDatos.separarRut(this.rut);
        this.rutPart1 = (String) this.partesRut.get(0);       
        this.rutPart2 = (String) this.partesRut.get(1);     
        this.rutPart3 = (String) this.partesRut.get(2);        
        this.rutPart4 = (String) this.partesRut.get(3); 
        this.direccion = this.listaClientes.get(index).getDireccion();
        this.ciudad = this.listaClientes.get(index).getCiudad();        
        this.region = this.listaClientes.get(index).getRegion();
        this.telefono = Integer.toString(this.listaClientes.get(index).getTelefono());
        this.movil = Integer.toString(this.listaClientes.get(index).getMovil());
        this.email = this.listaClientes.get(index).getEmail();
        this.deuda = Integer.toString(this.listaClientes.get(index).getDeuda());
            
        this.vCliente = new VentanaCliente(1,nombre,apellido,rutPart1,rutPart2, rutPart3, rutPart4,direccion,telefono,movil,email,deuda);
        this.vCliente.pnlDatos.cbCiudad.removeAllItems();
        for(Object l:listaCiudades){
        this.vCliente.pnlDatos.cbCiudad.addItem(l);
        }
        this.vCliente.pnlDatos.cbRegion.removeAllItems();
        for(Object l:listaRegiones){
        this.vCliente.pnlDatos.cbRegion.addItem(l);
        }
        this.vCliente.pnlDatos.cbCiudad.setSelectedItem(ciudad);
        this.vCliente.pnlDatos.cbRegion.setSelectedItem(region);
    }
    
    public void crearCliente(PestagnasInicio p){       
        this.getAllDataCliente();
        
        Cliente c = new Cliente(this.nombre,
                                this.apellido,
                                this.rut,
                                this.direccion,
                                this.ciudad,
                                this.region,
                                Integer.parseInt(this.telefono),
                                Integer.parseInt(this.movil),
                                this.email);
        this.listaClientes.add(c);
        
        Object[] fila = new Object[7];
        fila[0] = c.getNombre();
        fila[1] = c.getApellido();
        fila[2] = c.getRut();
        fila[3] = c.getCiudad();
        fila[4] = c.getTelefono();
        fila[5] = c.getMovil();
        fila[6] = c.getEmail();
        p.pFicheros.pClientes.pnlTabla.modelo.addRow(fila);                
    }   
    
    public void editarCliente(int index, PestagnasInicio p){
        this.getAllDataCliente();
        
        this.listaClientes.get(index).setNombre(this.nombre);
        this.listaClientes.get(index).setApellido(this.apellido);
        this.listaClientes.get(index).setRut(this.rut);
        this.listaClientes.get(index).setDireccion(this.direccion);
        this.listaClientes.get(index).setCiudad(this.ciudad);
        this.listaClientes.get(index).setRegion(this.region);
        this.listaClientes.get(index).setTelefono(Integer.parseInt(this.telefono));
        this.listaClientes.get(index).setMovil(Integer.parseInt(this.movil));
        this.listaClientes.get(index).setEmail(this.email);
        
        Cliente c = this.listaClientes.get(index);        
        p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getNombre(), index, 0);
        p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getApellido(), index, 1);
        p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getRut(), index, 2);
        p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getCiudad(), index, 3);
        p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getTelefono(), index, 4);
        p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getMovil(), index, 5);
        p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getEmail(), index, 6);
        
        
    }
    
    public void getAllDataCliente(){
        this.nombre = this.vCliente.pnlDatos.txtNombre.getText();
        this.apellido = this.vCliente.pnlDatos.txtApellidos.getText();
        this.rutPart1 = this.vCliente.pnlDatos.rutParte1.getText();
        this.rutPart2 = this.vCliente.pnlDatos.rutParte2.getText();
        this.rutPart3 = this.vCliente.pnlDatos.rutParte3.getText();
        this.rutPart4 = this.vCliente.pnlDatos.rutParte4.getText();
        this.rut =this.rutPart1 +"."+this.rutPart2+"."+this.rutPart3+"-"+this.rutPart4;
        this.direccion = this.vCliente.pnlDatos.txtDireccion.getText();
        this.ciudad = (String)this.vCliente.pnlDatos.cbCiudad.getSelectedItem();
        this.region = (String)this.vCliente.pnlDatos.cbRegion.getSelectedItem();
        this.telefono = this.vCliente.pnlDatos.txtTelefono.getText();
        this.movil = this.vCliente.pnlDatos.txtMovil.getText();
        this.email = this.vCliente.pnlDatos.txtEmail.getText();
    }
}
