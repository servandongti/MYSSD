print("Programa para calcular promedios de valores")
suma=0
contador=0
promedio=0
lista=[]
lista2=[]
 
valor_r=int(input("Introduzca el rango de valores a calcular: "))
 
#ingresar el rango de valores numéricos a calcular.
 
 
for i in range(valor_r):
 
#el range toma el valor del rango de valores a calcular.
 
    valor_n= int(input("Ingrese el valor numerico: "))
 
    #según el rango el for repite este mensaje hasta ingresar todos los valores a promediar.
 
    lista.extend([valor_n])
 
    #se guarda los valores en lista
 
    suma=suma+valor_n
 
#se calcula el promedio
 
promedio=suma/valor_r
 
for i in range(len(lista[:])):
 
    #se utiliza la lista de valores como rango para validar cuantos valores son mayores al promedio
 
    if promedio<=lista[i]:
 
        #se compara los valores de la lista con el promedio
 
        contador=contador+1
 
        lista2.extend([lista[i]])
 
        #se guarda los valores mayores al promedio en lista2
 
print("Los valores numéricos son : " +str(lista[:]))
x=promedio/100000
print("El promedio es: " + str(x))
valor_a=int(input("Introduzca alfa: "))
Zo=abs(((x-0.5)*3.16227766)/0.2886751346)
print("El estadistico es:  " +str(Zo))
a=(100-valor_a)/100
print("El a real es:  " +str(a))
Zaz=(a*2)+valor_a
print("El estadistico de tablas es:  " +str(Zaz))

if Zaz>Zo:
    print(str(Zaz)+">"+str(Zo))
    print("Por lo tanto, los números son aceptados")
else :
    print(str(Zaz)+"<"+str(Zo))
    print("Por lo tanto, los números NO son aceptados")

k=input("press close to exit") 




