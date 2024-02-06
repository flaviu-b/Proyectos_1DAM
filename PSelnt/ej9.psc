Algoritmo sin_titulo
	Escribir "dame un numero"
	Leer num1
	Escribir "dame otro numero"
	Leer num2
	Escribir "dame orto numero"
	Leer num3
	
	si num1 < num3 y num1 < num2 Entonces
		Escribir num1, " es el menor" 
		si num2 < num3 Entonces
			Escribir num2, "es el segundo menor"
		SiNo
			Escribir num3, "es el segundo menor"
		FinSi
	FinSi
	si num2 < num3 y num2 < num1 Entonces
		Escribir num2, " es el menor"
		si num1 < num3 Entonces
			Escribir num1, "es el segundo menor"
		SiNo
			Escribir num3, "es el segundo menor"
		FinSi
	FinSi
	si num3 < num2 y num3 < num1 Entonces
		Escribir num3, " es el menor" 
		si num2 < num1 Entonces
			Escribir num2, "es el segundo menor"
		SiNo
			Escribir num1, "es el segundo menor"
		FinSi
	FinSi
	
FinAlgoritmo
