Algoritmo sin_titulo
	Escribir 'dame una nota'
	Leer nota
	Si nota>10 Entonces
		Escribir 'Error: No puedes introducir una nota mayo a 10'
	SiNo
		Si nota<0 Entonces
			Escribir 'Error: No puedes introducir una nota negativa'
		SiNo
			Si nota<4 Entonces
				Escribir 'Muy deficiente'
			SiNo
				Si nota<5 Entonces
					Escribir 'insuficiente'
				SiNo
					Si nota<7 Entonces
						Escribir 'suficiente'
					SiNo
						Si nota<9 Entonces
							Escribir 'notable'
						SiNo
							Escribir 'sobresaliente'
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
