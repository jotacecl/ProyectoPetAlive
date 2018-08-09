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
public class SisDirectorioTest {
    
    private Sistema sys;
    private SisDirectorio sD;
    
    public SisDirectorioTest() {
        this.sys = new Sistema();
        this.sD = new SisDirectorio(sys.pPestagnas);
    }
    
    @Test
    public void iniciarDirectorioTest(){
        sD.iniciarDirectorio();
    }
    
    @Test
    public void setDirectorioTest(){
        sD.setDirectorio("");
    }
    
}
