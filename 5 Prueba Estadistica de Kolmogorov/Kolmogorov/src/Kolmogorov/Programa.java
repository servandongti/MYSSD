/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolmogorov;

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
    private Tabla tabla;
    
    private int N; //Cantidad de números aleatorios
    private int alpha; //alpha
    private double estadisticoDeTabla;
    private ArrayList<Double> arrayNumerosAleatorios = new ArrayList<>(); //Array con los numeros generados
    private ArrayList<Double> arrayDistanciaAcumulada = new ArrayList<>(); //Array con distancias acumuladas
    private ArrayList<Double> arrayEstadisticos = new ArrayList<>(); //Array con estadisticos
    private Double max;
    
    public Programa(int N, int alpha) //Constructor de la clase, define N
    {
        this.N = N;
        numerosAleatorios = new aleatorios(N); //le manda el valor de N a aleatorios
        this.alpha = alpha;
        tabla = new Tabla( N, alpha );
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
        System.out.println("Valor de alpha: " + alpha);
    }
    
    
    public void ordenarNumerosXi() //Ordena los numeros aleatorios
    {
        Collections.sort(arrayNumerosAleatorios);
    }
    
    
    public void distanciaAcumuladaXi() //Obtener distancias acumuladas
    {
        //Obtener distancias acumuladas
        for( int i = 1; i <= N; i++ )
        {
            double Fxi = ( (Double.valueOf(i)) / (Double.valueOf(N)) ); //Fxi = i / N
            this.arrayDistanciaAcumulada.add(Fxi);
        }
    }
    
    
    public void generarEstadisticos() //Genera Estasdistico y selecciona el mayor
    {
        //System.out.println("Ordenados: " + arrayNumerosAleatorios);
        //System.out.println("Fxi: " + distanciaAcumulada);
        
        for( int i = 1; i <= N; i++ ) //Genera los estadisticos
        {
            double Dn = ( this.arrayDistanciaAcumulada.get(i-1) - this.arrayNumerosAleatorios.get(i-1) ); //Dn = Fxi - Xi
            Dn = abs(Dn);
            this.arrayEstadisticos.add(Dn);
        }
        
        //System.out.println("Dn: " + arrayEstadisticos);
    }
    
    public void maxEstadistico()
    {
        max = arrayEstadisticos.get(0);
        
        for( int i = 1; i < N; i++ )
        {
            if( max < arrayEstadisticos.get(i))
            {
                this.max = arrayEstadisticos.get(i);
            }
        }
        
        //System.out.println("DnMax = " + max);
    }
    
    
    public void Comparacion()
    {
        this.estadisticoDeTabla = tabla.generarEstadísticoTablas();
        
        System.out.println("(Dn) " + max + "  <  "  + estadisticoDeTabla + "(d alpha,N)" );
        
        System.out.println("\nConclusion:");
        if( max < estadisticoDeTabla )
        {
            System.out.println("Por lo tanto...Los números son aceptados");
        }
        else
        {
            System.out.println("Por lo tanto...Los números NO son aceptados");
        }
        
    }
    
    public void generarTablaCorrer()
    {
        //System.out.println("AAAAAAAAA: " + arrayNumerosAleatorios+ "\nAAA: " + arrayDistanciaAcumulada + "\nAAA: " + arrayEstadisticos);
        System.out.println("|      i      |      Xi      |      Fxi = i / N      |      Dn = MAX|Fxi - Xi      |");
        System.out.println("------------------------------------------------------------------------------------");
        for( int i = 0; i < N; i++ )
        {
            System.out.print("       " + (i+1) + "           " ); 
            System.out.print(arrayNumerosAleatorios.get(i) + "              ");
            System.out.print(arrayDistanciaAcumulada.get(i) + "                ");
            System.out.print(arrayEstadisticos.get(i));
            System.out.print("\n");
        }
    }
    
}
