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
            nombre[i]= JOptionPane.showInputDialog("Ingrese su nombre "+(i+1));
            nota1[i]= Double.parseDouble(JOptionPane.
                    showInputDialog("Ingrese nota 1 del estudiante "+(i+1)));
            nota2[i]= Double.parseDouble(JOptionPane.
                    showInputDialog("Ingrese nota 1 del estudiante "+(i+1)));            
        }     
        promedio=calcularpromedio(nota1, nota2);
        imprimirestado(promedio);
        for (int i = 0; i < promedio.length; i++) {
            JOptionPane.showMessageDialog(null, "Datos estudiante "+(i+1)+""
                    + "\n Nombre: "+nombre[i]+
                    "\n Promedio: "+df.format(promedio[i])
                            + "\n Del grupo: "+GRUPO_SISTEMAS);
        }
        imprimirestado(promedio);
    }
    
    public static double[] calcularpromedio(double nota1[],double nota2[]){
        double promedio[]= new double[3];
        for (int i = 0; i < promedio.length; i++) {
            promedio[i]=(nota1[i]+nota2[i])/2;
        }
        return promedio;
    }
    public static void imprimirestado(double promedio[]){
        String estado[]= new String[3];
        for (int i = 0; i < promedio.length; i++) {
            if (promedio[i]>=7 && promedio[i]<=10) {
                estado[i]="Aprobado";
            }else{
                estado[i]="Reprobado";
            }
        }
        for (int i = 0; i < estado.length; i++) {
            JOptionPane.showMessageDialog(null, 
                    "Estado del estudiante "+(i+1)+"es: "+estado[i]);
        }
    }
    
}
