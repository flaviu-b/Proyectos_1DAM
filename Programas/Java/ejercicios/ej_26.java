package ejercicios;

import java.util.Random;

public class ej_26 {
    public static void main(String[] args) {
        funciones.Pantalla.titol("Adivina el numero");
        Random random = new Random();
        int num_random = random.nextInt(100) + 1;
        int num_introducido = 0;
        while (num_introducido != num_random) {
            num_introducido = funciones.Teclat.lligInt("Introduce tu respuesta:");
            if (num_introducido > num_random) System.out.println("INCORRECTO: El numero introducido esta por [encima] del numero a adivinar");
            else if (num_introducido < num_random) System.out.println("INCORRECTO: El numero introducido esta por [debajo] del numero a adivinar");
            else System.out.println("CORRECTO: Has adivinado el numero");
        }   
    }
}
