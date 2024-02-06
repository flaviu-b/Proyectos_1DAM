Algoritmo sin_titulo
	Escribir "Dame un numero natural positivo: "
	Leer lin
	acc = 1
	si lin > 1 Entonces
		Escribir "1 = 1"
		Para i = 2 Hasta lin + 1
			Escribir Sin Saltar "1"
			para j = 2 Hasta i
				Escribir Sin Saltar " + ", j
				acc = acc + j
			FinPara
			Escribir " = ", acc
		FinPara
	SiNo
		si lin == 1
			Escribir "1 = 1"
		SiNo
			
			Escribir "Error: Numero introducido inorrecto"
		FinSi
	FinSi
FinAlgoritmo
