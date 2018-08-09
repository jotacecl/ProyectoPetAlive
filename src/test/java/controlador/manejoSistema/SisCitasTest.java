/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.manejoSistema;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Juan Carlos
 */
public class SisCitasTest {
    
    private Sistema sys;
    private SisCitas sC;
    
    public SisCitasTest() {
        this.sys = new Sistema();
        this.sC = new SisCitas(sys.pPestagnas);
    }
    
    @Test
    public void iniciarCitasTest(){
        sC.iniciarCitas(0, sys.pPestagnas);
    }
    
    @Test
    public void setDatosCitasTest(){
        sC.setDatosCitas(2);
    }
    
    @Test
    public void crearCitaTest() throws Exception{
        sC.crearCita(this.sys.pPestagnas);
    }
    
    @Test
    public void editarCitaTest(){
        sC.editarCita(this.sys.pPestagnas);
    }
    
    @Test
    public void eliminarCitaTest(){
        sC.eliminarCita(this.sys.pPestagnas);
    }
    
    @Test
    public void getAllDataCitaTest(){
        sC.getAllDataCita();
    }
    
    @Test
    public void buscarTest(){
        sC.buscar("", this.sys.pPestagnas);
    }
    
    @Test
    public void refrescarTest(){
        sC.refrescar(this.sys.pPestagnas);
    }
    
    @Test
    public void compararTest(){
        sC.comparar(this.sys.pPestagnas);
    }
    
}
