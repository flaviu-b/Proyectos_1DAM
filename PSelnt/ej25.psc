Algoritmo sin_titulo
	Escribir "Dame un numero"
	Leer num
	i = 0
	
	Repetir
		num = num / 10
		i = i + 1
		Escribir num
	Hasta Que num < 1
		Escribir i, " cifras" 
FinAlgoritmo
