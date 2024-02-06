Algoritmo sin_titulo
	Escribir "dame un numero"
	Leer num1
	Escribir "dame otro numero"
	Leer num2
	Escribir "dame orto numero"
	Leer num3
	si num1 < num3 y num3 > num2 Entonces
		Escribir num3, " es el mayor" 
		h = num3
		c1 = num1
		c2 = num2
	FinSi
	
	Si num1 > num2 y num1 > num3
		Escribir num1, " es el mayor"
		h = num1
		c1 = num2
		c2 = num3
	Finsi
	
	Si num2 > num1 y num2 > num3
		Escribir num2, " es el mayor"
		h = num2
		c1 = num1
		c2 = num3
	FinSi
	Escribir c1
	Escribir c2
	escribir h
	
	si h < c1 + c2 Entonces
		Escribir " puede corresponder a las medidas de un triangulo"
	SiNo
		Escribir "no puede corresponder a las medidas de un triangulo"
	FinSi
FinAlgoritmo
