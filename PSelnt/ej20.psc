Algoritmo sin_titulo
	Escribir "ej17"
	Escribir "Dame un umero:"
	Leer num
	i = 0
	Repetir
		Escribir i
		i = i + 1
	Hasta Que i == num
	
	Escribir "------------------------------------------------------------------------"
	Escribir "ej18"
	
	i = 0
	Escribir "Dame dos numeros: "
	Leer num1
	Leer num2
	si num1 < num2
		Repetir
			Escribir i
			i = i + 3
		Hasta Que i >= num2
	SiNo
		Repetir
			Escribir i
			i = i - 3
		Hasta Que i <= num2
	FinSi
	
	Escribir "------------------------------------------------------------------------"
	Escribir "Tabla del 9"
	
	i = 0
	Repetir
		Escribir "9 x ", i," = ", 9 * i
		i = i + 1
	Hasta Que i = 10
FinAlgoritmo