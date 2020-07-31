/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.test;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class GitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("##.##");
        double nota1[]= new double[3];
        double nota2[]= new double[3];
        double promedio[]= new double[3];
        String nombre[]= new String[3];
        String estado[]= new String[3];
        final String GRUPO_SISTEMAS="Sis11A";
        JOptionPane.showMessageDialog(null, "Bienvenid@s a DAUTE");
        for (int i = 0; i < nota1.length; i++) {
            nota1[i]= Double.parseDouble(JOptionPane.
                    showInputDialog("Ingrese nota 1 del estudiante"+i));
            nota2[i]= Double.parseDouble(JOptionPane.
                    showInputDialog("Ingrese nota 1 del estudiante"+i));
            nombre[i]= JOptionPane.showInputDialog("Ingrese su nombre"+i);
        }
    }
    
    public static double[] calcularpromedio(double nota1[],double nota2[]){
        double promedio[]= new double[3];
        for (int i = 0; i < promedio.length; i++) {
            promedio[i]=(nota1[i]+nota2[i])/2;
        }
        return promedio;        
    }
    
}
