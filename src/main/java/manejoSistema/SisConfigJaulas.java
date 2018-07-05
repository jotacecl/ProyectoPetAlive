
package manejoSistema;

import java.util.ArrayList;
import vistaJaulas.VentanaCJaulas;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisConfigJaulas {
    
    public VentanaCJaulas vCJaulas;
    public final ArrayList<String> cantidadJaulas = new ArrayList<>(3);
    
    public void iniciarCJaulas(){
        if(cantidadJaulas.size() == 3){
            this.vCJaulas = new VentanaCJaulas(cantidadJaulas.get(0), cantidadJaulas.get(1), cantidadJaulas.get(2));
        }else{
            this.vCJaulas = new VentanaCJaulas("","","");
        }        
    }
    
    public void setDatosJaula(){
        if(this.cantidadJaulas.isEmpty()){
            for(int i = 0; i<3 ;i++){
            this.cantidadJaulas.add("");            
            }
        }
        this.cantidadJaulas.set(0, this.vCJaulas.pnlCJaulas.txtCL.getText());
        this.cantidadJaulas.set(1, this.vCJaulas.pnlCJaulas.txtCM.getText());
        this.cantidadJaulas.set(2, this.vCJaulas.pnlCJaulas.txtCS.getText());
    }
    
    public void actualizarJaulas(PestagnasInicio p){        
        p.pJaulas.pJaulas.setCantidadJaulasL(Integer.valueOf(vCJaulas.pnlCJaulas.txtCL.getText()));
        p.pJaulas.pJaulas.setCantidadJaulasM(Integer.valueOf(vCJaulas.pnlCJaulas.txtCM.getText()));
        p.pJaulas.pJaulas.setCantidadJaulasS(Integer.valueOf(vCJaulas.pnlCJaulas.txtCS.getText()));
        p.pJaulas.pJaulas.removeAll();
        p.pJaulas.pJaulas.updateUI();
        p.pJaulas.pJaulas.repaint();
        p.pJaulas.pJaulas.iniciarComponentes();
    }  
    
    public void setJaulaOcupada(boolean ocupada, String tamannoJaula,int nroJaula, PestagnasInicio p){        
         if(tamannoJaula.equals("L")){
             p.pJaulas.pJaulas.jaulasL.get(nroJaula-1).setOcupada(ocupada);
             p.pJaulas.pJaulas.jaulasL.get(nroJaula-1).pintar();
             this.actualizarJaulas(p);
         }else if(tamannoJaula.equals("M")){
             p.pJaulas.pJaulas.jaulasM.get(nroJaula-1).setOcupada(ocupada);
             p.pJaulas.pJaulas.jaulasM.get(nroJaula-1).pintar();
             this.actualizarJaulas(p);
         }else if(tamannoJaula.equals("S")){
             p.pJaulas.pJaulas.jaulasS.get(nroJaula-1).setOcupada(ocupada);
             p.pJaulas.pJaulas.jaulasS.get(nroJaula-1).pintar();
             this.actualizarJaulas(p);
         }         
     }
    
}
