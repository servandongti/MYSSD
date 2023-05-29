import random

nums_list = []
nums = input('Cuantos numeros aleatorerios quieres generar: ')

for _ in range(0, int(nums)):
    rand = random.uniform(0, 1)
    num = round(rand, 5)
    nums_list.append(num)

for num in nums_list:
    print(num)