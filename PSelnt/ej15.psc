Algoritmo sin_titulo
	Escribir "Dame un radio positivo"
	Leer rad
	
	Mientras rad <= 0 Hacer
		Escribir "dame un radio positivo"
		Leer rad
	FinMientras
	
	Escribir "El area de el circulo de radio ", rad, " es: ", pi * rad^2
FinAlgoritmo
