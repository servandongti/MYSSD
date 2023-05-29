
class Mixto:
        a  = int(input("\n\nIntroduzca constante a: "))
        x  = int(input("Introduzca valor de semilla inicial Xo: "))
        c  = int(input("Introduzca constante aditiva C: "))
        m  = int(input("Introduzca valor del modulo m: "))
        print('\n| n | Xo | (aXo + c) mod m  | Xn+1  | Numeros Rectangulares')
        ini = x
        for n in range(1, m+1):    
            xn = ((a*x) + c) % m   
            b = ((a*x) + c) // m  
            print(f'| {n} | {x}  |  {b} + {xn}/{m}        |  {xn}   | {xn}/{m}  = {xn/m}')
            if xn == ini and n != m:
                break
            x = xn
        if xn == ini and n==m: 
            print("\nGenerador congruencial mixto confiable.") 
            print()
        else:
            print("\nGenerador congruencial mixto no confiable.")
            print()




