
package controlador.manejoSistema;

import java.util.ArrayList;
import vista.vistaDirectorio.VentanaDirectorio;

/**
 *
 * @author Juan Carlos
 */
public class SisDirectorio {
    
   public VentanaDirectorio vDirectorio;
   public ArrayList<String> almacenDirectorio = new ArrayList<>();  
    
   public void iniciarDirectorio(){         
       if(!this.almacenDirectorio.isEmpty()){           
           this.vDirectorio = new VentanaDirectorio(this.almacenDirectorio.get(0));
       }else{           
           this.vDirectorio = new VentanaDirectorio("");
       }
   }
   
   public void setDirectorio(String directorio){        
       if(this.almacenDirectorio.isEmpty()){
           this.almacenDirectorio.add(directorio);
       }else{
           this.almacenDirectorio.set(0, directorio);
       }       
   }      
          
}
