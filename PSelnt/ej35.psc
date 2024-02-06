Algoritmo sin_titulo
	Escribir "Dame un numero: "
	Leer num1
	EsPrimo = Verdadero
	si num1> 1
		para i = 2 Hasta num1 - 1
			si num1 % i = 0 
				EsPrimo = Falso
			FinSi
		FinPara
	FinSi
	si EsPrimo == Verdadero
		Escribir num1, " es primo"
	SiNo
		Escribir num1, " No es primo"
	FinSi
	
FinAlgoritmo
