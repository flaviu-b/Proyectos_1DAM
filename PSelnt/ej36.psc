Algoritmo sin_titulo
	Escribir "programa guardado de el mas grande y el mas pequeño."
	Escribir "Dame un numero (0 para una vez hayas intoducido todos los numeros)"
	i = 0
	max = 0
	min = 0
	Leer num 
	mientras num <> 0 Hacer
		si max < num Entonces
			max = num
		FinSi
		
		si min > num
			min = num
		FinSi
		
		Escribir "Dame otro numero: "
		Leer num 
	FinMientras
	Escribir "El numero mas grande es: ", max
	Escribir "El numero mas pequeño es: ", min
	
FinAlgoritmo
