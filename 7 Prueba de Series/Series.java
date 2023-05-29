import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Series {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int volver=0;
        do{
        int n, i=0, num, fin=0;
        float fe=0, f=0, rango, alfa;
        //ArrayList<Float> Res = new ArrayList<Float>();
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.print("\nIngrese la cantidad de numeros: ");
        num = lec.nextInt();
        System.out.print("\nIngrese la cantidad de subgrupos: ");
        n = lec.nextInt();
        System.out.print("\nIngrese el estadistico de tablas: ");
        alfa = lec.nextFloat();
        float Numeros[] = new float[num];
        float Rangosx[] = new float [n+1];
        float Rangosy[] = new float [n+1];
        for(i=0;i<num;i++){
            Numeros[i] = (int) (Math.random() * 100000) + 1;
            Numeros[i] = Numeros[i]/100000;
            System.out.printf("\nNumero %d: %.5f \n",i+1, Numeros[i]);
        }
        System.out.print("\nParejas de numeros");
        for(i=0;i<num-1;i++){
            System.out.printf("\n%.5f, %.5f\n",Numeros[i], Numeros[i+1]);
        }
        fe=((float)num-1)/(float)Math.pow(n,2);
        System.out.println("FEi = N-1/n^2 = "+num+"-1/"+n+"^2= "+df.format(fe));
        System.out.printf("\nFrecuencia esperada: %.5f \n", fe);
        for(i=0;i<=n;i++){
            rango = (float)i/(float)n;
            Rangosx[i] = rango;
            Rangosy[i] = rango;
            fin = i;
        }
        int FO[][] = new int [n][n];
        i=0;
        do{
            for(int j=0;j<fin;j++){
                for(int m=0;m<fin;m++){
                    if(Numeros[i]>Rangosx[j] && Numeros[i]<=Rangosx[j+1]){
                        if(Numeros[i+1]>Rangosy[m] && Numeros[i+1]<=Rangosy[m+1]){
                        FO[j][m] = FO[j][m] + 1;
                        }
                    }
                }
            }
            i++;
        }while(i!=num-1);
        String impresion1 = "\nRangos de x= ";
        for(int j=0;j<fin+1;j++){
			impresion1 = impresion1 + Rangosx[j] + " ";
	}
        System.out.println(impresion1);
        String impresion2 = "\nRangos de y= ";
        for(int j=0;j<fin+1;j++){
			impresion2 = impresion2 + Rangosy[j] + " ";
		}
        System.out.println(impresion2);
        String impresion = "\n";
        for(int j=0;j<fin;j++){
                for(int m=0;m<fin;m++){
			impresion = impresion + FO[j][m] + "  ";
		}
                impresion = impresion + "\n";
        }
        System.out.println(impresion);
        System.out.println("\nX0-2 = (n^2 / N-1)(Sum Sum(Foi-Fei)^2)");
        impresion = "\nX0-2 = ("+n+"^2 / "+num+"-1 )(";
        for(int j=0;j<n;j++){
            for(int m=0;m<n;m++){
			impresion = impresion + "(("+FO[j][m]+"-"+df.format(fe)+")^2)+";
		}
        }
        impresion = impresion + ")";
        System.out.println(impresion);
        float res1 = ((float) Math.pow((float)n,2))/(num-1);
        float res, valor=0;
        float Res[][] = new float [n][n];
        impresion = "\nX0-2 = ("+df.format(res1)+")(";
        for(int j=0;j<n;j++){
            for(int m=0;m<n;m++){
                    res = FO[j][m]-fe; 
                    Res[j][m] = (float) Math.pow(res,2);
                    impresion = impresion + Res[j][m]+"+";
                    valor = valor + Res[j][m];
		}
        }
        impresion = impresion + ")";
        System.out.println(impresion);
        System.out.println("\nX0-2 = ("+df.format(res1)+")("+df.format(valor)+")");
        float res2 = res1*valor;
        System.out.println("\nX0-2 = "+df.format(res2));
        if(res2<alfa){
                System.out.printf("\n%.5f < %.5f\n", res2, alfa);
                System.out.printf("\nLos numeros son aceptados\n");
            }
            else{
                System.out.printf("\n%.5f > %.5f\n", res2, alfa);
                System.out.printf("\nLos numeros no son aceptados\n");
            }
        System.out.println("\nIngresa el numero 0 para reinciar");
        System.out.print("\nIngresa otro numero para salir: ");
        volver = lec.nextInt();
        }while(volver==0);
    }
}