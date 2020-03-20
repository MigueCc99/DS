/**
 * Universidad de Granada - Grado en Informatica : 2020  
 * 
 * Asignatura: Desarrollo de Software
 * Practica 1 - Sesión 3
 * 
 * @author Miguel Ángel Campos Cubillas
 * @email miguecc99@correo.ugr.es
 * 
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.border.*;
import javax.swing.SwingConstants;

public class PanelBotones extends JFrame {
    private JButton BotonAcelerar;
    private JButton BotonEncender;
    private JButton BotonFrenar;
    private JPanel pb1;
    private JPanel pb2;
    private JLabel Estado;
    
    public PanelBotones () {
        setSize(400,100);
        setMinimumSize(new Dimension(200,100));
        inicializar();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CONTROL DE MOVIMIENTO");
        setLocation(100,100);
        setVisible(true);
    }
    
    private void inicializar () {
        inicializarPanelSuperior();
        inicializarPanelInferior();
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(pb1);
        this.add(pb2);
    }
    
    private void inicializarPanelSuperior () {
        pb1 = new JPanel();
        pb1.setLayout(new BoxLayout(pb1,BoxLayout.X_AXIS));

        Estado = new JLabel();
        Estado.setText("APAGADO");
        Estado.setHorizontalAlignment(SwingConstants.CENTER);
        Estado.setForeground(Color.RED);
        Estado.setFont(new Font("arial", Font.BOLD, 15));
        pb1.add(Estado);                
    }
    
    private void inicializarPanelInferior () {
        pb2 = new JPanel();
        pb2.setLayout(new BoxLayout(pb2,BoxLayout.X_AXIS));
        
        BotonAcelerar = new JButton();
        BotonAcelerar.setText("ACELERAR");
        BotonAcelerar.setForeground(Color.BLACK);
        BotonAcelerar.setFont(new Font("arial", Font.BOLD, 15));
        pb2.add(BotonAcelerar);
        
        BotonFrenar = new JButton();
        BotonFrenar.setText("FRENAR");
        BotonFrenar.setForeground(Color.BLACK);
        BotonFrenar.setFont(new Font("arial", Font.BOLD, 15));
        pb2.add(BotonFrenar);   
        
        BotonEncender = new JButton();
        BotonEncender.setText("FRENAR");
        BotonEncender.setForeground(Color.GREEN);
        BotonEncender.setFont(new Font("arial", Font.BOLD, 15));
        pb2.add(BotonEncender);  
    }
    
    private void gestionarEventos () {
        ActionListener al1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                
            }
        };
    }
}
