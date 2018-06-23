/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

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
    private int jaula;
    private String antecedentes;

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

    public int getJaula() {
        return jaula;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
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

    public Paciente() {
    }

    public Paciente(String id, String nombre, String especie, String raza, String color, String fNacimiento, String sexo, String internado, int jaula, String rutCliente, String antMed) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fNacimiento = fNacimiento;
        this.sexo = sexo;
        this.internado = internado;
        this.jaula = jaula;
        this.rutCliente = rutCliente;
        this.antecedentes = antMed;
    }
    
    
}
