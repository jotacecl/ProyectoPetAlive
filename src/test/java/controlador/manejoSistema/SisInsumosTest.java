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
public class SisInsumosTest {
    
    private Sistema sys;
    private SisInsumos sI;
    
    public SisInsumosTest() {
        this.sys = new Sistema();
        this.sI = new SisInsumos();
    }
    
    @Test
    public void iniciarInsumosTest(){
        sI.iniciarInsumos(sys.sFichaPaciente, 0);
    }
    
    @Test
    public void setDatosInsumosTest(){
        sI.setDatosInsumos(sys.sFichaPaciente, 0);
    }
    
    @Test
    public void crearInsumoTest(){
        sI.crearInsumo(sys.sFichaPaciente, 0, sys.sCliente);
    }
    
    @Test
    public void eliminarInsumoTest(){
        sI.eliminarInsumo(sys.sFichaPaciente, 0, sys.sCliente);
    }
    
    @Test
    public void getAllDataInsumoTest(){
        sI.getAllDataInsumo();
    }
    
    @Test
    public void sumarCostoTest(){
        sI.sumarCosto(sys.sFichaPaciente, 0, sys.sCliente);
    }
    
    @Test
    public void restarCostoTest(){
        sI.restarCosto(sys.sFichaPaciente, 0, sys.sCliente);
    }
    
    @Test
    public void actualizarDeudaClienteTest(){
        sI.actualizarDeudaCliente(sys.sCliente, sys.sFichaPaciente, 0, 0);
    }
}
