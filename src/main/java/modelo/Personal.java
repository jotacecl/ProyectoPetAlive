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
public class Personal extends Persona {
    String cargo;

    public Personal() {
    }
    
    
    
    public Personal(String cargo, String nombre, String apellido, String rut,String direccion, String ciudad, String region, int telefono, int movil, String email) {
        super(nombre, apellido, rut, direccion, ciudad, region, telefono, movil, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
