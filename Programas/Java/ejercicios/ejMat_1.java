package ejercicios;

import funciones.Teclat;

class ejMat_1 {

    public static void main(String[] args) {
        float notas[][] = new float [5][3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Evaluación " + (i + 1));
            for (int j = 0; j < 5; j++) {
                notas[i][j] = Teclat.lligFloat("Dame la nota del alumno ", + (j+1));
            }
        }
    }
}