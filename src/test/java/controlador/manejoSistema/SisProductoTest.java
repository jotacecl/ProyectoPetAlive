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
public class SisProductoTest {
    
    private Sistema sys;
    private SisProducto sP;
    
    public SisProductoTest() {
        this.sys = new Sistema();
        this.sP = new SisProducto();
    }
    
    @Test
    public void iniciarProductosTest(){
        sP.iniciarProductos(0, sys.pPestagnas);
    }
    
    @Test
    public void setDatosProductoTest(){
        sP.setDatosProducto(0);
    }
    
    @Test
    public void crearProductoTest(){
        sP.crearProducto(sys.pPestagnas);
    }
    
    @Test
    public void editarProductoTest(){
        sP.editarProducto(0, sys.pPestagnas);
    }
    
    @Test
    public void getAllDataProductoTest(){
        sP.getAllDataProducto();
    }
    
    @Test
    public void eliminarProductoTest(){
        sP.eliminarProducto(sys.pPestagnas);
    }
    
    @Test
    public void setTipoTest(){
        sP.setTipo("");
    }
    
    @Test
    public void editarTipoTest(){
        sP.editarTipo("");
    }
    
    @Test
    public void eliminarTipoTest(){
        sP.eliminarTipo();
    }
}
