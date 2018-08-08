
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
   
   /**
    * Metodo para iniciar la ventana de Directorio.
    */
   public void iniciarDirectorio(){         
       if(!this.almacenDirectorio.isEmpty()){           
           this.vDirectorio = new VentanaDirectorio(this.almacenDirectorio.get(0));
       }else{           
           this.vDirectorio = new VentanaDirectorio(null);
       }
   }
   
   /**
    * Metodo para ingresar los datos en los JTextfields de la ventana.
    * @param directorio 
    */
   public void setDirectorio(String directorio){
       try {
           if(this.almacenDirectorio.isEmpty()){
               this.almacenDirectorio.add(directorio);
           }else{
               this.almacenDirectorio.set(0, directorio);
           }   
       } catch (NullPointerException e) {
           e.getCause();
       }              
   }      
          
}
