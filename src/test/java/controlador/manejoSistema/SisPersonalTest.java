/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.manejoSistema;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Carlos
 */
public class SisPersonalTest {
     
    private Sistema sys;
    private SisPersonal sP;
    
    public SisPersonalTest() { 
        this.sys = new Sistema();
        this.sP = new SisPersonal(sys.pPestagnas);
    }
    
    @Test
    public void iniciarPersonalTest(){       
        sP.iniciarPersonal(0, null, null, null);
    }
    
    @Test
    public void setDatosPeronalTest(){
        sP.setDatosPersonal(0, null, null);
    }
    
    @Test
    public void crearPersonalTest(){
        sP.crearPersonal(sys.pPestagnas);
    }
    
    @Test
    public void editarPersonalTest(){
        sP.editarPersonal(sys.pPestagnas);
    }
    
    @Test
    public void eliminarPersonalTest(){
        sP.eliminarPersonal(sys.pPestagnas);
    }
    
    @Test
    public void getAllDataPersonalTest(){
        sP.getAllDataPersonal();
    }
    
    @Test
    public void setCargoTest(){
        sP.setCargo(null);
    }
    
    @Test
    public void editarCargoTest(){
        sP.editarCargo(null);
    }
    
    @Test
    public void eliminarCargoTest(){
        sP.eliminarCargo();
    }
    
    @Test
    public void buscarTest(){
        sP.buscar("", sys.pPestagnas);
    }
    
    @Test
    public void refrescarTest(){
        sP.refrescar(sys.pPestagnas);
    }
    
    @Test
    public void compararTest(){
        sP.comparar(sys.pPestagnas);
    }
}
