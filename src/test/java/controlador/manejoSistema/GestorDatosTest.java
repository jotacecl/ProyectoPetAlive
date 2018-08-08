/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.manejoSistema;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Carlos
 */
public class GestorDatosTest {
    
    private Sistema sys;
    private GestorDatos gD;
    
    public GestorDatosTest() {
        this.sys = new Sistema();
        this.gD = new GestorDatos();
    }
    
    @Test
    public void compararRutTest(){
       gD.compararRut("", this.sys.sCliente);
    }
    
    @Test
    public void separarRutTest(){
        gD.separarRut("");
    }
            
}
