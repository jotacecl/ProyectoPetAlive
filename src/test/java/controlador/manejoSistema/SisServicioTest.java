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
public class SisServicioTest {
    
    private Sistema sys;
    private SisServicio sT;
    
    public SisServicioTest() {
        this.sys = new Sistema();
        this.sT = new SisServicio(sys.pPestagnas);
    }
    
    @Test
    public void iniciarServiciosTest(){
        sT.iniciarServicios(0, sys.pPestagnas);
    }
    
    @Test
    public void setDatosServicioTest(){
        sT.setDatosServicio(0);
    }
    
    @Ignore
    public void crearServicioTest(){
        sT.crearServicio(sys.pPestagnas);
    }
    
    @Test
    public void editarServicioTest(){
        sT.editarServicio(0, sys.pPestagnas);
    }
    
    @Test
    public void eliminarServicioTest(){
        sT.eliminarServicio(sys.pPestagnas);
    }
    
    @Test
    public void getAllDataServicioTest(){
        sT.getAllDataServicio();
    }
}
