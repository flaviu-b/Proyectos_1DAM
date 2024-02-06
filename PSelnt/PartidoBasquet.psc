Algoritmo sin_titulo
	// Flaviu Mihai Brehariu
	Escribir 'Dame el nombre de los dos equipos'
	Escribir 'Equipo 1'
	Leer eq1
	Escribir 'Equipo 2'
	Leer eq2
	difPmax <- 0
	ganador <- 3
	acctEq1 <- 0
	acctEq2 <- 0
	can1 <- 0
	can2 <- 0
	can3 <- 0
	// Bucle principal
	Para i<-1 Hasta 4 Hacer
		accEq1 <- 0
		accEq2 <- 0
		difP <- 0
		Escribir '{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}'
		Escribir '{}               INICIO DEL QUARTO NUMERO ', i, '             {}'
		Escribir '{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}'
		Escribir ''
		Repetir
			// obtencion de datos
			Escribir 'OPCION 1 --> Introduce el valor de la canasta anotada: (entre 1 y 3)'
			Escribir 'OPCION 2 --> Para acabar el quarto ', i, ' introduce --> 0'
			Leer intpunt
			Si intpunt<=3 Entonces
				Si intpunt<>0 Entonces
					Según intpunt Hacer
						1:
							can1 <- can1+1
						2:
							can2 <- can2+1
						3:
							can3 <- can3+1
					FinSegún
					Escribir 'Que equipo ha anotado la canasta? (si es {', eq1, '} introduce --> 1 / Si es {', eq2, '} introduce --> 2)'
					Leer intEq
					// una vez obtenidos los datos hago unas breves operaciones y muestro los resultados
					Si intEq==1 O intEq==2 Entonces
						Si intEq==1 Entonces
							accEq1 <- accEq1+intpunt
							acctEq1 <- acctEq1+intpunt
							Escribir '-----------------------------------------------------------------------------------------'
							Escribir ''
							Escribir '                               ---', eq1, ' anota ', intpunt, ' puntos---'
							Escribir ''
							Escribir '                                  ', eq1, ': ', accEq1, ' puntos'
							Escribir '                                  ', eq2, ': ', accEq2, ' puntos'
							Escribir ''
							Si accEq1>accEq2 Entonces
								difP <- accEq1-accEq2
							SiNo
								difP <- accEq2-accEq1
							FinSi
							Si difP>difPmax Entonces
								difPmax <- difP
							FinSi
							Escribir '                                  Diferencia de puntos: ', difP
							Escribir '                                  Diferencia maxima de puntos:', difPmax
							Escribir ''
							Escribir '-----------------------------------------------------------------------------------------'
							Escribir ''
							Escribir ''
							Escribir ''
						SiNo
							accEq2 <- accEq2+intpunt
							acctEq2 <- acctEq2+intpunt
							Escribir '-----------------------------------------------------------------------------------------'
							Escribir ''
							Escribir '                               ---', eq2, ' anota ', intpunt, ' puntos---'
							Escribir ''
							Escribir '                                  ', eq1, ': ', accEq1, ' puntos'
							Escribir '                                  ', eq2, ': ', accEq2, ' puntos'
							Escribir ''
							Si accEq1>accEq2 Entonces
								difP <- accEq1-accEq2
							SiNo
								difP <- accEq2-accEq1
							FinSi
							Si difP>difPmax Entonces
								difPmax <- difP
							FinSi
							Escribir '                                  Diferencia de puntos: ', difP
							Escribir '                                  Diferencia maxima de puntos:', difPmax
							Escribir ''
							Escribir '-----------------------------------------------------------------------------------------'
							Escribir ''
							Escribir ''
							Escribir ''
						FinSi
					SiNo
						Escribir 'Error: el parametro introducido no es valido'
						Escribir ''
					FinSi
				FinSi
			SiNo
				Escribir '!!Error: parametro introducido no valido¡¡'
				Escribir ''
			FinSi
		Hasta Que intpunt=0
		Escribir '-----------------------------------------------------------------------------------------'
		Escribir ''
		Escribir '                                  Fin del quarto numero ', i
		Escribir '                                  Puntos realizados en este quarto: '
		Escribir '                                  ', eq1, ' --> ', accEq1, ' puntos'
		Escribir '                                  ', eq2, ' --> ', accEq2, ' puntos'
		Escribir '-----------------------------------------------------------------------------------------'
		Escribir ''
		Escribir ''
		Escribir ''
	FinPara
	// una vez finaliza el bucle principal muestro las estadisticas finales
	Escribir '-----------------------------------------------------------------------------------------'
	Escribir ''
	Escribir '                          ####################################'
	Escribir '                          #       FINAL DEL PARTIDO          #'
	Escribir '                          ####################################'
	Escribir ''
	Si acctEq1>acctEq2 Entonces
		Escribir '                                  ', eq1, ' Es el ganador'
	SiNo
		Escribir '                                  ', eq2, ' Es el ganador'
	FinSi
	Escribir ''
	Escribir '                                  ', eq1, ' --> ', acctEq1
	Escribir '                                  ', eq2, ' --> ', acctEq2
	Escribir ''
	Escribir '                                  Entre los dos equipos se han realizado: '
	Escribir '                                  ', can1, ' canastas de 1 punto'
	Escribir '                                  ', can2, ' canastas de 2 puntos'
	Escribir '                                  ', can3, ' canastas de 3 puntos'
	Escribir ''
	Escribir '-----------------------------------------------------------------------------------------'
FinAlgoritmo
