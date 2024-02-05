Algoritmo sin_titulo
	Escribir "Adivina el numero aleatorio del 1 al 10!"
	alea = Aleatorio(1,10)
	Para i = 1 Hasta 20
		Escribir "Dame una respuesta: "
		Leer ans
		si alea == ans
			Escribir "correcto :)"
		
		SiNo
			Escribir "Icorrecto :(   Vuelve a intentarlo:"
		FinSi
	FinPara
	Escribir "Num de intentos --> ", i
	
FinAlgoritmo
