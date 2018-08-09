
package controlador.manejoArchivo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import modelo.Cita;
import modelo.Cliente;
import modelo.Paciente;
import modelo.Personal;
import modelo.Producto;
import modelo.Servicio;

/**
 *
 * @author HernySenpai
 */
public class ManejoDeDatos {
    
    public void escritura (Object object, String direccion){
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
        String datos = null;
        try {
            datos = new String(Files.readAllBytes(Paths.get(direccion)));
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return datos;
    }
    
    public ArrayList<String> leerArchivoArrayString (String direccion){
        Gson gson = new Gson();
        String datos = lector(direccion);
        ArrayList <String> array = gson.fromJson(datos, ArrayList.class);
        return array;
    }
    
    public ArrayList<Cliente> leerArchivoListaCliente (String direccion){
        Gson gson = new Gson();
        String datos = lector(direccion);
        ArrayList <Cliente> array = gson.fromJson(datos, new TypeToken<List<Cliente>>() {}.getType());
        return array;
    }
    
    public ArrayList<Paciente> leerArchivoListaPaciente (String direccion){
        Gson gson = new Gson();
        String datos = lector(direccion);
        ArrayList <Paciente> array = gson.fromJson(datos, new TypeToken<List<Paciente>>() {}.getType());
        return array;
    }
    
    public ArrayList<Personal> leerArchivoListaPersonal (String direccion){
        Gson gson = new Gson();
        String datos = lector(direccion);
        ArrayList <Personal> array = gson.fromJson(datos, new TypeToken<List<Personal>>() {}.getType());
        return array;
    }
    
    public ArrayList<Producto> leerArchivoListaProducto (String direccion){
        Gson gson = new Gson();
        String datos = lector(direccion);
        ArrayList <Producto> array = gson.fromJson(datos, new TypeToken<List<Producto>>() {}.getType());
        return array;
    }
    
    public ArrayList<Servicio> leerArchivoListaServicio (String direccion){
        Gson gson = new Gson();
        String datos = lector(direccion);
        ArrayList <Servicio> array = gson.fromJson(datos, new TypeToken<List<Servicio>>() {}.getType());
        return array;
    }
    
    public ArrayList<Cita> leerArchivoListaCita (String direccion){
        Gson gson = new Gson();
        String datos = lector(direccion);
        ArrayList <Cita> array = gson.fromJson(datos, new TypeToken<List<Cita>>() {}.getType());
        return array;
    }
    
    
    
}
