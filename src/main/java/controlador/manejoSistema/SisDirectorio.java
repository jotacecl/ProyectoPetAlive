
package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import vista.vistaDirectorio.VentanaDirectorio;

/**
 *
 * @author Juan Carlos
 */
public class SisDirectorio {
    
   public VentanaDirectorio vDirectorio;
   public ArrayList<String> almacenDirectorio = new ArrayList<>();  
   private final String RUTA = "data\\config\\";
   private final String ARCHIVO = "directorio.json";
   public ManejoDeDatos mD;

    public SisDirectorio() {
        this.mD = new ManejoDeDatos();
    }
   
   
   
   /**
    * Metodo para iniciar la ventana de Directorio.
    */
   public void iniciarDirectorio(){         
       if(!this.almacenDirectorio.isEmpty()){           
           this.vDirectorio = new VentanaDirectorio(this.almacenDirectorio.get(0));
           this.vDirectorio = new VentanaDirectorio(mD.leerArchivoArrayString(RUTA+ARCHIVO).get(0));
       }else{        
           this.vDirectorio = new VentanaDirectorio(mD.leerArchivoArrayString(RUTA+ARCHIVO).get(0));
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
       mD.escritura(almacenDirectorio, RUTA+ARCHIVO);
   }      
          
}
