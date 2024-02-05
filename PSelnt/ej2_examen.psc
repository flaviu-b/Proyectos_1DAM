Algoritmo ej2_examen
	media_max = 0
	Repetir
		Escribir "Dime tu nombre:"
		Leer nombre
		asignatura = 0
		suma_notas = 0
		Repetir
			Escribir "Nota de la materia ", asignatura + 1
			leer nota
			si nota >= 0 y nota <= 10
				suma_notas = suma_notas + nota
				asignatura = asignatura + 1
			SiNo
				Escribir "Error: la nota debe estar entre 0 y 10"
			FinSi
		Hasta Que asignatura == 7
		media = suma_notas / 7 
		si media > media_max 
			media_max = media
			nombre_max = nombre
		FinSi
		Escribir "Quieres seguir introduciendo mas alumnos?(s/n)"
		Leer  mas_notas
	Hasta Que mas_notas == "n"	
	Escribir nombre_max
	Escribir media_max 
FinAlgoritmo