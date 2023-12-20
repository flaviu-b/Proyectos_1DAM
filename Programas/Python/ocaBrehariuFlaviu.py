from random import randint
partidaActual = 0
otraPartida =True
tiradas = 0
dado6 = 0
casillaEsta = 0
mejorPartida = 1
error = True
print("OCA EN SOLITARIO")
cantCasillas = input("Dame el numero de casillas del tablero (de 10 a 100): ")
# Este es el bucle principal que se repetira hasta que el jugador indique que no quiere jugar mas
while otraPartida == True:
    # Al inicio de cada bucle he de resetear algunas variables para poder segir usandolas
    partidaActual = partidaActual + 1
    tiradas = 0
    dado = 0
    casillaEsta = 0
    cantCasillas = str(cantCasillas)

    # Aqui estoy haciendo la comprobación de datos
    while True:
        if cantCasillas.isnumeric() == False:
            print("Error: No has introducido un numero entre 10 y 100")
            cantCasillas = input("Dame el numero de casillas del tablero (de 10 a 100): ")
        else:
            cantCasillas = int(cantCasillas)
            if cantCasillas >= 10 and cantCasillas <= 100:
                break
            else:
                print("Error: No has introducido un numero entre 10 y 100")
                cantCasillas = input("Dame el numero de casillas del tablero (de 10 a 100): ")

    print(f"||| Inicio de la partida [{partidaActual}] |||")
    print("")    
    # Bucle de cada partida            
    while casillaEsta <= cantCasillas:
        dado = randint(1,6)
        tiradas = tiradas + 1
        print(f"Tirada realizada: Ha salido un [{dado}]")
        if dado == 6:
            dado6 = dado6 + 1
            if dado6 == 2:
                print(f"Has sacada dos veces [6] vuelves a la casilla inicial")
                print(f"[{casillaEsta}] --> [0]")
                dado6 = 0
                casillaEsta = 0
                continue
            elif dado6 < 2:
                print("¡Has sacado un [6], a los 2 seises seguidos volveras a la casilla de inicio!")
        casillaEsta = casillaEsta + dado
        if casillaEsta > cantCasillas:
            resta = casillaEsta - cantCasillas
            casillaEsta = cantCasillas - 2 * resta
            print(f"Rebote | [{casillaEsta + 2 * resta - dado}] --> [{casillaEsta}]")
        else:
            print(f"Avanzas | [{casillaEsta - dado}] --> [{casillaEsta}]")
        if casillaEsta % 5 == 0:
            print(f"De oca en oca, salto porque me toca")
            casillaEsta = casillaEsta + 5
            print(f"Avanzas | [{casillaEsta - 5}] --> [{casillaEsta}]")
    print("----¡Has ganado!----")
    print(f"has necesitado [{tiradas}] tiradas")
    print("")
    quiere = input("Quieres jugar otra partida? (S/n)")
    print("")
    if partidaActual == 1:
        tiradasMin = tiradas
    if quiere == "n" or quiere == "N":
        otraPartida = False
    elif quiere == "S" or quiere == "s":
        otraPartida = True
    if tiradas < tiradasMin:
        tiradasMin = tiradas
        mejorPartida = partidaActual
        
print(f"Tu mejor partida fue la partida numero [{mejorPartida}] con [{tiradasMin}] tiradas")