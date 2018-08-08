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
public class SisDatosClinicaTest {
    
    private Sistema sys;
    private SisDatosClinica sDC;
    
    public SisDatosClinicaTest() {
        this.sys = new Sistema();
        this.sDC = new SisDatosClinica();
    }
    
    @Test
    public void iniciarDClinicaTest(){
        sDC.iniciarDClinica();
    }
    
    @Test
    public void setDatosClinicaTest(){
        sDC.setDatosClinica();
    }
    
}
