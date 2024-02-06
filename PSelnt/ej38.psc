Algoritmo sin_titulo
	Escribir "Dame el timepo en minutos: "
	Leer mint
	eur = 0
	hor = 0
	mientras mint >= 60 Hacer
		mint = mint - 60 
		eur = eur + 2
		hor = hor + 1
	FinMientras
	cent = mint * (4/10)
	si mint >= 60
		Repetir 
			cent = cent - 100
				hor = hor + 1
		Hasta Que cent < 100 
	FinSi
	
	
	Escribir "Tiempo: ", hor,"h" ,mint, "min"
	Escribir "Precio: ", eur, ",", cent," Euros" 	
FinAlgoritmo
