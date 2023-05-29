/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frecuencias;

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
    private double alpha; //alpha
    private int subintervalos; //Subintervalos en que se dividirá
    private double FE, limites[];
    private int contador[];
    private double estadistico, sumatoria;
    private double estadisticoDeTabla;
    private ArrayList<Double> arrayNumerosAleatorios = new ArrayList<>(); //Array con los numeros generados
    
    public Programa(int N, double alpha, int subintervalos) //Constructor de la clase
    {
        this.N = N;
        numerosAleatorios = new aleatorios(N); //le manda el valor de N a aleatorios
        this.alpha = alpha;
        this.subintervalos = subintervalos;
        this.limites = new double[(this.subintervalos)+1];
        this.contador = new int[(this.subintervalos)];
        tabla = new Tabla( N, alpha );
        
        System.out.println("Cantidad de números aleatorios: " + this.N );
        System.out.println("Valor de alpha: " + this.alpha + "%");
        System.out.println("Subintervalos(n): " + this.subintervalos);
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
    
    public void obtenerFrecuenciaEsperada()
    {
        this.FE = (Double.valueOf(N) / Double.valueOf(subintervalos)); //  Formula Fei = N / n
    }
    
    public void ordenarNumeros() //Ordena los numeros aleatorios
    {
        Collections.sort(arrayNumerosAleatorios);
    }
    
    public void limitarYAsignar() //Limita segun el numero de subintervalos y los asigna
    {
        for( int i = 0; i <= subintervalos; i++ ) //Define limites y inicializa las secciones en 0
        {
            double limite = Double.valueOf(i) / Double.valueOf(subintervalos);
            limites[i] = limite;
            //System.out.println("Limite: " + limite);
            if( i < subintervalos )
            {
                contador[i] = 0; //Inicializo todo
                //System.out.println("Contador " + i + ": " + contador[i]);
            }
        }
        
        for( int i = 0; i < N; i++ ) //Obtiene la FO de cada subintervalo
        {
            for( int j = 0; j < subintervalos; j++ )
            {
                if( (arrayNumerosAleatorios.get(i) > limites[j]) && (arrayNumerosAleatorios.get(i) < limites[j+1]) )
                {
                    contador[j]++;
                }
            }
        }
    }
    
    public void imprimirNumerosYAsignacion()
    {
        {
        int cont = 0;
            System.out.println("");
            for( int i = 0; i < subintervalos; i++)
            {
                int a = 0;
                while( a != contador[i])
                {
                    System.out.print(arrayNumerosAleatorios.get(cont) + " ");

                    switch( (i+1) )
                    {
                        case 1:
                            System.out.print("A\n");
                            break;
                        case 2:
                            System.out.print("B\n");
                            break;
                        case 3:
                            System.out.print("C\n");
                            break;
                        case 4:
                            System.out.print("D\n");
                            break;
                        case 5:
                            System.out.print("E\n");
                            break;
                        case 6:
                            System.out.print("F\n");
                            break;
                        case 7:
                            System.out.print("G\n");
                            break;
                        case 8:
                            System.out.print("H\n");
                            break;
                        case 9:
                            System.out.print("I\n");
                            break;
                        case 10:
                            System.out.print("J\n");
                            break;
                        case 11:
                            System.out.print("K\n");
                            break;
                        case 12:
                            System.out.print("L\n");
                            break;
                        case 13:
                            System.out.print("M\n");
                            break;
                        case 14:
                            System.out.print("N\n");
                            break;
                        case 15:
                            System.out.print("O\n");
                            break;
                        case 16:
                            System.out.print("P\n");
                            break;
                        case 17:
                            System.out.print("Q\n");
                            break;
                        case 18:
                            System.out.print("R\n");
                            break;
                        case 19:
                            System.out.print("S\n");
                            break;
                        case 20:
                            System.out.print("T\n");
                            break;
                        case 21:
                            System.out.print("U\n");
                            break;
                        case 22:
                            System.out.print("V\n");
                            break;
                        case 23:
                            System.out.print("W\n");
                            break;
                        case 24:
                            System.out.print("X\n");
                            break;
                        case 25:
                            System.out.print("Y\n");
                            break;
                        case 26:
                            System.out.print("Z\n");
                            break;
                    }
                    cont++;
                    a++;
                }
            }
        }
        System.out.println("\nFrecuencia Esperada: " + this.FE);
    }
    
    public void calcularEstadistico() //Calcula el estadístico Xo2
    {
        sumatoria = 0;
        //System.out.println(arrayNumerosAleatorios);
        
        
        System.out.println("");
        for( int i = 0; i < subintervalos; i++)
        {
            double operacion = (contador[i] - FE);
            sumatoria += Math.pow(operacion, 2);
        }
        
        estadistico = (( 1 / FE )* sumatoria );
        System.out.println("Estadistico: " + estadistico);
    }
    
    public void imprimirTabla()
    {
            
        System.out.println("");
        for( int j = 0; j <= 2; j++){
            switch(j)
            {
                case 0:
                    System.out.print("      ");
                    for( int i = 0; i < subintervalos; i++)
                    {
                        //double operacion = (contador[i] - FE);
                        //sumatoria += Math.pow(operacion, 2);
                        System.out.print("|     ");
                        switch( (i+1) )
                        {
                            case 1:
                                System.out.print("A");
                                break;
                            case 2:
                                System.out.print("B");
                                break;
                            case 3:
                                System.out.print("C");
                                break;
                            case 4:
                                System.out.print("D");
                                break;
                            case 5:
                                System.out.print("E");
                                break;
                            case 6:
                                System.out.print("F");
                                break;
                            case 7:
                                System.out.print("G");
                                break;
                            case 8:
                                System.out.print("H");
                                break;
                            case 9:
                                System.out.print("I");
                                break;
                            case 10:
                                System.out.print("J");
                                break;
                            case 11:
                                System.out.print("K");
                                break;
                            case 12:
                                System.out.print("L");
                                break;
                            case 13:
                                System.out.print("M");
                                break;
                            case 14:
                                System.out.print("N");
                                break;
                            case 15:
                                System.out.print("O");
                                break;
                            case 16:
                                System.out.print("P");
                                break;
                            case 17:
                                System.out.print("Q");
                                break;
                            case 18:
                                System.out.print("R");
                                break;
                            case 19:
                                System.out.print("S");
                                break;
                            case 20:
                                System.out.print("T");
                                break;
                            case 21:
                                System.out.print("U");
                                break;
                            case 22:
                                System.out.print("V");
                                break;
                            case 23:
                                System.out.print("W");
                                break;
                            case 24:
                                System.out.print("X");
                                break;
                            case 25:
                                System.out.print("Y");
                                break;
                            case 26:
                                System.out.print("Z");
                                break;
                        }
                        System.out.print("      ");
                    }
                     System.out.println("");
                    break;
                case 1:
                    System.out.print(" FEi  |");
                    for( int i = 0; i < subintervalos; i++)
                    {
                        System.out.print("    " + FE);
                        System.out.print("      ");
                    }
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.print(" FOi  |");
                    for( int i = 0; i < subintervalos; i++)
                    {
                        System.out.print("     " + contador[i]);
                        System.out.print("       ");
                    }
                    System.out.println("\n");
                    break;
            }
        }
    }
    
    
    public void Comprobar()
    {
        this.estadisticoDeTabla = tabla.generarEstadisticoTablas();
        
        System.out.println("(X2alpha) " + estadistico + "  <  "  + estadisticoDeTabla + "(X2,n-1)" );
        
        System.out.println("\nConclusion:");
        
        if( estadistico < estadisticoDeTabla )
        {
            System.out.println("Por lo tanto...Los números son aceptados");
        }
        else
        {
            System.out.println("Por lo tanto...Los números NO son aceptados");
        }
        
    }
    
}
