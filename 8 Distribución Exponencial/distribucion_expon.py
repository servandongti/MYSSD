
import random

class distribucion_expon:

    def __init__(self, nums, time, const):
        self.nums = nums
        self.time = time
        self.const = const
        self.r = len(nums)
        self.x = []
        self.exp()

    def exp(self):
        count = 0
        print(f' xi     X = -1/L Ln R')
        for xi in self.nums:
            count+=1
            x = (-1/self.time)*(np.log(xi))
            print(f'{xi}  Ts{count}= {1}/{self.time} Ln({xi}) = {x} {self.const}')
            self.x.append(x)

        tot = sum(self.x)
        prom = sum(self.x) / self.r
        print(f'El total es = {tot} {self.const} \n El promedio es = {prom} {self.const}')


const = input("Como quieres que se resuelva el problema\n Presiona a. si horas  \n Presiona  b. si minutos  :")
nums_list = []
nums = input('Cantidad de numeros aleatorios que se desea generar: ')
tiempo =  input('Da un valor a lambda: ')


if const == 'a':
    const = 'horas'
elif const == 'b':
    const = 'minutos'
else:
    const = 'minutos/horas'

    
for _ in range(0, int(nums)):
    rand = random.uniform(0, 1)
    num = round(rand, 5)
    nums_list.append(num)


test = distribucion_expon(nums_list, int(tiempo), const)

