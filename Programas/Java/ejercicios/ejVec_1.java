package ejercicios;

import funciones.Teclat;

public class ejVec_1 {
    public static void main(String[] args) {
        // --a--
        int[] edades = new int[10];
        // --b--
        for (int i = 0; i < 10; i++) {
            System.out.printf("Edad %d", i + 1);
            edades[i] = Teclat.lligInt(": ");
        }
        // --c--
        int num_pedidio = Teclat.lligInt("Que edad quieres ver (de 1 a 10)");
        System.out.printf("la edad es %d\n", edades[num_pedidio - 1]);
        // --d--
        int num_menores = 0;
        for (int i = 0; i < 10; i++) {
            if (edades[i] < 18) {
                num_menores += 1;
            }
        }
        System.out.printf("Hay %d menores de edad \n", num_menores);
        // --e--
        int min = 150;
        int num_alu = 0;
        for (int i = 0; i < 10; i++)
            if (edades[i] < min) {
                min = edades[i];
                num_alu = i;
            }
        System.out.printf("el alumno mas joven es el numero %d con %d año/s\n", num_alu + 1, min);
        // --f--
        System.out.println("los alumnos mayores de edad son:");
        int[] mayores = new int[10];
        int j = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                mayores[j] = i;
                j++;
            }
        }
        //--g--
        for (int k = 0; k < j; k++) {
            System.out.println(mayores[k] + 1);
        }
    }
}
