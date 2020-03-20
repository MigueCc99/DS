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
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Salpicadero extends JFrame {
    private Velocimetro velocimetro;
    private CuentaKilometros cuentaKilometros;
    private CuentaRevoluciones cuentaRevoluciones;
    private JPanel panelPrincipal;
    private JLabel titulo;
    
    public Salpicadero () {
        inicializar();
        velocimetro = new Velocimetro(panelPrincipal);
        cuentaKilometros = new CuentaKilometros(panelPrincipal);
        cuentaRevoluciones = new CuentaRevoluciones(panelPrincipal);
    }
    
    private void inicializar () {
        setSize(500,600);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("SALPICADERO VEHÍCULO");
        setLocationRelativeTo(null);
        setVisible(true);
        
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
        
        inicializarComponentes();
    }
    
    private void inicializarComponentes () {
      titulo = new JLabel();                               
      titulo.setText("SALPICADERO");                
      titulo.setBounds(10,5,200,20);                     
      titulo.setHorizontalAlignment(SwingConstants.CENTER);  
      titulo.setForeground(Color.WHITE);                    
      titulo.setOpaque(rootPaneCheckingEnabled);            
      titulo.setBackground(Color.BLACK);                    
      titulo.setFont(new Font("arial", Font.BOLD, 20));     
      panelPrincipal.add(titulo);   
    }
}
