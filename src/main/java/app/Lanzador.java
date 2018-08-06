
package app;



import controlador.manejoSistema.SisLanzamiento;
import vista.vistaInicio.VentanaInicio;


/**
 *
 * @author Juan Carlos
 */
public class Lanzador {
   
    public static void main(String[] args) {
        VentanaInicio v1 = new VentanaInicio();
        SisLanzamiento sL = new SisLanzamiento(v1.system);              
    }
    
}
