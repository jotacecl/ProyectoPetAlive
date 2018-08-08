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
public class SisFichaPacienteTest {
    
    private Sistema sys;
    private SisFichaPaciente sFP;
    
    public SisFichaPacienteTest() {
        this.sys = new Sistema();
        this.sFP = new SisFichaPaciente();
    }
    
    @Test
    public void iniciarFPacienteTest(){
        sFP.iniciarFPaciente(0, sys.pPestagnas);
    }
    
    @Test
    public void setDatosFPacienteTest(){
        sFP.setDatosFPaciente(0);
    }
    
    @Test
    public void creafFPacienteTest(){
        sFP.crearFPaciente(sys.pPestagnas);
    }
    
    @Test
    public void editarFPacienteTest(){
        sFP.editarFPaciente(sys.pPestagnas);
    }
    
    @Test
    public void eliminarPacienteTest(){
        sFP.eliminarPaciente(sys.pPestagnas);
    }
    
    @Test
    public void getAllDataPacienteTest(){
        sFP.getAllDataPaciente();
    }
    
    @Test
    public void setEspecieTest(){
        sFP.setEspecie(null);
    }
    
    @Test
    public void editarEspecieTest(){
        sFP.editarEspecie(null);
    }
    
    @Test
    public void eliminarEspecieTest(){
        sFP.eliminarEspecie();
    }
    
    @Test
    public void setJaulasTest(){
        sFP.setJaulas(0);
    }
    
    @Test
    public void buscarTest(){
        sFP.buscar(null, sys.pPestagnas);
    }
    
    @Test
    public void refrescarTest(){
        sFP.refrescar(sys.pPestagnas);
    }
    
    @Test
    public void compararTest(){
        sFP.comparar(sys.pPestagnas);
    }
    
    
}
