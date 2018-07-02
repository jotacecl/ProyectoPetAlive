/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class Sistema {
    
    public PestagnasInicio pPestagnas;                         
    
    public SisDatosClinica sDatosClinica;
    public SisConfigJaulas sConfigJaulas;
    public SisConfigHorario sConfigHorario;
    public SisCliente sCliente;
    public GestorDatos gDatos;
    public SisFichaPaciente sFichaPaciente;
    public SisPersonal sPersonal;    
    public SisCitas sCitas;
    public SisProducto sProductos;
    public SisServicio sServicio;
    public SisDirectorio sDirectorio;
    public SisTratamiento sTratamiento;
    
    public final ArrayList<String> listaCiudades = new ArrayList<>();    
    public final ArrayList<String> listaRegiones = new ArrayList<>();
    
    public boolean booleano;
    
    public Sistema(){
        this.iniciarComponentes();        
    }  
    
    private void iniciarComponentes(){
        this.sDatosClinica = new SisDatosClinica();
        this.sConfigJaulas = new SisConfigJaulas();
        this.sConfigHorario = new SisConfigHorario();
        this.sCliente = new SisCliente();
        this.gDatos = new GestorDatos();
        this.sFichaPaciente = new SisFichaPaciente();
        this.sPersonal = new SisPersonal();
        this.sCitas = new SisCitas();
        this.sProductos = new SisProducto();
        this.sServicio = new SisServicio();
        this.sDirectorio = new SisDirectorio();
        this.sTratamiento = new SisTratamiento();
        
        this.pPestagnas = new PestagnasInicio();
        this.sDatosClinica.iniciarDClinica();
        this.sConfigJaulas.iniciarCJaulas();
        this.sConfigHorario.iniciarCHorario();
        this.sCliente.iniciarCliente(2, this.pPestagnas, this.listaCiudades, this.listaRegiones);
        this.sFichaPaciente.iniciarFPaciente(2, this.pPestagnas);
        this.sPersonal.iniciarPersonal(2,this.pPestagnas, this.listaCiudades, this.listaRegiones);
        this.sCitas.iniciarCitas(2, this.pPestagnas);
        this.sProductos.iniciarProductos(2, this.pPestagnas);
        this.sServicio.iniciarServicios(2, this.pPestagnas);
        this.sDirectorio.iniciarDirectorio();
        this.sTratamiento.iniciarTratamiento(0, false);
    }                
    
    public void setCiudades(String ciudad){
        
        if(ciudad != null){
            this.listaCiudades.add(ciudad);
            Collections.sort(this.listaCiudades);
            this.sCliente.vCliente.pnlDatos.cbCiudad.removeAllItems();
            this.sPersonal.vPersonal.pnlDatos.cbCiudad.removeAllItems();
            for(String l:listaCiudades){
            this.sCliente.vCliente.pnlDatos.cbCiudad.addItem(l);
            this.sPersonal.vPersonal.pnlDatos.cbCiudad.addItem(l);
            }
             System.out.println("Ciudad: "+ciudad+" agregada.");
        }else{
            System.out.println("null");
        }        
        
    }
    
    public void setRegiones(String region){
        
        if(region != null){
            this.listaRegiones.add(region);
            Collections.sort(this.listaRegiones);
            this.sCliente.vCliente.pnlDatos.cbRegion.removeAllItems();
            this.sPersonal.vPersonal.pnlDatos.cbRegion.removeAllItems();
            for(String l:listaRegiones){
            this.sCliente.vCliente.pnlDatos.cbRegion.addItem(l);
            this.sPersonal.vPersonal.pnlDatos.cbRegion.addItem(l);
            }
             System.out.println("Región: "+region+" agregada.");
        }else{
            System.out.println("null");
        } 
    }  
    
    public void abrirExplorer(String dir){
        Runtime r = Runtime.getRuntime();
		Process p = null;
		try {
			p = r.exec("explorer.exe " + dir);
		} catch (IOException e) {
			System.out.println("Error al ejecutar");
		}
    }
                                                
}
