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
public class SisConfigHorarioTest {
    
    private Sistema sys;
    private SisConfigHorario sCH;
    
    public SisConfigHorarioTest() {
        this.sys = new Sistema();
        this.sCH = new SisConfigHorario();
    }
    
    @Test
    public void iniciarCHorarioTest(){
        sCH.iniciarCHorario();
    }
    
    @Test
    public void setDatosHorarioTest(){
        sCH.setDatosHorario();
    }
    
}
