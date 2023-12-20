package ejercicios;

import funciones.Teclat;

public class ej_11 {
    public static void main(String[] args) {
        int num = Teclat.lligInt("Dame un numero: ");
        int respuesta;
        do {
            System.out.printf("Dame el quadrado de %d:\n", num);
            respuesta = Teclat.lligInt();
        } while (respuesta != num * 2);
    }
}
