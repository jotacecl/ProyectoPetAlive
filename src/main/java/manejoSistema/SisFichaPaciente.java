/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Paciente;
import vistaFichaPaciente.VentanaFichaPaciente;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisFichaPaciente {
    public VentanaFichaPaciente vFPaciente;
    private final ArrayList<String> listaEspecies = new ArrayList<>();
    private final ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private String nombreP, especie, raza, color, fNac, jaula, internado, sexo, antMed, rut;
    
    public void iniciarFPaciente(int btnSeleccionado, PestagnasInicio p){
        int index = p.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
        if(btnSeleccionado == 1){
            this.setDatosFPaciente(index);
        }else if(btnSeleccionado == 2){
            this.vFPaciente = new VentanaFichaPaciente("","","","","","", false, 3, "");
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
        this.antMed = this.listaPacientes.get(index).getAntecedentes();
        
        if(this.internado.equals("si")){
            this.vFPaciente = new VentanaFichaPaciente(nombreP, raza, color, fNac, rut, jaula, true, 2, antMed);
            this.vFPaciente.pnlDatos.grupoRB2.setSelected(this.vFPaciente.pnlDatos.rbSi.getModel(), true);
        }else if(this.internado.equals("no")){
            this.vFPaciente = new VentanaFichaPaciente(nombreP, raza, color, fNac, rut, jaula, false, 2, antMed);
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
    
    public void crearFPaciente(PestagnasInicio pi){
        this.getAllDataPaciente();
        
        Paciente p = new Paciente(Integer.toString(this.listaPacientes.size()),
                                    this.nombreP,
                                    this.especie,
                                    this.raza,
                                    this.color,
                                    this.fNac,
                                    this.sexo,
                                    this.internado,
                                    Integer.parseInt(this.jaula),
                                    this.rut,
                                    this.antMed);
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
        pi.pFicheros.pPacientes.pnlTabla.modelo.addRow(fila);
        
    }
    
    public void editarFPaciente(int index, PestagnasInicio pi){
        this.getAllDataPaciente();
        
        this.listaPacientes.get(index).setNombre(this.nombreP);
        this.listaPacientes.get(index).setEspecie(this.especie);
        this.listaPacientes.get(index).setRaza(this.raza);
        this.listaPacientes.get(index).setColor(this.color);
        if(!this.fNac.equals("null-null-null")){  
            this.listaPacientes.get(index).setfNacimiento(this.fNac);
        }
        this.listaPacientes.get(index).setSexo(this.sexo);
        this.listaPacientes.get(index).setInternado(this.internado);
        this.listaPacientes.get(index).setJaula(Integer.parseInt(this.jaula));
        this.listaPacientes.get(index).setRutCliente(this.rut);
        
        Paciente p = this.listaPacientes.get(index);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getNombre(), index, 1);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getEspecie(), index, 2);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getRaza(), index, 3);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getColor(), index, 4);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getfNacimiento(), index, 5);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getSexo(), index, 6);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getInternado(), index, 7);
        pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getJaula(), index, 8);
        
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
        this.antMed = this.vFPaciente.pnlAMedicos.ingAntecedentesMedicos.getText();
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
}
