Algoritmo sin_titulo
	Escribir 'Dame el año de nacimiento(AAAA): '
	Leer ANON
	Escribir 'Dame mes de nacimiento(MM): '
	Leer mesN
	Escribir 'Dame el dia de nacimiento(DD): '
	Leer diaN
	Escribir 'Dame el año de defunción(AAAA): '
	Leer ANOM
	Escribir 'Dame mes de defunción(MM)'
	Leer mesM
	Escribir 'Dame el dia de defunción(DD): '
	Leer diaM
	Mientras ANON>ANOM Hacer
		Escribir 'Error: la fecha de defuncion no puede ser anterior a la de nacimiento.'
		Escribir 'Itroduce el año de nacimiento: '
		Leer ANON
		Escribir 'Itroduce el año de defunción: '
		Leer ANOM
	FinMientras
	Si ANON==ANOM Entonces
		Mientras mesN>mesM Hacer
			Escribir 'Error: la fecha de defuncion no puede ser anterior a la de nacimiento.'
			Escribir 'Dame el mes de nacimiento: '
			Leer mesN
			Escribir 'Dame el mes de defunción: '
			Leer mesM
		FinMientras
	FinSi
	Si mesN==mesM y ANON==ANOM Entonces
		Mientras diaN>diaM Hacer
			Escribir 'Error: la fecha de defuncion no puede ser anterior a la de nacimiento.'
			Escribir 'Dame el dia de nacimiento: '
			Leer diaN
			Escribir 'Dame el dia de defunción: '
			Leer diaM
		FinMientras
	FinSi
	Escribir 'Edad: ', ANOM-ANON, ' años. Nacido el ', ANON, '/', mesN, '/', diaN, ' y fallecido el ', ANOM, '/', mesN, '/', diaN
FinAlgoritmo
