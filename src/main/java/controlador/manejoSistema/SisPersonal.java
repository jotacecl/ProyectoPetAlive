package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import java.util.Collections;
import modelo.Personal;
import vista.vistaPersonal.VentanaPersonal;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisPersonal {

    public VentanaPersonal vPersonal;
    private ArrayList<String> listaCargos = new ArrayList<>();
    private ArrayList<Personal> listaPersonal = new ArrayList<>();
    private String nombre;
    private String apellido;
    private String rut;
    private String rutPart1;
    private String rutPart2;
    private String rutPart3;
    private String rutPart4;
    private String direccion;
    private String ciudad;
    private String region;
    private String telefono;
    private String movil;
    private String email;
    private String cargo;
    private GestorDatos gDatos;
    private ArrayList<String> partesRut = new ArrayList<>();
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO1 = "personal.json";
    private final String ARCHIVO2 = "cargos.json";
    public ManejoDeDatos mD;

    private int indice;

    public SisPersonal(PestagnasInicio p) {
        this.gDatos = new GestorDatos();
        this.mD = new ManejoDeDatos();
        this.cargarDatosPersonal(p);
        this.cargarDatosCargo(p);
    }

    /**
     * Metodo para iniciar la ventana Personal.
     *
     * @param btnSeleccionado
     * @param p
     * @param listaCiudades
     * @param listaRegiones
     */
    public void iniciarPersonal(int btnSeleccionado, PestagnasInicio p, ArrayList listaCiudades, ArrayList listaRegiones) {

        if (btnSeleccionado == 1) {
            this.indice = comparar(p);
            this.setDatosPersonal(this.indice, listaCiudades, listaRegiones);
        } else if (btnSeleccionado == 2) {
            this.vPersonal = new VentanaPersonal(3, null, "", "", "", "");
            if (this.vPersonal.pnlDatos.cbCiudad.getItemAt(1) != ("    ")) {
                this.vPersonal.pnlDatos.cbCiudad.removeAllItems();
                for (Object l : listaCiudades) {
                    this.vPersonal.pnlDatos.cbCiudad.addItem(l);
                }
                this.vPersonal.pnlDatos.cbRegion.removeAllItems();
                for (Object l : listaRegiones) {
                    this.vPersonal.pnlDatos.cbRegion.addItem(l);
                }
            }
            if (this.vPersonal.pnlDatos.cbCargo.getItemAt(1) != ("    ")) {
                this.vPersonal.pnlDatos.cbCargo.removeAllItems();
                for (String l : listaCargos) {
                    this.vPersonal.pnlDatos.cbCargo.addItem(l);
                }
            }
        }
    }

    /**
     * Metodo para rellenar automaticamente la ventana con la info.
     *
     * @param index
     * @param listaCiudades
     * @param listaRegiones
     */
    public void setDatosPersonal(int index, ArrayList listaCiudades, ArrayList listaRegiones) {
        try {
            this.gDatos = new GestorDatos();

            if (!listaPersonal.isEmpty()) {
                Personal p = this.listaPersonal.get(index);

                this.rut = p.getRut();
                this.partesRut = this.gDatos.separarRut(this.rut);
                this.rutPart1 = (String) this.partesRut.get(0);
                this.rutPart2 = (String) this.partesRut.get(1);
                this.rutPart3 = (String) this.partesRut.get(2);
                this.rutPart4 = (String) this.partesRut.get(3);

                this.vPersonal = new VentanaPersonal(
                        2,
                        p,
                        rutPart1,
                        rutPart2,
                        rutPart3,
                        rutPart4);
            }

            this.vPersonal.pnlDatos.cbCiudad.removeAllItems();
            for (Object l : listaCiudades) {
                this.vPersonal.pnlDatos.cbCiudad.addItem(l);
            }
            this.vPersonal.pnlDatos.cbRegion.removeAllItems();
            for (Object l : listaRegiones) {
                this.vPersonal.pnlDatos.cbRegion.addItem(l);
            }
            this.vPersonal.pnlDatos.cbCargo.removeAllItems();
            for (String l : listaCargos) {
                this.vPersonal.pnlDatos.cbCargo.addItem(l);
            }

            this.vPersonal.pnlDatos.cbCiudad.setSelectedItem(ciudad);
            this.vPersonal.pnlDatos.cbRegion.setSelectedItem(region);
            this.vPersonal.pnlDatos.cbCargo.setSelectedItem(cargo);
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para crear un ficha nueva de Personal.
     *
     * @param pi
     */
    public void crearPersonal(PestagnasInicio pi) {
        try {
            this.getAllDataPersonal();

            Personal p = new Personal(this.cargo,
                    this.nombre,
                    this.apellido,
                    this.rut,
                    this.direccion,
                    this.ciudad,
                    this.region,
                    Integer.parseInt(this.telefono),
                    Integer.parseInt(this.movil),
                    this.email);
            this.listaPersonal.add(p);
            mD.escritura(listaPersonal, RUTA+ARCHIVO1);
            mD.escritura(listaCargos, RUTA+ARCHIVO2);

            Object[] fila = new Object[]{
                p.getNombre(),
                p.getApellido(),
                p.getRut(),
                p.getCiudad(),
                p.getTelefono(),
                p.getMovil(),
                p.getEmail(),
                p.getCargo()
            };
            pi.pFicheros.pPersonal.pnlTabla.modelo.addRow(fila);
        } catch (NullPointerException e) {
            e.getCause();
        } catch (NumberFormatException n) {
            n.getCause();
        }
    }

    /**
     * Metodo para editar una ficha de Personal.
     *
     * @param pi
     */
    public void editarPersonal(PestagnasInicio pi) {
        try {
            int auxIndex = pi.pFicheros.pPersonal.pnlTabla.tabla.getSelectedRow();

            this.getAllDataPersonal();
            if (!this.listaPersonal.isEmpty()) {
                this.listaPersonal.get(this.indice).setNombre(this.nombre);
                this.listaPersonal.get(this.indice).setApellido(this.apellido);
                this.listaPersonal.get(this.indice).setRut(this.rut);
                this.listaPersonal.get(this.indice).setDireccion(this.direccion);
                this.listaPersonal.get(this.indice).setCiudad(this.ciudad);
                this.listaPersonal.get(this.indice).setRegion(this.region);
                this.listaPersonal.get(this.indice).setTelefono(Integer.parseInt(this.telefono));
                this.listaPersonal.get(this.indice).setMovil(Integer.parseInt(this.movil));
                this.listaPersonal.get(this.indice).setEmail(this.email);

                Personal p = this.listaPersonal.get(this.indice);

                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getNombre(), auxIndex, 0);
                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getApellido(), auxIndex, 1);
                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getRut(), auxIndex, 2);
                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getCiudad(), auxIndex, 3);
                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getTelefono(), auxIndex, 4);
                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getMovil(), auxIndex, 5);
                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getEmail(), auxIndex, 6);
                pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getCargo(), auxIndex, 7);
            }
            mD.escritura(listaPersonal, RUTA+ARCHIVO1);
            mD.escritura(listaCargos, RUTA+ARCHIVO2);
            
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para eliminar el personal seleccionado.
     *
     * @param p
     */
    public void eliminarPersonal(PestagnasInicio p) {
        try {
            this.indice = comparar(p);
            if (!this.listaPersonal.isEmpty()) {
                this.listaPersonal.remove(this.indice);
                p.pFicheros.pPersonal.pnlTabla.modelo.removeRow(p.pFicheros.pPersonal.pnlTabla.tabla.getSelectedRow());
            }
            mD.escritura(listaPersonal, RUTA+ARCHIVO1);
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataPersonal() {
        try {
            this.nombre = this.vPersonal.pnlDatos.txtNombres.getText();
            this.apellido = this.vPersonal.pnlDatos.txtApellidos.getText();
            this.rutPart1 = this.vPersonal.pnlDatos.rutParte1.getText();
            this.rutPart2 = this.vPersonal.pnlDatos.rutParte2.getText();
            this.rutPart3 = this.vPersonal.pnlDatos.rutParte3.getText();
            this.rutPart4 = this.vPersonal.pnlDatos.rutParte4.getText();
            this.rut = this.rutPart1 + "." + this.rutPart2 + "." + this.rutPart3 + "-" + this.rutPart4;
            this.direccion = this.vPersonal.pnlDatos.txtDireccion.getText();
            this.ciudad = (String) this.vPersonal.pnlDatos.cbCiudad.getSelectedItem();
            this.region = (String) this.vPersonal.pnlDatos.cbRegion.getSelectedItem();
            this.telefono = this.vPersonal.pnlDatos.txtTelefono.getText();
            this.movil = this.vPersonal.pnlDatos.txtMovil.getText();
            this.email = this.vPersonal.pnlDatos.txtEmail.getText();
            this.cargo = (String) this.vPersonal.pnlDatos.cbCargo.getSelectedItem();
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para agregar un Cargo nuevo a la lista.
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        try {
            if (cargo != null) {
                this.listaCargos.add(cargo);
                Collections.sort(this.listaCargos);
                this.vPersonal.pnlDatos.cbCargo.removeAllItems();
                for (String l : this.listaCargos) {
                    this.vPersonal.pnlDatos.cbCargo.addItem(l);
                    mD.escritura(listaCargos, RUTA+ARCHIVO2);
                }
                System.out.println("Cargo: " + cargo + " agregado.");
            } else {
                System.out.println("null");
            }
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para editar un Cargo seleccionado.
     *
     * @param cargoEditado
     */
    public void editarCargo(String cargoEditado) {
        try {
            if (cargoEditado != null) {
                this.eliminarCargo();
                this.setCargo(cargoEditado);
            } else {
                System.out.println("null");
            }
            mD.escritura(listaCargos, RUTA+ARCHIVO2);
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para eliminar un Cargo seleccionado.
     */
    public void eliminarCargo() {
        this.listaCargos = mD.leerArchivoArrayString(RUTA+ARCHIVO2);
        try {
            for (int i = 0; i < listaCargos.size(); i++) {
                if ((String) this.vPersonal.pnlDatos.cbCargo.getSelectedItem() == this.listaCargos.get(i)) {
                    this.listaCargos.remove(i);
                }
            }
            this.vPersonal.pnlDatos.cbCargo.removeItemAt(this.vPersonal.pnlDatos.cbCargo.getSelectedIndex());
            mD.escritura(listaPersonal, RUTA+ARCHIVO2);
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Busca el rut ingresado en la lista de clientes.
     *
     * @param rut
     * @param p
     */
    public void buscar(String rut, PestagnasInicio p) {
        for (Personal personal : listaPersonal) {
            if (rut.equals(personal.getRut())) {
                p.pFicheros.pPersonal.pnlTabla.modelo.setRowCount(0);
                break;
            }
        }

        for (Personal personal : listaPersonal) {
            if (rut.equals(personal.getRut())) {
                Personal per = personal;

                Object[] fila = new Object[]{
                    per.getNombre(),
                    per.getApellido(),
                    per.getRut(),
                    per.getCiudad(),
                    per.getTelefono(),
                    per.getMovil(),
                    per.getEmail(),
                    per.getCargo()
                };
                p.pFicheros.pPersonal.pnlTabla.modelo.addRow(fila);
            }
        }
    }

    /**
     * Refresca la tabla de la pestanna de cliente.
     *
     * @param p
     */
    public void refrescar(PestagnasInicio p) {
        p.pFicheros.pPersonal.pnlTabla.modelo.setRowCount(0);
        for (Personal personal : listaPersonal) {
            Personal per = personal;

            Object[] fila = new Object[]{
                per.getNombre(),
                per.getApellido(),
                per.getRut(),
                per.getCiudad(),
                per.getTelefono(),
                per.getMovil(),
                per.getEmail(),
                per.getCargo()
            };
            p.pFicheros.pPersonal.pnlTabla.modelo.addRow(fila);
        }
    }

    /**
     * Compara la informacion que contiene la fila seleccionada con la info de
     * la lista de clientes.
     *
     * @param p
     * @return
     */
    public int comparar(PestagnasInicio p) {
        int index = p.pFicheros.pPersonal.pnlTabla.tabla.getSelectedRow();
        if (p.pFicheros.pPersonal.pnlTabla.modelo.getRowCount() != 0) {
            String aux1 = (String) p.pFicheros.pPersonal.pnlTabla.modelo.getValueAt(index, 0);
            String aux2 = (String) p.pFicheros.pPersonal.pnlTabla.modelo.getValueAt(index, 1);
            String aux3 = (String) p.pFicheros.pPersonal.pnlTabla.modelo.getValueAt(index, 2);
            for (Personal personal : listaPersonal) {
                if (aux1.equals(personal.getNombre())
                        && aux2.equals(personal.getApellido())
                        && aux3.equals(personal.getRut())) {
                    return listaPersonal.indexOf(personal);
                }
            }
        }

        return -1;
    }
    public void cargarDatosPersonal(PestagnasInicio p) {
        ArrayList<Personal> aux = mD.leerArchivoListaPersonal(RUTA + ARCHIVO1);
        if (aux != null) {
            this.listaPersonal = aux;
            this.refrescar(p);
        }
    }
    
    public void cargarDatosCargo(PestagnasInicio p) {
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA + ARCHIVO2);
        if (aux != null) {
            this.listaCargos = aux;
            this.refrescar(p);
        }
    }
    

}
