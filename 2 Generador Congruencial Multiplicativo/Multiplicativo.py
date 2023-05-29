
import subprocess
import sys

def install(package):
    subprocess.call([sys.executable, "-m", "pip", "install", numpy])

import numpy as np
    
class GCM:
    def __init__(self, a, x, m):     # Variables a, Xo, M
        self.a  = a
        self.x  = x
        self.m  = m
    
    def pe(self):
        for i in str(self.m):
            if i in '10': 
                binary = True
            else:
                binary = False
                break
        if binary == False:
            return self.m/4
        else:
            exp = np.floor(np.log10(np.abs(self.m)))
            if exp == 0:
                lamb_2 = 1
            elif exp == 1:
                lamb_2 = 2
            elif exp > 2:
                lamb_2 = 2**(exp-2) 
            lamb_5 = (5**(exp-1))*(4)  
        return 
    def gen(self):
        self.pe()
        print('| n | Xo | (  aXo  ) mod m | Xn+1 | Numeros Rectangulares')
        ini = self.x
        for n in range(1, self.m+1):    # loop con numero de iteraciones "m"
            xn = (self.a*self.x) % self.m    # obtiene el residuo
            b = (self.a*self.x) // self.m    # division entera
            # ******************************************** print ********************************************
            print(f'| {n} | {self.x}  |  {b} + {xn}/{self.m}        |  {xn}   | {xn}/{self.m}  = {xn/self.m}')
            # ***********************************************************************************************
            if xn == ini and n != self.m:
                break
            self.x = xn
        if xn == ini:
            print("Generador congruencial multiplicativo confiable.")
            print()
        elif xn != ini:
            print("Generador congruencial multiplicativo no confiable.")
            print()
        
a1 = int(input("\n\nIntroduzca constante a: "))
x1 = int(input("Introduzca valor de semilla inicial Xo: "))
m1 = int(input("Introduzca valor del modulo m: "))
x = GCM(a1, x1, m1)
x.gen()


