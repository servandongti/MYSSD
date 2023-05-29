import random

def lanzar_dado():
    return random.randint(1, 6)

def main():
    dinero_inicial = 20
    dinero_actual = dinero_inicial
    rondas_ganadas = 0
    rondas_perdidas = 0

    print("¡Bienvenido al juego de dados!")
    print("Tu dinero inicial es: $", dinero_inicial)

    while dinero_actual > 0 and dinero_actual < 50:
        input("Presiona Enter para lanzar los dados...")
        dado1 = lanzar_dado()
        dado2 = lanzar_dado()
        primera_suma = dado1 + dado2
        print("Dado 1:", dado1)
        print("Dado 2:", dado2)
        print("Primera suma:", primera_suma)

        if primera_suma == 7 or primera_suma == 11:
            dinero_actual += 1
            rondas_ganadas += 1
            print("¡Ganaste! Has ganado $1. Tu dinero actual es: $", dinero_actual)
        elif primera_suma == 3 or primera_suma == 12:
            dinero_actual -= 1
            rondas_perdidas += 1
            print("¡Perdiste! Has perdido $1. Tu dinero actual es: $", dinero_actual)
        else:
            suma_guardada = primera_suma
            print("La suma guardada es:", suma_guardada)
            while True:
                input("Presiona Enter para lanzar los dados nuevamente...")
                dado1 = lanzar_dado()
                dado2 = lanzar_dado()
                suma = dado1 + dado2
                print("Dado 1:", dado1)
                print("Dado 2:", dado2)
                print("Suma:", suma)

                if suma == 7:
                    dinero_actual -= 1
                    rondas_perdidas += 1
                    print("¡Perdiste! Has perdido $1. Tu dinero actual es: $", dinero_actual)
                    break
                elif suma == suma_guardada:
                    dinero_actual += 1
                    rondas_ganadas += 1
                    print("¡Ganaste! Has ganado $1. Tu dinero actual es: $", dinero_actual)
                    break

    if dinero_actual == 0:
        print("Te has quedado sin dinero. ¡Juego terminado!")
    elif dinero_actual == 50:
        print("¡Felicidades! Has alcanzado los $50. ¡Juego terminado!")

    total_rondas = rondas_ganadas + rondas_perdidas
    probabilidad_ganar = rondas_ganadas / total_rondas
    probabilidad_perder = rondas_perdidas / total_rondas

    print("Rondas ganadas:", rondas_ganadas)
    print("Rondas perdidas:", rondas_perdidas)
    print("Total de rondas:", total_rondas)
    print("Probabilidad de ganar:", probabilidad_ganar)
    print("Probabilidad de perder:", probabilidad_perder)

    print("¡Gracias por jugar!")

if __name__ == "__main__":
    main()