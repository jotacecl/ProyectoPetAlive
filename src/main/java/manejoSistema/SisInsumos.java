
package manejoSistema;

import modelo.Insumo;
import vistaVentanaInsumos.VentanaInsumos;

/**
 *
 * @author Juan Carlos
 */
public class SisInsumos {
    
    private String nombre, cantidad;
    private int costo;
    public VentanaInsumos vInsumos;    
    private Insumo ins;
    
    public void iniciarInsumos(SisFichaPaciente sFP, int index){
        if(sFP.listaPacientes.size()!=0 && sFP.listaPacientes.get(index).getListaInsumos() != null){
            this.setDatosInsumos(sFP, index);
        }else{
            this.vInsumos = new VentanaInsumos();
        }
    }
    
    public void setDatosInsumos(SisFichaPaciente sFP, int index){
        this.vInsumos = new VentanaInsumos();
        for(int i=0; i<sFP.listaPacientes.get(index).getListaInsumos().size(); i++){
            Object[] fila = new Object[3];
            fila[0] = sFP.listaPacientes.get(index).getListaInsumos().get(i).getNombre();
            if(sFP.listaPacientes.get(index).getListaInsumos().get(i).getCantidad() == "0"){
              fila[1] = " ";  
            }else{
              fila[1] = sFP.listaPacientes.get(index).getListaInsumos().get(i).getCantidad(); 
            }                           
            fila[2] = sFP.listaPacientes.get(index).getListaInsumos().get(i).getCosto();
            this.vInsumos.pnlTabla.modelo.addRow(fila);
        }
        this.vInsumos.pnlTabla.txtTotal.setText(Integer.toString(sFP.listaPacientes.get(index).getCostoInsumos()));        
    }
    
    public void crearInsumo(SisFichaPaciente sFP, int index, SisCliente sC){
        this.getAllDataInsumo();
        
        if(this.cantidad == "0"){
            this.ins = new Insumo(this.nombre,
                                    " ",
                                    this.costo);            
        }else{
            this.ins = new Insumo(this.nombre,
                                    this.cantidad,
                                    this.costo);            
        }                   
        
        sFP.listaPacientes.get(index).getListaInsumos().add(this.ins);
        this.sumarCosto(sFP, index, sC);
        
        Object[] fila = new Object[3];
        fila[0] = this.ins.getNombre();
        if(this.cantidad == "0"){
            fila[1] = " ";
        }else{
           fila[1] = this.ins.getCantidad(); 
        }        
        fila[2] = this.ins.getCosto();
        this.vInsumos.pnlTabla.modelo.addRow(fila);
        
        this.vInsumos.pnlInsumo.txtInsumo.setText("");
        this.vInsumos.pnlInsumo.txtCantidad.setText("");
        this.vInsumos.pnlInsumo.txtCosto.setText("");
    }
    
    public void eliminarInsumo(SisFichaPaciente sFP, int index, SisCliente sC){
        this.restarCosto(sFP, index, sC);
        sFP.listaPacientes.get(index).getListaInsumos().remove(this.vInsumos.pnlTabla.tabla.getSelectedRow());
        this.vInsumos.pnlTabla.modelo.removeRow(this.vInsumos.pnlTabla.tabla.getSelectedRow());        
    }
    
    public void getAllDataInsumo(){
        this.nombre = this.vInsumos.pnlInsumo.txtInsumo.getText();
        if(this.vInsumos.pnlInsumo.txtCantidad.getText().equals("") || 
           this.vInsumos.pnlInsumo.txtCantidad.getText().equals(null) || 
           this.vInsumos.pnlInsumo.txtCantidad.getText().equals(" ") ||
           this.vInsumos.pnlInsumo.txtCantidad.getText().equals("0")){
            this.cantidad = " " ;            
        }else{
            this.cantidad = this.vInsumos.pnlInsumo.txtCantidad.getText();
        }
        this.costo = Integer.parseInt(this.vInsumos.pnlInsumo.txtCosto.getText());        
        
    }
    
    public void sumarCosto(SisFichaPaciente sFP, int index, SisCliente sC){
        int valorTotal = this.costo+sFP.listaPacientes.get(index).getCostoInsumos();
        sFP.listaPacientes.get(index).setCostoInsumos(valorTotal);        
        this.vInsumos.pnlTabla.txtTotal.setText(Integer.toString(valorTotal));
        this.actualizarDeudaCliente(sC, sFP, index, valorTotal);
    }
    
    public void restarCosto(SisFichaPaciente sFP, int index, SisCliente sC){
        int i = this.vInsumos.pnlTabla.tabla.getSelectedRow();
        int valorTotal = sFP.listaPacientes.get(index).getCostoInsumos()- sFP.listaPacientes.get(index).getListaInsumos().get(i).getCosto();
        sFP.listaPacientes.get(index).setCostoInsumos(valorTotal);        
        this.vInsumos.pnlTabla.txtTotal.setText(Integer.toString(valorTotal));
        this.actualizarDeudaCliente(sC, sFP, index, valorTotal);
    }
    
    public void actualizarDeudaCliente(SisCliente sC, SisFichaPaciente sFP, int index, int valor){              
        for(int i=0; i<sC.listaClientes.size(); i++){
            if(sFP.listaPacientes.get(index).getRutCliente().equals(sC.listaClientes.get(i).getRut())){                
                sC.listaClientes.get(i).setDeuda(valor);
                break;
            }            
        }        
    }
       
    
}
