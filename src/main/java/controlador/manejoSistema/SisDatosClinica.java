
package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import vista.vistaDatosClinica.VentanaDClinica;

/**
 *
 * @author Juan Carlos
 */
public class SisDatosClinica {
    public ManejoDeDatos mD;
    public VentanaDClinica vDClinica;
    private final ArrayList<String> datosClinica = new ArrayList<>(8);
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO = "datosClinica.json";

    public SisDatosClinica() {
        this.mD = new ManejoDeDatos();
    }
    
    
    
    /**
     * Metodo para iniciar la ventana Datos de la Clinica.
     */
     public void iniciarDClinica(){
                     
            if(datosClinica.size() == 8 ){
                System.out.println("");
                System.out.println("Imprime con datos");
                this.vDClinica = new VentanaDClinica(datosClinica.get(0), 
                        datosClinica.get(1), datosClinica.get(2) , 
                        datosClinica.get(3), datosClinica.get(4), 
                        datosClinica.get(5), datosClinica.get(6), 
                        datosClinica.get(7));
                
            }else{
                System.out.println("");
                System.out.println("Imprime vacio");
                this.vDClinica = new VentanaDClinica(mD.leerArchivoArrayString(RUTA+ARCHIVO).get(0),
                    mD.leerArchivoArrayString(RUTA+ARCHIVO).get(1),
                    mD.leerArchivoArrayString(RUTA+ARCHIVO).get(2),
                    mD.leerArchivoArrayString(RUTA+ARCHIVO).get(3),
                    mD.leerArchivoArrayString(RUTA+ARCHIVO).get(4),
                    mD.leerArchivoArrayString(RUTA+ARCHIVO).get(5),
                    mD.leerArchivoArrayString(RUTA+ARCHIVO).get(6),
            mD.leerArchivoArrayString(RUTA+ARCHIVO).get(7));                                    
            }   
    }
    
     /**
     * Metodo para ingresar los datos automaticamente en los JTextfields de la ventana. 
     */
    public void setDatosClinica(){
        try{
        if(this.datosClinica.size() == 0){
            for(int i = 0; i<8 ;i++){
            this.datosClinica.add("");            
            }
        }        
        this.datosClinica.set(0,this.vDClinica.pnlDatos.txtNombreS.getText());
        this.datosClinica.set(1,this.vDClinica.pnlDatos.txtNombreF.getText());
        this.datosClinica.set(2,this.vDClinica.pnlDatos.txtDireccion.getText());
        this.datosClinica.set(3,this.vDClinica.pnlDatos.txtCiudad.getText());            
        this.datosClinica.set(4,this.vDClinica.pnlDatos.txtRegion.getText());
        this.datosClinica.set(5,this.vDClinica.pnlDatos.txtTelefono.getText());
        this.datosClinica.set(6,this.vDClinica.pnlDatos.txtEmail.getText());
        this.datosClinica.set(7,this.vDClinica.pnlDatos.txtWeb.getText());
        mD.escritura(this.datosClinica, RUTA+ARCHIVO);
        }catch(NullPointerException e){
            e.getCause();
        }
    }
    
}
