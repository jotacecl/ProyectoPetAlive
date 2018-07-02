/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.util.ArrayList;
import vistaDirectorio.VentanaDirectorio;

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
