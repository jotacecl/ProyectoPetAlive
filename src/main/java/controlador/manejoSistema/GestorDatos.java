
package controlador.manejoSistema;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Juan Carlos
 */
public class GestorDatos {
    
    private boolean existe;
    private ArrayList<String> lista;
    
    /**
     * Este metodo compara los RUT ingresados con los RUT registrados de los clientes.
     * Si el RUT coincide se devuelve un boolean true, si no coincide con ningun RUT se retorna un false.
     * @param dato1
     * @param sCliente
     * @return 
     */
    public boolean compararRut(String dato1, SisCliente sCliente){
        for(int i=0; i<sCliente.listaClientes.size(); i++){
            if(dato1.equals(sCliente.listaClientes.get(i).getRut())){
                System.out.println("RUT encontrado");
                existe = true;
                break;
            }else{
                System.out.println("RUT no encontrado");
                existe = false;
            }            
        }
        return existe;
    }        
    
    /**
     * Este metodo separa el RUT del cliente a formato xx.xxx.xxx-x.
     * @param rut
     * @return 
     */
    public ArrayList separarRut(String rut){
        this.lista = new ArrayList<>();
        if(rut.length()==12 || rut.length()==11){            
            if(rut.length()==12){
                this.lista.add(Character.toString(rut.charAt(0))+Character.toString(rut.charAt(1)));
                this.lista.add(Character.toString(rut.charAt(3))+Character.toString(rut.charAt(4))+Character.toString(rut.charAt(5)));
                this.lista.add(Character.toString(rut.charAt(7))+Character.toString(rut.charAt(8))+Character.toString(rut.charAt(9)));
                this.lista.add(Character.toString(rut.charAt(11)));
            }else{
                this.lista.add(Character.toString(rut.charAt(0)));
                this.lista.add(Character.toString(rut.charAt(2))+Character.toString(rut.charAt(3))+Character.toString(rut.charAt(4)));
                this.lista.add(Character.toString(rut.charAt(6))+Character.toString(rut.charAt(7))+Character.toString(rut.charAt(8)));
                this.lista.add(Character.toString(rut.charAt(10)));
            }                 
        }       
        return this.lista;
    }
    
    /**
     * Este metodo limita el numero de caracteres ingresados en los JTextfields.
     * @param l
     * @param nmax 
     */
    public void limitarCaracteres(JTextField l, int nmax){
      l.addKeyListener(new KeyAdapter(){
       @Override
       public void keyTyped(KeyEvent  e){
          if (l.getText().length()==nmax){
              e.consume();}
          }             
       });
    }
}
