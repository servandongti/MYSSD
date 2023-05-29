/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aleatorios;

import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class Lanzador 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Generador de numeros aleatorios\n");
        int N = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros aleatorios: ")); //Definicion de cuantos numeros aleatorios serán <-------------------------------------
            
        Programa programa = new Programa(N); //Instancia de la clase que realiza los métodos y se le pasa el valor de N

        programa.generarNumerosAleatorios(); //Genera los numeros aleatorios
        programa.imprimirNumerosAleatoriosGenerados();
        
    }
    
    
}
