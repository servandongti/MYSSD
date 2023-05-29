/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aleatorios;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class Programa 
{
    private aleatorios numerosAleatorios; //Instancia a aleatorios
    
    private int N; //Cantidad de números aleatorios
    private ArrayList<Double> arrayNumerosAleatorios = new ArrayList<>(); //Array con los numeros generados
    
    public Programa(int N) //Constructor de la clase
    {
        this.N = N;
        numerosAleatorios = new aleatorios(N); //le manda el valor de N a aleatorios
        
        System.out.println("Cantidad de números aleatorios: " + this.N );
    }
    
    
    
    public void generarNumerosAleatorios() //Genera numeros aleatorios
    {
        arrayNumerosAleatorios = numerosAleatorios.generarNumerosAleatorios();
    }
    
    public void imprimirNumerosAleatoriosGenerados() //imprimir numeros aleatorios
    {
        for ( int i = 0; i < N; i++ )
        {
            System.out.println( arrayNumerosAleatorios.get(i) );
        }
    }
    
}
