/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolmogorov;

/**
 *
 * @author jonat
 */
public class Tabla 
{
    private int N;
    private int alpha;
    private double estadisticoDeTablas;
    private double diez[][] = {{1,0.950},{2,0.776},{3,0.642},{4,0.564},{5,0.510},{6,0.470},{7,0.438},{8,0.411},{9,0.388},{10,0.368},{11,0.352},{12,0.338},{13,0.352},{14,0.314},{15,0.304},{16,0.295},{17,0.286},{18,0.278},{19,0.272},{20,0.264},{25,0.240},{30,0.220},{35,0.210}};
    private double cinco[][] = {{1,0.975},{2,0.842},{3,0.708},{4,0.624},{5,0.563},{6,0.521},{7,0.486},{8,0.457},{9,0.432},{10,0.409},{11,0.391},{12,0.375},{13,0.361},{14,0.349},{15,0.338},{16,0.328},{17,0.318},{18,0.309},{19,0.301},{20,0.294},{25,0.264},{30,0.242},{35,0.230},{40,0.210},{50,0.188},{60,0.172},{70,0.160},{80,0.150},{90,0.141},{100,0.134}};
    private double uno[][] = {{1,0.995},{2,0.929},{3,0.829},{4,0.734},{5,0.669},{6,0.618},{7,0.577},{8,0.543},{9,0.514},{10,0.486},{11,0.468},{12,0.450},{13,0.433},{14,0.418},{15,0.404},{16,0.392},{17,0.381},{18,0.371},{19,0.363},{20,0.352},{25,0.317},{30,0.290},{35,0.270},{40,0.252},{50,0.226},{60,0.207},{70,0.192},{80,0.180}};
    
    public Tabla(Integer N, Integer alpha)
    {
        this.N = N;
        this.alpha = alpha;
    }
    
    public double generarEstadísticoTablas()
    {
        switch(alpha) //Dependiendo del alpha es el array que se usa, compara la n con la N y asigna el estadistico
        {
            case 10:
                for( int i = 0; i < diez.length; i++ )
                {
                    if( (diez[i][0]) == N )
                    {
                        this.estadisticoDeTablas = (Double)diez[i][1];
                    }
                }
                break;
                
            case 5:
                for( int i = 0; i < cinco.length; i++ )
                {
                    if( (cinco[i][0]) == N )
                    {
                        this.estadisticoDeTablas = cinco[i][1];
                    }
                }
                
                break;
            case 1:
                for( int i = 0; i < uno.length; i++ )
                {
                    if( (uno[i][0]) == N )
                    {
                        this.estadisticoDeTablas = uno[i][1];
                    }
                }
                
                break;
        }
        System.out.println("\nEstadistico de tablas: " + estadisticoDeTablas);
        return estadisticoDeTablas;
    }
    
    
}
