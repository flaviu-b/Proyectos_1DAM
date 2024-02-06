temp = 0
Salir = False
while Salir == False:
    opcion = int(input("Pedir temperatura/Subir un grado/Bajar un grado/Salir (1/2/3/4): "))
    if opcion > 4 or opcion < 1:
        print("Error: el numero introducido no es valido, dbes introducir un numero entero entre 1 y 4")
    elif opcion == 1:
        temp = int(input("Dame la temperatura: "))
        print(f"La temperatura es {temp}ºC")
    elif opcion == 2:
         temp += 1
         print(f"La temperatura es {temp}ºC")
    elif opcion == 3:
        temp += -1
        print(f"La temperatura es {temp}ºC")
    else:
        Salir = True
        print(f"La temperatura final es {temp}ºC")
