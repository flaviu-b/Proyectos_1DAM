Algoritmo sin_titulo
	i = 1
	mul2 = 0 
	mul3 = 0
	mul2y3 = 0
	Repetir
		si i % 2 == 0
			mul2 = mul2 + 1
		FinSi
		si i % 3  == 0
			mul3 = mul3 + 1
		FinSi
		si i % 2 == 0 y i % 3  == 0
			mul2y3 = mul2y3 + 1
		FinSi
		i = i + 1
	Hasta Que i == 100
	Escribir "multipes de 2:  ",mul2
	Escribir "multipes de 3:  ",mul3
	Escribir "multipes de 2 y 3:  ",mul2y3
FinAlgoritmo
