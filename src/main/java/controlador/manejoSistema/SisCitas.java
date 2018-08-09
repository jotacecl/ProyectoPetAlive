package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import modelo.Cita;
import vista.vistaCitas.VentanaCita;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisCitas {

    public VentanaCita vCitas;
    public ArrayList<Cita> listaCitas = new ArrayList<>();
    private String paciente;
    private String rutCliente;
    private String fechaIngreso;
    private String fechaCita;
    private String motivo;
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO = "Citas.json";
    public ManejoDeDatos mD;
    private int indice;

    public SisCitas(PestagnasInicio p) {
        this.mD = new ManejoDeDatos();
        this.cargarDatosCita(p);
    }

    
    
    
    /**
     * Metodo para iniciar la ventana de Citas, se desplega con o sin info segun
     * se requiera.
     *
     * @param btnSeleccionado
     * @param p
     */
    public void iniciarCitas(int btnSeleccionado, PestagnasInicio p) {

        if (btnSeleccionado == 1) {
            this.indice = comparar(p);
            this.setDatosCitas(this.indice);
        } else if (btnSeleccionado == 2) {
            this.vCitas = new VentanaCita(3, null);
        }
    }

    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     *
     * @param index
     */
    public void setDatosCitas(int index) {
        try {
            if (!this.listaCitas.isEmpty()) {
                Cita c = this.listaCitas.get(index);

                this.vCitas = new VentanaCita(2, c);
            }

            
                Cita c = this.listaCitas.get(index);

                this.vCitas = new VentanaCita(2, c);
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para crear una Cita nueva.
     *
     * @param p
     */
    public void crearCita(PestagnasInicio p) throws Exception {
        try {
            this.getAllDataCita();
            if (this.rutCliente.length() != 0
                    && this.paciente.length() != 0
                    && this.fechaIngreso.length() != 0) {
                Cita c = new Cita(
                        this.paciente,
                        this.rutCliente,
                        this.fechaIngreso,
                        this.fechaCita,
                        this.motivo);
                this.listaCitas.add(c);

                Object[] fila = new Object[]{
                    c.getPaciente(),
                    c.getRutCliente(),
                    c.getFechaIngreso(),
                    c.getFechaCita(),
                    c.getMotivoCita()};
                p.pCitas.pnlTabla.modelo.addRow(fila);
                mD.escritura(listaCitas,RUTA+ ARCHIVO);
            } else {
                throw new Exception();
            }
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para editar una Cita ya exitente.
     *
     * @param p
     */
    public void editarCita(PestagnasInicio p) {
        try {
            int auxIndex = p.pCitas.pnlTabla.tabla.getSelectedRow();

            this.getAllDataCita();
            if (!this.listaCitas.isEmpty()) {
                this.listaCitas.get(this.indice).setPaciente(this.paciente);
                this.listaCitas.get(this.indice).setFechaIngreso(this.fechaIngreso);
                if (!this.fechaCita.equals("null-null-null")) {
                    this.listaCitas.get(this.indice).setFechaCita(this.fechaCita);
                }
                this.listaCitas.get(this.indice).setMotivoCita(this.motivo);

                Cita c = this.listaCitas.get(this.indice);

                p.pCitas.pnlTabla.modelo.setValueAt(c.getPaciente(), auxIndex, 0);
                p.pCitas.pnlTabla.modelo.setValueAt(c.getRutCliente(), auxIndex, 1);
                p.pCitas.pnlTabla.modelo.setValueAt(c.getFechaIngreso(), auxIndex, 2);
                p.pCitas.pnlTabla.modelo.setValueAt(c.getFechaCita(), auxIndex, 3);
                p.pCitas.pnlTabla.modelo.setValueAt(c.getMotivoCita(), auxIndex, 4);
            }
            mD.escritura(listaCitas, ARCHIVO);
        } catch (NullPointerException e) {
            e.getCause();
        }

    }

    /**
     * Metodo para eliminar la cita seleccionada.
     *
     * @param p
     */
    public void eliminarCita(PestagnasInicio p) {
        try {
            this.indice = comparar(p);
            this.listaCitas.remove(this.indice);
            p.pCitas.pnlTabla.modelo.removeRow(p.pCitas.pnlTabla.tabla.getSelectedRow());
            mD.escritura(listaCitas, ARCHIVO);
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataCita() {
        try {
            this.paciente = this.vCitas.pnlDatos.txtPaciente.getText();
            this.rutCliente = this.vCitas.pnlDatos.txtRUT.getText();
            this.fechaIngreso = this.vCitas.pnlDatos.txtFIngreso.getText();

            String fechaSeleccionada = String.format(this.vCitas.pnlDatos.FORMATO,
                    this.vCitas.pnlDatos.calendario.getDate());
            this.fechaCita = fechaSeleccionada;

            this.motivo = this.vCitas.pnlDatos.txtMotivo.getText();
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Busca el rut ingresado en la lista de citas.
     *
     * @param rut
     * @param p
     */
    public void buscar(String rut, PestagnasInicio p) {
        for (Cita cita : listaCitas) {
            if (rut.equals(cita.getRutCliente())) {
                p.pCitas.pnlTabla.modelo.setRowCount(0);
                break;
            }
        }

        for (Cita cita : listaCitas) {
            if (rut.equals(cita.getRutCliente())) {
                Cita c = cita;

                Object[] fila = new Object[]{
                    c.getPaciente(),
                    c.getRutCliente(),
                    c.getFechaIngreso(),
                    c.getFechaCita(),
                    c.getMotivoCita()};
                p.pCitas.pnlTabla.modelo.addRow(fila);
            }
        }
    }

    /**
     * Refresca la tabla de la pestanna de citas.
     *
     * @param p
     */
    public void refrescar(PestagnasInicio p) {
        try{
            p.pCitas.pnlTabla.modelo.setRowCount(0);
            for (Cita cita : listaCitas) {
                Cita c = cita;

                Object[] fila = new Object[]{
                    c.getPaciente(),
                    c.getRutCliente(),
                    c.getFechaIngreso(),
                    c.getFechaCita(),
                    c.getMotivoCita()};
                p.pCitas.pnlTabla.modelo.addRow(fila);
            }
            mD.escritura(listaCitas,RUTA+ARCHIVO);
        }catch(NullPointerException e){
            e.getCause();
        }        
    }

    /**
     * Compara la informacion que contiene la fila seleccionada con la info de
     * la lista de citas.
     *
     * @param p
     * @return
     */
    public int comparar(PestagnasInicio p) {
        int index = p.pCitas.pnlTabla.tabla.getSelectedRow();
        if (p.pCitas.pnlTabla.modelo.getRowCount() != 0) {
            String aux1 = (String) p.pCitas.pnlTabla.modelo.getValueAt(index, 0);
            String aux2 = (String) p.pCitas.pnlTabla.modelo.getValueAt(index, 1);
            String aux3 = (String) p.pCitas.pnlTabla.modelo.getValueAt(index, 3);
            for (Cita c : listaCitas) {
                if (aux1.equals(c.getPaciente())
                        && aux2.equals(c.getRutCliente())
                        && aux3.equals(c.getFechaCita())) {
                    return listaCitas.indexOf(c);
                }
            }
        }

        return -1;
    }
    
    public void cargarDatosCita(PestagnasInicio p) {
        ArrayList<Cita> aux = mD.leerArchivoListaCita(RUTA + ARCHIVO);
        if (aux != null) {
            this.listaCitas = aux;
            this.refrescar(p);
        }
    }

}
