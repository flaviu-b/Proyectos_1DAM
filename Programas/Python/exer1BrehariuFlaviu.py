#Flaviu Mihai Brehariu
import random


victorias_necesarias = int(input("Cuantas victorias necesitas para ganar? "))
victorias_a = 0
victorias_b = 0



print("JUGADOR A        jUGADOR B       GANA")
print("---------        ---------       ----")



while victorias_necesarias > victorias_a and victorias_necesarias > victorias_b:
    random_a = random.randint(1,3)
    random_b = random.randint(1,3)
    if random_a != random_b:
        if random_a == 1 and random_b == 2:
            victorias_b += 1
            gana = "B"
        elif random_a == 1 and random_b == 3:
            victorias_a += 1
            gana = "A"
        elif random_a == 2 and random_b == 1:
            victorias_a += 1
            gana = "A"
        elif random_a == 2 and random_b == 3:
            victorias_b += 1
            gana = "B"
        elif random_a == 3 and random_b == 1:
            victorias_b +=1
            gana = "B"
        elif random_a == 3 and random_b == 2:
            victorias_a += 1
            gana = "A"
    else:
        gana = ""
    if random_a == 1:
        jugada_random_a = "Piedra"
    elif random_a == 2:
        jugada_random_a = "Papel "
    else:
        jugada_random_a = "Tijera"

    if random_b == 1:
        jugada_random_b = "Piedra"
    elif random_b == 2:
        jugada_random_b = "Papel "
    else:
        jugada_random_b = "Tijera"
    
    print(f"{jugada_random_a}           {jugada_random_b}          {gana}")
if victorias_a > victorias_b:
    print("Ha ganado A")
else:
    print("Ha ganado B")
print(f"Victorias de A: {victorias_a}")
print(f"Victorias de B: {victorias_b}")
