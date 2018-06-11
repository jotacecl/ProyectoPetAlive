/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HernySenpai
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private String ciudad;
    private int telefono;
    private int movil;
    private String email;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String rut, String ciudad, int telefono, int movil, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.movil = movil;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
