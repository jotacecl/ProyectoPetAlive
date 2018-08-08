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
public class SisClienteTest {
    
    private Sistema sys;
    private SisCliente sC;
    
    public SisClienteTest() {
        this.sys = new Sistema();
        this.sC = new SisCliente();
    }
    
    @Test
    public void iniciarClienteTest(){
        ArrayList<String> test = null;
        sC.iniciarCliente(0, sys.pPestagnas, test, test);
    }
    
    @Test
    public void setDatosClienteTest(){
        ArrayList<String> test = null;
        sC.setDatosCliente(0, test, test);
    }
    
    @Test
    public void crearClienteTest(){
        sC.crearCliente(sys.pPestagnas);
    }
    
    @Test
    public void editarClienteTest(){
        sC.editarCliente(sys.pPestagnas);
    }
    
    @Test
    public void eliminarCliente(){
        sC.eliminarCliente(sys.pPestagnas);
    }
    
    @Test
    public void getAllDataClienteTest(){
        sC.getAllDataCliente();
    }
    
    @Test
    public void buscarTest(){
        sC.buscar("", sys.pPestagnas);
    }
    
    @Test
    public void refrescarTest(){
        sC.refrescar(sys.pPestagnas);
    }
    
    @Test
    public void compararTest(){
        sC.comparar(sys.pPestagnas);
    }
    
}
