/**
 * Universidad de Granada - Grado en Informatica : 2020  
 * 
 * Asignatura: Desarrollo de Software
 * Practica 1 - Sesión 4
 * 
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 * 
 */
package GUI;

import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;

import eu.hansolo.steelseries.gauges.Radial;
import scacv.EstadoMotor;

import scacv.Objetivo;

public class Scacv extends JPanel implements Runnable{
    
    // ETIQUETAS (JLabel)
    private JLabel velocidad;
    private JLabel velocidadAuto;
    private JLabel combustible;
    private JLabel alertaAceite;
    private JLabel alertaPastillas;
    private JLabel alertaRevision;
    private JLabel distancia;
    private JLabel estado;

    // PANEL (Panels)
    private JPanel panel;
    private JPanel panelSpeedometer;
    private JPanel panelMonitorizacion;
    private JPanel panelPalanca;
    private JPanel panelEstados;
    private JPanel panelCombustible;
    private JPanel panelMecanico;
    private JPanel panelAlertas;
    
    // BOTONES (Buttons)
    private JToggleButton onOff;
    private JToggleButton freno;
    private JToggleButton acelerador;
    private JRadioButton acelerar;
    private JRadioButton parar;
    private JRadioButton mantener;
    private JRadioButton reiniciar;
    private JButton cambioAceite;
    private JButton cambioPastillas;
    private JButton revisionMotor;    
    private JButton repostar;
    
    private Radial gauge;
    
    private Objetivo obj;
        
    public Thread thr;
    
    public Scacv (Objetivo o){
        setSize(1000, 700);
        setBackground(Color.WHITE);
        
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        add(panel);
        
        velocidad = new JLabel();
        distancia = new JLabel();
        estado = new JLabel("APAGADO");
        estado.setForeground(Color.RED);
        velocidadAuto = new JLabel();
        combustible = new JLabel();
        alertaAceite = new JLabel("Aceite: CORRECTO");
        alertaPastillas = new JLabel("Pastillas: CORRECTO");
        alertaRevision = new JLabel("Revision: NO NECESARIO");
        
        onOff = new JToggleButton("Encendido / Apagado", false);
        acelerador = new JToggleButton("Acelerador", false);
        freno = new JToggleButton("Freno", false);
        cambioAceite = new JButton("Cambiar Aceite");
        cambioPastillas = new JButton("Cambiar Pastillas");
        revisionMotor = new JButton("Revisar Motor");
        acelerar = new JRadioButton("Acelerar", false);
        parar = new JRadioButton("Parar", false);
        mantener = new JRadioButton("Mantener", false);
        reiniciar = new JRadioButton("Reiniciar", false);
        repostar = new JButton("Repostar");     
        
        gauge = new Radial();
        gauge.setBounds(WIDTH, WIDTH, 300, 300);
        gauge.setTitle("Velocímetro");
        gauge.setUnitString("KM/H");
        
        obj = o;
        
        panelSpeedometer = new JPanel();
        panelSpeedometer.setBackground(Color.WHITE);
        panelSpeedometer.setBorder(new TitledBorder(new EtchedBorder(), "Speedometer"));
        
        panel.add(panelSpeedometer);
        panelSpeedometer.add(gauge);
        
        panelMonitorizacion = new JPanel();
        panelMonitorizacion.setBackground(Color.WHITE);
        panelMonitorizacion.setBorder(new TitledBorder(new EtchedBorder(), "Monitorizacion"));
        
        panel.add(panelMonitorizacion);
        panelMonitorizacion.add(velocidad);
        panelMonitorizacion.add(onOff);
        panelMonitorizacion.add(acelerador);
	panelMonitorizacion.add(freno);
        panelMonitorizacion.add(distancia);
        
        panelEstados = new JPanel();
        panelEstados.setBackground(Color.WHITE);
        panelEstados.setBorder(new TitledBorder(new EtchedBorder(), "Estado"));
        
        panel.add(panelEstados);
        panelEstados.add(estado);
        panelEstados.add(velocidadAuto);
        
        panelPalanca = new JPanel();
        panelPalanca.setBackground(Color.WHITE);
        panelPalanca.setBorder(new TitledBorder(new EtchedBorder(), "Palanca"));
       
        panel.add(panelPalanca);
        panelPalanca.add(acelerar);
        panelPalanca.add(parar);
        panelPalanca.add(mantener);
        panelPalanca.add(reiniciar);
        
        panelCombustible = new JPanel();
        panelCombustible.setBackground(Color.WHITE);
        panelCombustible.setBorder(new TitledBorder(new EtchedBorder(), "Deposito de Combustible"));
    
        panel.add(panelCombustible);
        panelCombustible.add(combustible);
        panelCombustible.add(repostar);
        
        panelAlertas = new JPanel();
        panelAlertas.setBackground(Color.WHITE);
        panelAlertas.setBorder(new TitledBorder(new EtchedBorder(), "Alertas"));
        
        panel.add(panelAlertas);
        panelAlertas.add(alertaAceite);
        panelAlertas.add(alertaPastillas);
        panelAlertas.add(alertaRevision);
        
        panelMecanico = new JPanel();
        panelMecanico.setBackground(Color.WHITE);
        panelMecanico.setBorder(new TitledBorder(new EtchedBorder(), "Mecanico"));
        
        panel.add(panelMecanico);
        panelMecanico.add(cambioAceite);
        panelMecanico.add(cambioPastillas);
        panelMecanico.add(revisionMotor);  
        
        gestionarEventos();     
        
        thr = new Thread(this);
    }
    
