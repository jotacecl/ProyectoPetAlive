package controlador.manejoSistema;

import modelo.Insumo;
import vista.vistaInsumos.VentanaInsumos;

/**
 *
 * @author Juan Carlos
 */
public class SisInsumos {

    private String nombre;
    private String cantidad;
    private int costo;
    public VentanaInsumos vInsumos;
    private Insumo ins;
    private GestorDatos gDatos;


    
    
    /**
     * Metodo para iniciar la ventana de Insumos.
     *
     * @param sFP
     * @param index
     */
    public void iniciarInsumos(SisFichaPaciente sFP, int index) {        
            if (sFP.listaPacientes.size() != 0) {
                this.setDatosInsumos(sFP, index);
            } else {
                this.vInsumos = new VentanaInsumos();
            }        
    }

    /**
     * Metodo que rellena la tabla de insumos de manera automatica.
     *
     * @param sFP
     * @param index
     */
    public void setDatosInsumos(SisFichaPaciente sFP, int index) {
        try {
            this.vInsumos = new VentanaInsumos();
            if (!sFP.listaPacientes.isEmpty()) {
                for (int i = 0; i < sFP.listaPacientes.get(index).getListaInsumos().size(); i++) {

                    Object[] fila = new Object[3];
                    fila[0] = sFP.listaPacientes.get(index).getListaInsumos().get(i).getNombre();

                    if (sFP.listaPacientes.get(index).getListaInsumos().get(i).getCantidad() == "0") {
                        fila[1] = " ";
                    } else {
                        fila[1] = sFP.listaPacientes.get(index).getListaInsumos().get(i).getCantidad();
                    }

                    fila[2] = sFP.listaPacientes.get(index).getListaInsumos().get(i).getCosto();
                    this.vInsumos.pnlTabla.modelo.addRow(fila);

                }
                this.vInsumos.pnlTabla.txtTotal.setText(Integer.toString(sFP.listaPacientes.get(index).getCostoInsumos()));
            }
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para crear un Insumo nuevo en la lista.
     *
     * @param sFP
     * @param index
     * @param sC
     */
    public void crearInsumo(SisFichaPaciente sFP, int index, SisCliente sC) {
        this.getAllDataInsumo();

        try {
            if (!sFP.listaPacientes.isEmpty()) {
                if (this.cantidad == "0") {
                    this.ins = new Insumo(this.nombre,
                            " ",
                            this.costo);
                } else {
                    this.ins = new Insumo(this.nombre,
                            this.cantidad,
                            this.costo);
                }

                sFP.listaPacientes.get(index).getListaInsumos().add(this.ins);
                this.sumarCosto(sFP, index, sC);

                Object[] fila;
                if (this.cantidad == "0") {
                    fila = new Object[]{
                        this.ins.getNombre(),
                        "",
                        this.ins.getCosto()
                    };
                } else {
                    fila = new Object[]{
                        this.ins.getNombre(),
                        this.ins.getCantidad(),
                        this.ins.getCosto()
                    };
                }

                this.vInsumos.pnlTabla.modelo.addRow(fila);

                this.vInsumos.pnlInsumo.txtInsumo.setText("");
                this.vInsumos.pnlInsumo.txtCantidad.setText("");
                this.vInsumos.pnlInsumo.txtCosto.setText("");
            }
        } catch (NullPointerException e) {
            e.getCause();
        } catch (Exception n) {
            n.getCause();
        }
    }

    /**
     * Metodo para eliminar un Insumo de la lista.
     *
     * @param sFP
     * @param index
     * @param sC
     */
    public void eliminarInsumo(SisFichaPaciente sFP, int index, SisCliente sC) {
        try {
            if (!sFP.listaPacientes.isEmpty()) {
                this.restarCosto(sFP, index, sC);
                sFP.listaPacientes.get(index).getListaInsumos().remove(this.vInsumos.pnlTabla.tabla.getSelectedRow());
                this.vInsumos.pnlTabla.modelo.removeRow(this.vInsumos.pnlTabla.tabla.getSelectedRow());
            }
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataInsumo() {
        try {
            this.nombre = this.vInsumos.pnlInsumo.txtInsumo.getText();
            if (this.vInsumos.pnlInsumo.txtCantidad.getText().equals("")
                    || this.vInsumos.pnlInsumo.txtCantidad.getText().equals(null)
                    || this.vInsumos.pnlInsumo.txtCantidad.getText().equals(" ")
                    || this.vInsumos.pnlInsumo.txtCantidad.getText().equals("0")) {
                this.cantidad = " ";
            } else {
                this.cantidad = this.vInsumos.pnlInsumo.txtCantidad.getText();
            }
            this.costo = Integer.parseInt(this.vInsumos.pnlInsumo.txtCosto.getText());
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para sumar los costos de los insumos a la deuda total.
     *
     * @param sFP
     * @param index
     * @param sC
     */
    public void sumarCosto(SisFichaPaciente sFP, int index, SisCliente sC) {
        try {
            if (!sFP.listaPacientes.isEmpty()) {
                int valorTotal = this.costo + sFP.listaPacientes.get(index).getCostoInsumos();
                sFP.listaPacientes.get(index).setCostoInsumos(valorTotal);
                this.vInsumos.pnlTabla.txtTotal.setText(Integer.toString(valorTotal));
                this.actualizarDeudaCliente(sC, sFP, index, valorTotal);
            }
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para restar el costo del insumo a la deuda total.
     *
     * @param sFP
     * @param index
     * @param sC
     */
    public void restarCosto(SisFichaPaciente sFP, int index, SisCliente sC) {
        try {
            if (!sFP.listaPacientes.isEmpty()) {
                int i = this.vInsumos.pnlTabla.tabla.getSelectedRow();
                int valorTotal = sFP.listaPacientes.get(index).getCostoInsumos() - sFP.listaPacientes.get(index).getListaInsumos().get(i).getCosto();
                sFP.listaPacientes.get(index).setCostoInsumos(valorTotal);
                this.vInsumos.pnlTabla.txtTotal.setText(Integer.toString(valorTotal));
                this.actualizarDeudaCliente(sC, sFP, index, valorTotal);
            }
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para actualizar la deuda total del cliente.
     *
     * @param sC
     * @param sFP
     * @param index
     * @param valor
     */
    public void actualizarDeudaCliente(SisCliente sC, SisFichaPaciente sFP, int index, int valor) {
        for (int i = 0; i < sC.listaClientes.size(); i++) {
            if (sFP.listaPacientes.get(index).getRutCliente().equals(sC.listaClientes.get(i).getRut())) {
                sC.listaClientes.get(i).setDeuda(valor);
                sC.mD.escritura(sC.listaClientes.get(i),sC.RUTA+sC.ARCHIVO);
                break;
            }
        }
    }

}
