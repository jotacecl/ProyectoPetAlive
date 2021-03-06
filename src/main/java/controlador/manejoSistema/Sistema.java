package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class Sistema {

    public PestagnasInicio pPestagnas;

    public SisDatosClinica sDatosClinica;
    public SisConfigJaulas sConfigJaulas;
    public SisConfigHorario sConfigHorario;
    public SisCliente sCliente;
    public GestorDatos gDatos;
    public SisFichaPaciente sFichaPaciente;
    public SisPersonal sPersonal;
    public SisCitas sCitas;
    public SisProducto sProductos;
    public SisServicio sServicio;
    public SisDirectorio sDirectorio;
    public SisTratamiento sTratamiento;
    public SisInsumos sInsumos;
    public ManejoDeDatos mD;
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO1 = "ciudades.json";
    private final String ARCHIVO2 = "regiones.json";
    public ArrayList<String> listaCiudades = new ArrayList<>();
    public ArrayList<String> listaRegiones = new ArrayList<>();

    public boolean booleano;

    public Sistema() {
        this.iniciarComponentes();
        this.mD = new ManejoDeDatos();
        this.cargarDatosCiudades(pPestagnas);
        this.cargarDatosRegiones(pPestagnas);
    }

    /**
     * Metodo para iniciar todos los componentes de la aplicacion.
     */
    private void iniciarComponentes() {
        this.pPestagnas = new PestagnasInicio();

        this.sDatosClinica = new SisDatosClinica();
        this.sFichaPaciente = new SisFichaPaciente(pPestagnas);
        this.sConfigJaulas = new SisConfigJaulas(pPestagnas, sFichaPaciente);
        this.sConfigHorario = new SisConfigHorario();
        this.sCliente = new SisCliente(pPestagnas);
        this.gDatos = new GestorDatos();
        this.sPersonal = new SisPersonal(pPestagnas);
        this.sCitas = new SisCitas(pPestagnas);
        this.sProductos = new SisProducto(pPestagnas);
        this.sServicio = new SisServicio(pPestagnas);
        this.sDirectorio = new SisDirectorio(pPestagnas);
        this.sTratamiento = new SisTratamiento();
        this.sInsumos = new SisInsumos();

        this.sDatosClinica.iniciarDClinica();
        this.sConfigJaulas.iniciarCJaulas();
        this.sConfigHorario.iniciarCHorario();
        this.sCliente.iniciarCliente(2, this.pPestagnas, this.listaCiudades, this.listaRegiones);
        this.sFichaPaciente.iniciarFPaciente(2, this.pPestagnas);
        this.sPersonal.iniciarPersonal(2, this.pPestagnas, this.listaCiudades, this.listaRegiones);
        this.sCitas.iniciarCitas(2, this.pPestagnas);
        this.sProductos.iniciarProductos(2, this.pPestagnas);
        this.sServicio.iniciarServicios(2, this.pPestagnas);
        this.sDirectorio.iniciarDirectorio();
        this.sTratamiento.iniciarTratamiento(this.sFichaPaciente, 0);
        this.sInsumos.iniciarInsumos(this.sFichaPaciente, 0);
    }

    /**
     * Metodo para agregar una Ciudad nueva a la lista.
     *
     * @param ciudad
     */
    public void setCiudades(String ciudad) {

        if (ciudad != null) {
            this.listaCiudades.add(ciudad);
            Collections.sort(this.listaCiudades);
            this.sCliente.vCliente.pnlDatos.cbCiudad.removeAllItems();
            this.sPersonal.vPersonal.pnlDatos.cbCiudad.removeAllItems();
            for (String l : listaCiudades) {
                this.sCliente.vCliente.pnlDatos.cbCiudad.addItem(l);
                this.sPersonal.vPersonal.pnlDatos.cbCiudad.addItem(l);
                mD.escritura(listaCiudades, RUTA+ARCHIVO1);
            }
            System.out.println("Ciudad: " + ciudad + " agregada.");
        } else {
            System.out.println("null");
        }

    }

    /**
     * Metodo para editar una Ciudad seleccionada.
     *
     * @param ciudadEditada
     * @param ventanaSeleccionada
     */
    public void editarCiudad(String ciudadEditada, int ventanaSeleccionada) {
        if (ciudadEditada != null) {
            this.eliminarCiudad(ventanaSeleccionada);
            this.setCiudades(ciudadEditada);
        } else {
            System.out.println("null");
        }
        mD.escritura(listaCiudades, RUTA+ARCHIVO1);
    }

    /**
     * Metodo para eliminar una Ciudad seleccionada.
     *
     * @param ventanaSeleccionada
     */
    public void eliminarCiudad(int ventanaSeleccionada) {
        try {
            if (ventanaSeleccionada == 1) {
                for (int i = 0; i < listaCiudades.size(); i++) {
                    if ((String) this.sCliente.vCliente.pnlDatos.cbCiudad.getSelectedItem() == this.listaCiudades.get(i)) {
                        this.listaCiudades.remove(i);
                    }
                }
            } else if (ventanaSeleccionada == 2) {
                for (int i = 0; i < listaCiudades.size(); i++) {
                    if ((String) this.sPersonal.vPersonal.pnlDatos.cbCiudad.getSelectedItem() == this.listaCiudades.get(i)) {
                        this.listaCiudades.remove(i);
                    }
                }
            }
            this.sCliente.vCliente.pnlDatos.cbCiudad.removeItemAt(this.sCliente.vCliente.pnlDatos.cbCiudad.getSelectedIndex());
            this.sPersonal.vPersonal.pnlDatos.cbCiudad.removeItemAt(this.sPersonal.vPersonal.pnlDatos.cbCiudad.getSelectedIndex());
            mD.escritura(listaCiudades, RUTA+ARCHIVO1);
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para agregar una Region nueva.
     *
     * @param region
     */
    public void setRegiones(String region) {

        if (region != null) {
            this.listaRegiones.add(region);
            Collections.sort(this.listaRegiones);
            this.sCliente.vCliente.pnlDatos.cbRegion.removeAllItems();
            this.sPersonal.vPersonal.pnlDatos.cbRegion.removeAllItems();
            for (String l : listaRegiones) {
                this.sCliente.vCliente.pnlDatos.cbRegion.addItem(l);
                this.sPersonal.vPersonal.pnlDatos.cbRegion.addItem(l);
            }
            mD.escritura(listaRegiones, RUTA+ARCHIVO2);
            System.out.println("Región: " + region + " agregada.");
        } else {
            System.out.println("null");
        }
    }

    /**
     * Metodo para editar una Region seleccionada.
     *
     * @param regionEditada
     * @param ventanaSeleccionada
     */
    public void editarRegion(String regionEditada, int ventanaSeleccionada) {
        if (regionEditada != null) {
            this.eliminarRegion(ventanaSeleccionada);
            this.setRegiones(regionEditada);
        } else {
            System.out.println("null");
        }
        mD.escritura(listaRegiones, ARCHIVO2);
    }

    /**
     * Metodo para eliminar una Region seleccionada.
     *
     * @param ventanaSeleccionada
     */
    public void eliminarRegion(int ventanaSeleccionada) {
        try {
            if (ventanaSeleccionada == 1) {
                for (int i = 0; i < listaRegiones.size(); i++) {
                    if ((String) this.sCliente.vCliente.pnlDatos.cbRegion.getSelectedItem() == this.listaRegiones.get(i)) {
                        this.listaRegiones.remove(i);
                    }
                }
            } else if (ventanaSeleccionada == 2) {
                for (int i = 0; i < listaRegiones.size(); i++) {
                    if ((String) this.sPersonal.vPersonal.pnlDatos.cbRegion.getSelectedItem() == this.listaRegiones.get(i)) {
                        this.listaRegiones.remove(i);
                    }
                }
            }
            this.sCliente.vCliente.pnlDatos.cbRegion.removeItemAt(this.sCliente.vCliente.pnlDatos.cbRegion.getSelectedIndex());
            this.sPersonal.vPersonal.pnlDatos.cbRegion.removeItemAt(this.sPersonal.vPersonal.pnlDatos.cbRegion.getSelectedIndex());
            mD.escritura(listaRegiones, RUTA+ARCHIVO2);
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para abrir el explorador de archivos del PC.
     *
     * @param dir
     */
    public void abrirExplorer(String dir) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("explorer.exe " + dir);
        } catch (IOException e) {
            System.out.println("Error al ejecutar");
        }
    }
    
    
    public void cargarDatosCiudades(PestagnasInicio p) {
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA + ARCHIVO1);
        if (aux != null) {
            this.listaCiudades = aux;
        }
    }
    
    public void cargarDatosRegiones(PestagnasInicio p) {
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA + ARCHIVO2);
        if (aux != null) {
            this.listaRegiones = aux;
        }
    }

}
