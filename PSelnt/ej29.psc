Algoritmo sin_titulo
	Escribir "Dame dos numeros, el primero menor que el segundo: "
	Leer A,B
	si A > B
		Escribir "Error: datros introduidos incorrectamente"
	FinSi
	Mientras A <= B
		A = A + 2
		Escribir "A --> ",A
		B = B - 3
		Escribir "B --> ",B
	FinMientras
FinAlgoritmo
