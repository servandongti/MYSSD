import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Poisson{
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);
        int volver=0;
        ArrayList<Double> Res = new ArrayList<Double>();
        ArrayList<Double> Sum = new ArrayList<Double>();
        DecimalFormat df = new DecimalFormat("0.00000");
        do{
        int i=0, lamda, fin;
        double sum=0, e=(float) 2.71828;
        do{
            System.out.print("\nIngrese la cantidad de numeros: ");
            lamda = lec.nextInt();
        }while(lamda<=0);
        System.out.println("\nX    f(Xi)      F(Xi)");
        do{
            double factorial=1, res=0;
            for (int j = i; j > 0; j--) {
            factorial = factorial * j;
            }
            
            res=((((double) Math.pow(e, (-1*lamda)))*((double)Math.pow(lamda, i)))/(factorial));
            Res.add(res);
            sum = sum + res;
            Sum.add(sum);
            System.out.println("\n"+i+"   "+df.format(Res.get(i))+"   "+df.format(Sum.get(i)));
            fin=i;
        i++;
        }while(sum<.99995);
        i=1;

        System.out.println("\nRangos\n");
        System.out.println("\nSi R>0 y =< "+df.format(Sum.get(0))+", Entonces x=0");
        do{
            System.out.println("\nSi R> "+df.format(Sum.get(i-1))+ "y =< "+df.format(Sum.get(i))+", Entonces x="+i);
            i++;
        }while(i<=fin);
        float Numeros[] = new float[lamda];
        System.out.println("\nNumeros");
        for(i=0;i<lamda;i++){
            Numeros[i] = (int) (Math.random() * 100000) + 1;
            Numeros[i] = Numeros[i]/100000;
        }
        i=0;
        int total=0;
        do{
            int valor=0;
            for(int j=0;j<fin;j++){
                if(Numeros[i]>Sum.get(j) && Numeros[i]<=Sum.get(j+1)){
                    valor= valor + (j+1);
                }
                else{
                    valor = valor + 0;
                }
            }
            total = total + valor;
            System.out.printf("\nNumero %d: %.5f= %d\n",i+1, Numeros[i], valor);
            i++;
        }while(i!=lamda);
        System.out.printf("\nTotal= %d \n", total);
        System.out.println("\nIngresa el numero 0 para reinciar");
        System.out.print("\nIngresa otro numero para salir: ");
        volver = lec.nextInt();
        Res.clear();
        Sum.clear();
        }while(volver==0);
    }
}