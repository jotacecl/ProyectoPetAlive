
package manejoSistema;

import java.util.ArrayList;
import vistaHorario.VentanaHorario;

/**
 *
 * @author Juan Carlos
 */
public class SisConfigHorario {
    
    public VentanaHorario vCHorario;
    private final ArrayList<String> datosHorario = new ArrayList<>(8);
    
    public void iniciarCHorario(){
        if(datosHorario.size() == 8){
            this.vCHorario = new VentanaHorario(datosHorario.get(0), datosHorario.get(1), datosHorario.get(2),datosHorario.get(3),datosHorario.get(4),datosHorario.get(5),datosHorario.get(6),datosHorario.get(7));
        }else{
            this.vCHorario = new VentanaHorario("","","","","","","","");
        }  
    }
    
    public void setDatosHorario(){
       if(this.datosHorario.isEmpty()){
            for(int i = 0; i<8 ;i++){
            this.datosHorario.add("");            
            }
        }
       this.datosHorario.set(0, this.vCHorario.pnlHorario.txtLV1.getText());
       this.datosHorario.set(1, this.vCHorario.pnlHorario.txtLV2.getText());
       this.datosHorario.set(2, this.vCHorario.pnlHorario.txtLV3.getText());
       this.datosHorario.set(3, this.vCHorario.pnlHorario.txtLV4.getText());
       this.datosHorario.set(4, this.vCHorario.pnlHorario.txtSD1.getText());
       this.datosHorario.set(5, this.vCHorario.pnlHorario.txtSD2.getText());
       this.datosHorario.set(6, this.vCHorario.pnlHorario.txtSD3.getText());
       this.datosHorario.set(7, this.vCHorario.pnlHorario.txtSD4.getText());
    }
    
}
