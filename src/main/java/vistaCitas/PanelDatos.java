/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCitas;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Date;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatos extends JPanel{
    
    private JLabel labID, labPaciente, labRUT, labFIngreso, labFCita, labMotivo;
    private JTextField txtID, txtPaciente, txtRUT, txtMotivo, txtFIngreso, txtFCita;
    public JDateChooser calendario;
    private static final String FORMATO = "%1$td-%1$tm-%1$tY";
    private Date fecha;
    private java.sql.Date fechaActual;
    private long fecha1;
    
    public PanelDatos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();
        
        calendario = new JDateChooser();
        fecha = new Date();
        fecha1 = fecha.getTime();
        fechaActual = new java.sql.Date(fecha1);
        
        JPanel pnlID = new JPanel();
        this.labID = new JLabel("ID Paciente     ");
        this.txtID = new JTextField("", 20);
        pnlID.add(this.labID);
        pnlID.add(this.txtID);
        pnlID.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlID);
        
        JPanel pnlPaciente = new JPanel();
        this.labPaciente = new JLabel("Paciente          ");
        this.txtPaciente = new JTextField("", 20);
        pnlPaciente.add(this.labPaciente);
        pnlPaciente.add(this.txtPaciente);
        pnlPaciente.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlPaciente);
        
        JPanel pnlRUT = new JPanel();
        this.labRUT = new JLabel("RUT Cliente    ");
        this.txtRUT = new JTextField("", 20);
        pnlRUT.add(this.labRUT);
        pnlRUT.add(this.txtRUT);
        pnlRUT.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlRUT);
        
        JPanel pnlFIngreso = new JPanel();
        this.labFIngreso = new JLabel("Fecha ingreso ");
        this.txtFIngreso = new JTextField(String.format(FORMATO, fechaActual), 20);
        pnlFIngreso.add(this.labFIngreso);
        pnlFIngreso.add(this.txtFIngreso);
        this.txtFIngreso.setEditable(false);
        pnlFIngreso.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlFIngreso);        
        
        JPanel pnlFCita = new JPanel();
        this.labFCita = new JLabel("Fecha Cita        ");
        this.txtFCita = new JTextField("dd-mm-aaaa", 20);
        pnlFCita.add(this.labFCita);
        JPanel subPanel = new JPanel();
        subPanel.setPreferredSize(new Dimension(226,25));
        subPanel.setLayout(new GridLayout(1,1));
        subPanel.add(this.calendario);
        pnlFCita.add(subPanel);
        pnlFCita.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlFCita);
        
        JPanel pnlMotivo = new JPanel();
        this.labMotivo = new JLabel("Motivo Cita        ");
        this.txtMotivo = new JTextField("",20);
        pnlMotivo.add(this.labMotivo);
        pnlMotivo.add(this.txtMotivo);
        pnlMotivo.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlMotivo);        
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
        
    }
    
}
