
package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import vista.vistaDirectorio.VentanaDirectorio;
import vista.vistaInicio.PestagnasInicio;

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

    public SisDirectorio(PestagnasInicio p) {
        this.mD = new ManejoDeDatos();
        this.cargarDatos(p);
    }      
   
   /**
    * Metodo para iniciar la ventana de Directorio.
    */
   public void iniciarDirectorio(){
       try{
        if(!this.almacenDirectorio.isEmpty()){           
            this.vDirectorio = new VentanaDirectorio(this.almacenDirectorio.get(0));            
        }else{        
            this.vDirectorio = new VentanaDirectorio("");
        }
       }catch(NullPointerException e){
           e.getCause();
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
           mD.escritura(almacenDirectorio, RUTA+ARCHIVO);
       } catch (NullPointerException e) {
           e.getCause();
       }       
   }
   
    public void cargarDatos(PestagnasInicio p){
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA+ARCHIVO);         
        if(aux!=null){
            this.almacenDirectorio = aux;                        
        }
    }
          
}
