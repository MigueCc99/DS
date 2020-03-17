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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import s3.Observable;
import s3.Observer;
import s3.Simulador;

public class PantallaTemperatura extends JFrame implements Observer {
    private Simulador sujetoObservable;
    private JPanel panel;
    private JLabel Titulo;
    private JLabel TCelsius;
    private JLabel TFarenheit;
    private JLabel TAC;
    private JLabel TAF;
    
    public PantallaTemperatura (){
        setSize(500,450);                                   // Tamaño de la ventana
        setMinimumSize(new Dimension(200,200));             // Tamaño mínimo
        inicializar ();                                     // Inicializamos la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);            // Establecemos la finalización de la aplicación al cerrar la ventana
        setTitle("Temperatura");                            // Título de la ventana
        setLocationRelativeTo(null);                        // Centramos la pantalla
        setVisible(true);
    }
    
    private void inicializar (){
      // Configuración del Panel
      panel = new JPanel();                                 // Creamos el panel
      panel.setLayout(null);                                // Desactivamos el layout
      this.getContentPane().add(panel);                     // Agregamos el panel a la ventana
      //panel.setBackground(Color.BLUE);                    // Cambiamos el color al panel
      
      // Configuración de las etiquetas
      // Configuración de la etiqueta "Título"
      Titulo = new JLabel();                                // Creamos una etiqueta
      Titulo.setText("TEMPERATURA");                
      Titulo.setBounds(100,30,300,50);                      // Posicionamos la etiqueta y modificamos su tamaño
      Titulo.setHorizontalAlignment(SwingConstants.CENTER); // Establecemos la alineación horizontal del texto
      Titulo.setForeground(Color.WHITE);                    // Establecemos el color de la etiqueta "Titulo"
      Titulo.setOpaque(rootPaneCheckingEnabled);            // Establecemos pintar el fondo de la etiqueta
      Titulo.setBackground(Color.BLACK);                    // Cambiamos elfondo de la etiqueta
      Titulo.setFont(new Font("arial", Font.BOLD, 20));     // Establecemos la fuente del texto
      panel.add(Titulo);    
      
      // Configuración de la etiqueta "Temperatura ºC"
      TCelsius = new JLabel("Temperatura ºC:", SwingConstants.CENTER);
      TCelsius.setBounds(10,125,125,50);
      TCelsius.setForeground(Color.BLUE);
      TCelsius.setFont(new Font("arial", Font.PLAIN, 13));
      panel.add(TCelsius);
      
      // Configuración de la etiqueta "Temperatura ºF"
      TFarenheit = new JLabel("Temperatura ºF:", SwingConstants.CENTER);
      TFarenheit.setBounds(10,300,125,50);
      TFarenheit.setForeground(Color.BLUE);
      TFarenheit.setFont(new Font("arial", Font.PLAIN, 13));
      panel.add(TFarenheit);
      
      TAC = new JLabel("0 ºC", SwingConstants.CENTER);
      TAC.setBounds(150,135,100,30);
      TAC.setForeground(Color.BLACK);
      panel.add(TAC);
      
      TAF = new JLabel("0 ºF", SwingConstants.CENTER);
      TAF.setBounds(150,310,100,30);
      TAF.setForeground(Color.BLACK);
      panel.add(TAF);
    }

    @Override public void update (Observable o){
        sujetoObservable = (Simulador) o;
        TAC.setText( Integer.toString(sujetoObservable.getTemperaturaActual())+"ºC");
        TAF.setText( Integer.toString((sujetoObservable.getTemperaturaActual()*9/5)+32)+"ºF");
    }
}