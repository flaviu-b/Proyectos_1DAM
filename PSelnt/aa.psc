Algoritmo aa
	Escribir "Nombre:"
	leer Nombre
	escribir "sueldo por hora:"
	leer SueldoHora
	escribir "Horas trabajadas"
	leer horas
	Bruto = SueldoHora * horas
	Importe = Bruto * 0.15
	Neto = Bruto - Importe
	Escribir "Nombre:", Nombre
	escribir "sueldo en bruto:", Bruto, " euros"
	Escribir "importe:", Importe, " euros"
	Escribir "Sueldo neto:", Neto, " euros"
FinAlgoritmo
