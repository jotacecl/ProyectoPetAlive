
package controlador.manejoSistema;

import java.util.ArrayList;
import modelo.Cliente;
import vista.vistaClientes.VentanaCliente;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisCliente {
       
    public VentanaCliente vCliente;
    public final ArrayList<Cliente> listaClientes = new ArrayList<>();
    private String nombre;
    private String apellido;
    private String rut;
    private String rutPart1;
    private String rutPart2;
    private String rutPart3;
    private String rutPart4;
    private String direccion;
    private String ciudad;
    private String region;
    private String telefono;
    private String movil;
    private String email;
    private String deuda;
    private GestorDatos gDatos;
    private ArrayList<String> partesRut = new ArrayList<>();
    
    private int indice;

    public SisCliente() {
        this.gDatos = new GestorDatos();
    }        
    
    /**
     * Metodo para inciar la ventana del Cliente, se desplega con o sin info segun se requiera.
     * @param btnSeleccionado
     * @param p
     * @param listaCiudades
     * @param listaRegiones 
     */
    public void iniciarCliente(int btnSeleccionado, PestagnasInicio p, ArrayList listaCiudades, ArrayList listaRegiones){        
        
        if(btnSeleccionado == 1){          
            this.indice = comparar(p);
            this.setDatosCliente(this.indice, listaCiudades, listaRegiones);
        }else if(btnSeleccionado == 2){
            this.vCliente = new VentanaCliente(2,null,"","","","","");
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
    
    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     * @param index
     * @param listaCiudades
     * @param listaRegiones 
     */
    public void setDatosCliente(int index, ArrayList listaCiudades, ArrayList listaRegiones){
        try{
            this.gDatos = new GestorDatos();

            Cliente c = this.listaClientes.get(index);

            this.rut = c.getRut();        
            this.partesRut = this.gDatos.separarRut(this.rut);
            this.rutPart1 = (String) this.partesRut.get(0);       
            this.rutPart2 = (String) this.partesRut.get(1);     
            this.rutPart3 = (String) this.partesRut.get(2);        
            this.rutPart4 = (String) this.partesRut.get(3);         
            this.deuda = Integer.toString(c.getDeuda());

            this.vCliente = new VentanaCliente(1,
                    c,                
                    rutPart1,
                    rutPart2, 
                    rutPart3, 
                    rutPart4,                
                    deuda);
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
        }catch(Exception e){
            e.getCause();
        }
    }
    
    /**
     * Metodo para crear un Cliente nuevo.
     * @param p 
     */
    public void crearCliente(PestagnasInicio p){  
        try{
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

            Object[] fila = new Object[]{
                        c.getNombre(),
                        c.getApellido(),
                        c.getRut(),
                        c.getCiudad(),
                        c.getTelefono(),
                        c.getMovil(),
                        c.getEmail()};        
            p.pFicheros.pClientes.pnlTabla.modelo.addRow(fila);                
        }catch(NullPointerException e){
            e.getCause();
        }catch(NumberFormatException n){
            n.getCause();
        }
    }   
    
    /**
     * Metodo para editar un Cliente ya exitente.
     * @param p 
     */
    public void editarCliente(PestagnasInicio p){
        try{
            int auxIndex = p.pFicheros.pClientes.pnlTabla.tabla.getSelectedRow();

            this.getAllDataCliente();

            if(!this.listaClientes.isEmpty()){
                this.listaClientes.get(this.indice).setNombre(this.nombre);
                this.listaClientes.get(this.indice).setApellido(this.apellido);
                this.listaClientes.get(this.indice).setRut(this.rut);
                this.listaClientes.get(this.indice).setDireccion(this.direccion);
                this.listaClientes.get(this.indice).setCiudad(this.ciudad);
                this.listaClientes.get(this.indice).setRegion(this.region);
                this.listaClientes.get(this.indice).setTelefono(Integer.parseInt(this.telefono));
                this.listaClientes.get(this.indice).setMovil(Integer.parseInt(this.movil));
                this.listaClientes.get(this.indice).setEmail(this.email);

                Cliente c = this.listaClientes.get(this.indice);        
                p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getNombre(), auxIndex, 0);
                p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getApellido(), auxIndex, 1);
                p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getRut(), auxIndex, 2);
                p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getCiudad(), auxIndex, 3);
                p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getTelefono(), auxIndex, 4);
                p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getMovil(), auxIndex, 5);
                p.pFicheros.pClientes.pnlTabla.modelo.setValueAt(c.getEmail(), auxIndex, 6);
            }
            
        }catch(NullPointerException e){
            e.getCause();
        }
        
    }
    
    /**
     * Metodo para eliminar el cliente seleccionado.
     * @param p 
     */
    public void eliminarCliente(PestagnasInicio p){
        try{
            this.indice = comparar(p);
            this.listaClientes.remove(this.indice);
            p.pFicheros.pClientes.pnlTabla.modelo.removeRow(p.pFicheros.pClientes.pnlTabla.tabla.getSelectedRow());
        }catch(Exception e){
            
        }
    }
    
    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataCliente(){
        try{
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
        }catch(NullPointerException e){
            e.getCause();
        }
            
    }
    
    /**
     * Busca el rut ingresado en la lista de clientes.
     * @param rut     
     * @param p     
     */
    public void buscar(String rut, PestagnasInicio p){          
        for(Cliente cliente: listaClientes){
             if(rut.equals(cliente.getRut())){
                  p.pFicheros.pClientes.pnlTabla.modelo.setRowCount(0);
                  break;
             }
        }
        
       for(Cliente cliente: listaClientes){
             if(rut.equals(cliente.getRut())){                                                                            
                Cliente c = cliente;
                
                Object[] fila = new Object[]{
                    c.getNombre(),
                    c.getApellido(),
                    c.getRut(),
                    c.getCiudad(),
                    c.getTelefono(),
                    c.getMovil(),
                    c.getEmail()};             
                p.pFicheros.pClientes.pnlTabla.modelo.addRow(fila);
            }
        }
    }
    
    /**
     * Refresca la tabla de la pestanna de cliente.
     * @param p 
     */
    public void refrescar(PestagnasInicio p){
        p.pFicheros.pClientes.pnlTabla.modelo.setRowCount(0);
        for(Cliente cliente: listaClientes){
            Cliente c = cliente;
            
            Object[] fila = new Object[]{
                    c.getNombre(),
                    c.getApellido(),
                    c.getRut(),
                    c.getCiudad(),
                    c.getTelefono(),
                    c.getMovil(),
                    c.getEmail()};              
            p.pFicheros.pClientes.pnlTabla.modelo.addRow(fila);
        }                
    }
    
    /**
     * Compara la informacion que contiene la fila seleccionada con la info
     * de la lista de clientes.
     * @param p
     * @return 
     */
    public int comparar(PestagnasInicio p){
        int index = p.pFicheros.pClientes.pnlTabla.tabla.getSelectedRow();                
        if(p.pFicheros.pClientes.pnlTabla.modelo.getRowCount()!=0){
            String aux1 = (String) p.pFicheros.pClientes.pnlTabla.modelo.getValueAt(index,0);
            String aux2 = (String) p.pFicheros.pClientes.pnlTabla.modelo.getValueAt(index,1);
            String aux3 = (String) p.pFicheros.pClientes.pnlTabla.modelo.getValueAt(index,2);
            for(Cliente cliente: listaClientes){
            if(aux1.equals(cliente.getNombre()) &&
                aux2.equals(cliente.getApellido()) &&
                    aux3.equals(cliente.getRut())){                
                return listaClientes.indexOf(cliente);
                }
            }
        }       
        return -1;
    }
    
}
