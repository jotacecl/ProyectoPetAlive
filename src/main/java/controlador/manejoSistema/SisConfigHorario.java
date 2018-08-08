
package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import vista.vistaHorario.VentanaHorario;

/**
 *
 * @author Juan Carlos
 */
public class SisConfigHorario {
    public ManejoDeDatos mD;
    public VentanaHorario vCHorario;
    public ArrayList<String> datosHorario = new ArrayList<>(8);
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO = "horario.json";

    public SisConfigHorario() {
        this.mD = new ManejoDeDatos();
    }
    
    /**
     * Metodo para iniciar la ventana Horario.
     */        
    public void iniciarCHorario(){
        if(datosHorario.size() == 8){
            this.vCHorario = new VentanaHorario(datosHorario.get(0), 
                    datosHorario.get(1), 
                    datosHorario.get(2),
                    datosHorario.get(3),
                    datosHorario.get(4),
                    datosHorario.get(5),
                    datosHorario.get(6),
                    datosHorario.get(7));
            
        }else{
            this.vCHorario = new VentanaHorario("","","","","","","","");
        }  
    }
    
    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     */
    public void setDatosHorario(){
        try{
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
            mD.escritura(this.datosHorario, RUTA+ARCHIVO);
        }catch(NullPointerException e){
            e.getCause();
        }
    }
    
}
