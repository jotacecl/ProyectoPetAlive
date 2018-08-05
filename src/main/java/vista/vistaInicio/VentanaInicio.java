
package vista.vistaInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.UIManager;
import controlador.manejoSistema.Sistema;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.vistaConfiguracion.VentanaAcerca;


/**
 *
 * @author Juan Carlos
 */
public class VentanaInicio extends JFrame implements ActionListener{    
       
    public VentanaAcerca vAcerca;
    private Sistema system;
    
    
    public VentanaInicio(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        system = new Sistema();
       
        try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}        
                     
        this.add(this.system.pPestagnas);      
        
        this.iniciarEventosTabla();
        
        //Botones presentes en las pestagnas
        this.addActionListenerPestannas();
        
        //Botones configuracion        
        this.addActionListenerHorario();
        this.addActionListenerCantidadJaulas();
        this.addActionListenerDatosClinica();       
        
        //Botones clientes           
        this.addActionListenerCliente();
        
        //Botones pacientes        
        this.addActionListenerFichaPaciente();
        
        //Botones personal
        this.addActionListenerPersonal();        
        
        //Botones cita
        this.addActionListenerCita();        
        
        //Botones productos         
        this.addActionListenerProductos();
        
        //Botones servicios        
        this.addActionListenerServicio();
        
        //Botones directorio
        this.addActionListenerDirectorio();
        
        //Botones tratamiento
        this.addActionListenerTratamiento();
                
