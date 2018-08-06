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
    
    public void verificarDatos(Sistema sys){
        if(sys.sConfigJaulas.vCJaulas.pnlCJaulas.txtCL.getText().length()==0 &&
                sys.sConfigJaulas.vCJaulas.pnlCJaulas.txtCM.getText().length()==0 &&
                sys.sConfigJaulas.vCJaulas.pnlCJaulas.txtCS.getText().length()==0 ){
            String out = "Bienvenido a PetAlive, al parecer es la primera vez que ejecuta esta aplicacion.\n";
            out += "Para que puedas trabajar sin problemas porfavor primero configura la aplicacion de manera completa.";
            JOptionPane.showMessageDialog(null, out, "Bienvenido a PetAlive!", INFORMATION_MESSAGE);
            sys.pPestagnas.setSelectedIndex(3);
        }
        
    }
    
}