    private void gestionarEventos(){

        onOff.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(obj.getEstado() == EstadoMotor.APAGADO){
                    obj.setEstado(EstadoMotor.ENCENDIDO);
                    acelerador.setSelected(false);
                    freno.setSelected(false);
                    acelerar.setSelected(false);
                    parar.setSelected(false);
                    reiniciar.setSelected(false);
                    mantener.setSelected(false);
                }
                else{
                    obj.setEstado(EstadoMotor.APAGADO);
                }
            }
        });
       
        acelerador.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(obj.getEstado() == EstadoMotor.ENCENDIDO){
                    obj.setEstado(EstadoMotor.ACELERANDO);
                }
                else if(obj.getEstado() == EstadoMotor.ACELERANDO){
                    obj.setEstado(EstadoMotor.ENCENDIDO);
                }
            }
        });

        freno.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(obj.getEstado() == EstadoMotor.ENCENDIDO){
                    obj.setEstado(EstadoMotor.FRENANDO);
                }
                else if(obj.getEstado() == EstadoMotor.FRENANDO){
                    obj.setEstado(EstadoMotor.ENCENDIDO);
                }
            }
        }); 
        
        acelerar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setEstado(EstadoMotor.ACELERANDOAUTOMÁTICO);
                acelerador.setSelected(false);
                freno.setSelected(false);
                parar.setSelected(false);
                reiniciar.setSelected(false);
                mantener.setSelected(false);
            }
        });   
        
        parar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setEstado(EstadoMotor.APAGADO);
                acelerador.setSelected(false);
                freno.setSelected(false);
                acelerar.setSelected(false);
                reiniciar.setSelected(false);
                mantener.setSelected(false);
            }
        });
        
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setEstado(EstadoMotor.APAGADO);
                acelerador.setSelected(false);
                freno.setSelected(false);
                acelerar.setSelected(false);
                parar.setSelected(false);
                mantener.setSelected(false);
            }
        });   
        
        mantener.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setEstado(EstadoMotor.MANTENIENDOAUTOMÁTICO);
                obj.setAutomatica(obj.getVelocidadAngular());
                obj.calcularVelocidadLinealAutomatica(obj.getAutomatica());
                acelerador.setSelected(false);
                freno.setSelected(false);
                acelerar.setSelected(false);
                reiniciar.setSelected(false);
                parar.setSelected(false);
            }
        });   
        
        cambioAceite.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.cambiarAceite();
            }
        });   
        
        cambioPastillas.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.cambiarPastillas();
            }
        });          
 
        revisionMotor.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.cambiarRevision();
            }
        });                
      
        repostar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.setCombustible(500);
            }
        });   
 
    }
    
    private void gestionarInfo (){
        velocidad.setText("Velocidad: " + roundAvoid(obj.getVelocidadLineal(),2) + " km/h");
        distancia.setText("Distancia recorrida: " + roundAvoid(obj.getDistancia(),2) + " km");
        velocidadAuto.setText("Velocidad Automática: " + roundAvoid(obj.getVelocidadLinealAutomatica(),2) + " km/h");
        combustible.setText("Combustible: " + roundAvoid(obj.getCombustible(),2));
        estado.setText(obj.getEstado().toString());     
        gauge.setValue(obj.getVelocidadLineal());
    }
    
    public void run() {
        while(true){
            gestionarInfo();
        }
    }
    
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
