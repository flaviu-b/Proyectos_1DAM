edad = int(input("Dame tu edad: "))
if edad < 18:
    esadulto = True
else:
    esadulto = False

if esadulto:
    print("Menor de edad.")
else:
    print("Mayor de edad")