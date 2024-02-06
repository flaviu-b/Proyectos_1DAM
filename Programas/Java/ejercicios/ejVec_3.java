package ejercicios;

import funciones.Teclat;

public class ejVec_3 {
    public static void main(String[] args) {
        // --a--
        int valor;
        int grandaria;
        int[] vector1;
        int[] vector2;
        int[] vector3;
        //--b--
        grandaria = Teclat.lligInt("dame el tamaño de los vectores ");
        //--c--
        vector1 = new int[grandaria];
        //--d--
        for (int i = 0; i < vector1.length; i++) {
            valor = Teclat.lligInt("Dame el valor [" + (i+1) + "] del vector 1");
            vector1[i] = valor;
        }
        //--e--
        vector2 = vector1;
        //--f--
        vector3 = new int[grandaria];
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i];
        }
        //--g--
        if (vector1 == vector2) System.out.println("Vectores iguales");else System.out.println("Vectores diferentes");
        if (vector1 == vector3) System.out.println("Vectores iguales");else System.out.println("Vectores diferentes");
        //--h--
        boolean sonIguales = true;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector3[i]) sonIguales = false;
        }
        if (sonIguales = true) System.out.println("Vectores iguales");else System.out.println("Vectores diferentes");
        //--i--
        System.out.println("Vector1     vector2     vector3");
        for (int i = 0; i < vector1.length; i++) {
            System.out.printf("  %d          %d           %d\n",vector1[i],vector2[i],vector3[i]);
        }
        //--j--
        vector1 = new int[5];
        vector2 = new int[5];
        vector3 = new int[5];
        for (int i = 0; i < vector3.length; i++) {
            vector1[i] = -1;
            vector2[i] = -1;
            vector3[i] = -1;
        }
        System.out.println("Vector1     vector2     vector3");
        for (int i = 0; i < vector1.length; i++) {
            System.out.printf("  %d          %d           %d\n",vector1[i],vector2[i],vector3[i]);
        }
    }
}
