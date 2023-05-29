/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promedio;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 */
public class Programa 
{
    private aleatorios numerosAleatorios; //Instancia a aleatorios
    private Tabla tabla;
    
    private int N; //Cantidad de números aleatorios
    private int alpha; //alpha
    private double alphaReal, datoABuscar, estadisticoDeTabla;
    private double sumatoria = 0, promedio, numerador, denominador, estadistico;
    private ArrayList<Double> arrayNumerosAleatorios = new ArrayList<>(); //Array con los numeros generados
    
    public Programa(int N, int alpha) //Constructor de la clase, define N
    {
        this.N = N;
        numerosAleatorios = new aleatorios(N); //le manda el valor de N a aleatorios
        this.alpha = alpha;
        tabla = new Tabla();
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
    
    public void imprimirAlpha() //Define alpha
    {
        System.out.println("Valor de alpha: " + alpha + "%");
    }
    
    public void obtenerSumatoriaYPromedio()
    {
        
        for ( int i = 0; i < N; i++ )
        {
            sumatoria += arrayNumerosAleatorios.get(i);
        }
        
        promedio = sumatoria / N;
    }
    
    public void obtenerEstadistico() //Obtener Zo
    {
        numerador = ((promedio - (Double.valueOf(1)/Double.valueOf(2))) * (Math.sqrt(Double.valueOf(N)))); //numerador = (promedio - 1/2) * raiz de N
        denominador = (Math.sqrt(Double.valueOf(1)/Double.valueOf(12)));
        estadistico = (Math.abs(numerador/denominador));
        System.out.println("\nEstadistico(Zo): " + estadistico);
    }
    
    public double obtenerAlphaReal()
    {
        alphaReal = (((Double.valueOf(100)) - alpha) / Double.valueOf(100));
        datoABuscar = alphaReal / (Double.valueOf(2));
        return datoABuscar;
    }
    

    
    public void Comparar(Double datoABuscar)
    {
        estadisticoDeTabla = tabla.buscarEstadisticoDeTablas(datoABuscar);
        System.out.println("Estadistico de tabla(Zalpha/2): " + estadisticoDeTabla);
        
        System.out.println("\n(Zo) " + estadistico + " < " + estadisticoDeTabla + " (Zalpha/2)" );
        
        System.out.println("\nConclusion:");
        if( estadistico < estadisticoDeTabla)
        {
            System.out.println("Por lo tanto....Los numeros son aceptados");
        }else
        {
            System.out.println("Por lo tanto....Los numeros NO son aceptados");
        }
    }
}