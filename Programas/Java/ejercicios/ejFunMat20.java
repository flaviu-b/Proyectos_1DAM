package ejercicios;

import funciones.Teclat;

public class ejFunMat20 {
    public static void main(String[] args){

        int vector[] = new int[5];
        leerEnteros(vector);
        System.out.print("|");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "|");
        }
    }

    private static void leerEnteros(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Teclat.lligInt("Dame el numero de la posición " + (i + 1) + ": ");
        }
    }
}
