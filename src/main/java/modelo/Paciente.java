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
    private Date fNacimiento;
    private Boolean sexo;
    private Boolean internado;
    private int jaula;

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

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Boolean getInternado() {
        return internado;
    }

    public void setInternado(Boolean internado) {
        this.internado = internado;
    }

    public int getJaula() {
        return jaula;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
    }

    public Paciente() {
    }

    public Paciente(String id, String nombre, String especie, String raza, String color, Date fNacimiento, Boolean sexo, Boolean internado, int jaula) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fNacimiento = fNacimiento;
        this.sexo = sexo;
        this.internado = internado;
        this.jaula = jaula;
    }
    
    
}
