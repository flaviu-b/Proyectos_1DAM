Algoritmo sin_titulo
	Escribir "dame numeros(introduce 0 al finalizar)"
	leer num
	i = 0
	pos = 0
	neg = 0
	fin0 = 0
	Repetir
		si num > 0
			pos = pos + 1
		sino
			neg = neg + 1
		FinSi
		si num % 10 == 0
			fin0 = fin0 + 1
		FinSi
		i = i + 1
		Escribir "dame otro numero: "
		leer num
	Hasta Que num == 0
	Escribir "positivos: ", pos
	Escribir "negativos: ", neg
	Escribir "acabados en 0: ", fin0
FinAlgoritmo
