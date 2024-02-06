Algoritmo sin_titulo
	Escribir "Dame un numero: "
	Leer num
	i = 1
	acc = 0
	Escribir "Divisores de ", num
	Repetir
		si num % i == 0
			Escribir i
			acc = acc + 1
		FinSi
		i = i + 1
	Hasta Que i > num
	Escribir num, " tiene ", acc, " divisores"
FinAlgoritmo
