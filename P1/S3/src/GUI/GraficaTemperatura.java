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

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

import s3.Observable;
import s3.Observer;
import s3.Simulador;

public class GraficaTemperatura extends ApplicationFrame implements Observer{
    private Simulador sujetoObservable;
    private JFreeChart barChart;
    private ChartPanel chartPanel;
    private DefaultCategoryDataset dataset;
    private final String centigrados = "ºC";        
    private final String farenheit = "ºF";   
    private final String c = "Grados Centígrados";
    private final String f = "Grados Farenheit";
    private Number aux;
    
    public GraficaTemperatura (String applicationTitle, String chartTitle) {
        super(applicationTitle);
        barChart = ChartFactory.createBarChart(chartTitle, "Unidad de Medida", "Grados", createDataset(), PlotOrientation.VERTICAL, true, true, false);
        
        chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(560,367));
        setContentPane(chartPanel);
        
        this.pack( );
        RefineryUtilities.positionFrameOnScreen(this, BOTTOM_ALIGNMENT, LEFT_ALIGNMENT);
        setVisible( true ); 
    }
    
    private CategoryDataset createDataset () {
      dataset = new DefaultCategoryDataset();

      dataset.addValue(10, c, centigrados);
      dataset.addValue(20, f, farenheit);
      return dataset;
    }
    
    @Override
    public void update(Observable o) {
        sujetoObservable = (Simulador)o; 
        dataset.setValue((Number)sujetoObservable.getTemperaturaActual(), c, centigrados);
        dataset.setValue((Number)((sujetoObservable.getTemperaturaActual()*9/5)+32), f, farenheit);
    }
    
}
