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
public class SisLanzamientoTest {
    
    private Sistema sys;
    private SisLanzamiento sL;
    
    public SisLanzamientoTest() {
        this.sys = new Sistema();        
    }
    
    @Test
    public void verficarDatosTest(){
        this.sL = new SisLanzamiento(sys);
    }
    
}
