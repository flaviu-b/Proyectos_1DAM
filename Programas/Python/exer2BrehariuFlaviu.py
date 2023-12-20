#Flaviu Mihai Brehariu
a_pequeño = 0
a_grande = 0
s_grande = 0
s_pequeño = 0
canal_inicio = int(input("Dime el canal en el que te encuentras: "))
canal_destino = int(input("Dime el canal destino: "))

if canal_destino < canal_inicio:
    resta = canal_inicio - canal_destino
    a_grande = int(resta / 10)
    a_pequeño = resta - a_grande * 10
else:
    resta = canal_destino - canal_inicio
    s_grande = int(resta/10)
    s_pequeño = resta - s_grande * 10

print("Solucion: ")
print(f"S: {s_grande}   s: {s_pequeño}      A: {a_grande}       a: {a_pequeño}")
if canal_destino < canal_inicio:
    for i in range (0,a_grande):
        print("A",end="")
    for i in range (0,a_pequeño):
        print("a",end="")
else:
    for i in range (0,s_grande):
        print("S",end="")
    for i in range (0,s_pequeño):
        print("s",end="")
