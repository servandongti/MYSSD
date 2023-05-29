/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promedio;

import javax.swing.JOptionPane;

/**
 */
public class Lanzador 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Prueba de promedio\n");
        int N = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros aleatorios: ")); //Definicion de cuantos numeros aleatorios serán <-------------------------------------
        int alpha = Integer.parseInt(JOptionPane.showInputDialog("Alpha a utilizar ")); //Definicion de alpha <------------------------------------------------------------
        
        Programa programa = new Programa(N, alpha); //Instancia de la clase que realiza los métodos y se le pasa el valor de N

        System.out.println("Cantidad de números aleatorios: " + N );
        programa.generarNumerosAleatorios(); //Genera los numeros aleatorios

        programa.imprimirAlpha(); //Definir e imprimir valor de alpha
        System.out.println("\nNumeros aleatorios generados: ");
        programa.imprimirNumerosAleatoriosGenerados();
        
        programa.obtenerSumatoriaYPromedio();
        programa.obtenerEstadistico();
         //Se obtiene valor a buscar en tablas
        
        programa.Comparar( programa.obtenerAlphaReal() );

    }
}