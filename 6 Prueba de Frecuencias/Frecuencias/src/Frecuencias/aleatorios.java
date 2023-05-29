/*
    Programa que define los numeros aleatorios que se usarán
 */
package Frecuencias;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class aleatorios 
{
    private int N;
    private int valorInicial = 0;
    private int valorFinal = 1;
    private ArrayList<Double> arrayNumerosAleatorios = new ArrayList<>();
    
    public aleatorios(int N)
    {
        this.N = N;
    }
    
    public ArrayList generarNumerosAleatorios() //genera numeros aleatorios
    {
        
        DecimalFormat decimales = new DecimalFormat("#.00000"); //Definir la cantidad de decimales que se manejarán de los números aleatorios
        
        for( int i = 1; i <= N; i++)
        {
            double aleatorio = ((Math.random()*(valorFinal-valorInicial))); //obtiene un número aleatorio
            double numeroAleatorio = Double.parseDouble(decimales.format(aleatorio)); //Define que sean los numeros de máximo 5 decimales
            arrayNumerosAleatorios.add(numeroAleatorio); //añade el numero a un arraylist de numeros
        }
        
        return arrayNumerosAleatorios; //retorna los numeros aleatorios generados
    }
   
}
