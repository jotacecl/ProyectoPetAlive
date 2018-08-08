/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.manejoSistema;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Juan Carlos
 */
public class SisLanzamiento {

    public SisLanzamiento(Sistema sys) {
        this.verificarDatos(sys);
    }        
    
    /**
     * Metodo para el mensaje de bienvenida, se ejecuta la primera vez que
     * se abra la app.
     * Solo toma en cuenta las configuraciones fundamentales.
     * @param sys 
     */
    public void verificarDatos(Sistema sys){
        if(sys.sConfigJaulas.vCJaulas.pnlCJaulas.txtCL.getText().length()==0 &&
                sys.sConfigJaulas.vCJaulas.pnlCJaulas.txtCM.getText().length()==0 &&
                sys.sConfigJaulas.vCJaulas.pnlCJaulas.txtCS.getText().length()==0
                ){
            sys.pPestagnas.setSelectedIndex(3);
            String out = "Bienvenido a PetAlive, al parecer es la primera vez que ejecuta esta aplicacion.\n";            
            out += "Si no quieres volver a ver este mensaje, porfavor configura las siguientes opciones: \n";
            out += " - Seleccionar directorio\n";
            out += " - Cantidad de Jaulas";
            JOptionPane.showMessageDialog(null, out, "Bienvenido a PetAlive!", INFORMATION_MESSAGE);            
        }else if(sys.sDirectorio.vDirectorio.pnlDatos.txtDirectorio.getText().isEmpty()){
            sys.pPestagnas.setSelectedIndex(3);
            String out = "Bienvenido a PetAlive, al parecer es la primera vez que ejecuta esta aplicacion.\n";            
            out += "Si no quieres volver a ver este mensaje, porfavor configura las siguientes opciones: \n";
            out += " - Seleccionar directorio\n";
            out += " - Cantidad de Jaulas";
            JOptionPane.showMessageDialog(null, out, "Bienvenido a PetAlive!", INFORMATION_MESSAGE);
        }
        
    }
    
}
