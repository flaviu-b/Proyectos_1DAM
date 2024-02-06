Algoritmo sin_titulo
	Escribir 'dame el primer numero'
	Leer num1
	Escribir 'dame el segundo numero'
	Leer num2
	Escribir 'operacion a realizar?(Suma/Resta/Multiplicacion/Division)'
	Leer op
	Si op=='Suma' O op=='Resta' O op=='Multiplicacion' O op=='Division' Entonces
		Si op=='Suma' Entonces
			Escribir num1+num2
		SiNo
			Si op=='Resta' Entonces
				Escribir num1-num2
			SiNo
				Si op=='Multiplicacion' Entonces
					Escribir num1*num2
				SiNo
					SI num2 = 0 Entonces
						Escribir "Error: Se esta intentando dividir entre 0"
					SiNo
						Escribir num1/num2
					FinSi
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir 'Error: El codigo de operacion no es correcto porfavor introduzca el codigo conforme aparece en pantalla(Suma/Resta/Multiplicacion/Division)'
	FinSi
FinAlgoritmo
