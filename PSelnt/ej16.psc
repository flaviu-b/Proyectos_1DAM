Algoritmo sin_titulo
	Escribir 'Dame el a�o de nacimiento(AAAA): '
	Leer ANON
	Escribir 'Dame mes de nacimiento(MM): '
	Leer mesN
	Escribir 'Dame el dia de nacimiento(DD): '
	Leer diaN
	Escribir 'Dame el a�o de defunci�n(AAAA): '
	Leer ANOM
	Escribir 'Dame mes de defunci�n(MM)'
	Leer mesM
	Escribir 'Dame el dia de defunci�n(DD): '
	Leer diaM
	Mientras ANON>ANOM Hacer
		Escribir 'Error: la fecha de defuncion no puede ser anterior a la de nacimiento.'
		Escribir 'Itroduce el a�o de nacimiento: '
		Leer ANON
		Escribir 'Itroduce el a�o de defunci�n: '
		Leer ANOM
	FinMientras
	Si ANON==ANOM Entonces
		Mientras mesN>mesM Hacer
			Escribir 'Error: la fecha de defuncion no puede ser anterior a la de nacimiento.'
			Escribir 'Dame el mes de nacimiento: '
			Leer mesN
			Escribir 'Dame el mes de defunci�n: '
			Leer mesM
		FinMientras
	FinSi
	Si mesN==mesM y ANON==ANOM Entonces
		Mientras diaN>diaM Hacer
			Escribir 'Error: la fecha de defuncion no puede ser anterior a la de nacimiento.'
			Escribir 'Dame el dia de nacimiento: '
			Leer diaN
			Escribir 'Dame el dia de defunci�n: '
			Leer diaM
		FinMientras
	FinSi
	Escribir 'Edad: ', ANOM-ANON, ' a�os. Nacido el ', ANON, '/', mesN, '/', diaN, ' y fallecido el ', ANOM, '/', mesN, '/', diaN
FinAlgoritmo
