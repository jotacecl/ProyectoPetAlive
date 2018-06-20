/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;
import java.util.Collections;
import vistaCitas.VentanaCita;
import vistaClientes.VentanaCliente;
import vistaDatosClinica.VentanaDClinica;
import vistaFichaPaciente.VentanaFichaPaciente;
import vistaJaulas.VentanaCJaulas;
import vistaHorario.VentanaHorario;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class Sistema {
    
    public PestagnasInicio pPestagnas;
    public VentanaCJaulas vCJaulas;
    public VentanaDClinica vDClinica;
    public VentanaHorario vCHorario;
    public VentanaCliente vCliente;
    public VentanaCita vCitas;
    public VentanaFichaPaciente vFPaciente;
    public ArrayList<String> datosClinica = new ArrayList<>(8);
    public ArrayList<String> cantidadJaulas = new ArrayList<>(3);
    public ArrayList<String> datosHorario = new ArrayList<>(8);
    public ArrayList<String> datosCitas = new ArrayList<>();
    public ArrayList<Cliente> listaClientes = new ArrayList<>();
    public ArrayList<String> listaCiudades = new ArrayList<>();
    public ArrayList<String> listaEspecies = new ArrayList<>();
    public ArrayList<String> litaRegiones = new ArrayList<>();
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    
    private String nombre,apellido,rut,direccion,ciudad,region,telefono,movil,email;
    private String nombreP, especie, raza, color, fNac, jaula, internado, sexo;

    public void iniciarDClinica(){
                     
            if(datosClinica.size() == 8 ){
                System.out.println("");
                System.out.println("Imprime con datos");
                this.vDClinica = new VentanaDClinica(datosClinica.get(0), datosClinica.get(1), datosClinica.get(2) , datosClinica.get(3), datosClinica.get(4), datosClinica.get(5), datosClinica.get(6), datosClinica.get(7));
                
            }else{
                System.out.println("");
                System.out.println("Imprime vacio");
                    this.vDClinica = new VentanaDClinica("", "", "", "", "", "", "", "");                                    
            }   
    }
    
    public void setDatosClinica(){
        if(this.datosClinica.size() == 0){
            for(int i = 0; i<8 ;i++){
            this.datosClinica.add("");            
            }
        }        
        this.datosClinica.set(0,this.vDClinica.pnlDatos.txtNombreS.getText());
        this.datosClinica.set(1,this.vDClinica.pnlDatos.txtNombreF.getText());
        this.datosClinica.set(2,this.vDClinica.pnlDatos.txtDireccion.getText());
        this.datosClinica.set(3,this.vDClinica.pnlDatos.txtCiudad.getText());            
        this.datosClinica.set(4,this.vDClinica.pnlDatos.txtRegion.getText());
        this.datosClinica.set(5,this.vDClinica.pnlDatos.txtTelefono.getText());
        this.datosClinica.set(6,this.vDClinica.pnlDatos.txtEmail.getText());
        this.datosClinica.set(7,this.vDClinica.pnlDatos.txtWeb.getText());
    }
    
    public void iniciarCJaulas(){
        if(cantidadJaulas.size() == 3){
            this.vCJaulas = new VentanaCJaulas(cantidadJaulas.get(0), cantidadJaulas.get(1), cantidadJaulas.get(2));
        }else{
            this.vCJaulas = new VentanaCJaulas("","","");
        }        
    }
    
    public void setDatosJaula(){
        if(this.cantidadJaulas.isEmpty()){
            for(int i = 0; i<3 ;i++){
            this.cantidadJaulas.add("");            
            }
        }
        this.cantidadJaulas.set(0, this.vCJaulas.pnlCJaulas.txtCL.getText());
        this.cantidadJaulas.set(1, this.vCJaulas.pnlCJaulas.txtCM.getText());
        this.cantidadJaulas.set(2, this.vCJaulas.pnlCJaulas.txtCS.getText());
    }
    
    public void actualizarJaulas(){        
        pPestagnas.pJaulas.pJaulas.setCantidadJaulasL(Integer.valueOf(vCJaulas.pnlCJaulas.txtCL.getText()));
        pPestagnas.pJaulas.pJaulas.setCantidadJaulasM(Integer.valueOf(vCJaulas.pnlCJaulas.txtCM.getText()));
        pPestagnas.pJaulas.pJaulas.setCantidadJaulasS(Integer.valueOf(vCJaulas.pnlCJaulas.txtCS.getText()));
        pPestagnas.pJaulas.pJaulas.removeAll();
        pPestagnas.pJaulas.pJaulas.updateUI();
        pPestagnas.pJaulas.pJaulas.repaint();
        pPestagnas.pJaulas.pJaulas.iniciarComponentes();
    }  
    
    public void iniciarCHorario(){
        if(datosHorario.size() == 8){
            this.vCHorario = new VentanaHorario(datosHorario.get(0), datosHorario.get(1), datosHorario.get(2),datosHorario.get(3),datosHorario.get(4),datosHorario.get(5),datosHorario.get(6),datosHorario.get(7));
        }else{
            this.vCHorario = new VentanaHorario("","","","","","","","");
        }  
    }
    
    public void setDatosHorario(){
       if(this.datosHorario.isEmpty()){
            for(int i = 0; i<8 ;i++){
            this.datosHorario.add("");            
            }
        }
       this.datosHorario.set(0, this.vCHorario.pnlHorario.txtLV1.getText());
       this.datosHorario.set(1, this.vCHorario.pnlHorario.txtLV2.getText());
       this.datosHorario.set(2, this.vCHorario.pnlHorario.txtLV3.getText());
       this.datosHorario.set(3, this.vCHorario.pnlHorario.txtLV4.getText());
       this.datosHorario.set(4, this.vCHorario.pnlHorario.txtSD1.getText());
       this.datosHorario.set(5, this.vCHorario.pnlHorario.txtSD2.getText());
       this.datosHorario.set(6, this.vCHorario.pnlHorario.txtSD3.getText());
       this.datosHorario.set(7, this.vCHorario.pnlHorario.txtSD4.getText());
    }
    
    public void iniciarCliente(int btnSeleccionado){
        int index = this.pPestagnas.pFicheros.pClientes.panelTabla.tabla.getSelectedRow();                
        if(btnSeleccionado == 1){
            this.setDatosCliente(index);
        }else if(btnSeleccionado == 2){
            this.vCliente = new VentanaCliente(2,"","","","","","","");
            if(this.vCliente.pnlDatos.cbCiudad.getItemAt(1) != ("    ")){
                this.vCliente.pnlDatos.cbCiudad.removeAllItems();
                for(String l:listaCiudades){
                    this.vCliente.pnlDatos.cbCiudad.addItem(l);
                }
                this.vCliente.pnlDatos.cbRegion.removeAllItems();
                for(String l:litaRegiones){
                    this.vCliente.pnlDatos.cbRegion.addItem(l);
                }                
            }
        }  
    }
    
    public void setDatosCliente(int index){
        this.nombre = this.listaClientes.get(index).getNombre();
        this.apellido = this.listaClientes.get(index).getApellido();
        this.rut = this.listaClientes.get(index).getRut();
        this.direccion = this.listaClientes.get(index).getDireccion();
        this.ciudad = this.listaClientes.get(index).getCiudad();
        this.region = this.listaClientes.get(index).getRegion();
        this.telefono = Integer.toString(this.listaClientes.get(index).getTelefono());
        this.movil = Integer.toString(this.listaClientes.get(index).getMovil());
        this.email = this.listaClientes.get(index).getEmail();
            
        this.vCliente = new VentanaCliente(1,nombre,apellido,rut,direccion,telefono,movil,email);
        this.vCliente.pnlDatos.cbCiudad.removeAllItems();
        for(String l:listaCiudades){
        this.vCliente.pnlDatos.cbCiudad.addItem(l);
        }
        this.vCliente.pnlDatos.cbRegion.removeAllItems();
        for(String l:litaRegiones){
        this.vCliente.pnlDatos.cbRegion.addItem(l);
        }
        this.vCliente.pnlDatos.cbCiudad.setSelectedItem(ciudad);
        this.vCliente.pnlDatos.cbRegion.setSelectedItem(region);
    }
    
    public void crearCliente(){       
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
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.addRow(fila);                
    }   
    
    public void editarCliente(int index){
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
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.setValueAt(c.getNombre(), index, 0);
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.setValueAt(c.getApellido(), index, 1);
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.setValueAt(c.getRut(), index, 2);
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.setValueAt(c.getCiudad(), index, 3);
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.setValueAt(c.getTelefono(), index, 4);
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.setValueAt(c.getMovil(), index, 5);
        this.pPestagnas.pFicheros.pClientes.panelTabla.modelo.setValueAt(c.getEmail(), index, 6);
        
        
    }
    
    public void getAllDataCliente(){
        this.nombre = this.vCliente.pnlDatos.txtNombre.getText();
        this.apellido = this.vCliente.pnlDatos.txtApellidos.getText();
        this.rut = this.vCliente.pnlDatos.txtRut.getText();
        this.direccion = this.vCliente.pnlDatos.txtDireccion.getText();
        this.ciudad = (String)this.vCliente.pnlDatos.cbCiudad.getSelectedItem();
        this.region = (String)this.vCliente.pnlDatos.cbRegion.getSelectedItem();
        this.telefono = this.vCliente.pnlDatos.txtTelefono.getText();
        this.movil = this.vCliente.pnlDatos.txtMovil.getText();
        this.email = this.vCliente.pnlDatos.txtEmail.getText();
    }
    
    public void setCiudades(String ciudad){
        
        if(ciudad != null){
            this.listaCiudades.add(ciudad);
            Collections.sort(this.listaCiudades);
            this.vCliente.pnlDatos.cbCiudad.removeAllItems();
            for(String l:listaCiudades){
            this.vCliente.pnlDatos.cbCiudad.addItem(l);
            }
             System.out.println("Ciudad: "+ciudad+" agregada.");
        }else{
            System.out.println("null");
        }        
        
    }
    
    public void setRegiones(String region){
        
        if(region != null){
            this.litaRegiones.add(region);
            Collections.sort(this.litaRegiones);
            this.vCliente.pnlDatos.cbRegion.removeAllItems();
            for(String l:litaRegiones){
            this.vCliente.pnlDatos.cbRegion.addItem(l);
            }
             System.out.println("Región: "+region+" agregada.");
        }else{
            System.out.println("null");
        } 
    }
    
    public void iniciarFPaciente(int btnSeleccionado){
        int index = this.pPestagnas.pFicheros.pPacientes.panelTabla.tabla.getSelectedRow();
        if(btnSeleccionado == 1){
            this.setDatosFPaciente(index);
        }else if(btnSeleccionado == 2){
            this.vFPaciente = new VentanaFichaPaciente("","","","","","", false, 3);
        }
    }
    
    public void setDatosFPaciente(int index){
        this.nombreP = this.listaPacientes.get(index).getNombre();
        this.especie = this.listaPacientes.get(index).getEspecie();
        this.raza = this.listaPacientes.get(index).getRaza();
        this.color = this.listaPacientes.get(index).getColor();
        this.fNac = this.listaPacientes.get(index).getfNacimiento();
        this.sexo = this.listaPacientes.get(index).getSexo();
        this.internado = this.listaPacientes.get(index).getInternado();
        this.jaula = Integer.toString(this.listaPacientes.get(index).getJaula());
        this.rut = this.listaPacientes.get(index).getRutCliente();
        
        if(this.internado.equals("si")){
            this.vFPaciente = new VentanaFichaPaciente(nombreP, raza, color, fNac, rut, jaula, true, 2);
            this.vFPaciente.pnlDatos.grupoRB2.setSelected(this.vFPaciente.pnlDatos.rbSi.getModel(), true);
        }else if(this.internado.equals("no")){
            this.vFPaciente = new VentanaFichaPaciente(nombreP, raza, color, fNac, rut, jaula, false, 2);
            this.vFPaciente.pnlDatos.grupoRB2.setSelected(this.vFPaciente.pnlDatos.rbNo.getModel(), true);
        }
        
        if(this.sexo.equals("macho")){
            this.vFPaciente.pnlDatos.grupoRB.setSelected(this.vFPaciente.pnlDatos.rbMacho.getModel(), true);
        }else if(this.sexo.equals("hembra")){
            this.vFPaciente.pnlDatos.grupoRB.setSelected(this.vFPaciente.pnlDatos.rbHembra.getModel(), true);
        }
        
        this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for(String l:listaEspecies){
            this.vFPaciente.pnlDatos.cbTipo.addItem(l);
            }
        this.vFPaciente.pnlDatos.cbTipo.setSelectedItem(especie);
        
    }
    
    public void crearFPaciente(){
        this.getAllDataPaciente();
        
        Paciente p = new Paciente(Integer.toString(this.listaClientes.size()),
                                    this.nombreP,
                                    this.especie,
                                    this.raza,
                                    this.color,
                                    this.fNac,
                                    this.sexo,
                                    this.internado,
                                    Integer.parseInt(this.jaula),
                                    this.rut);
        this.listaPacientes.add(p);
        
        Object[] fila = new Object[9];
        fila[0] = p.getId();
        fila[1] = p.getNombre();
        fila[2] = p.getEspecie();
        fila[3] = p.getRaza();
        fila[4] = p.getColor();
        fila[5] = p.getfNacimiento();
        fila[6] = p.getSexo();
        fila[7] = p.getInternado();
        fila[8] = p.getJaula();
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.addRow(fila);
        
    }
    
    public void editarFPaciente(int index){
        this.getAllDataPaciente();
        
        this.listaPacientes.get(index).setNombre(this.nombreP);
        this.listaPacientes.get(index).setEspecie(this.especie);
        this.listaPacientes.get(index).setRaza(this.raza);
        this.listaPacientes.get(index).setColor(this.color);
        if(this.fNac.equals("null-null-null")){                    
        }else{
            this.listaPacientes.get(index).setfNacimiento(this.fNac);            
        }
        this.listaPacientes.get(index).setSexo(this.sexo);
        this.listaPacientes.get(index).setInternado(this.internado);
        this.listaPacientes.get(index).setJaula(Integer.parseInt(this.jaula));
        this.listaPacientes.get(index).setRutCliente(this.rut);
        
        Paciente p = this.listaPacientes.get(index);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getNombre(), index, 1);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getEspecie(), index, 2);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getRaza(), index, 3);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getColor(), index, 4);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getfNacimiento(), index, 5);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getSexo(), index, 6);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getInternado(), index, 7);
        this.pPestagnas.pFicheros.pPacientes.panelTabla.modelo.setValueAt(p.getJaula(), index, 8);
        
    }
    
    public void getAllDataPaciente(){
        this.nombreP = this.vFPaciente.pnlDatos.txtPaciente.getText();
        this.especie = (String)this.vFPaciente.pnlDatos.cbTipo.getSelectedItem();
        this.raza = this.vFPaciente.pnlDatos.txtRaza.getText();
        this.color = this.vFPaciente.pnlDatos.txtColor.getText();
        
        String fechaSeleccionada = String.format(this.vFPaciente.pnlDatos.FORMATO, this.vFPaciente.pnlDatos.calendario.getDate());
        this.fNac = fechaSeleccionada;
        
        if(this.vFPaciente.pnlDatos.grupoRB.getSelection() == this.vFPaciente.pnlDatos.rbMacho.getModel()){
                this.sexo = "macho";
        }else if(this.vFPaciente.pnlDatos.grupoRB.getSelection() == this.vFPaciente.pnlDatos.rbHembra.getModel()){
                this.sexo = "hembra";
        }
        
        if(this.vFPaciente.pnlDatos.grupoRB2.getSelection() == this.vFPaciente.pnlDatos.rbSi.getModel()){
                this.internado = "si";
                this.jaula = this.vFPaciente.pnlDatos.txtJaula.getText();
        }else if(this.vFPaciente.pnlDatos.grupoRB2.getSelection() == this.vFPaciente.pnlDatos.rbNo.getModel()){
                this.internado = "no";
                this.jaula = "0";
        }
                
        this.rut = this.vFPaciente.pnlDatos.txtCliente.getText(); 
    }
    
    public void setEspecie(String especie){
         if(especie != null){
            this.listaEspecies.add(especie);
            Collections.sort(this.listaEspecies);
            this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for(String l:listaEspecies){
            this.vFPaciente.pnlDatos.cbTipo.addItem(l);
            }
             System.out.println("Especie: "+especie+" agregada.");
        }else{
            System.out.println("null");
        } 
    }
    
    
    public Sistema(){
        this.pPestagnas = new PestagnasInicio();
        this.iniciarDClinica();
        this.iniciarCJaulas();
        this.iniciarCHorario();
        this.iniciarCliente(2);
        this.iniciarFPaciente(2);
    }    
    
}
