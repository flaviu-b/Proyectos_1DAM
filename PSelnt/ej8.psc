Algoritmo sin_titulo
	Escribir "dame un numero"
	Leer num1
	Escribir "dame otro numero"
	Leer num2
	Escribir "dame orto numero"
	Leer num3
	si num1 < num3 y num3 > num2 Entonces
		Escribir num3, " es el mayor" 
	FinSi
	Si num1 > num2 y num1 > num3
		Escribir num1, " es el mayor"
	Finsi
	Si num2 > num1 y num2 > num3
		Escribir num2, " es el mayor"
	FinSi
	
	si num1 < num3 y num1 < num2 Entonces
		Escribir num1, " es el menor" 
	FinSi
	si num2 < num3 y num2 < num1 Entonces
		Escribir num2, " es el menor" 
	FinSi
	si num3 < num2 y num3 < num1 Entonces
		Escribir num3, " es el menor" 
	FinSi
	
FinAlgoritmo
