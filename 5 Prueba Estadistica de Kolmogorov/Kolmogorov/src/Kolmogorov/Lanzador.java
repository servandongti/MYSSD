/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolmogorov;

import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class Lanzador 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Prueba de kolmogorov\n");
        int N = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros aleatorios: ")); //Definicion de cuantos numeros aleatorios serán <-------------------------------------
        int alpha = Integer.parseInt(JOptionPane.showInputDialog("Alpha a utilizar ")); //Definicion de alpha <------------------------------------------------------------
        
        if( alpha == 1 || alpha == 5 || alpha == 10)
        {
            
            Programa programa = new Programa(N, alpha); //Instancia de la clase que realiza los métodos y se le pasa el valor de N

            System.out.println("Cantidad de números aleatorios: " + N );
            programa.generarNumerosAleatorios(); //Genera los numeros aleatorios

            programa.imprimirAlpha(); //Definir e imprimir valor de alpha

            programa.ordenarNumerosXi();  //Ordena los numeros aleatorios generados
            programa.distanciaAcumuladaXi(); //Obtiene las distancias acumuladas
            programa.generarEstadisticos();//Genera los estadisticos
            programa.generarTablaCorrer();
            programa.maxEstadistico();//Obtiene el mayor vlaor de los estadisticos
            
            programa.Comparacion ();//Realiza la comparacion final para sacar una conclusion
            
            

            
            
            
            
        }else
        {
            System.out.println("Alpha debe ser 1%, 5%, o 10%");
        }
        

        
    }
    
    
}
