package controlador.manejoSistema;

import controlador.manejoArchivo.ManejoDeDatos;
import java.util.ArrayList;
import java.util.Collections;
import modelo.Paciente;
import vista.vistaFichaPaciente.VentanaFichaPaciente;
import vista.vistaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisFichaPaciente {

    public VentanaFichaPaciente vFPaciente;
    private ArrayList<String> listaEspecies = new ArrayList<>();
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public String nombreP;
    public String especie;
    public String raza;
    public String color;
    public String fNac;
    public String tamannoJaula;
    public String internado;
    public String sexo;
    public String antMed;
    public String rut;
    private int nroJaula;
    private final String RUTA = "data\\config\\";
    private final String ARCHIVO1 = "pacientes.json";
    private final String ARCHIVO2 = "especies.json";
    private GestorDatos gDatos;
    public ManejoDeDatos mD;
    private int indice;

    public SisFichaPaciente(PestagnasInicio p) {
        this.mD = new ManejoDeDatos();
        this.gDatos = new GestorDatos();
        this.cargarDatosEspecie(p);
        this.cargarDatosPaciente(p);
    }

    /**
     * Metodo para iniciar la ventana de Ficha Paciente, se desplega con o sin
     * info segun se requiera.
     *
     * @param btnSeleccionado
     * @param p
     */
    public void iniciarFPaciente(int btnSeleccionado, PestagnasInicio p) {
        if (btnSeleccionado == 1) {
            this.indice = comparar(p);
            this.setDatosFPaciente(this.indice);
        } else if (btnSeleccionado == 2) {
            this.vFPaciente = new VentanaFichaPaciente(null, false, 3);
            this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for (Object l : listaEspecies) {
                this.vFPaciente.pnlDatos.cbTipo.addItem(l);
            }
        }
    }

    /**
     * Metodo para ingresar los datos en los JTextfields de la ventana.
     *
     * @param index
     */
    public void setDatosFPaciente(int index) {
        try {
            Paciente p = this.listaPacientes.get(index);

            this.antMed = this.listaPacientes.get(index).getAntecedentes();

            if (p.getInternado().equals("si")) {
                this.vFPaciente = new VentanaFichaPaciente(
                        p,
                        true,
                        2);
                this.vFPaciente.pnlDatos.grupoRB2.setSelected(this.vFPaciente.pnlDatos.rbSi.getModel(), true);
            } else if (p.getInternado().equals("no")) {
                this.vFPaciente = new VentanaFichaPaciente(
                        p,
                        false,
                        2);
                this.vFPaciente.pnlDatos.grupoRB2.setSelected(this.vFPaciente.pnlDatos.rbNo.getModel(), true);
            }

            if (p.getSexo().equals("macho")) {
                this.vFPaciente.pnlDatos.grupoRB.setSelected(this.vFPaciente.pnlDatos.rbMacho.getModel(), true);
            } else if (p.getSexo().equals("hembra")) {
                this.vFPaciente.pnlDatos.grupoRB.setSelected(this.vFPaciente.pnlDatos.rbHembra.getModel(), true);
            }

            this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for (String l : listaEspecies) {
                this.vFPaciente.pnlDatos.cbTipo.addItem(l);
            }
            this.vFPaciente.pnlDatos.cbTipo.setSelectedItem(p.getEspecie());

            this.vFPaciente.pnlDatos.cbTJaula.setSelectedItem(p.getTamannoJaula());
            this.vFPaciente.pnlDatos.cbNJaula.removeAllItems();

            if (this.nroJaula == 0) {
                this.vFPaciente.pnlDatos.cbNJaula.addItem(1);
                this.vFPaciente.pnlDatos.cbNJaula.setSelectedItem(1);
            } else {
                this.vFPaciente.pnlDatos.cbNJaula.addItem(p.getNroJaula());
                this.vFPaciente.pnlDatos.cbNJaula.setSelectedItem(p.getNroJaula());
            }
        } catch (Exception e) {
            e.getCause();
        }

    }

    /**
     * Metodo para crear una ficha de paciente nueva.
     *
     * @param pi
     */
    public void crearFPaciente(PestagnasInicio pi) {
        try {
            this.getAllDataPaciente();

            if (!this.nombreP.equals("") && !this.especie.equals("") && !this.raza.equals("") && !this.rut.equals("")) {

                Paciente p = new Paciente(
                        this.nombreP,
                        this.especie,
                        this.raza,
                        this.color,
                        this.fNac,
                        this.sexo,
                        this.internado,
                        this.rut,
                        this.tamannoJaula,
                        this.nroJaula,
                        this.antMed);
                this.listaPacientes.add(p);
                mD.escritura(listaPacientes, RUTA + ARCHIVO1);
                mD.escritura(listaEspecies, RUTA+ARCHIVO2);

                Object[] fila = new Object[]{
                    p.getNombre(),
                    p.getEspecie(),
                    p.getRaza(),
                    p.getColor(),
                    p.getfNacimiento(),
                    p.getSexo(),
                    p.getInternado(),
                    p.getTamannoJaula() + " " + p.getNroJaula()
                };

                pi.pFicheros.pPacientes.pnlTabla.modelo.addRow(fila);
            }
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para editar una ficha ya exitente.
     *
     * @param pi
     */
    public void editarFPaciente(PestagnasInicio pi) {
        
        try {
            int auxIndex = pi.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();

            this.getAllDataPaciente();
            
            if (!this.listaPacientes.isEmpty()) {
                
                this.listaPacientes.get(this.indice).setNombre(this.nombreP);
                this.listaPacientes.get(this.indice).setEspecie(this.especie);
                this.listaPacientes.get(this.indice).setRaza(this.raza);
                this.listaPacientes.get(this.indice).setColor(this.color);
                if (!this.fNac.equals("null-null-null")) {
                    this.listaPacientes.get(this.indice).setfNacimiento(this.fNac);
                }
                this.listaPacientes.get(this.indice).setSexo(this.sexo);
                this.listaPacientes.get(this.indice).setInternado(this.internado);
                this.listaPacientes.get(this.indice).setTamannoJaula(this.tamannoJaula);
                this.listaPacientes.get(this.indice).setNroJaula(this.nroJaula);
                this.listaPacientes.get(this.indice).setRutCliente(this.rut);
                this.listaPacientes.get(this.indice).setAntecedentes(this.antMed);

                Paciente p = this.listaPacientes.get(this.indice);
                
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getNombre(), auxIndex, 0);
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getEspecie(), auxIndex, 1);
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getRaza(), auxIndex, 2);
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getColor(), auxIndex, 3);
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getfNacimiento(), auxIndex, 4);
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getSexo(), auxIndex, 5);
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getInternado(), auxIndex, 6);
                pi.pFicheros.pPacientes.pnlTabla.modelo.setValueAt(p.getTamannoJaula() + " " + p.getNroJaula(), auxIndex, 7);
            }
            mD.escritura(listaPacientes, RUTA + ARCHIVO1);
            mD.escritura(this.listaEspecies, RUTA+ARCHIVO2);
            
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para eliminar el paciente seleccionado.
     *
     * @param p
     */
    public void eliminarPaciente(PestagnasInicio p) {
        try {
            this.indice = comparar(p);
            this.listaPacientes.remove(this.indice);
            p.pFicheros.pPacientes.pnlTabla.modelo.removeRow(p.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow());
            mD.escritura(listaPacientes, RUTA + ARCHIVO1);
        } catch (Exception e) {
            e.getCause();
        }
    }

    /**
     * Metodo para obtener los datos ingresados por el usuario.
     */
    public void getAllDataPaciente() {
        try {
            this.nombreP = this.vFPaciente.pnlDatos.txtPaciente.getText();
            this.especie = (String) this.vFPaciente.pnlDatos.cbTipo.getSelectedItem();
            this.raza = this.vFPaciente.pnlDatos.txtRaza.getText();
            this.color = this.vFPaciente.pnlDatos.txtColor.getText();

            String fechaSeleccionada = String.format(this.vFPaciente.pnlDatos.FORMATO, this.vFPaciente.pnlDatos.calendario.getDate());
            this.fNac = fechaSeleccionada;

            if (this.vFPaciente.pnlDatos.grupoRB.getSelection() == this.vFPaciente.pnlDatos.rbMacho.getModel()) {
                this.sexo = "macho";
            } else if (this.vFPaciente.pnlDatos.grupoRB.getSelection() == this.vFPaciente.pnlDatos.rbHembra.getModel()) {
                this.sexo = "hembra";
            }

            if (this.vFPaciente.pnlDatos.grupoRB2.getSelection() == this.vFPaciente.pnlDatos.rbSi.getModel()) {
                this.internado = "si";
                this.tamannoJaula = (String) this.vFPaciente.pnlDatos.cbTJaula.getSelectedItem();
                this.nroJaula = (int) this.vFPaciente.pnlDatos.cbNJaula.getSelectedItem();
            } else if (this.vFPaciente.pnlDatos.grupoRB2.getSelection() == this.vFPaciente.pnlDatos.rbNo.getModel()) {
                this.internado = "no";
                this.tamannoJaula = "0";
                this.nroJaula = 0;
            }

            this.rut = this.vFPaciente.pnlDatos.txtCliente.getText();
            this.antMed = this.vFPaciente.pnlAMedicos.ingAntecedentesMedicos.getText();
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para agregar una especie nueva al JComboBox y la lista de
     * especies.
     *
     * @param especie
     */
    public void setEspecie(String especie) {
        if (especie != null) {
            this.listaEspecies.add(especie);
            Collections.sort(this.listaEspecies);
            this.vFPaciente.pnlDatos.cbTipo.removeAllItems();
            for (String l : listaEspecies) {
                this.vFPaciente.pnlDatos.cbTipo.addItem(l);
                mD.escritura(listaEspecies, RUTA+ARCHIVO2);
            }
            System.out.println("Especie: " + especie + " agregada.");
        } else {
            System.out.println("null");
        }
    }

    /**
     * Metodo para editar la especie seleccionada en el JComboBox.
     *
     * @param especieEditada
     */
    public void editarEspecie(String especieEditada) {
        if (especieEditada != null) {
            this.eliminarEspecie();
            this.setEspecie(especieEditada);
        } else {
            System.out.println("null");
        }
        mD.escritura(this.listaEspecies, RUTA+ARCHIVO2);
    }

    /**
     * Metodo para eliminar la especie seleccionada en el JComboBox
     */
    public void eliminarEspecie() {
        this.listaEspecies = mD.leerArchivoArrayString(RUTA+ARCHIVO2);
        try {
            for (int i = 0; i < listaEspecies.size(); i++) {
                if ((String) this.vFPaciente.pnlDatos.cbTipo.getSelectedItem() == this.listaEspecies.get(i)) {
                    this.listaEspecies.remove(i);
                }
            }
            this.vFPaciente.pnlDatos.cbTipo.removeItemAt(this.vFPaciente.pnlDatos.cbTipo.getSelectedIndex());
            mD.escritura(listaEspecies, RUTA+ARCHIVO2);
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Metodo para rellenar la lista de jaulas en el JComboBox de Ficha
     * Paciente.
     *
     * @param cantidadJaulas
     */
    public void setJaulas(int cantidadJaulas) {
        try {
            if (cantidadJaulas != -1) {
                this.vFPaciente.pnlDatos.cbNJaula.removeAllItems();
                for (int i = 0; i < cantidadJaulas; i++) {
                    this.vFPaciente.pnlDatos.cbNJaula.addItem(i + 1);
                }
            } else {
                System.out.println("null");
            }
        } catch (NullPointerException e) {
            e.getCause();
        }
    }

    /**
     * Busca el rut ingresado en la lista de pacientes.
     *
     * @param rut
     * @param p
     */
    public void buscar(String rut, PestagnasInicio p) {
        for (Paciente paciente : listaPacientes) {
            if (rut.equals(paciente.getRutCliente())) {
                p.pFicheros.pPacientes.pnlTabla.modelo.setRowCount(0);
                break;
            }
        }

        for (Paciente paciente : listaPacientes) {
            if (rut.equals(paciente.getRutCliente())) {
                Paciente pa = paciente;

                Object[] fila = new Object[]{
                    pa.getNombre(),
                    pa.getEspecie(),
                    pa.getRaza(),
                    pa.getColor(),
                    pa.getfNacimiento(),
                    pa.getSexo(),
                    pa.getInternado(),
                    pa.getTamannoJaula() + " " + pa.getNroJaula()
                };
                p.pFicheros.pPacientes.pnlTabla.modelo.addRow(fila);
            }
        }
    }

    /**
     * Refresca la tabla de la pestanna de pacientes.
     *
     * @param p
     */
    public void refrescar(PestagnasInicio p) {
        p.pFicheros.pPacientes.pnlTabla.modelo.setRowCount(0);
        for (Paciente paciente : listaPacientes) {
            Paciente pa = paciente;

            Object[] fila = new Object[]{
                pa.getNombre(),
                pa.getEspecie(),
                pa.getRaza(),
                pa.getColor(),
                pa.getfNacimiento(),
                pa.getSexo(),
                pa.getInternado(),
                pa.getTamannoJaula() + " " + pa.getNroJaula()
            };
            p.pFicheros.pPacientes.pnlTabla.modelo.addRow(fila);
        }
    }

    /**
     * Compara la informacion que contiene la fila seleccionada con la info de
     * la lista de pacientes.
     *
     * @param p
     * @return
     */
    public int comparar(PestagnasInicio p) {
        try {
            int index = p.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
            if (p.pFicheros.pPacientes.pnlTabla.modelo.getRowCount() != 0) {
                String aux1 = (String) p.pFicheros.pPacientes.pnlTabla.modelo.getValueAt(index, 0);
                String aux2 = (String) p.pFicheros.pPacientes.pnlTabla.modelo.getValueAt(index, 1);
                String aux3 = (String) p.pFicheros.pPacientes.pnlTabla.modelo.getValueAt(index, 2);
                String aux4 = (String) p.pFicheros.pPacientes.pnlTabla.modelo.getValueAt(index, 4);
                for (Paciente paciente : listaPacientes) {
                    if (aux1.equals(paciente.getNombre())
                            && aux2.equals(paciente.getEspecie())
                            && aux3.equals(paciente.getRaza())
                            && aux4.equals(paciente.getfNacimiento())) {
                        return listaPacientes.indexOf(paciente);
                    }
                }
            }
        } catch (Exception e) {
            e.getCause();
        }
        return -1;
    }

    public void cargarDatosPaciente(PestagnasInicio p) {
        ArrayList<Paciente> aux = mD.leerArchivoListaPaciente(RUTA + ARCHIVO1);
        if (aux != null) {
            this.listaPacientes = aux;
            this.refrescar(p);
        }
    }
    
    public void cargarDatosEspecie(PestagnasInicio p) {
        ArrayList<String> aux = mD.leerArchivoArrayString(RUTA + ARCHIVO2);
        if (aux != null) {
            this.listaEspecies = aux;
            this.refrescar(p);
        }
    }
}
