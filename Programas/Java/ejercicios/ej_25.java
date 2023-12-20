package ejercicios;

import java.util.Random;

public class ej_25 {

    public static void main(String[] args) {
        int num_arriba = 100;
        int num_abajo = 1;
        int respuesta = 0;
        Random random = new Random();
        while (respuesta != 1){
            int num_random = random.nextInt(num_arriba - num_abajo + 1) + num_abajo;
            System.out.println(num_random);
            System.out.printf("El numero que has pensado es %d? \n",num_random);
            respuesta = funciones.Teclat.lligInt("en caso de ser afirmativo (1),  en caso de ser negativo: si el num pensado es mas alto (2), si es mas bajo (3)");
            if (respuesta == 1) {
                System.out.println("Numero acertado");
            }
            else{
                if (respuesta == 2) {
                    num_abajo = num_random;
                }
                else{
                    num_arriba = num_random; 
                }
            }

        }
    }

}   