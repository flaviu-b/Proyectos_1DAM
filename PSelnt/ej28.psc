Algoritmo sin_titulo
	Escribir "dame 2 muneros: "
	leer num1, num2
	sipar = 0
	nopar = 0
	Para i = num1 Hasta num2 Hacer
		Escribir i
		si i % 2 == 0 
			sipar = sipar + i
		SiNo
			nopar = nopar + i
		FinSi
	FinPara
	Escribir "total par: ", sipar
	Escribir "total impar: ", nopar
FinAlgoritmo
