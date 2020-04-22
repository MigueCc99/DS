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
    private JToggleButton cambioAceite;
    private JToggleButton cambioPastillas;
    private JToggleButton revisionMotor;
    private JRadioButton acelerar;
    private JRadioButton parar;
    private JRadioButton mantener;
    private JRadioButton reiniciar;
    private JButton repostar;
    
    private Radial gauge;
        
    public Thread thr;
    
    public Scacv (){
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
        cambioAceite = new JToggleButton("Cambiar Aceite", false);
        cambioPastillas = new JToggleButton("Cambiar Pastillas", false);
        revisionMotor = new JToggleButton("Revisar Motor", false);
        acelerar = new JRadioButton("Acelerar", false);
        parar = new JRadioButton("Parar", false);
        mantener = new JRadioButton("Mantener", false);
        reiniciar = new JRadioButton("Reiniciar", false);
        repostar = new JButton("Repostar");     
        
        gauge = new Radial();
        gauge.setBounds(WIDTH, WIDTH, 300, 300);
        gauge.setTitle("Velocímetro");
        gauge.setUnitString("KM/H");
        
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
                
        thr = new Thread(this);
    }
    
    public void run() {
        while(true){
            velocidad.setText("Velocidad: " + 0.0 + " km/h");
            distancia.setText("Distancia recorrida: " + 0.0 + " km");
            velocidadAuto.setText("Velocidad Automática: " + 0.0 + " km/h");
            combustible.setText("Combustible: " + 0);
        }
    }
}
