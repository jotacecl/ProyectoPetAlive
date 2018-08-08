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
public class SisTratamientoTest {
    
    private Sistema sys;
    private SisTratamiento sT;
    
    public SisTratamientoTest() {
        this.sys = new Sistema();
        this.sT = new SisTratamiento();
    }
    
    @Test
    public void iniciarTratamientoTest(){
        sT.iniciarTratamiento(sys.sFichaPaciente, 0);
    }
    
    @Test
    public void getTratamientoTest(){
        sT.getTratamiento(sys.sFichaPaciente, 0);
    }
    
    @Test
    public void setTratamientoTest(){
        sT.setTratamiento(sys.sFichaPaciente, 0);
    }
    
    @Test
    public void getAllDataTest(){
        sT.getAllDataTratamiento();
    }
}
