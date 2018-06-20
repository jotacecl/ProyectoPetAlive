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
public class Cliente extends Persona{

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String rut,String direccion, String ciudad, String region, int telefono, int movil, String email) {
        super(nombre, apellido, rut, direccion, ciudad, region, telefono, movil, email);
    }
    
    
}
