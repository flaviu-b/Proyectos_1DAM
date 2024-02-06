package ejercicios;

import funciones.Teclat;

public class ejCha_9 {

    public static void main(String[] args) {
        String cadena = Teclat.lligString("Dame una cadena de caracteres: ");
        String[] partes = cadena.split(" ");
        int longitud;
        int largo_max = 0;
        int largo_min = 30;
        String max = null;
        String min = null;
        boolean mayus = false;
        for (int i = 0; i < partes.length; i++) {
            longitud = partes[i].length();
            if (longitud > largo_max){
                max = partes[i];
                largo_max = longitud;
            }
            if (longitud < largo_min){
                min = partes[i];
                largo_min = longitud;
            }
            System.out.print("La longitud de la cadena " + (i+1) + " es: " + longitud);
            char primerCaracter = partes[i].charAt(0);
            if (Character.isUpperCase(primerCaracter)) System.out.println(", comienza por mayuscula");
            else System.out.println(", no comienza por mayuscula");
        }
        System.out.println("la palabra mas larga: " + max);
        System.out.println("la palabra mas corta: " + min);
    }
}