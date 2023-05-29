import random

class distribucion_unifi:

    def __init__(self, nums, time_a, time_b, const):
        self.nums = nums
        self.time_a = time_a
        self.time_b = time_b
        self.const = const
        self.n = len(nums)
        self.x = []
        self.unif()

    def unif(self):
        print('xi         a + ( b - a ) * R')
        for xi in self.nums:
            x = self.time_a + (self.time_b - self.time_a) * xi
            print(f'{xi}    {self.time_a} + ({self.time_b} - {self.time_a}) * {xi} = {x}')
            self.x.append(x)

        tot = sum(self.x)
        prom = sum(self.x) / self.n
        print(f'Total = {tot} {self.const} | Promedio = {prom} {self.const}')


const = input("Quieres trabajar con \n 1. horas  o\n   2. minutos  :")
nums_list = []
nums = input('Cantidad de numeros aleatorios que se desea generar: ')
tiempo1 =  input('Agrega el tiempo menor "a": ')
tiempo2 =  input('Agrega el tiempo mayor "b": ')

if const == '1':
    const = 'horas'
elif const == '2':
    const = 'minutos'
else:
    const = 'minutos/horas'
 

for _ in range(0, int(nums)):
    rand = random.uniform(0, 1)
    num = round(rand, 5)
    nums_list.append(num)

test = distribucion_unifi(nums_list, int(tiempo1), int(tiempo2), const)
