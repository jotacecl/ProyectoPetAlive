package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import modelo.Servicio;
import vista.vistaServicios.VentanaServicio;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisServicio {

    public VentanaServicio vServicio;
    private ArrayList<Servicio> listaServicios = new ArrayList<>();
    private String nombre;
    private String descripcion;
    private int precio;
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO = "Servicios.json";
    public ManejoDeDatos mD;

    public SisServicio(PestagnasInicio p) {
        this.mD = new ManejoDeDatos();
        this.cargarDatosServicio(p);
    }

    
    
    
    /**
     * Metodo para iniciar la ventana de Servicios, se desplega con o sin info
     * segun se requiera.
     *
     * @param btnSeleccionado
     * @param p
     */
    public void iniciarServicios(int btnSeleccionado, PestagnasInicio p) {

        int index = p.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow();
        if (btnSeleccionado == 1) {
            this.setDatosServicio(index);
        } else if (btnSeleccionado == 2) {
            this.vServicio = new VentanaServicio(null, 3);
        }

    }

    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     *
     * @param index
     */
    public void setDatosServicio(int index) {
        if (!listaServicios.isEmpty()) {
            Servicio s = this.listaServicios.get(index);

            this.vServicio = new VentanaServicio(s, 2);
        }
    }

    /**
     * Metodo para crear un Servicio nuevo.
     *
     * @param p
     */
    public void crearServicio(PestagnasInicio p) {

        try {
            this.getAllDataServicio();

            Servicio s = new Servicio(
                    this.nombre,
                    this.descripcion,
                    this.precio
            );

            this.listaServicios.add(s);
            mD.escritura(listaServicios, RUTA+ARCHIVO);

            Object[] fila = new Object[3];
            fila[0] = s.getNombre();
            fila[1] = s.getDescripcion();
            fila[2] = s.getPrecio();
            p.pFicheros.pServicios.pnlTabla.modelo.addRow(fila);
        } catch (NullPointerException e) {
            e.getCause();
        }

    }

    /**
     * Metodo para editar un Servicio ya exitente.
     *
     * @param p
     */
    public void editarServicio(int index, PestagnasInicio p) {

        try {
            this.getAllDataServicio();

            if (!this.listaServicios.isEmpty()) {
                this.listaServicios.get(index).setNombre(this.nombre);
                this.listaServicios.get(index).setDescripcion(this.descripcion);
                this.listaServicios.get(index).setPrecio(this.precio);

                Servicio s = this.listaServicios.get(index);
                p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getNombre(), index, 0);
                p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getDescripcion(), index, 1);
                p.pFicheros.pServicios.pnlTabla.modelo.setValueAt(s.getPrecio(), index, 2);
            }
            mD.escritura(listaServicios, RUTA+ARCHIVO);
        } catch (NullPointerException e) {
            e.getCause();
        }

    }

    /**
     * Metodo para eliminar el servicio seleccionado.
     *
     * @param p
     */
    public void eliminarServicio(PestagnasInicio p) {
        try {
            this.listaServicios.remove(p.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow());
            p.pFicheros.pServicios.pnlTabla.modelo.removeRow(p.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow());
            mD.escritura(listaServicios, RUTA+ARCHIVO);
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para obtener la info del Servicio.
     */
    public void getAllDataServicio() {

        try {
            this.nombre = this.vServicio.pnlDatosS.txtNombre.getText();
            this.descripcion = this.vServicio.pnlDatosS.txtDescripcion.getText();
            this.precio = Integer.parseInt(this.vServicio.pnlDatosS.txtPrecio.getText());
        } catch (NullPointerException e) {
            e.getCause();
        }

    }
    
    public void refrescar (PestagnasInicio p){
        p.pFicheros.pServicios.pnlTabla.modelo.setRowCount(0);
        for(Servicio servicio : listaServicios){
            Servicio s = servicio;
            Object[] fila = new Object[3];
            fila[0] = s.getNombre();
            fila[1] = s.getDescripcion();
            fila[2] = s.getPrecio();
            p.pFicheros.pServicios.pnlTabla.modelo.addRow(fila);
        }
    }
    
   public void cargarDatosServicio(PestagnasInicio p) {
        ArrayList<Servicio> aux = mD.leerArchivoListaServicio(RUTA + ARCHIVO);
        if (aux != null) {
            this.listaServicios = aux;
            this.refrescar(p);
        }
    }
    

}
