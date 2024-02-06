edad = int(input("Quantos años tienes?"))
if edad < 18:
    print(f"Faltan {18 - edad} años para ser mayor de edad.")
else:
    print(f"Faltan {65 - edad} años para jubilarse.")