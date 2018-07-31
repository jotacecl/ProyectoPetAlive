
package controlador.manejoArchivo;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author HernySenpai
 */
public class ManejoDeDatos {
    public static void escritura (Object object, String direccion){
        Gson gson = new Gson();
        String datos = gson.toJson(object);
        guardar(direccion, datos);
    }
    
    private static void guardar (String direccion, String datos){
        try{
            File fichero = new File(direccion);
            if(fichero.delete()){
                System.out.println("fichero borrado satisfactoriamente");
            }
        }catch (Exception e){
            System.out.println("El fichero no se ha podido borrar.");
        }
        try{
            Files.write(Paths.get(direccion), datos.getBytes(), StandardOpenOption.CREATE);
            System.out.println("Archivo creado");
        }catch (IOException e){
            System.out.println("Archivo no creado");
        }
    }
    
    private static String lector(String direccion){
        String datos="";
        try {
            datos = new String(Files.readAllBytes(Paths.get(direccion)));
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return datos;
    
    }
    
}