        //Boton insumos
        this.addActionListenerInsumo();
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(1100, 720);
        
    }
    
    public void iniciarEventosTabla(){       
        this.system.pPestagnas.pFicheros.pProductos.pnlTabla.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {                
                if(e.getClickCount()==2){
                    system.sProductos.iniciarProductos(1, system.pPestagnas);
                    addActionListenerProductos();
                    system.sProductos.vProducto.setVisible(true);
                }
            }
        });
        
        this.system.pPestagnas.pCitas.pnlTabla.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {                
                if(e.getClickCount()==2){
                    system.sCitas.iniciarCitas(1, system.pPestagnas);
                    addActionListenerCita();
                    system.sCitas.vCitas.setVisible(true);
                }
            }
        });
        
        this.system.pPestagnas.pFicheros.pClientes.pnlTabla.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {                
                if(e.getClickCount()==2){
                    system.sCliente.iniciarCliente(1, system.pPestagnas, system.listaCiudades, system.listaRegiones);
                    addActionListenerCliente();    
                    system.gDatos.limitarCaracteres(system.sCliente.vCliente.pnlDatos.rutParte1, 2);
                    system.gDatos.limitarCaracteres(system.sCliente.vCliente.pnlDatos.rutParte2, 3);
                    system.gDatos.limitarCaracteres(system.sCliente.vCliente.pnlDatos.rutParte3, 3);
                    system.gDatos.limitarCaracteres(system.sCliente.vCliente.pnlDatos.rutParte4, 1);
                    system.sCliente.vCliente.setVisible(true);
                }
            }
        });
        
        this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {                
                if(e.getClickCount()==2){
                    system.sFichaPaciente.iniciarFPaciente(1, system.pPestagnas);
                    addActionListenerFichaPaciente();
                    system.sFichaPaciente.vFPaciente.pnlBotones.btnTratamiento.setEnabled(true);
                    system.sFichaPaciente.vFPaciente.pnlBotones.btnDocumentos.setEnabled(true);
                    system.sFichaPaciente.vFPaciente.setVisible(true);
                }
            }
        });
        
        this.system.pPestagnas.pFicheros.pPersonal.pnlTabla.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {                
                if(e.getClickCount()==2){
                    system.sPersonal.iniciarPersonal(1, system.pPestagnas, system.listaCiudades, system.listaRegiones);            
                    addActionListenerPersonal();
                    system.sPersonal.vPersonal.setVisible(true);
                }
            }
        });
        
        this.system.pPestagnas.pFicheros.pServicios.pnlTabla.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {                
                if(e.getClickCount()==2){
                    system.sServicio.iniciarServicios(1, system.pPestagnas);
                    addActionListenerServicio();
                    system.sServicio.vServicio.setVisible(true);
                }
            }
        });
        
    }
    
    public void addActionListenerPestannas(){
        this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnEliminar.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnEliminar.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnEliminar.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnCancelar.addActionListener(this);
        this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnEliminar.addActionListener(this);
        this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnEliminar.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bJaulas.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bDatosClinica.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bHorario.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bAcerca.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bDirectorio.addActionListener(this);        
        this.system.pPestagnas.pCitas.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pCitas.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pCitas.pnlBotones.btnEliminar.addActionListener(this);
    }
    
    public void addActionListenerInsumo(){
        this.system.sInsumos.vInsumos.pnlBotones.btnAgregar.addActionListener(this);
        this.system.sInsumos.vInsumos.pnlBotones.btnEliminar.addActionListener(this);
    }
    
    public void addActionListenerTratamiento(){        
        this.system.sTratamiento.vTrat.pnlBotones.btnInsumos.addActionListener(this);
        this.system.sTratamiento.vTrat.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sTratamiento.vTrat.pnlBotones.btnGuardar.addActionListener(this); 
    }
    
    public void addActionListenerDirectorio(){
        this.system.sDirectorio.vDirectorio.pnlDatos.btnBuscar.addActionListener(this);
        this.system.sDirectorio.vDirectorio.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sDirectorio.vDirectorio.pnlBotones.btnCancelar.addActionListener(this);
    }
    
    public void addActionListenerServicio(){
        this.system.sServicio.vServicio.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sServicio.vServicio.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sServicio.vServicio.pnlBotones.btnCancelar.addActionListener(this);
    }
    
    public void addActionListenerCita(){
        this.system.sCitas.vCitas.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sCitas.vCitas.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sCitas.vCitas.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sCitas.vCitas.pnlDatos.btnBusqueda.addActionListener(this);
    }
        
    public void addActionListenerPersonal(){
        this.system.sPersonal.vPersonal.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlBotones.btnCancelar.addActionListener(this);  
        this.system.sPersonal.vPersonal.pnlDatos.btnAgregarC.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnEliminarC.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnEditarC.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnAgregarCG.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnEliminarCG.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnEditarCG.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnAgregarR.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnEliminarR.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnEditarR.addActionListener(this);
    }
    
    public void addActionListenerFichaPaciente(){
        this.system.sFichaPaciente.vFPaciente.pnlBotones.btnDocumentos.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlBotones.btnTratamiento.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.btnBusqueda.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.btnAgregar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.btnEliminar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.btnEditar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.rbSi.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.rbNo.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.addActionListener(this);
    }       
    
    public void addActionListenerCliente(){
        this.system.sCliente.vCliente.pnlDatos.btnAgregarC.addActionListener(this);
        this.system.sCliente.vCliente.pnlDatos.btnEditarC.addActionListener(this);
        this.system.sCliente.vCliente.pnlDatos.btnEliminarC.addActionListener(this);
        this.system.sCliente.vCliente.pnlDatos.btnAgregarR.addActionListener(this);
        this.system.sCliente.vCliente.pnlDatos.btnEditarR.addActionListener(this);
        this.system.sCliente.vCliente.pnlDatos.btnEliminarR.addActionListener(this);
        this.system.sCliente.vCliente.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sCliente.vCliente.pnlBotones.btnAceptar.addActionListener(this);    
        this.system.sCliente.vCliente.pnlBotones.btnCancelar.addActionListener(this);
    }        
    
    public void addActionListenerCantidadJaulas(){        
        this.system.sConfigJaulas.vCJaulas.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sConfigJaulas.vCJaulas.pnlBotones.btnCancelar.addActionListener(this);                
    }
    
    public void addActionListenerDatosClinica(){
        this.system.sDatosClinica.vDClinica.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sDatosClinica.vDClinica.pnlBotones.btnCancelar.addActionListener(this);
    }
    
    public void addActionListenerHorario(){
        this.system.sConfigHorario.vCHorario.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sConfigHorario.vCHorario.pnlBotones.btnCancelar.addActionListener(this);
    }        
    
    public void addActionListenerProductos(){            
            this.system.sProductos.vProducto.pnlBotones.btnAceptar.addActionListener(this);
            this.system.sProductos.vProducto.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sProductos.vProducto.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sProductos.vProducto.pnlDatos.btnAgregar.addActionListener(this);
            this.system.sProductos.vProducto.pnlDatos.btnEliminar.addActionListener(this);
            this.system.sProductos.vProducto.pnlDatos.btnEditar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {//Iniciar ventana 
        if(this.system.pPestagnas.pConfig.pOpciones.bJaulas == e.getSource()){  //CONFIGURACION JAULA
            this.system.sConfigJaulas.iniciarCJaulas();
            this.addActionListenerCantidadJaulas();
            this.system.sConfigJaulas.vCJaulas.setVisible(true);            
        }else if(this.system.sConfigJaulas.vCJaulas.pnlBotones.btnGuardar == e.getSource()){                          //boton GUARDAR
           try{
            this.system.sConfigJaulas.setDatosJaula();            
            this.system.sConfigJaulas.actualizarJaulas(this.system.pPestagnas);
            this.system.sConfigJaulas.vCJaulas.hide();
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sConfigJaulas.vCJaulas.pnlBotones.btnCancelar == e.getSource()){                         //boton CANCELAR
            this.system.sConfigJaulas.vCJaulas.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bDatosClinica == e.getSource()){ //DATOS CLINICA
            this.system.sDatosClinica.iniciarDClinica();
            this.addActionListenerDatosClinica();
            this.system.sDatosClinica.vDClinica.setVisible(true);                                
        }else if(this.system.sDatosClinica.vDClinica.pnlBotones.btnGuardar == e.getSource()){                         //boton GUARDAR
            try{
            this.system.sDatosClinica.setDatosClinica();          
            this.system.sDatosClinica.vDClinica.hide();
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sDatosClinica.vDClinica.pnlBotones.btnCancelar == e.getSource()){                        //boton CANCELAR
            this.system.sDatosClinica.vDClinica.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bHorario == e.getSource()){  //CONFIGURACION HORARIO
            this.system.sConfigHorario.iniciarCHorario();
            this.addActionListenerHorario();
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV2, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV3, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV4, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD2, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD3, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD4, 2);
            this.system.sConfigHorario.vCHorario.setVisible(true);
        }else if(this.system.sConfigHorario.vCHorario.pnlBotones.btnAceptar == e.getSource()){                         //boton ACEPTAR
            try{
            this.system.sConfigHorario.setDatosHorario();
            this.system.sConfigHorario.vCHorario.hide();
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sConfigHorario.vCHorario.pnlBotones.btnCancelar == e.getSource()){                        //boton CANCELAR
            this.system.sConfigHorario.vCHorario.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bAcerca == e.getSource()){//CONFIGURACION ACERCA
            this.vAcerca = new VentanaAcerca();            
        }else if(this.system.pPestagnas.pConfig.pOpciones.bDirectorio == e.getSource()){//CONFIGURACION DIRECTORIO           
            this.system.sDirectorio.iniciarDirectorio();
            this.system.sDirectorio.vDirectorio.setVisible(true);
            this.addActionListenerDirectorio();
        }else if(this.system.sDirectorio.vDirectorio.pnlDatos.btnBuscar == e.getSource()){
            String ruta;
            JFileChooser jf = new JFileChooser();           
            jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jf.showOpenDialog(this);            
            File dir = jf.getSelectedFile();            
            if(dir != null){
                ruta = dir.getPath();
                this.system.sDirectorio.vDirectorio.pnlDatos.txtDirectorio.setText(ruta);
            }
        }else if(this.system.sDirectorio.vDirectorio.pnlBotones.btnAceptar == e.getSource()){
            this.system.sDirectorio.setDirectorio(this.system.sDirectorio.vDirectorio.pnlDatos.txtDirectorio.getText());
            this.system.sDirectorio.vDirectorio.hide();
        }else if(this.system.sDirectorio.vDirectorio.pnlBotones.btnCancelar == e.getSource()){
            this.system.sDirectorio.vDirectorio.hide();
        }else if(this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAbrir == e.getSource()){ //CLIENTES
            try{                             
            this.system.sCliente.iniciarCliente(1, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);
            this.addActionListenerCliente();    
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte2, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte3, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte4, 1);
            this.system.sCliente.vCliente.setVisible(true);
            }catch(Exception m){
                String out = "No hay una ficha seleccionada\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlDatos.btnAgregarC == e.getSource()){                           //boton AGREGAR CIUDAD
            try{
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad");            
            this.system.setCiudades(ciudad);
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlDatos.btnEditarC == e.getSource()){                           //boton EDITAR CIUDAD
            try{
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad");            
            this.system.editarCiudad(ciudad,1);
            }catch(Exception m){
                String out = "No hay una opción seleccionada";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlDatos.btnEliminarC == e.getSource()){                         //boton ELIMINAR CIUDAD
            this.system.eliminarCiudad(1);
        }else if(this.system.sCliente.vCliente.pnlDatos.btnAgregarR == e.getSource()){                           //boton AGREGAR REGION
            try{
            String region = JOptionPane.showInputDialog(null, "Introduce la región");            
            this.system.setRegiones(region);
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlDatos.btnEditarR == e.getSource()){                           //boton EDITAR REGION
            try{
            String region = JOptionPane.showInputDialog(null, "Introduce la región");            
            this.system.editarRegion(region, 1);
            }catch(Exception m){
                String out = "No hay una opción seleccionada";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlDatos.btnEliminarR == e.getSource()){                         //boton ELIMINAR REGION
            this.system.eliminarRegion(1);
        }else if(this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAnnadir == e.getSource()){           
            this.system.sCliente.iniciarCliente(2, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);
            this.addActionListenerCliente();
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte2, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte3, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte4, 1);
            this.system.sCliente.vCliente.setVisible(true);
        }else if(this.system.sCliente.vCliente.pnlBotones.btnGuardar == e.getSource()){                          //boton GUARDAR
            try{
                if(this.system.sCliente.vCliente.pnlDatos.rutParte1.getText().length() > 0 &&
                        this.system.sCliente.vCliente.pnlDatos.rutParte2.getText().length()== 3 && 
                        this.system.sCliente.vCliente.pnlDatos.rutParte3.getText().length()== 3 &&
                        this.system.sCliente.vCliente.pnlDatos.rutParte4.getText().length()== 1){
                    this.system.sCliente.crearCliente(this.system.pPestagnas);
                    this.system.sCliente.vCliente.hide(); 
                }else{
                    throw new Exception();
                }              
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlBotones.btnCancelar == e.getSource()){                         //boton CANCELAR
            this.system.sCliente.vCliente.hide();  
        }else if(this.system.sCliente.vCliente.pnlBotones.btnAceptar == e.getSource()){                          //boton ACEPTAR
            try{
            int index = this.system.pPestagnas.pFicheros.pClientes.pnlTabla.tabla.getSelectedRow();  
            this.system.sCliente.editarCliente(index, this.system.pPestagnas);
            this.system.sCliente.vCliente.hide();
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnEliminar == e.getSource()){               //boton Eliminar
            this.system.sCliente.eliminarCliente(this.system.pPestagnas);
        }else if(this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAbrir == e.getSource()){  //PACIENTES  
            try{
                this.system.sFichaPaciente.iniciarFPaciente(1, this.system.pPestagnas);
                this.addActionListenerFichaPaciente();
                this.system.sFichaPaciente.vFPaciente.pnlBotones.btnTratamiento.setEnabled(true);
                this.system.sFichaPaciente.vFPaciente.pnlBotones.btnDocumentos.setEnabled(true);
                this.system.sFichaPaciente.vFPaciente.setVisible(true);
            }catch(Exception m){
                String out = "No hay una ficha seleccionada\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
            
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.btnEliminar == e.getSource()){
            this.system.sFichaPaciente.eliminarEspecie();
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.btnEditar == e.getSource()){
            try{
                String especieEditada = JOptionPane.showInputDialog(null, "Introduce la especie");
                this.system.sFichaPaciente.editarEspecia(especieEditada);
            }catch(Exception m){
                String out = "No hay una opción seleccionada";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }            
        }else if(this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sFichaPaciente.iniciarFPaciente(2, this.system.pPestagnas);
            this.addActionListenerFichaPaciente();
            this.system.sFichaPaciente.vFPaciente.pnlBotones.btnTratamiento.setEnabled(false);
            this.system.sFichaPaciente.vFPaciente.pnlBotones.btnDocumentos.setEnabled(false);
            this.system.sFichaPaciente.vFPaciente.setVisible(true);
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnGuardar == e.getSource()){             //boton GUARDAR             
           try{
                this.system.sFichaPaciente.crearFPaciente(this.system.pPestagnas);
                if(!this.system.sFichaPaciente.nombreP.equals("")&&!this.system.sFichaPaciente.especie.equals("")&&!this.system.sFichaPaciente.raza.equals("")&&!this.system.sFichaPaciente.rut.equals("")){
                    if(this.system.booleano == true){
                        this.system.sConfigJaulas.setJaulaOcupada(this.system.booleano,
                            (String)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem(), 
                            (int)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.getSelectedItem(), 
                            this.system.pPestagnas);
                    }            
                    this.system.sFichaPaciente.vFPaciente.hide();   
                }else{
                    throw new Exception();
                }  
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.btnAgregar == e.getSource()){                               //boton AGREGAR
            String especie = JOptionPane.showInputDialog(null, "Introduce una nueva especie");
            this.system.sFichaPaciente.setEspecie(especie);
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnAceptar == e.getSource()){                  //boton ACEPTAR
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
            this.system.sFichaPaciente.editarFPaciente(index, this.system.pPestagnas);                       
            this.system.sConfigJaulas.setJaulaOcupada(this.system.booleano,
                    (String)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem(), 
                    (int)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.getSelectedItem(), 
                    this.system.pPestagnas);           
            this.system.sFichaPaciente.vFPaciente.hide();
            }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.btnBusqueda == e.getSource()){                          //boton BUSCAR
            String rut = JOptionPane.showInputDialog(null, "Introduce el rut con puntos y guion \n"+"Ej: 19.512.341-4");   
            if(this.system.gDatos.compararRut(rut,this.system.sCliente)==true){
                this.system.sFichaPaciente.vFPaciente.pnlDatos.txtCliente.setText(rut);
            }
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnCancelar == e.getSource()){                 //boton CANCELAR
            this.system.sFichaPaciente.vFPaciente.hide();
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.rbSi == e.getSource()){                                         //boton SI           
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.setEnabled(true);
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.setEnabled(true);
            this.system.booleano = true;
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.rbNo == e.getSource()){                                         //rboton NO                                 
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.setEnabled(false);            
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.setEnabled(false);            
            this.system.booleano = false;
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula == e.getSource()){                                  //combobox TJAULA
            if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem().equals("L")){
                this.system.sFichaPaciente.setJaulas(Integer.parseInt(this.system.sConfigJaulas.cantidadJaulas.get(0)));
            }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem().equals("M")){
                this.system.sFichaPaciente.setJaulas(Integer.parseInt(this.system.sConfigJaulas.cantidadJaulas.get(1)));
            }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem().equals("S")){
                this.system.sFichaPaciente.setJaulas(Integer.parseInt(this.system.sConfigJaulas.cantidadJaulas.get(2)));
            }
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.btnTratamiento == e.getSource()){ //TRATAMIENTO
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();                       
            this.system.sTratamiento.iniciarTratamiento(this.system.sFichaPaciente, index);
            this.addActionListenerTratamiento();
            this.system.sTratamiento.vTrat.setVisible(true);
        }else if(this.system.sTratamiento.vTrat.pnlBotones.btnGuardar == e.getSource()){                                         //boton GUARDAR
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();            
            this.system.sTratamiento.setTratamiento(this.system.sFichaPaciente, index);
            this.system.sTratamiento.vTrat.hide();
        }else if(this.system.sTratamiento.vTrat.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();            
            this.system.sTratamiento.setTratamiento(this.system.sFichaPaciente, index);
            this.system.sTratamiento.vTrat.hide();
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.btnDocumentos == e.getSource()){                      //>>>>>DOCUMENTOS<<<<<<
            this.system.abrirExplorer(this.system.sDirectorio.almacenDirectorio.get(0));
        }else if(this.system.sTratamiento.vTrat.pnlBotones.btnInsumos == e.getSource()){                                //>>>>>INSUMOS<<<<<<
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
            this.system.sInsumos.iniciarInsumos(this.system.sFichaPaciente, index);
            this.system.sInsumos.vInsumos.setVisible(true);
            this.addActionListenerInsumo();
        }else if(this.system.sInsumos.vInsumos.pnlBotones.btnAgregar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
            this.system.sInsumos.crearInsumo(this.system.sFichaPaciente, index, this.system.sCliente);
        }else if(this.system.sInsumos.vInsumos.pnlBotones.btnEliminar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
            this.system.sInsumos.eliminarInsumo(this.system.sFichaPaciente, index, this.system.sCliente);
        }else if(this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnEliminar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();            
            this.system.sConfigJaulas.setJaulaOcupada(
                    false, 
                    this.system.sFichaPaciente.listaPacientes.get(index).getTamannoJaula(), 
                    this.system.sFichaPaciente.listaPacientes.get(index).getNroJaula(), 
                    this.system.pPestagnas);
            this.system.sFichaPaciente.eliminarPaciente(this.system.pPestagnas);
            
        }else if(this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAbrir == e.getSource()){  //PERSONAL
            try{
            this.system.sPersonal.iniciarPersonal(1, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);            
            this.addActionListenerPersonal();
            this.system.sPersonal.vPersonal.setVisible(true);
            }catch(Exception m){
                String out = "No hay una ficha seleccionada\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sPersonal.iniciarPersonal(2, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);
            this.addActionListenerPersonal();
            this.system.sPersonal.vPersonal.setVisible(true);
        }else if(this.system.sPersonal.vPersonal.pnlBotones.btnGuardar == e.getSource()){
            try{
            this.system.sPersonal.crearPersonal(this.system.pPestagnas);
            this.system.sPersonal.vPersonal.hide();
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sPersonal.vPersonal.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pPersonal.pnlTabla.tabla.getSelectedRow();
            this.system.sPersonal.editarPersonal(index, this.system.pPestagnas);
            this.system.sPersonal.vPersonal.hide();
        }else if(this.system.sPersonal.vPersonal.pnlBotones.btnCancelar == e.getSource()){
            this.system.sPersonal.vPersonal.hide();
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnAgregarC == e.getSource()){
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad");            
            this.system.setCiudades(ciudad); 
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnEliminarC == e.getSource()){
            this.system.eliminarCiudad(2);
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnEditarC == e.getSource()){
            try{
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad");            
            this.system.editarCiudad(ciudad,2);
            }catch(Exception m){
                String out = "No hay una opción seleccionada";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnAgregarR == e.getSource()){
            String region = JOptionPane.showInputDialog(null, "Introduce la región");            
            this.system.setRegiones(region); 
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnEliminarR == e.getSource()){
            this.system.eliminarRegion(2);
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnEditarR == e.getSource()){
            try{
            String region = JOptionPane.showInputDialog(null, "Introduce la región");            
            this.system.editarRegion(region,2);
            }catch(Exception m){
                String out = "No hay una opción seleccionada";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnAgregarCG == e.getSource()){
            String cargo = JOptionPane.showInputDialog(null, "Introduce el cargo/rol");            
            this.system.sPersonal.setCargo(cargo); 
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnEliminarCG == e.getSource()){
            this.system.sPersonal.eliminarCargo();
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnEditarCG == e.getSource()){
            try{
                String cargoEditado = JOptionPane.showInputDialog(null, "Introduce el cargo/rol");
                this.system.sPersonal.editarCargo(cargoEditado);
            }catch(Exception m){
                String out = "No hay una opción seleccionada";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pCitas.pnlBotones.btnAbrir == e.getSource()){   //CITAS
            try{            
            this.system.sCitas.iniciarCitas(1, this.system.pPestagnas);
            this.addActionListenerCita();
            this.system.sCitas.vCitas.setVisible(true);
            }catch(Exception m){
                String out = "No hay una cita seleccionada\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pCitas.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sCitas.iniciarCitas(2, this.system.pPestagnas);
            this.addActionListenerCita();
            this.system.sCitas.vCitas.setVisible(true);
        }else if(this.system.pPestagnas.pCitas.pnlBotones.btnEliminar == e.getSource()){
            this.system.sCitas.eliminarCita(this.system.pPestagnas);
        }else if(this.system.sCitas.vCitas.pnlDatos.btnBusqueda == e.getSource()){
            String rut = JOptionPane.showInputDialog(null, "Introduce el rut con puntos y guion \n"+"Ej: 19.512.341-4");   
            if(this.system.gDatos.compararRut(rut,this.system.sCliente)==true){
                this.system.sCitas.vCitas.pnlDatos.txtRUT.setText(rut);
            }
        }else if(this.system.sCitas.vCitas.pnlBotones.btnGuardar == e.getSource()){
            try{                
            this.system.sCitas.crearCita(this.system.pPestagnas);
            this.system.sCitas.vCitas.hide();
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCitas.vCitas.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pCitas.pnlTabla.tabla.getSelectedRow();            
            this.system.sCitas.editarCita(index, this.system.pPestagnas);
            this.system.sCitas.vCitas.hide();
        }else if(this.system.sCitas.vCitas.pnlBotones.btnCancelar == e.getSource()){
            this.system.sCitas.vCitas.hide();
        }else if(this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAbrir == e.getSource()){ //PRODUCTOS
            try{
            this.system.sProductos.iniciarProductos(1, this.system.pPestagnas);
            this.addActionListenerProductos();
            this.system.sProductos.vProducto.setVisible(true);
            }catch(Exception m){
                String out = "No hay un producto seleccionado\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sProductos.iniciarProductos(2, this.system.pPestagnas);
            this.addActionListenerProductos();
            this.system.sProductos.vProducto.setVisible(true);
        }else if(this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnEliminar == e.getSource()){
            
        }else if(this.system.sProductos.vProducto.pnlBotones.btnGuardar == e.getSource()){
            try{
                this.system.sProductos.crearProducto(this.system.pPestagnas);
                this.system.sProductos.vProducto.hide();
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sProductos.vProducto.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pProductos.pnlTabla.tabla.getSelectedRow(); 
            this.system.sProductos.editarProducto(index, this.system.pPestagnas);
            this.system.sProductos.vProducto.hide();
        }else if(this.system.sProductos.vProducto.pnlBotones.btnCancelar == e.getSource()){
            this.system.sProductos.vProducto.hide();
        }else if(this.system.sProductos.vProducto.pnlDatos.btnAgregar == e.getSource()){
            try{
                String tipo = JOptionPane.showInputDialog(null, "Introduce el tipo de producto que deseas añadir");
                this.system.sProductos.setTipo(tipo);
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sProductos.vProducto.pnlDatos.btnEliminar == e.getSource()){
            this.system.sProductos.eliminarTipo();
        }else if(this.system.sProductos.vProducto.pnlDatos.btnEditar == e.getSource()){
            try{
                String tipoEditado = JOptionPane.showInputDialog(null, "Introduce el tipo de producto");
                this.system.sProductos.editarTipo(tipoEditado);
            }catch(Exception m){
                String out = "No hay una opción seleccionada";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAbrir == e.getSource()){ //Iniciar ventana SERVICIOS
            try{
                this.system.sServicio.iniciarServicios(1, this.system.pPestagnas);
                this.addActionListenerServicio();
                this.system.sServicio.vServicio.setVisible(true);
            }catch(Exception m){
                String out = "No hay un servicio seleccionado";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sServicio.iniciarServicios(2, this.system.pPestagnas);
            this.addActionListenerServicio();
            this.system.sServicio.vServicio.setVisible(true);
        }else if(this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnEliminar == e.getSource()){
            
        }else if(this.system.sServicio.vServicio.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow();
            this.system.sServicio.editarServicio(index, this.system.pPestagnas);
            this.system.sServicio.vServicio.hide();
        }else if(this.system.sServicio.vServicio.pnlBotones.btnGuardar == e.getSource()){
            try{
                this.system.sServicio.crearServicio(this.system.pPestagnas);
                this.system.sServicio.vServicio.hide();
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sServicio.vServicio.pnlBotones.btnCancelar == e.getSource()){
            this.system.sServicio.vServicio.hide();
        }
    }
           
}
