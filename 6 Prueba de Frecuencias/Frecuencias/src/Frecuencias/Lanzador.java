/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frecuencias;

import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class Lanzador 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Prueba de Frecuencias\n");
        int N = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros aleatorios: ")); //Definicion de cuantos numeros aleatorios serán <-------------------------------------
        double alpha = Double.parseDouble(JOptionPane.showInputDialog("Alpha a utilizar: ")); //Definicion de alpha <--------------------------------------------------------------
        int subintervalos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de subintervalos: ")); //Definicion de subintervalos(n) <-------------------------------------------
            
        Programa programa = new Programa(N, alpha, subintervalos); //Instancia de la clase que realiza los métodos y se le pasa el valor de N

        programa.generarNumerosAleatorios(); //Genera los numeros aleatorios
        //programa.imprimirNumerosAleatoriosGenerados();
        programa.obtenerFrecuenciaEsperada(); //Obtiene la frecuencia esperada
        programa.ordenarNumeros();
        programa.limitarYAsignar();
        programa.imprimirNumerosYAsignacion();
        programa.imprimirTabla();
        programa.calcularEstadistico();
        programa.Comprobar();
        
        
    }
    
    
}
