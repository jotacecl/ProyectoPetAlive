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
public class SistemaTest {
    
    private Sistema sys;
    
    public SistemaTest() {
        this.sys = new Sistema();
    }
    
    @Test
    public void setCiudadesTest(){
        sys.setCiudades("");
    }
    
    @Test
    public void editarCiudadTest(){
        sys.editarCiudad("", 0);
    }
    
    @Test
    public void eliminarCiudadTest(){
        sys.eliminarCiudad(0);
    }
    
    @Test
    public void setRegionesTest(){
        sys.setRegiones("");
    }
    
    @Test
    public void editarRegionTest(){
        sys.editarRegion("", 0);
    }
    
    @Test
    public void eliminarRegionTest(){
        sys.eliminarRegion(0);
    }
    
    @Test
    public void abrirExplorerTest(){
        sys.abrirExplorer("");
    }
    
}
