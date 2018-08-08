/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.manejoSistema;

import org.junit.Ignore;
import org.junit.Test;
/**
 *
 * @author Juan Carlos
 */
public class SisConfigJaulasTest {
    
    private SisConfigJaulas sCJ;
    private Sistema sys;

    public SisConfigJaulasTest() {
        this.sys = new Sistema();
        this.sCJ = new SisConfigJaulas(this.sys.pPestagnas);
    }
            
    @Test
    public void setDatosJaulaTest(){
        this.sCJ.setDatosJaula();
    }
    
    @Test
    public void actualizarJaulasTest(){
        this.sCJ.actualizarJaulas(this.sys.pPestagnas);
    }
    
    @Test
    public void setJaulasOcupadaTest(){
        this.sCJ.setJaulaOcupada(true, "L", 0, this.sys.pPestagnas);
    }
    
    @Test
    public void cargarDatosTest(){
        this.sCJ.cargarDatos(this.sys.pPestagnas);
    }
    
}
