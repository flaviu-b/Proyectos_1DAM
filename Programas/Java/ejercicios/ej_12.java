package ejercicios;

import funciones.Teclat;

public class ej_12 {
    public static void main(String[] args) {
        int nota = 0;
        int acumulador = 0;
        int suma_nota = 0;
        int aprobado = 0;
        int suspendido = 0;
        do {

            nota = Teclat.lligInt("Dime la nota(-1 para salir): ");
            if (nota >= 0) {

                if (nota >= 5)
                    aprobado += 1;
                else
                    suspendido += 1;

                suma_nota += nota;
                acumulador += 1;
                System.out.printf("Numero de notas -> %d\n",acumulador);
            }

        } while (nota >= 0);
         float media = suma_nota / acumulador;
        System.out.printf("La nota media es %f (%d -> aprobados, %d -> suspendidos )", media, aprobado,
                suspendido);
    }
}