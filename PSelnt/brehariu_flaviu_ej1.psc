Algoritmo ej1_examen
	//Flaviu Mihai Breharu�iu
	cartas_menores = 0
	Repetir
		Escribir "Dime tu edad:"
		Leer edad
		Escribir "Crees en los reyes magos?(S/n)"
		Leer respuesta_cree
		si respuesta_cree == "s" o respuesta_cree == "S"
			cree = Verdadero
		SiNo
			cree = Falso
		FinSi
		
		si edad < 10 y cree = Verdadero 
			quiere_mu�eca = Falso
			cartas_menores = cartas_menores + 1
			Escribir "Cuantos regalos quieres?"
			Leer num_regalos
			para i = 1 Hasta num_regalos
				Escribir "Dime el nombre de el regalo ", i
				Leer nombre_regalo
				si nombre_regalo == "mu�eca" Entonces
					quiere_mu�eca = Verdadero
				FinSi
			FinPara
			si quiere_mu�eca <> Verdadero
				Escribir "Mira que no querer mu�ecas!"
			FinSi
		SiNo
			Escribir "Carbon tendras!"
		FinSi
	Hasta Que cartas_menores == 3
FinAlgoritmo
