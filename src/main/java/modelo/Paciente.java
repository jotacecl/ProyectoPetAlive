
package modelo;

import java.util.ArrayList;

/**
 *
 * @author HernySenpai
 */
public class Paciente {
    private String id;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    private String fNacimiento;
    private String sexo;
    private String internado;
    private String rutCliente;
    private String tamannoJaula;
    private int nroJaula;
    private String antecedentes;
    private String tratamiento;
    private ArrayList<Insumo> listaInsumos = new ArrayList<>();
    private int costoInsumos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getInternado() {
        return internado;
    }

    public void setInternado(String internado) {
        this.internado = internado;
    }

    public String getTamannoJaula() {
        return tamannoJaula;
    }

    public void setTamannoJaula(String tamannoJaula) {
        this.tamannoJaula = tamannoJaula;
    }
    
    public int getNroJaula() {
        return nroJaula;
    }

    public void setNroJaula(int jaula) {
        this.nroJaula = jaula;
    }
    
    public String getRutCliente(){
        return rutCliente;
    }
    
    public void setRutCliente(String rutCliente){
        this.rutCliente = rutCliente;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }        

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public ArrayList<Insumo> getListaInsumos() {
        return listaInsumos;
    }  
    
    public int getCostoInsumos() {
        return costoInsumos;
    }

    public void setCostoInsumos(int costoInsumos) {
        this.costoInsumos = costoInsumos;
    }
    
    public Paciente() {
    }   

    public Paciente(String id, String nombre, String especie, String raza, String color, String fNacimiento, String sexo, String internado, String rutCliente, String tamannoJaula, int nroJaula, String antecedentes) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fNacimiento = fNacimiento;
        this.sexo = sexo;
        this.internado = internado;
        this.rutCliente = rutCliente;
        this.tamannoJaula = tamannoJaula;
        this.nroJaula = nroJaula;
        this.antecedentes = antecedentes;
    }                  
    
}
